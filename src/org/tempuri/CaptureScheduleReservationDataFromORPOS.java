
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strTranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strConceptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strTerritoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strStoreOrposCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelySlot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelyCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelyState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelyArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iInvItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dInvValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dInvVolume" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="strReservationDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strReservationExpiryDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strSchReserveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelyWHSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strSalesmanHRMSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCashierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bManagerOverwriteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iExpDel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCustRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCustMob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strTranId",
    "strConceptCode",
    "strTerritoryID",
    "strStoreOrposCode",
    "strDelyType",
    "strDelyDate",
    "strDelySlot",
    "strDelyCountry",
    "strDelyState",
    "strDelyArea",
    "iInvItemCount",
    "dInvValue",
    "dInvVolume",
    "strReservationDateTime",
    "strReservationExpiryDatetime",
    "strSchReserveFlag",
    "strDelyWHSourceCode",
    "strSalesmanHRMSID",
    "strCashierId",
    "bManagerOverwriteFlag",
    "iExpDel",
    "strDataSource",
    "strCustRefNo",
    "strCustMob"
})
@XmlRootElement(name = "CaptureScheduleReservationDataFromORPOS")
public class CaptureScheduleReservationDataFromORPOS {

    protected String strTranId;
    protected String strConceptCode;
    protected String strTerritoryID;
    protected String strStoreOrposCode;
    protected String strDelyType;
    protected String strDelyDate;
    protected String strDelySlot;
    protected String strDelyCountry;
    protected String strDelyState;
    protected String strDelyArea;
    protected int iInvItemCount;
    @XmlElement(required = true)
    protected BigDecimal dInvValue;
    @XmlElement(required = true)
    protected BigDecimal dInvVolume;
    protected String strReservationDateTime;
    protected String strReservationExpiryDatetime;
    protected String strSchReserveFlag;
    protected String strDelyWHSourceCode;
    protected String strSalesmanHRMSID;
    protected String strCashierId;
    protected boolean bManagerOverwriteFlag;
    protected int iExpDel;
    protected String strDataSource;
    protected String strCustRefNo;
    protected String strCustMob;

    /**
     * Gets the value of the strTranId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTranId() {
        return strTranId;
    }

    /**
     * Sets the value of the strTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTranId(String value) {
        this.strTranId = value;
    }

    /**
     * Gets the value of the strConceptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrConceptCode() {
        return strConceptCode;
    }

    /**
     * Sets the value of the strConceptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrConceptCode(String value) {
        this.strConceptCode = value;
    }

    /**
     * Gets the value of the strTerritoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTerritoryID() {
        return strTerritoryID;
    }

    /**
     * Sets the value of the strTerritoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTerritoryID(String value) {
        this.strTerritoryID = value;
    }

    /**
     * Gets the value of the strStoreOrposCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrStoreOrposCode() {
        return strStoreOrposCode;
    }

    /**
     * Sets the value of the strStoreOrposCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrStoreOrposCode(String value) {
        this.strStoreOrposCode = value;
    }

    /**
     * Gets the value of the strDelyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDelyType() {
        return strDelyType;
    }

    /**
     * Sets the value of the strDelyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDelyType(String value) {
        this.strDelyType = value;
    }

    /**
     * Gets the value of the strDelyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDelyDate() {
        return strDelyDate;
    }

    /**
     * Sets the value of the strDelyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDelyDate(String value) {
        this.strDelyDate = value;
    }

    /**
     * Gets the value of the strDelySlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDelySlot() {
        return strDelySlot;
    }

    /**
     * Sets the value of the strDelySlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDelySlot(String value) {
        this.strDelySlot = value;
    }

    /**
     * Gets the value of the strDelyCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDelyCountry() {
        return strDelyCountry;
    }

    /**
     * Sets the value of the strDelyCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDelyCountry(String value) {
        this.strDelyCountry = value;
    }

    /**
     * Gets the value of the strDelyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDelyState() {
        return strDelyState;
    }

    /**
     * Sets the value of the strDelyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDelyState(String value) {
        this.strDelyState = value;
    }

    /**
     * Gets the value of the strDelyArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDelyArea() {
        return strDelyArea;
    }

    /**
     * Sets the value of the strDelyArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDelyArea(String value) {
        this.strDelyArea = value;
    }

    /**
     * Gets the value of the iInvItemCount property.
     * 
     */
    public int getIInvItemCount() {
        return iInvItemCount;
    }

