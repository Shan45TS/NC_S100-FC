//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100areafill._5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import _int.iho.s100symboldefinition._5.AreaFillBase;
import _int.iho.s100symboldefinition._5.ColorFill;
import _int.iho.s100symboldefinition._5.HatchFill;
import _int.iho.s100symboldefinition._5.PixmapFill;
import _int.iho.s100symboldefinition._5.SymbolFill;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.iho.s100areafill._5 package. 
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

    private final static QName _AreaFillBase_QNAME = new QName("http://www.iho.int/S100AreaFill/5.2", "areaFillBase");
    private final static QName _ColorFill_QNAME = new QName("http://www.iho.int/S100AreaFill/5.2", "colorFill");
    private final static QName _PixmapFill_QNAME = new QName("http://www.iho.int/S100AreaFill/5.2", "pixmapFill");
    private final static QName _SymbolFill_QNAME = new QName("http://www.iho.int/S100AreaFill/5.2", "symbolFill");
    private final static QName _HatchFill_QNAME = new QName("http://www.iho.int/S100AreaFill/5.2", "hatchFill");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.iho.s100areafill._5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaFillBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AreaFillBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100AreaFill/5.2", name = "areaFillBase")
    public JAXBElement<AreaFillBase> createAreaFillBase(AreaFillBase value) {
        return new JAXBElement<AreaFillBase>(_AreaFillBase_QNAME, AreaFillBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorFill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorFill }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100AreaFill/5.2", name = "colorFill", substitutionHeadNamespace = "http://www.iho.int/S100AreaFill/5.2", substitutionHeadName = "areaFillBase")
    public JAXBElement<ColorFill> createColorFill(ColorFill value) {
        return new JAXBElement<ColorFill>(_ColorFill_QNAME, ColorFill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PixmapFill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PixmapFill }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100AreaFill/5.2", name = "pixmapFill", substitutionHeadNamespace = "http://www.iho.int/S100AreaFill/5.2", substitutionHeadName = "areaFillBase")
    public JAXBElement<PixmapFill> createPixmapFill(PixmapFill value) {
        return new JAXBElement<PixmapFill>(_PixmapFill_QNAME, PixmapFill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolFill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SymbolFill }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100AreaFill/5.2", name = "symbolFill", substitutionHeadNamespace = "http://www.iho.int/S100AreaFill/5.2", substitutionHeadName = "areaFillBase")
    public JAXBElement<SymbolFill> createSymbolFill(SymbolFill value) {
        return new JAXBElement<SymbolFill>(_SymbolFill_QNAME, SymbolFill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HatchFill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HatchFill }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S100AreaFill/5.2", name = "hatchFill", substitutionHeadNamespace = "http://www.iho.int/S100AreaFill/5.2", substitutionHeadName = "areaFillBase")
    public JAXBElement<HatchFill> createHatchFill(HatchFill value) {
        return new JAXBElement<HatchFill>(_HatchFill_QNAME, HatchFill.class, null, value);
    }

}
