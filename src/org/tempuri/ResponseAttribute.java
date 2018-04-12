
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataCaptureResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDateCheckResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliverySlot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseAttribute", propOrder = {
    "dataCaptureResponse",
    "deliveryDateCheckResponse",
    "connectionResponse",
    "deliveryDate",
    "deliverySlot",
    "errorMessage"
})
public class ResponseAttribute {

    @XmlElement(name = "DataCaptureResponse")
    protected String dataCaptureResponse;
    @XmlElement(name = "DeliveryDateCheckResponse")
    protected String deliveryDateCheckResponse;
    @XmlElement(name = "ConnectionResponse")
    protected String connectionResponse;
    @XmlElement(name = "DeliveryDate")
    protected String deliveryDate;
    @XmlElement(name = "DeliverySlot")
    protected String deliverySlot;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the dataCaptureResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCaptureResponse() {
        return dataCaptureResponse;
    }

    /**
     * Sets the value of the dataCaptureResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCaptureResponse(String value) {
        this.dataCaptureResponse = value;
    }

    /**
     * Gets the value of the deliveryDateCheckResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDateCheckResponse() {
        return deliveryDateCheckResponse;
    }

    /**
     * Sets the value of the deliveryDateCheckResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDateCheckResponse(String value) {
        this.deliveryDateCheckResponse = value;
    }

    /**
     * Gets the value of the connectionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionResponse() {
        return connectionResponse;
    }

    /**
     * Sets the value of the connectionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionResponse(String value) {
        this.connectionResponse = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliverySlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverySlot() {
        return deliverySlot;
    }

    /**
     * Sets the value of the deliverySlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverySlot(String value) {
        this.deliverySlot = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
