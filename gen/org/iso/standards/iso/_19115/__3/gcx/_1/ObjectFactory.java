//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.gcx._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.iso.standards.iso._19115.__3.gcx._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MimeFileType_QNAME = new QName("http://standards.iso.org/iso/19115/-3/gcx/1.0", "MimeFileType");
    private final static QName _Anchor_QNAME = new QName("http://standards.iso.org/iso/19115/-3/gcx/1.0", "Anchor");
    private final static QName _FileName_QNAME = new QName("http://standards.iso.org/iso/19115/-3/gcx/1.0", "FileName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.iso.standards.iso._19115.__3.gcx._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnchorType }
     * 
     */
    public AnchorType createAnchorType() {
        return new AnchorType();
    }

    /**
     * Create an instance of {@link FileNameType }
     * 
     */
    public FileNameType createFileNameType() {
        return new FileNameType();
    }

    /**
     * Create an instance of {@link MimeFileTypeType }
     * 
     */
    public MimeFileTypeType createMimeFileTypeType() {
        return new MimeFileTypeType();
    }

    /**
     * Create an instance of {@link MimeFileTypePropertyType }
     * 
     */
    public MimeFileTypePropertyType createMimeFileTypePropertyType() {
        return new MimeFileTypePropertyType();
    }

    /**
     * Create an instance of {@link AnchorPropertyType }
     * 
     */
    public AnchorPropertyType createAnchorPropertyType() {
        return new AnchorPropertyType();
    }

    /**
     * Create an instance of {@link FileNamePropertyType }
     * 
     */
    public FileNamePropertyType createFileNamePropertyType() {
        return new FileNamePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MimeFileTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/gcx/1.0", name = "MimeFileType", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/gco/1.0", substitutionHeadName = "CharacterString")
    public JAXBElement<MimeFileTypeType> createMimeFileType(MimeFileTypeType value) {
        return new JAXBElement<MimeFileTypeType>(_MimeFileType_QNAME, MimeFileTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnchorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/gcx/1.0", name = "Anchor", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/gco/1.0", substitutionHeadName = "CharacterString")
    public JAXBElement<AnchorType> createAnchor(AnchorType value) {
        return new JAXBElement<AnchorType>(_Anchor_QNAME, AnchorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://standards.iso.org/iso/19115/-3/gcx/1.0", name = "FileName", substitutionHeadNamespace = "http://standards.iso.org/iso/19115/-3/gco/1.0", substitutionHeadName = "CharacterString")
    public JAXBElement<FileNameType> createFileName(FileNameType value) {
        return new JAXBElement<FileNameType>(_FileName_QNAME, FileNameType.class, null, value);
    }

}
