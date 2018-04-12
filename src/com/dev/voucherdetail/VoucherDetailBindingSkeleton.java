/**
 * VoucherDetailBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dev.voucherdetail;

public class VoucherDetailBindingSkeleton implements com.dev.voucherdetail.VoucherDetailPortType, org.apache.axis.wsdl.Skeleton {
    private com.dev.voucherdetail.VoucherDetailPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "getVoucherDetail_INTO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dev.com/voucherdetail", "GetVoucherDetail_INTO"), com.dev.voucherdetail.GetVoucherDetail_INTO.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getVoucherDetail", _params, new javax.xml.namespace.QName("http://dev.com/voucherdetail", "voucherDetail_TO"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "VoucherDetail_TO"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getVoucherDetail"));
        _oper.setSoapAction("getVoucherDetail");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getVoucherDetail") == null) {
            _myOperations.put("getVoucherDetail", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getVoucherDetail")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("voucherDetailFault");
        _fault.setQName(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "voucherDetailFault"));
        _fault.setClassName("com.dev.voucherdetail.VoucherDetailFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "VoucherDetailFault"));
        _oper.addFault(_fault);
    }

    public VoucherDetailBindingSkeleton() {
        this.impl = new com.dev.voucherdetail.VoucherDetailBindingImpl();
    }

    public VoucherDetailBindingSkeleton(com.dev.voucherdetail.VoucherDetailPortType impl) {
        this.impl = impl;
    }
    public com.dev.voucherdetail.VoucherDetail_TO getVoucherDetail(com.dev.voucherdetail.GetVoucherDetail_INTO parameters) throws java.rmi.RemoteException, com.dev.voucherdetail.VoucherDetailFault
    {
        com.dev.voucherdetail.VoucherDetail_TO ret = impl.getVoucherDetail(parameters);
        return ret;
    }

}
