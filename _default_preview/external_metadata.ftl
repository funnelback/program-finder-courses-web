<#ftl output_format="HTML" encoding="utf-8" />
<#import "/web/templates/modernui/funnelback_classic.ftl" as s/>
<#import "/web/templates/modernui/funnelback.ftl" as fb/>

<@s.Results>
    <#if s.result.class.simpleName != "TierBar">
        ${s.result.liveUrl} stencilsProgramDepartment:"${s.result.customData.dep!}"
    </#if>
</@s.Results>