//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package org.w3._2000.svg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2000.svg package. 
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

    private final static QName _Element_QNAME = new QName("http://www.w3.org/2000/svg", "element");
    private final static QName _Path_QNAME = new QName("http://www.w3.org/2000/svg", "path");
    private final static QName _Line_QNAME = new QName("http://www.w3.org/2000/svg", "line");
    private final static QName _Rect_QNAME = new QName("http://www.w3.org/2000/svg", "rect");
    private final static QName _Circle_QNAME = new QName("http://www.w3.org/2000/svg", "circle");
    private final static QName _Polyline_QNAME = new QName("http://www.w3.org/2000/svg", "polyline");
    private final static QName _Polygon_QNAME = new QName("http://www.w3.org/2000/svg", "polygon");
    private final static QName _G_QNAME = new QName("http://www.w3.org/2000/svg", "g");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2000.svg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Svg }
     * 
     */
    public Svg createSvg() {
        return new Svg();
    }

    /**
     * Create an instance of {@link Path }
     * 
     */
    public Path createPath() {
        return new Path();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link Rect }
     * 
     */
    public Rect createRect() {
        return new Rect();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link Ellipse }
     * 
     */
    public Ellipse createEllipse() {
        return new Ellipse();
    }

    /**
     * Create an instance of {@link Polyline }
     * 
     */
    public Polyline createPolyline() {
        return new Polyline();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link Container }
     * 
     */
    public Container createContainer() {
        return new Container();
    }

    /**
     * Create an instance of {@link Svg.Metadata }
     * 
     */
    public Svg.Metadata createSvgMetadata() {
        return new Svg.Metadata();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Element }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Element }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "element")
    public JAXBElement<Element> createElement(Element value) {
        return new JAXBElement<Element>(_Element_QNAME, Element.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Path }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Path }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "path", substitutionHeadNamespace = "http://www.w3.org/2000/svg", substitutionHeadName = "element")
    public JAXBElement<Path> createPath(Path value) {
        return new JAXBElement<Path>(_Path_QNAME, Path.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Line }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "line", substitutionHeadNamespace = "http://www.w3.org/2000/svg", substitutionHeadName = "element")
    public JAXBElement<Line> createLine(Line value) {
        return new JAXBElement<Line>(_Line_QNAME, Line.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rect }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Rect }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "rect", substitutionHeadNamespace = "http://www.w3.org/2000/svg", substitutionHeadName = "element")
    public JAXBElement<Rect> createRect(Rect value) {
        return new JAXBElement<Rect>(_Rect_QNAME, Rect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Circle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Circle }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "circle", substitutionHeadNamespace = "http://www.w3.org/2000/svg", substitutionHeadName = "element")
    public JAXBElement<Circle> createCircle(Circle value) {
        return new JAXBElement<Circle>(_Circle_QNAME, Circle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polyline }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Polyline }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "polyline", substitutionHeadNamespace = "http://www.w3.org/2000/svg", substitutionHeadName = "element")
    public JAXBElement<Polyline> createPolyline(Polyline value) {
        return new JAXBElement<Polyline>(_Polyline_QNAME, Polyline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "polygon", substitutionHeadNamespace = "http://www.w3.org/2000/svg", substitutionHeadName = "element")
    public JAXBElement<Polygon> createPolygon(Polygon value) {
        return new JAXBElement<Polygon>(_Polygon_QNAME, Polygon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Container }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Container }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/svg", name = "g", substitutionHeadNamespace = "http://www.w3.org/2000/svg", substitutionHeadName = "element")
    public JAXBElement<Container> createG(Container value) {
        return new JAXBElement<Container>(_G_QNAME, Container.class, null, value);
    }

}
