<div id="proxy" class="colorbox-content inline-modal">
    <div class="col-md-6 col-sm-6 col-xs-12">
        <h1 class="lightbox-title">${springMacroRequestContext.getMessage("common.change_proxy.Signinasaproxy")}</h1>
        <div>
            <#list profile.orcidBio.delegation.givenPermissionBy.delegationDetails as delegationDetails>
                    <form action="manage/switch-user" method="post" id="revokeDelegateForm${delegationDetails_index}">
                        <input type="hidden" name="giverOrcid" value="${delegationDetails.delegateSummary.orcid.value}"/>
                        <h4>${delegationDetails.delegateSummary.creditName.content}</h4>
                        <p>${springMacroRequestContext.getMessage("manage_delegation.tdORCID")} <a href="<@orcid.orcidUrl delegationDetails.delegateSummary.orcid.value/>">${delegationDetails.delegateSummary.orcid.value}</a><br />
                        ${springMacroRequestContext.getMessage("manage_delegation.tdapproved")} ${delegationDetails.approvalDate.value.toGregorianCalendar().time?date}</p>
                        <p>
                            <#if !inDelegationMode>
                                <button class="btn btn-primary" type="submit">${springMacroRequestContext.getMessage("common.change_proxy.Switchtothisuser")}</button>
                            </#if>
                        </p>
                    </form>
            </#list>
       </div>
    </div>
</div>