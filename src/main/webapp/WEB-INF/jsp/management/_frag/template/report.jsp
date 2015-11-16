<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<c:import url="../pager/pagerForm.jsp"></c:import>

<form method="post" rel="pagerForm" action="<c:url value='/management/ui/report/index'/>" onsubmit="return navTabSearch(this)">
</form>
<c:if test="${not empty tabletemplatevo.pagevo.total}">
<div class="pageHeader">
	<div class="searchBar">
		<ul class="searchContent">
		<c:forEach var="item" items="${tabletemplatevo.pagevo.total}"> 
			<li >
				<label>${item.key}：</label>
				<input type="text" name="keywords" readonly="readonly" value="${item.value}"/>
			</li>
		</c:forEach>
			
			<%-- <li>
				<label>充值总额：</label>
				<input type="text" name="keywords" readonly="readonly" value="${tabletemplatevo.pagevo.total.totalrechare}"/>
			</li>
			<li>
				<label>投资总额：</label>
				<input type="text" name="keywords" readonly="readonly" value="${tabletemplatevo.pagevo.total.totalinvest}"/>
			</li> --%>
			<!-- <li>
				<label>我的客户：</label>
				<input type="text" name="keywords" readonly="readonly" value=""/>
			</li> -->
		</ul>
	</div>
</div>
</c:if>
<div class="pageContent">
	 <div class="panelBar">
		<%-- <ul class="toolBar">
			<li><a class="add" href="<c:url value='management/ui/report/query?templateid=${paramvo.templateid}'/>" target="dialog" rel=" "  mask="true" title=" "><span>查询</span></a></li>
			<li><a class="add" href="<c:url value='management/ui/report/query?templateid=${paramvo.templateid}'/>" target="dialog" rel=" "  mask="true" title=" "><span>查询</span></a></li>
		</ul> --%>
	 </div> 
	<!-- layoutH="138"
	<table class="table" width="<c:if test="${fn:length(tabletemplatevo.tablehead)<10}">100%</c:if><c:if test="${fn:length(tabletemplatevo.tablehead)>10}">${fn:length(tabletemplatevo.tablehead)}0%</c:if>" layoutH="75">
	 -->
	
	<table class="table" width="${tabletemplatevo.tableinfo.width}px"  <c:if test="${not empty tabletemplatevo.pagevo.total}"> layoutH="113"</c:if><c:if test="${ empty tabletemplatevo.pagevo.total}"> layoutH="75"</c:if>>
	
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
