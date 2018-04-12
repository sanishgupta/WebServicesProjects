
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="expdel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="strConceptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strTerrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDelyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "expdel",
    "strConceptCode",
    "strTerrID",
    "dt",
    "strArea",
    "strDelyType"
})
@XmlRootElement(name = "DeliveryAvailabilityCheckForDate")
public class DeliveryAvailabilityCheckForDate {

    protected boolean expdel;
    protected String strConceptCode;
    protected String strTerrID;
    protected String dt;
    protected String strArea;
    protected String strDelyType;

    /**
     * Gets the value of the expdel property.
     * 
     */
    public boolean isExpdel() {
        return expdel;
    }

    /**
     * Sets the value of the expdel property.
     * 
     */
    public void setExpdel(boolean value) {
        this.expdel = value;
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
     * Gets the value of the strTerrID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTerrID() {
        return strTerrID;
    }

    /**
     * Sets the value of the strTerrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTerrID(String value) {
        this.strTerrID = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDt(String value) {
        this.dt = value;
    }

    /**
     * Gets the value of the strArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrArea() {
        return strArea;
    }

    /**
     * Sets the value of the strArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrArea(String value) {
        this.strArea = value;
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

}
