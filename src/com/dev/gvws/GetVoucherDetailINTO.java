
package com.dev.gvws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVoucherDetail_INTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVoucherDetail_INTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voucherNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVoucherDetail_INTO", propOrder = {
    "operationName",
    "voucherNumber"
})
public class GetVoucherDetailINTO {

    @XmlElement(required = true)
    protected String operationName;
    @XmlElement(required = true)
    protected String voucherNumber;

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the voucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherNumber(String value) {
        this.voucherNumber = value;
    }

}
