//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package net.opengis.gml._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolygonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolygonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractSurfaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}exterior" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}interior" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonType", propOrder = {
    "exterior",
    "interior"
})
public class PolygonType
    extends AbstractSurfaceType
{

    protected AbstractRingPropertyType exterior;
    protected List<AbstractRingPropertyType> interior;

    /**
     * Gets the value of the exterior property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractRingPropertyType }
     *     
     */
    public AbstractRingPropertyType getExterior() {
        return exterior;
    }

    /**
     * Sets the value of the exterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractRingPropertyType }
     *     
     */
    public void setExterior(AbstractRingPropertyType value) {
        this.exterior = value;
    }

    /**
     * Gets the value of the interior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractRingPropertyType }
     * 
     * 
     */
    public List<AbstractRingPropertyType> getInterior() {
        if (interior == null) {
            interior = new ArrayList<AbstractRingPropertyType>();
        }
        return this.interior;
    }

}
