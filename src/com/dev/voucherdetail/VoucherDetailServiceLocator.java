/**
 * VoucherDetailServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dev.voucherdetail;

public class VoucherDetailServiceLocator extends org.apache.axis.client.Service implements com.dev.voucherdetail.VoucherDetailService {

    public VoucherDetailServiceLocator() {
    }


    public VoucherDetailServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VoucherDetailServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VoucherDetailPort
    private java.lang.String VoucherDetailPort_address = "http://localhost:8989/voucher/detail";

    public java.lang.String getVoucherDetailPortAddress() {
        return VoucherDetailPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VoucherDetailPortWSDDServiceName = "VoucherDetailPort";

    public java.lang.String getVoucherDetailPortWSDDServiceName() {
        return VoucherDetailPortWSDDServiceName;
    }

    public void setVoucherDetailPortWSDDServiceName(java.lang.String name) {
        VoucherDetailPortWSDDServiceName = name;
    }

    public com.dev.voucherdetail.VoucherDetailPortType getVoucherDetailPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VoucherDetailPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVoucherDetailPort(endpoint);
    }

    public com.dev.voucherdetail.VoucherDetailPortType getVoucherDetailPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dev.voucherdetail.VoucherDetailBindingStub _stub = new com.dev.voucherdetail.VoucherDetailBindingStub(portAddress, this);
            _stub.setPortName(getVoucherDetailPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVoucherDetailPortEndpointAddress(java.lang.String address) {
        VoucherDetailPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dev.voucherdetail.VoucherDetailPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dev.voucherdetail.VoucherDetailBindingStub _stub = new com.dev.voucherdetail.VoucherDetailBindingStub(new java.net.URL(VoucherDetailPort_address), this);
                _stub.setPortName(getVoucherDetailPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("VoucherDetailPort".equals(inputPortName)) {
            return getVoucherDetailPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dev.com/voucherdetail", "VoucherDetailService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "VoucherDetailPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VoucherDetailPort".equals(portName)) {
            setVoucherDetailPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