    /**
     * Sets the value of the iInvItemCount property.
     * 
     */
    public void setIInvItemCount(int value) {
        this.iInvItemCount = value;
    }

    /**
     * Gets the value of the dInvValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDInvValue() {
        return dInvValue;
    }

    /**
     * Sets the value of the dInvValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDInvValue(BigDecimal value) {
        this.dInvValue = value;
    }

    /**
     * Gets the value of the dInvVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDInvVolume() {
        return dInvVolume;
    }

    /**
     * Sets the value of the dInvVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDInvVolume(BigDecimal value) {
        this.dInvVolume = value;
    }

    /**
     * Gets the value of the strReservationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrReservationDateTime() {
        return strReservationDateTime;
    }

    /**
     * Sets the value of the strReservationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrReservationDateTime(String value) {
        this.strReservationDateTime = value;
    }

    /**
     * Gets the value of the strReservationExpiryDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrReservationExpiryDatetime() {
        return strReservationExpiryDatetime;
    }

    /**
     * Sets the value of the strReservationExpiryDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrReservationExpiryDatetime(String value) {
        this.strReservationExpiryDatetime = value;
    }

    /**
     * Gets the value of the strSchReserveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSchReserveFlag() {
        return strSchReserveFlag;
    }

    /**
     * Sets the value of the strSchReserveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSchReserveFlag(String value) {
        this.strSchReserveFlag = value;
    }

    /**
     * Gets the value of the strDelyWHSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDelyWHSourceCode() {
        return strDelyWHSourceCode;
    }

    /**
     * Sets the value of the strDelyWHSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDelyWHSourceCode(String value) {
        this.strDelyWHSourceCode = value;
    }

    /**
     * Gets the value of the strSalesmanHRMSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSalesmanHRMSID() {
        return strSalesmanHRMSID;
    }

    /**
     * Sets the value of the strSalesmanHRMSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSalesmanHRMSID(String value) {
        this.strSalesmanHRMSID = value;
    }

    /**
     * Gets the value of the strCashierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCashierId() {
        return strCashierId;
    }

    /**
     * Sets the value of the strCashierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCashierId(String value) {
        this.strCashierId = value;
    }

    /**
     * Gets the value of the bManagerOverwriteFlag property.
     * 
     */
    public boolean isBManagerOverwriteFlag() {
        return bManagerOverwriteFlag;
    }

    /**
     * Sets the value of the bManagerOverwriteFlag property.
     * 
     */
    public void setBManagerOverwriteFlag(boolean value) {
        this.bManagerOverwriteFlag = value;
    }

    /**
     * Gets the value of the iExpDel property.
     * 
     */
    public int getIExpDel() {
        return iExpDel;
    }

    /**
     * Sets the value of the iExpDel property.
     * 
     */
    public void setIExpDel(int value) {
        this.iExpDel = value;
    }

    /**
     * Gets the value of the strDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDataSource() {
        return strDataSource;
    }

    /**
     * Sets the value of the strDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDataSource(String value) {
        this.strDataSource = value;
    }

    /**
     * Gets the value of the strCustRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCustRefNo() {
        return strCustRefNo;
    }

    /**
     * Sets the value of the strCustRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCustRefNo(String value) {
        this.strCustRefNo = value;
    }

    /**
     * Gets the value of the strCustMob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCustMob() {
        return strCustMob;
    }

    /**
     * Sets the value of the strCustMob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCustMob(String value) {
        this.strCustMob = value;
    }

}
