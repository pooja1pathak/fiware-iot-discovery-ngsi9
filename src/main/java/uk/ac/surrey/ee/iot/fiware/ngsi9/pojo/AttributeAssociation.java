//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.03 at 10:28:59 PM GMT 
//


package uk.ac.surrey.ee.iot.fiware.ngsi9.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttributeAssociation {

   
    @JsonProperty ("source")
    protected String sourceAttribute;
    @JsonProperty ("target")
    protected String targetAttribute;

    /**
     * Gets the value of the sourceAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAttribute() {
        return sourceAttribute;
    }

    /**
     * Sets the value of the sourceAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAttribute(String value) {
        this.sourceAttribute = value;
    }

    /**
     * Gets the value of the targetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAttribute() {
        return targetAttribute;
    }

    /**
     * Sets the value of the targetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAttribute(String value) {
        this.targetAttribute = value;
    }

}
