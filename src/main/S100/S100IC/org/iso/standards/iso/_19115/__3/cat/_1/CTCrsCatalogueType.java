//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:26:08 PM PDT 
//


package org.iso.standards.iso._19115.__3.cat._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_CrsCatalogue_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_CrsCatalogue_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/cat/1.0}AbstractCT_Catalogue_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameters" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_OperationParameters_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operation" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_Operation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="coordinateSystem" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_CoordinateSystem_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ellipsoid" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_Ellipsoid_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="datum" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_Datum_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operationMethod" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_OperationMethod_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="crs" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_CRS_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="primeMeridian" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_PrimeMeridian_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="axis" type="{http://standards.iso.org/iso/19115/-3/cat/1.0}CT_CoordinateSystemAxis_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_CrsCatalogue_Type", propOrder = {
    "parameters",
    "operation",
    "coordinateSystem",
    "ellipsoid",
    "datum",
    "operationMethod",
    "crs",
    "primeMeridian",
    "axis"
})
public class CTCrsCatalogueType
    extends AbstractCTCatalogueType
{

    protected List<CTOperationParametersPropertyType> parameters;
    protected List<CTOperationPropertyType> operation;
    protected List<CTCoordinateSystemPropertyType> coordinateSystem;
    protected List<CTEllipsoidPropertyType> ellipsoid;
    protected List<CTDatumPropertyType> datum;
    protected List<CTOperationMethodPropertyType> operationMethod;
    @XmlElement(required = true)
    protected List<CTCRSPropertyType> crs;
    protected List<CTPrimeMeridianPropertyType> primeMeridian;
    protected List<CTCoordinateSystemAxisPropertyType> axis;

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTOperationParametersPropertyType }
     * 
     * 
     */
    public List<CTOperationParametersPropertyType> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<CTOperationParametersPropertyType>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTOperationPropertyType }
     * 
     * 
     */
    public List<CTOperationPropertyType> getOperation() {
        if (operation == null) {
            operation = new ArrayList<CTOperationPropertyType>();
        }
        return this.operation;
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCoordinateSystemPropertyType }
     * 
     * 
     */
    public List<CTCoordinateSystemPropertyType> getCoordinateSystem() {
        if (coordinateSystem == null) {
            coordinateSystem = new ArrayList<CTCoordinateSystemPropertyType>();
        }
        return this.coordinateSystem;
    }

    /**
     * Gets the value of the ellipsoid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ellipsoid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEllipsoid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTEllipsoidPropertyType }
     * 
     * 
     */
    public List<CTEllipsoidPropertyType> getEllipsoid() {
        if (ellipsoid == null) {
            ellipsoid = new ArrayList<CTEllipsoidPropertyType>();
        }
        return this.ellipsoid;
    }

    /**
     * Gets the value of the datum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDatumPropertyType }
     * 
     * 
     */
    public List<CTDatumPropertyType> getDatum() {
        if (datum == null) {
            datum = new ArrayList<CTDatumPropertyType>();
        }
        return this.datum;
    }

    /**
     * Gets the value of the operationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTOperationMethodPropertyType }
     * 
     * 
     */
    public List<CTOperationMethodPropertyType> getOperationMethod() {
        if (operationMethod == null) {
            operationMethod = new ArrayList<CTOperationMethodPropertyType>();
        }
        return this.operationMethod;
    }

    /**
     * Gets the value of the crs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCRSPropertyType }
     * 
     * 
     */
    public List<CTCRSPropertyType> getCrs() {
        if (crs == null) {
            crs = new ArrayList<CTCRSPropertyType>();
        }
        return this.crs;
    }

    /**
     * Gets the value of the primeMeridian property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primeMeridian property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimeMeridian().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPrimeMeridianPropertyType }
     * 
     * 
     */
    public List<CTPrimeMeridianPropertyType> getPrimeMeridian() {
        if (primeMeridian == null) {
            primeMeridian = new ArrayList<CTPrimeMeridianPropertyType>();
        }
        return this.primeMeridian;
    }

    /**
     * Gets the value of the axis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCoordinateSystemAxisPropertyType }
     * 
     * 
     */
    public List<CTCoordinateSystemAxisPropertyType> getAxis() {
        if (axis == null) {
            axis = new ArrayList<CTCoordinateSystemAxisPropertyType>();
        }
        return this.axis;
    }

}
