//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * Java content class for AlphabetType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 623)
 * <p>
 * <pre>
 * &lt;complexType name="AlphabetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="case" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="excludedChars" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requiredChars" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AlphabetType {


    /**
     * Gets the value of the excludedChars property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getExcludedChars();

    /**
     * Sets the value of the excludedChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setExcludedChars(java.lang.String value);

    /**
     * Gets the value of the requiredChars property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getRequiredChars();

    /**
     * Sets the value of the requiredChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setRequiredChars(java.lang.String value);

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCase();

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCase(java.lang.String value);

}
