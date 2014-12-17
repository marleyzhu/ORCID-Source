/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.pojo.ajaxForm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.orcid.jaxb.model.message.FundingExternalIdentifier;
import org.orcid.jaxb.model.message.FundingExternalIdentifierType;
import org.orcid.jaxb.model.message.Url;

public class FundingExternalIdentifierForm implements ErrorsInterface, Serializable {

    private static final long serialVersionUID = 1L;

    private List<String> errors = new ArrayList<String>();
     
    private Text type;
    private Text value;
    private Text url;
    private Text putCode;
    
	@Override 
	public List<String> getErrors() {
		return this.errors;
	}
	@Override
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}	
	public Text getType() {
		return type;
	}
	public void setType(Text type) {
		this.type = type;
	}
	public Text getValue() {
		return value;
	}
	public void setValue(Text value) {
		this.value = value;
	}
	public Text getUrl() {
		return url;
	}
	public void setUrl(Text url) {
		this.url = url;
	}
	public Text getPutCode() {
		return putCode;
	}
	public void setPutCode(Text putCode) {
		this.putCode = putCode;
	}
	public static FundingExternalIdentifierForm valueOf(FundingExternalIdentifier fundingExternalIdentifier){
		FundingExternalIdentifierForm result = new FundingExternalIdentifierForm();		
		if(fundingExternalIdentifier.getType() != null)
			result.setType(Text.valueOf(fundingExternalIdentifier.getType().value()));
		if(fundingExternalIdentifier.getUrl() != null && !PojoUtil.isEmpty(fundingExternalIdentifier.getUrl().getValue()))
			result.setUrl(Text.valueOf(fundingExternalIdentifier.getUrl().getValue()));
		if(!PojoUtil.isEmpty(fundingExternalIdentifier.getValue()))
			result.setValue(Text.valueOf(fundingExternalIdentifier.getValue()));
		return result;
	}
	
	public FundingExternalIdentifier toFundingExternalIdentifier() {
		FundingExternalIdentifier result = new FundingExternalIdentifier();		
		if(!PojoUtil.isEmpty(type))
			result.setType(FundingExternalIdentifierType.fromValue(type.getValue()));
		if(!PojoUtil.isEmpty(url))
			result.setUrl(new Url(url.getValue()));
		else 
			result.setUrl(new Url());
		if(!PojoUtil.isEmpty(value))
			result.setValue(value.getValue());
		return result;
	}
}
