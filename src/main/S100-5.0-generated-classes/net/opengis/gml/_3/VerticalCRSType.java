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
 * <p>Java class for VerticalCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalCRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}verticalCS"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}verticalDatum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCRSType", propOrder = {
    "verticalCS",
    "verticalDatum"
})
public class VerticalCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "verticalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<VerticalCSPropertyType> verticalCS;
    @XmlElementRef(name = "verticalDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<VerticalDatumPropertyType> verticalDatum;

    /**
     * Gets the value of the verticalCS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalCSPropertyType> getVerticalCS() {
        return verticalCS;
    }

    /**
     * Sets the value of the verticalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     
     */
    public void setVerticalCS(JAXBElement<VerticalCSPropertyType> value) {
        this.verticalCS = value;
    }

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalDatumPropertyType> getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     
     */
    public void setVerticalDatum(JAXBElement<VerticalDatumPropertyType> value) {
        this.verticalDatum = value;
    }

}
