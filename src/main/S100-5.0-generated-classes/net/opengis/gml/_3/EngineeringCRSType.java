//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:20:02 PM PDT 
//


package net.opengis.gml._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EngineeringCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineeringCRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}affineCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cylindricalCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}linearCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}polarCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}userDefinedCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}engineeringDatum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
    "affineCS",
    "cartesianCS",
    "cylindricalCS",
    "linearCS",
    "polarCS",
    "sphericalCS",
    "userDefinedCS",
    "coordinateSystem",
    "engineeringDatum"
})
public class EngineeringCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    protected CylindricalCSPropertyType cylindricalCS;
    protected LinearCSPropertyType linearCS;
    protected PolarCSPropertyType polarCS;
    @XmlElementRef(name = "sphericalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SphericalCSPropertyType> sphericalCS;
    protected UserDefinedCSPropertyType userDefinedCS;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;
    @XmlElementRef(name = "engineeringDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EngineeringDatumPropertyType> engineeringDatum;

    /**
     * Gets the value of the affineCS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<AffineCSPropertyType> getAffineCS() {
        return affineCS;
    }

    /**
     * Sets the value of the affineCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public void setAffineCS(JAXBElement<AffineCSPropertyType> value) {
        this.affineCS = value;
    }

    /**
     * Gets the value of the cartesianCS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<CartesianCSPropertyType> getCartesianCS() {
        return cartesianCS;
    }

    /**
     * Sets the value of the cartesianCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public void setCartesianCS(JAXBElement<CartesianCSPropertyType> value) {
        this.cartesianCS = value;
    }

    /**
     * Gets the value of the cylindricalCS property.
     * 
     * @return
     *     possible object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public CylindricalCSPropertyType getCylindricalCS() {
        return cylindricalCS;
    }

    /**
     * Sets the value of the cylindricalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public void setCylindricalCS(CylindricalCSPropertyType value) {
        this.cylindricalCS = value;
    }

    /**
     * Gets the value of the linearCS property.
     * 
     * @return
     *     possible object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public LinearCSPropertyType getLinearCS() {
        return linearCS;
    }

    /**
     * Sets the value of the linearCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public void setLinearCS(LinearCSPropertyType value) {
        this.linearCS = value;
    }

    /**
     * Gets the value of the polarCS property.
     * 
     * @return
     *     possible object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public PolarCSPropertyType getPolarCS() {
        return polarCS;
    }

    /**
     * Sets the value of the polarCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public void setPolarCS(PolarCSPropertyType value) {
        this.polarCS = value;
    }

    /**
     * Gets the value of the sphericalCS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<SphericalCSPropertyType> getSphericalCS() {
        return sphericalCS;
    }

    /**
     * Sets the value of the sphericalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public void setSphericalCS(JAXBElement<SphericalCSPropertyType> value) {
        this.sphericalCS = value;
    }

    /**
     * Gets the value of the userDefinedCS property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public UserDefinedCSPropertyType getUserDefinedCS() {
        return userDefinedCS;
    }

    /**
     * Sets the value of the userDefinedCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public void setUserDefinedCS(UserDefinedCSPropertyType value) {
        this.userDefinedCS = value;
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

    /**
     * Gets the value of the engineeringDatum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<EngineeringDatumPropertyType> getEngineeringDatum() {
        return engineeringDatum;
    }

    /**
     * Sets the value of the engineeringDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public void setEngineeringDatum(JAXBElement<EngineeringDatumPropertyType> value) {
        this.engineeringDatum = value;
    }

}
