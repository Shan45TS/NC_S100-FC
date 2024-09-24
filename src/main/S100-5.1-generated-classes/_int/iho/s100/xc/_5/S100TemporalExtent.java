//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:44:06 PM PDT 
//


package _int.iho.s100.xc._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Temporal extent
 * 
 * <p>Java class for S100_TemporalExtent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_TemporalExtent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeInstantBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="timeInstantEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_TemporalExtent", propOrder = {
    "timeInstantBegin",
    "timeInstantEnd"
})
public class S100TemporalExtent {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeInstantBegin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeInstantEnd;

    /**
     * Gets the value of the timeInstantBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeInstantBegin() {
        return timeInstantBegin;
    }

    /**
     * Sets the value of the timeInstantBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeInstantBegin(XMLGregorianCalendar value) {
        this.timeInstantBegin = value;
    }

    /**
     * Gets the value of the timeInstantEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeInstantEnd() {
        return timeInstantEnd;
    }

    /**
     * Sets the value of the timeInstantEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeInstantEnd(XMLGregorianCalendar value) {
        this.timeInstantEnd = value;
    }

}
