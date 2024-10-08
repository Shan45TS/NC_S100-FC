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
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResponsibilityPropertyType;


/**
 * <p>Java class for MD_Releasability_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Releasability_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="addressee" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Responsibility_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statement" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="disseminationConstraints" type="{http://standards.iso.org/iso/19115/-3/mco/1.0}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Releasability_Type", propOrder = {
    "addressee",
    "statement",
    "disseminationConstraints"
})
public class MDReleasabilityType
    extends AbstractObjectType
{

    protected List<AbstractResponsibilityPropertyType> addressee;
    protected CharacterStringPropertyType statement;
    protected List<MDRestrictionCodePropertyType> disseminationConstraints;

    /**
     * Gets the value of the addressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractResponsibilityPropertyType }
     * 
     * 
     */
    public List<AbstractResponsibilityPropertyType> getAddressee() {
        if (addressee == null) {
            addressee = new ArrayList<AbstractResponsibilityPropertyType>();
        }
        return this.addressee;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setStatement(CharacterStringPropertyType value) {
        this.statement = value;
    }

    /**
     * Gets the value of the disseminationConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disseminationConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisseminationConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getDisseminationConstraints() {
        if (disseminationConstraints == null) {
            disseminationConstraints = new ArrayList<MDRestrictionCodePropertyType>();
        }
        return this.disseminationConstraints;
    }

}
