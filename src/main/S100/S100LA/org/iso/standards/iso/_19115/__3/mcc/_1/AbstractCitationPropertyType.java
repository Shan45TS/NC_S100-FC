//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:32:41 PM PDT 
//


package org.iso.standards.iso._19115.__3.mcc._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.cit._2.CICitationType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Java class for Abstract_Citation_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Abstract_Citation_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Citation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}ObjectReference"/&gt;
 *       &lt;attribute ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}nilReason"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abstract_Citation_PropertyType", propOrder = {
    "abstractCitation"
})
public class AbstractCitationPropertyType {

    @XmlElementRef(name = "Abstract_Citation", namespace = "http://standards.iso.org/iso/19115/-3/mcc/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCitationType> abstractCitation;
    @XmlAttribute(name = "nilReason", namespace = "http://standards.iso.org/iso/19115/-3/gco/1.0")
    protected List<String> nilReason;
    @XmlAttribute(name = "uuidref")
    protected String uuidref;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title1;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Gets the value of the abstractCitation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CICitationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCitationType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCitationType> getAbstractCitation() {
        return abstractCitation;
    }

    /**
     * Sets the value of the abstractCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CICitationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCitationType }{@code >}
     *     
     */
    public void setAbstractCitation(JAXBElement<? extends AbstractCitationType> value) {
        this.abstractCitation = value;
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

    /**
     * Gets the value of the uuidref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidref() {
        return uuidref;
    }

    /**
     * Sets the value of the uuidref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidref(String value) {
        this.uuidref = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle1(String value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

}
