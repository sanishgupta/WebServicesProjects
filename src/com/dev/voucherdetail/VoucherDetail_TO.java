/**
 * VoucherDetail_TO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dev.voucherdetail;

public class VoucherDetail_TO  implements java.io.Serializable {
    private java.lang.String operationName;

    private java.lang.String voucherNumber;

    private java.lang.String voucherStatus;

    private java.lang.String message;

    public VoucherDetail_TO() {
    }

    public VoucherDetail_TO(
           java.lang.String operationName,
           java.lang.String voucherNumber,
           java.lang.String voucherStatus,
           java.lang.String message) {
           this.operationName = operationName;
           this.voucherNumber = voucherNumber;
           this.voucherStatus = voucherStatus;
           this.message = message;
    }


    /**
     * Gets the operationName value for this VoucherDetail_TO.
     * 
     * @return operationName
     */
    public java.lang.String getOperationName() {
        return operationName;
    }


    /**
     * Sets the operationName value for this VoucherDetail_TO.
     * 
     * @param operationName
     */
    public void setOperationName(java.lang.String operationName) {
        this.operationName = operationName;
    }


    /**
     * Gets the voucherNumber value for this VoucherDetail_TO.
     * 
     * @return voucherNumber
     */
    public java.lang.String getVoucherNumber() {
        return voucherNumber;
    }


    /**
     * Sets the voucherNumber value for this VoucherDetail_TO.
     * 
     * @param voucherNumber
     */
    public void setVoucherNumber(java.lang.String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }


    /**
     * Gets the voucherStatus value for this VoucherDetail_TO.
     * 
     * @return voucherStatus
     */
    public java.lang.String getVoucherStatus() {
        return voucherStatus;
    }


    /**
     * Sets the voucherStatus value for this VoucherDetail_TO.
     * 
     * @param voucherStatus
     */
    public void setVoucherStatus(java.lang.String voucherStatus) {
        this.voucherStatus = voucherStatus;
    }


    /**
     * Gets the message value for this VoucherDetail_TO.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this VoucherDetail_TO.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherDetail_TO)) return false;
        VoucherDetail_TO other = (VoucherDetail_TO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationName==null && other.getOperationName()==null) || 
             (this.operationName!=null &&
              this.operationName.equals(other.getOperationName()))) &&
            ((this.voucherNumber==null && other.getVoucherNumber()==null) || 
             (this.voucherNumber!=null &&
              this.voucherNumber.equals(other.getVoucherNumber()))) &&
            ((this.voucherStatus==null && other.getVoucherStatus()==null) || 
             (this.voucherStatus!=null &&
              this.voucherStatus.equals(other.getVoucherStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOperationName() != null) {
            _hashCode += getOperationName().hashCode();
        }
        if (getVoucherNumber() != null) {
            _hashCode += getVoucherNumber().hashCode();
        }
        if (getVoucherStatus() != null) {
            _hashCode += getVoucherStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherDetail_TO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "VoucherDetail_TO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "operationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "voucherNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "voucherStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dev.com/voucherdetail", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
