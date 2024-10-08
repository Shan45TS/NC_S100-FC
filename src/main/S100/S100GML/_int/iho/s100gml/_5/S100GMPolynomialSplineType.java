//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:24:11 PM PDT 
//


package _int.iho.s100gml._5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:documentation xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.iho.int/s100gml/5.0" xmlns:gml="http://www.opengis.net/gml/3.2"&gt;Type for polynomial splines&lt;/xs:documentation&gt;
 * </pre>
 * 
 * 
 * <p>Java class for S100_GM_PolynomialSplineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_GM_PolynomialSplineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/s100gml/5.0}S100_GM_SplineCurveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="derivativeAtStart" type="{http://www.iho.int/s100gml/5.0}VectorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="derivativeAtEnd" type="{http://www.iho.int/s100gml/5.0}VectorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numDerivativeInterior" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_GM_PolynomialSplineType", propOrder = {
    "rest"
})
public class S100GMPolynomialSplineType
    extends S100GMSplineCurveType
{

    @XmlElementRefs({
        @XmlElementRef(name = "derivativeAtStart", namespace = "http://www.iho.int/s100gml/5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "derivativeAtEnd", namespace = "http://www.iho.int/s100gml/5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numDerivativeInterior", namespace = "http://www.iho.int/s100gml/5.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "NumDerivativeInterior" is used by two different parts of a schema. See: 
     * line 706 of file:/D:/NC_S100/Code/NC_S100/NC_S100-FC/src/main/resources/xsd/S100/5.0.0/S100GML/20220620/s100gmlbase.xsd
     * line 858 of file:/D:/NC_S100/Code/NC_S100/NC_S100-FC/src/main/resources/xsd/S100/5.0.0/S100GML/20220620/S100_gmlProfile.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link VectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
