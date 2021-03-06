//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.04 at 03:29:07 PM GMT 
//


package uk.ac.surrey.ee.iot.fiware.ngsi9.pojo; 

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.ArrayList;
import java.util.List;

@JsonRootName ("ContextRegistration")
public class ContextRegistration {  

    @JsonProperty ("entities")
//    @XmlElementWrapper(name="entityIdList")
    protected List<EntityId> entityId;
//    @XmlElementWrapper(name="contextRegistrationAttributeList")
    @JsonProperty ("attributes")
    protected List<ContextRegistrationAttribute> contextRegistrationAttribute;    
//    @XmlElementWrapper(name="registrationMetadata")
    @JsonProperty ("metadatas")
    protected List<ContextMetadata> contextMetadata;
//    @XmlElement(required = true)
//    @XmlSchemaType(name = "anyURI")
    protected String providingApplication;
    
    
    public List<ContextMetadata> getContextMetadata() {
        if (contextMetadata == null) {
            contextMetadata = new ArrayList<>();
        }
        return this.contextMetadata;
    }
    
    public List<EntityId> getEntityId() {
        if (entityId == null) {
            entityId = new ArrayList<>();
        }
        return this.entityId;
    }
    
    public List<ContextRegistrationAttribute> getContextRegistrationAttribute() {
        if (contextRegistrationAttribute == null) {
            contextRegistrationAttribute = new ArrayList<>();
        }
        return this.contextRegistrationAttribute;
    }

   
    /**
     * Gets the value of the providingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidingApplication() {
        return providingApplication;
    }

    /**
     * Sets the value of the providingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidingApplication(String value) {
        this.providingApplication = value;
    }
    

}
