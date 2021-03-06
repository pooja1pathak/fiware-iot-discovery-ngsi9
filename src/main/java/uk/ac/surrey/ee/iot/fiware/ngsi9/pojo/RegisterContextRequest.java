//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 10:33:51 PM GMT 
//


package uk.ac.surrey.ee.iot.fiware.ngsi9.pojo;

import com.fasterxml.jackson.annotation.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType; 

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterContextRequest")
@XmlRootElement(name = "registerContextRequest")
@JsonRootName ("registerContextRequest")

//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)

public class RegisterContextRequest {
    
    @JsonProperty ("contextRegistrations")
    protected List<ContextRegistration> contextRegistration;
    protected String duration;
    protected String registrationId;
    
    protected Instant timestamp;

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    
    public List<ContextRegistration> getContextRegistration() {
        if (contextRegistration == null) {
            contextRegistration = new ArrayList<>();
        }
        return this.contextRegistration;
    }

    

    /**
     * Gets the value of the contextRegistrationList property.
     * 
     * @return
     *     possible object is
     *     {@link ContextRegistrationList }
     *     
     */
//    public ContextRegistrationList getContextRegistrationList() {
//        return contextRegistrationList;
//    }

    /**
     * Sets the value of the contextRegistrationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextRegistrationList }
     *     
     */
//    public void setContextRegistrationList(ContextRegistrationList value) {
//        this.contextRegistrationList = value;
//    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

}
