/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.02 at 11:50:02 AM BST 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-orcid"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-common-name"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-reference"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-url"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "externalIdOrcid", "externalIdCommonName", "externalIdReference", "externalIdUrl" })
@XmlRootElement(name = "external-identifier")
public class ExternalIdentifier implements Serializable {

    @XmlElement(name = "external-id-orcid", required = true)
    protected ExternalIdOrcid externalIdOrcid;
    @XmlElement(name = "external-id-common-name", required = true)
    protected ExternalIdCommonName externalIdCommonName;
    @XmlElement(name = "external-id-reference", required = true)
    protected ExternalIdReference externalIdReference;
    @XmlElement(name = "external-id-url", required = true)
    protected ExternalIdUrl externalIdUrl;

    public ExternalIdentifier() {
        super();
    }

    public ExternalIdentifier(ExternalIdOrcid externalIdOrcid, ExternalIdReference externalIdReference) {
        super();
        this.externalIdOrcid = externalIdOrcid;
        this.externalIdReference = externalIdReference;
    }

    /**
     * Gets the value of the externalIdOrcid property.
     *
     * @return possible object is
     *         {@link ExternalIdOrcid }
     */
    public ExternalIdOrcid getExternalIdOrcid() {
        return externalIdOrcid;
    }

    /**
     * Sets the value of the externalIdOrcid property.
     *
     * @param value
     *         allowed object is
     *         {@link ExternalIdOrcid }
     */
    public void setExternalIdOrcid(ExternalIdOrcid value) {
        this.externalIdOrcid = value;
    }

    /**
     * Gets the value of the externalIdCommonName property.
     *
     * @return possible object is
     *         {@link ExternalIdCommonName }
     */
    public ExternalIdCommonName getExternalIdCommonName() {
        return externalIdCommonName;
    }

    /**
     * Sets the value of the externalIdCommonName property.
     *
     * @param value
     *         allowed object is
     *         {@link ExternalIdCommonName }
     */
    public void setExternalIdCommonName(ExternalIdCommonName value) {
        this.externalIdCommonName = value;
    }

    /**
     * Gets the value of the externalIdReference property.
     *
     * @return possible object is
     *         {@link ExternalIdReference }
     */
    public ExternalIdReference getExternalIdReference() {
        return externalIdReference;
    }

    /**
     * Sets the value of the externalIdReference property.
     *
     * @param value
     *         allowed object is
     *         {@link ExternalIdReference }
     */
    public void setExternalIdReference(ExternalIdReference value) {
        this.externalIdReference = value;
    }

    /**
     * Gets the value of the externalIdUrl property.
     *
     * @return possible object is
     *         {@link ExternalIdUrl }
     */
    public ExternalIdUrl getExternalIdUrl() {
        return externalIdUrl;
    }

    /**
     * Sets the value of the externalIdUrl property.
     *
     * @param value
     *         allowed object is
     *         {@link ExternalIdUrl }
     */
    public void setExternalIdUrl(ExternalIdUrl value) {
        this.externalIdUrl = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalIdentifier)) {
            return false;
        }

        ExternalIdentifier that = (ExternalIdentifier) o;

        if (externalIdCommonName != null ? !externalIdCommonName.equals(that.externalIdCommonName) : that.externalIdCommonName != null) {
            return false;
        }
        if (externalIdOrcid != null ? !externalIdOrcid.equals(that.externalIdOrcid) : that.externalIdOrcid != null) {
            return false;
        }
        if (externalIdReference != null ? !externalIdReference.equals(that.externalIdReference) : that.externalIdReference != null) {
            return false;
        }
        if (externalIdUrl != null ? !externalIdUrl.equals(that.externalIdUrl) : that.externalIdUrl != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = externalIdOrcid != null ? externalIdOrcid.hashCode() : 0;
        result = 31 * result + (externalIdCommonName != null ? externalIdCommonName.hashCode() : 0);
        result = 31 * result + (externalIdReference != null ? externalIdReference.hashCode() : 0);
        result = 31 * result + (externalIdUrl != null ? externalIdUrl.hashCode() : 0);
        return result;
    }
}
