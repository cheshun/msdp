<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<%-- <c:import url="../../pager/pagerForm.jsp"></c:import>

<form method="post" rel="pagerForm1" action="<c:url value='/management/ui/tree/index'/>" >
</form>
 --%>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/access/resource/selectrole?pk_parent=${paramvo.pk_parent }&pk_data={pk_data}'/>" target="dialog"   mask="true" title=""><span>分配</span></a></li>
			<li><a class="add" href="management/access/resource/selectrole?pk_parent=${paramvo.pk_parent }&pk_data={pk_data}" target="dialog"  mask="true" title=""><span>取消分配</span></a></li>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="75">
		<thead>
			<tr>
				<c:forEach items="${headlist}" var="tablehead" varStatus="sta2">
				<th width="40">${tablehead.name}</th>
				</c:forEach> 
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty valuelist}">
				<c:forEach items="${valuelist}" var="item" varStatus="sta3">
					<tr  target="pk_data"  rel="<c:forEach items="${item.bringlist}" var="bringvalue" >${bringvalue.value}</c:forEach>" >
					<c:forEach items="${item.refdatalist}" var="tdvalue" >
						<td>${tdvalue}</td>
					</c:forEach>
					</tr>
				</c:forEach>
			</c:if> 
		</tbody>
	</table>
	<c:import url="../../pager/panelBar.jsp"></c:import>
</div>
