//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_SE_DigitalSignatureReference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="S100_SE_DigitalSignatureReference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RSA"/>
 *     &lt;enumeration value="DSA"/>
 *     &lt;enumeration value="ECDSA"/>
 *     &lt;enumeration value="ECDSA-224-SHA2-224"/>
 *     &lt;enumeration value="ECDSA-224-SHA3-224"/>
 *     &lt;enumeration value="ECDSA-256-SHA2-256"/>
 *     &lt;enumeration value="ECDSA-256-SHA3-256"/>
 *     &lt;enumeration value="ECDSA-384-SHA2"/>
 *     &lt;enumeration value="ECDSA-384-SHA3"/>
 *     &lt;enumeration value="AES-128"/>
 *     &lt;enumeration value="AES-192"/>
 *     &lt;enumeration value="AES-256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "S100_SE_DigitalSignatureReference")
@XmlEnum
public enum S100SEDigitalSignatureReference {


    /**
     * RSA with key length >= 2048 bits
     * 
     */
    RSA("RSA"),

    /**
     * DSA with key length >= 2048 bits
     * 
     */
    DSA("DSA"),

    /**
     * ECDSA with key length >= 224 bits
     * 
     */
    ECDSA("ECDSA"),

    /**
     *  224 bits ECDSA with SHA2-224 hashing
     * 
     */
    @XmlEnumValue("ECDSA-224-SHA2-224")
    ECDSA_224_SHA_2_224("ECDSA-224-SHA2-224"),

    /**
     *  224 bits ECDSA with SHA3-224 hashing
     * 
     */
    @XmlEnumValue("ECDSA-224-SHA3-224")
    ECDSA_224_SHA_3_224("ECDSA-224-SHA3-224"),

    /**
     *  256 bits ECDSA: SHA2-256
     * 
     */
    @XmlEnumValue("ECDSA-256-SHA2-256")
    ECDSA_256_SHA_2_256("ECDSA-256-SHA2-256"),

    /**
     *  256 bits ECDSA: SHA3-256
     * 
     */
    @XmlEnumValue("ECDSA-256-SHA3-256")
    ECDSA_256_SHA_3_256("ECDSA-256-SHA3-256"),

    /**
     *  384 bits ECDSA: SHA2-384
     * 
     */
    @XmlEnumValue("ECDSA-384-SHA2")
    ECDSA_384_SHA_2("ECDSA-384-SHA2"),

    /**
     *  384 bits ECDSA: SHA3-384
     * 
     */
    @XmlEnumValue("ECDSA-384-SHA3")
    ECDSA_384_SHA_3("ECDSA-384-SHA3"),

    /**
     * AES 128 bit keys
     * 
     */
    @XmlEnumValue("AES-128")
    AES_128("AES-128"),

    /**
     * AES 192 bit keys
     * 
     */
    @XmlEnumValue("AES-192")
    AES_192("AES-192"),

    /**
     * AES 256 bit keys
     * 
     */
    @XmlEnumValue("AES-256")
    AES_256("AES-256");
    private final String value;

    S100SEDigitalSignatureReference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100SEDigitalSignatureReference fromValue(String v) {
        for (S100SEDigitalSignatureReference c: S100SEDigitalSignatureReference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
