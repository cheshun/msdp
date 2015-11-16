<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<c:if test="${isshowadd }">
		<div class="panelBar">
			<ul class="toolBar">
			<li><a class="add" href="<c:url value="/management/ui/card/add?templateid=${paramvo.templateid}"/>" target="dialog" mask="true"><span>添加</span></a></li>
			</ul>
		</div>
	</c:if>
	<div layoutH="0" style="float:left;display:block;overflow:auto;width:250px;heigth:240px; border:solid 1px #CCC; line-height:21px; background:#fff "> 
