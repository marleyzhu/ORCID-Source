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
package org.orcid.core.adapter.v3;

import java.util.Collection;
import java.util.List;

import org.orcid.jaxb.model.v3.dev1.record.summary.DistinctionSummary;
import org.orcid.jaxb.model.v3.dev1.record.Distinction;
import org.orcid.persistence.jpa.entities.OrgAffiliationRelationEntity;

/**
 * 
 * @author Angel Montenegro
 *
 */
public interface JpaJaxbDistinctionAdapter {

    OrgAffiliationRelationEntity toOrgAffiliationRelationEntity(Distinction distinction);

    Distinction toDistinction(OrgAffiliationRelationEntity entity);
    
    DistinctionSummary toDistinctionSummary(OrgAffiliationRelationEntity entity);

    List<Distinction> toDistinction(Collection<OrgAffiliationRelationEntity> entities);
    
    List<DistinctionSummary> toDistinctionSummary(Collection<OrgAffiliationRelationEntity> entities);
    
    OrgAffiliationRelationEntity toOrgAffiliationRelationEntity(Distinction distinction, OrgAffiliationRelationEntity existing);

}
