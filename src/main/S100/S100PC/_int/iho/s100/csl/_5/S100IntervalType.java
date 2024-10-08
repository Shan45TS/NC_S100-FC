//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100.csl._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_IntervalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="S100_IntervalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="openInterval"/&gt;
 *     &lt;enumeration value="geLtInterval"/&gt;
 *     &lt;enumeration value="gtLeInterval"/&gt;
 *     &lt;enumeration value="closedInterval"/&gt;
 *     &lt;enumeration value="gtSemiInterval"/&gt;
 *     &lt;enumeration value="geSemiInterval"/&gt;
 *     &lt;enumeration value="ltSemiInterval"/&gt;
 *     &lt;enumeration value="leSemiInterval"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_IntervalType")
@XmlEnum
public enum S100IntervalType {


    /**
     * The open interval
     * 
     */
    @XmlEnumValue("openInterval")
    OPEN_INTERVAL("openInterval"),

    /**
     * The right half-open interval
     * 
     */
    @XmlEnumValue("geLtInterval")
    GE_LT_INTERVAL("geLtInterval"),

    /**
     * The left half-open interval
     * 
     */
    @XmlEnumValue("gtLeInterval")
    GT_LE_INTERVAL("gtLeInterval"),

    /**
     * The closed interval
     * 
     */
    @XmlEnumValue("closedInterval")
    CLOSED_INTERVAL("closedInterval"),

    /**
     * The left half-open ray
     * 
     */
    @XmlEnumValue("gtSemiInterval")
    GT_SEMI_INTERVAL("gtSemiInterval"),

    /**
     * The left closed ray
     * 
     */
    @XmlEnumValue("geSemiInterval")
    GE_SEMI_INTERVAL("geSemiInterval"),

    /**
     * The right half-open ray
     * 
     */
    @XmlEnumValue("ltSemiInterval")
    LT_SEMI_INTERVAL("ltSemiInterval"),

    /**
     * The right closed ray
     * 
     */
    @XmlEnumValue("leSemiInterval")
    LE_SEMI_INTERVAL("leSemiInterval");
    private final String value;

    S100IntervalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100IntervalType fromValue(String v) {
        for (S100IntervalType c: S100IntervalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
