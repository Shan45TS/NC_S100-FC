//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:44:06 PM PDT 
//


package net.opengis.gml._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopoComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopoComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopologyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximalComplex"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}superComplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}subComplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMembers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/&gt;
 *       &lt;attribute name="isMaximal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoComplexType", propOrder = {
    "maximalComplex",
    "superComplex",
    "subComplex",
    "topoPrimitiveMemberElement",
    "topoPrimitiveMembersElement"
})
public class TopoComplexType
    extends AbstractTopologyType
{

    @XmlElement(required = true)
    protected TopoComplexPropertyType maximalComplex;
    protected List<TopoComplexPropertyType> superComplex;
    protected List<TopoComplexPropertyType> subComplex;
    @XmlElement(name = "topoPrimitiveMember")
    protected List<TopoPrimitiveMemberType> topoPrimitiveMemberElement;
    @XmlElement(name = "topoPrimitiveMembers")
    protected TopoPrimitiveArrayAssociationType topoPrimitiveMembersElement;
    @XmlAttribute(name = "isMaximal")
    protected java.lang.Boolean isMaximal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the maximalComplex property.
     * 
     * @return
     *     possible object is
     *     {@link TopoComplexPropertyType }
     *     
     */
    public TopoComplexPropertyType getMaximalComplex() {
        return maximalComplex;
    }

    /**
     * Sets the value of the maximalComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoComplexPropertyType }
     *     
     */
    public void setMaximalComplex(TopoComplexPropertyType value) {
        this.maximalComplex = value;
    }

    /**
     * Gets the value of the superComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSuperComplex() {
        if (superComplex == null) {
            superComplex = new ArrayList<TopoComplexPropertyType>();
        }
        return this.superComplex;
    }

    /**
     * Gets the value of the subComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSubComplex() {
        if (subComplex == null) {
            subComplex = new ArrayList<TopoComplexPropertyType>();
        }
        return this.subComplex;
    }

    /**
     * Gets the value of the topoPrimitiveMemberElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topoPrimitiveMemberElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopoPrimitiveMemberElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoPrimitiveMemberType }
     * 
     * 
     */
    public List<TopoPrimitiveMemberType> getTopoPrimitiveMemberElement() {
        if (topoPrimitiveMemberElement == null) {
            topoPrimitiveMemberElement = new ArrayList<TopoPrimitiveMemberType>();
        }
        return this.topoPrimitiveMemberElement;
    }

    /**
     * Gets the value of the topoPrimitiveMembersElement property.
     * 
     * @return
     *     possible object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     */
    public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembersElement() {
        return topoPrimitiveMembersElement;
    }

    /**
     * Sets the value of the topoPrimitiveMembersElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     */
    public void setTopoPrimitiveMembersElement(TopoPrimitiveArrayAssociationType value) {
        this.topoPrimitiveMembersElement = value;
    }

    /**
     * Gets the value of the isMaximal property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isIsMaximal() {
        if (isMaximal == null) {
            return false;
        } else {
            return isMaximal;
        }
    }

    /**
     * Sets the value of the isMaximal property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsMaximal(java.lang.Boolean value) {
        this.isMaximal = value;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

}
