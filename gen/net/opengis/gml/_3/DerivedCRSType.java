//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package net.opengis.gml._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivedCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}baseCRS"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}derivedCRSType"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedCRSType", propOrder = {
    "baseCRS",
    "derivedCRSType",
    "coordinateSystem"
})
public class DerivedCRSType
    extends AbstractGeneralDerivedCRSType
{

    @XmlElement(required = true)
    protected SingleCRSPropertyType baseCRS;
    @XmlElement(required = true)
    protected CodeWithAuthorityType derivedCRSType;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;

    /**
     * Gets the value of the baseCRS property.
     * 
     * @return
     *     possible object is
     *     {@link SingleCRSPropertyType }
     *     
     */
    public SingleCRSPropertyType getBaseCRS() {
        return baseCRS;
    }

    /**
     * Sets the value of the baseCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleCRSPropertyType }
     *     
     */
    public void setBaseCRS(SingleCRSPropertyType value) {
        this.baseCRS = value;
    }

    /**
     * Gets the value of the derivedCRSType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getDerivedCRSType() {
        return derivedCRSType;
    }

    /**
     * Sets the value of the derivedCRSType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setDerivedCRSType(CodeWithAuthorityType value) {
        this.derivedCRSType = value;
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<CoordinateSystemPropertyType> getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Sets the value of the coordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public void setCoordinateSystem(JAXBElement<CoordinateSystemPropertyType> value) {
        this.coordinateSystem = value;
    }

}
