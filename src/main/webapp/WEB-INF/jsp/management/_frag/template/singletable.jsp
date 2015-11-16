<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<c:import url="../pager/pagerForm.jsp"></c:import>

<form method="post" rel="pagerForm" action="<c:url value='/management/ui/singletable/index'/>" onsubmit="return navTabSearch(this)">
</form>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<c:forEach items="${tabletemplatevo.listbuttons}" var="button" varStatus="sta1">
				<c:if test="${button.btn_type=='Y' }">
				<li><a class="${button.btn_class }" href="<c:url value='${button.btn_href }?templateid=${paramvo.templateid}&pk_button=${button.pk_button }&pk_data=${paramvo.pk_data}&pk_parent=${paramvo.pk_parent}'/>" target="${button.btn_target }" rel="${button.pk_button }"  mask="true" title="${button.btn_title }"><span>${button.btn_name }</span></a></li>
				</c:if>
				<c:if test="${button.btn_type=='N' }">
				<li><a class="${button.btn_class }" href="<c:url value='${button.btn_href }?templateid=${paramvo.templateid}&pk_button=${button.pk_button }&pk_parent=${paramvo.pk_parent}'/>" target="${button.btn_target }" rel="${button.pk_button }"  mask="true" title="${button.btn_title }"><span>${button.btn_name }</span></a></li>
				</c:if>
				<c:if test="${button.btn_type=='body' }">
				<li><a class="${button.btn_class }" href="<c:url value='${button.btn_href }&pk_data=${paramvo.pk_data}&actiontype=${button.btn_type}'/>" target="${button.btn_target }" rel="${button.pk_node }"  title="${button.btn_title }"><span>${button.btn_name }</span></a></li>
				</c:if>
			</c:forEach>
		</ul>
	 </div> 
	<!-- layoutH="138"
	<table class="table" width="<c:if test="${fn:length(tabletemplatevo.tablehead)<10}">100%</c:if><c:if test="${fn:length(tabletemplatevo.tablehead)>10}">${fn:length(tabletemplatevo.tablehead)}0%</c:if>" layoutH="75">
	 -->
	<table class="table" width="${tabletemplatevo.tableinfo.width}px" layoutH="75">
		<thead>
			<tr>
				<c:forEach items="${tabletemplatevo.tablehead}" var="tablehead" varStatus="sta2">
				<th width="40">${tablehead.name}</th>
				</c:forEach> 
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty tabletemplatevo.tabledata}">
				<c:forEach items="${tabletemplatevo.tabledata}" var="item" varStatus="sta3">
					<tr <c:forEach items="${item.bringlist}" var="bringvalue" >${bringvalue.code}="${bringvalue.value}" </c:forEach> >
					<c:forEach items="${item.datalist}" var="tdvalue" >
						<td>${tdvalue}</td>
					</c:forEach>
					</tr>
				</c:forEach>
			</c:if> 
		</tbody>
	</table>
	<c:import url="../pager/panelBar.jsp"></c:import>
</div>
