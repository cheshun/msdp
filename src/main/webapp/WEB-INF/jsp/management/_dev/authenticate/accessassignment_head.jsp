<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include
	file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post"
		action="<c:url value='${actionurl}?pk_date=${param.pk_data }'/>"
		class="pageForm required-validate"
		onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="templateid" value="${paramvo.templateid}" />
		<input type="hidden" name="templatetype" value="${paramvo.templatetype}" />
		<input type="hidden" name="pk_button" value="${paramvo.pk_button }" />
		<input type="hidden" name="pk_data" value="${paramvo.pk_data}" />
		<input type="hidden" name="pk_parent" value="${paramvo.pk_parent}" />
		<input type="hidden" name="actiontype" value="${paramvo.actiontype}" />
		<div class="pageFormContent" layoutH="85" >
				 