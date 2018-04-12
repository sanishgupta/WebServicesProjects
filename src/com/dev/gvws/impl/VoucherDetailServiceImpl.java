package com.dev.gvws.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebService;

import com.dev.dao.DBUtil;
import com.dev.gvws.GetVoucherDetailINTO;
import com.dev.gvws.VoucherDetailFault;
import com.dev.gvws.VoucherDetailFault_Exception;
import com.dev.gvws.VoucherDetailPortType;
import com.dev.gvws.VoucherDetailTO;

@WebService(name = "VoucherDetailService", 
portName = "VoucherDetailPort", 
endpointInterface = "com.dev.gvws.VoucherDetailPortType", 
wsdlLocation = "WEB-INF/resources/wsdl/giftGVMax.wsdl",
targetNamespace="http://dev.com/voucherdetail")

public class VoucherDetailServiceImpl implements VoucherDetailPortType {
	
	
	public static String MISSING_VOUCHER_NUMBER_FAULT	 = "Missing Voucher Number";
	public static String MISSING_VOUCHER_NUMBER			 = "Voucher Number is required field";
	public static String MISSING_VOUCHER_NUMBER_MSG			 = "Voucher Number missing";
	
	public static String MISSING_OPERATION_CODE_FAULT	 = "Operation Code";
	public static String MISSING_OPERATION_CODE			 = "Operation Code is required field";
	public static String MISSING_OPERATION_CODE_MSG			 = "Operation Code missing";
	
	public static String SUCCESS = "SUCCESS";
	public static String FAILURE = "FAILURE";
	
	public static String OPERATION_1 = "VOUCHER_NUMBER";
	public static String OPERATION_2 = "VOUCHER_UPDATE";
	
	public static String STATUS_R = "READY_TO_PRINT";
	public static String STATUS_P = "PRINTED";
	public static String STATUS_I = "ISSUED";

	@Override
	public VoucherDetailTO getVoucherDetail(GetVoucherDetailINTO parameters)
			throws VoucherDetailFault_Exception 
	
