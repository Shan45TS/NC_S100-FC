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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicFeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;group ref="{http://www.opengis.net/gml/3.2}dynamicProperties"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureType", propOrder = {
    "validTime",
    "history",
    "dataSource",
    "dataSourceReference"
})
@XmlSeeAlso({
    DynamicFeatureCollectionType.class
})
public class DynamicFeatureType
    extends AbstractFeatureType
{

    protected TimePrimitivePropertyType validTime;
    @XmlElementRef(name = "history", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<HistoryPropertyType> history;
    protected StringOrRefType dataSource;
    protected ReferenceType dataSourceReference;

    /**
     * Gets the value of the validTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setValidTime(TimePrimitivePropertyType value) {
        this.validTime = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     
     */
    public JAXBElement<HistoryPropertyType> getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     
     */
    public void setHistory(JAXBElement<HistoryPropertyType> value) {
        this.history = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDataSource(StringOrRefType value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the dataSourceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDataSourceReference() {
        return dataSourceReference;
    }

    /**
     * Sets the value of the dataSourceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDataSourceReference(ReferenceType value) {
        this.dataSourceReference = value;
    }

}
