//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package net.opengis.gml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:KnotPropertyType encapsulates a knot to use it in a geometric type.
 * 
 * <p>Java class for KnotPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnotPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Knot" type="{http://www.opengis.net/gml/3.2}KnotType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnotPropertyType", propOrder = {
    "knot"
})
public class KnotPropertyType {

    @XmlElement(name = "Knot", required = true)
    protected KnotType knot;

    /**
     * Gets the value of the knot property.
     * 
     * @return
     *     possible object is
     *     {@link KnotType }
     *     
     */
    public KnotType getKnot() {
        return knot;
    }

    /**
     * Sets the value of the knot property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnotType }
     *     
     */
    public void setKnot(KnotType value) {
        this.knot = value;
    }

}
