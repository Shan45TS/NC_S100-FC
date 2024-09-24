//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.mco._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100.xc._5.S100ClassificationCodePropertyType;
import org.iso.standards.iso._19115.__3.gco._1.CodeListValueType;


/**
 * <p>Java class for MD_ClassificationCode_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_ClassificationCode_PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://standards.iso.org/iso/19115/-3/mco/1.0}MD_ClassificationCode"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}nilReason"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ClassificationCode_PropertyType", propOrder = {
    "mdClassificationCode"
})
@XmlSeeAlso({
    S100ClassificationCodePropertyType.class
})
public class MDClassificationCodePropertyType {

    @XmlElement(name = "MD_ClassificationCode")
    protected CodeListValueType mdClassificationCode;
    @XmlAttribute(name = "nilReason", namespace = "http://standards.iso.org/iso/19115/-3/gco/1.0")
    protected List<String> nilReason;

    /**
     * Gets the value of the mdClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListValueType }
     *     
     */
    public CodeListValueType getMDClassificationCode() {
        return mdClassificationCode;
    }

    /**
     * Sets the value of the mdClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListValueType }
     *     
     */
    public void setMDClassificationCode(CodeListValueType value) {
        this.mdClassificationCode = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

}
