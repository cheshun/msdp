<%@ include file="/include.inc.jsp"%>

<form id="pagerForm" method="post" action="#rel#">
	<input type="hidden" name="pageNum" value="${tabletemplatevo.pagevo.pageNum}" />
	<input type="hidden" name="condition" value="${tabletemplatevo.pagevo.condition}" />
	<input type="hidden" name="templateid" value="${paramvo.templateid}" />
	<input type="hidden" name="pageSize" value="${tabletemplatevo.pagevo.pageSize}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
</form>