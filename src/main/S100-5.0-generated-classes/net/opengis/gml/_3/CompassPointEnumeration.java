//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:20:02 PM PDT 
//


package net.opengis.gml._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompassPointEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CompassPointEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="NNE"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="ENE"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="ESE"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SSE"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="SSW"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="WSW"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="WNW"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="NNW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompassPointEnumeration")
@XmlEnum
public enum CompassPointEnumeration {

    N,
    NNE,
    NE,
    ENE,
    E,
    ESE,
    SE,
    SSE,
    S,
    SSW,
    SW,
    WSW,
    W,
    WNW,
    NW,
    NNW;

    public String value() {
        return name();
    }

    public static CompassPointEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
