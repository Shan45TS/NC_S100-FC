//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package org.iso.standards.iso._19115.__3.gco._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Use to represent the possible cardinality of a relation. Represented by a set of simple multiplicity ranges.
 * 
 * <p>Java class for Multiplicity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Multiplicity_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="range" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}MultiplicityRange_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Multiplicity_Type", propOrder = {
    "range"
})
public class MultiplicityType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected List<MultiplicityRangePropertyType> range;

    /**
     * Gets the value of the range property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiplicityRangePropertyType }
     * 
     * 
     */
    public List<MultiplicityRangePropertyType> getRange() {
        if (range == null) {
            range = new ArrayList<MultiplicityRangePropertyType>();
        }
        return this.range;
    }

}