	{
		// TODO Auto-generated method stub
		
		VoucherDetailTO voucherDetailTO = new VoucherDetailTO();
		
		// populate response
		String operName = parameters.getOperationName();
		String vouchNumber = parameters.getVoucherNumber();
		
		if(operName == null || operName.trim().length()==0)
		{
			VoucherDetailFault faultInfo = new VoucherDetailFault();
			faultInfo.setFaultInfo(MISSING_OPERATION_CODE);
			faultInfo.setMessage(MISSING_OPERATION_CODE);
			throw new VoucherDetailFault_Exception(MISSING_OPERATION_CODE_MSG, faultInfo);
		}
		else if ( operName.trim().equalsIgnoreCase(OPERATION_1))
		{
			voucherDetailTO = new VoucherDetailTO();
			
			voucherDetailTO = getUniqueVoucherNumber();
			voucherDetailTO.setOperationName(OPERATION_1);
			//voucherDetailTO.setVoucherNumber(vouchNumber);
			//voucherDetailTO.setVoucherNumber("1234567890");
			//voucherDetailTO.setVoucherStatus(STATUS_R);
			voucherDetailTO.setMessage(SUCCESS);
			updateVoucherStatusFinal(voucherDetailTO.getVoucherNumber(), "R");
			
			return voucherDetailTO;
		}
		else if ( operName.trim().equalsIgnoreCase(OPERATION_2))
		{
			voucherDetailTO = updateVoucherStatus(vouchNumber, operName);
			return voucherDetailTO;
		}
		else 
		{
			VoucherDetailFault faultInfo = new VoucherDetailFault();
			faultInfo.setFaultInfo("UNKNOWN OPERATION CODE");
			faultInfo.setMessage("Unknown Opearion Code REQUESTED");
			throw new VoucherDetailFault_Exception("Missing  Opearion Code in REQUEST", faultInfo);
		}
		
		//return voucherDetailTO;
	}
	
	
	public VoucherDetailTO updateVoucherStatus(String voucherNumber, String operName)
			throws VoucherDetailFault_Exception
	{
	
		if(voucherNumber == null || voucherNumber.trim().length()==0)
		{
			VoucherDetailFault faultInfo = new VoucherDetailFault();
			faultInfo.setFaultInfo(MISSING_VOUCHER_NUMBER);
			faultInfo.setMessage(MISSING_VOUCHER_NUMBER);
			throw new VoucherDetailFault_Exception(MISSING_VOUCHER_NUMBER_MSG, faultInfo);
		}
		
		if(operName == null || operName.trim().length()==0)
		{
			VoucherDetailFault faultInfo = new VoucherDetailFault();
			faultInfo.setFaultInfo(MISSING_OPERATION_CODE);
			faultInfo.setMessage(MISSING_OPERATION_CODE);
			throw new VoucherDetailFault_Exception(MISSING_OPERATION_CODE_MSG, faultInfo);
		}
		
		VoucherDetailTO voucherDetailTO = new VoucherDetailTO();
		
		voucherDetailTO.setOperationName(OPERATION_2);
		voucherDetailTO.setVoucherNumber(voucherNumber);
		voucherDetailTO.setVoucherStatus(STATUS_P);
		voucherDetailTO.setMessage(SUCCESS);
		
		updateVoucherStatusFinal(voucherNumber, "P");
		
		return voucherDetailTO;
	}
	
	
	public static VoucherDetailTO getUniqueVoucherNumber() {

		PreparedStatement query = null;
		ResultSet rs = null;
		VoucherDetailTO voucherDetailTO = new VoucherDetailTO();
		String seqNum = "";
		String status = "";
		
		try {
			System.out.println("Processing Records......");
			//logger.info("Processing Records......");
			
			Statement stmnt = DBUtil.getConnection().createStatement(); // ("select ID_GV, STATUS_GV from LMG_GV_MAX where rownum=1 and ID_GV is not null and STATUS_GV is null order by id_gv asc " );
			
			//rs = query.executeQuery();
			rs = stmnt.executeQuery("select ID_GV, STATUS_GV from LMG_GV_MAX where rownum=1 and ID_GV is not null and STATUS_GV is null order by id_gv asc " ); 
			int i= 0;
			System.out.print("Count : ");
			
			while (rs.next()) {
				++i;
				System.out.print(i+",");
				seqNum = rs.getString("ID_GV");
				status = rs.getString("STATUS_GV");
				
				/*String seqNum = rs.getString("AI_TRN");
				String tillID = rs.getString("ID_WS");
				String cardNum = rs.getString("skrn_member_id");
				String store = rs.getString("ID_STR_RT");
				//String inv = CreateInvoice(store, tillID, seqNum);
				String businessDate = rs.getString("DC_DY_BSN");
				String[] arr = businessDate.split("-");
				String invdate = parseDate(arr);
				String invoice = inv + invdate;
				logger.info("The transaction Sequence number is : " + seqNum);
				UnholdServiceInvoker uti = new UnholdServiceInvoker();
				uti.SendUnholdRequest(invoice, cardNum, seqNum);*/

			}
			System.out.println("Completed Processing Records......");
			//logger.info("Completed Processing Records......");

		} catch (SQLException e) {

			//logger.error(e.getMessage());
			e.printStackTrace();
		}

		finally {
			try {
				
				if(rs != null)
				{
					rs.close();
					rs = null;
				}
				
				if(query != null)
				{
					query.close();
					query = null;
				}
				
	/*			if(con != null )
				{
					con.close();
					con = null;
				}*/
				
				//logger.info("Connection Closed : " + user);
			} catch (SQLException e) {

				//logger.error(e);
				e.printStackTrace();
			}
		}
		
		voucherDetailTO.setVoucherNumber(seqNum);
		voucherDetailTO.setVoucherStatus(status);
		
		return voucherDetailTO;
	}

	public static void updateVoucherStatusFinal(String voucherNo, String status) {

		PreparedStatement query = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			System.out.println("Updating  GV Records......");
			//logger.info("Processing Records......");
			
			query = DBUtil.getConnection().prepareStatement("update LMG_GV_MAX set STATUS_GV='" + status +"' where  ID_GV = '" + voucherNo + "'" );
			//rs = query.executeUpdate();
			result = query.executeUpdate();
			System.out.print("GV  ["+ voucherNo +" ] update status #" + result);
			
			//System.out.println("Completed Processing Records......");
			//logger.info("Completed Processing Records......");

		} catch (SQLException e) {

			//logger.error(e.getMessage());
			e.printStackTrace();
		}

		finally {
			try {
				
				if(rs != null)
				{
					rs.close();
					rs = null;
				}
				
				if(query != null)
				{
					query.close();
					query = null;
				}
				
	/*			if(con != null )
				{
					con.close();
					con = null;
				}*/
				
				//logger.info("Connection Closed : " + user);
			} catch (SQLException e) {

				//logger.error(e);
				e.printStackTrace();
			}
		}
	}



	
}
