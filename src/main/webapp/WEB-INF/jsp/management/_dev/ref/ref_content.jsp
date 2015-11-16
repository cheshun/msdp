<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/ui/template/billtemplate/add?pk_parent=${param.pk_data }'/>" target="dialog"><span>添加</span></a></li>
			<li><a class="edit" href="<c:url value='/management/ui/template/billtemplate/edit?pk_data={pk_data}'/>" target="dialog"><span>修改</span></a></li>
			<li><a class="icon" href="<c:url value='/management/ui/template/billtemplate/item?pk_data={pk_data}'/>" target="navTab" title="模板管理"><span>模板管理</span></a></li>
			<%-- <li><a class="icon" href="<c:url value='/management/ui/template/button?pk_data={pk_data}'/>" target="navTab" title="模板管理"><span>模板按钮管理</span></a></li> --%>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="160%" layoutH="75">
		<thead>
			<tr>
				<th >序号</th>
				<th >pk_ref</th>
				<th >pk_module</th>
				<th >参照类型</th>
				<th >主键字段</th>
				<th >显示字段</th>
				<th >参照信息</th>
				<th >参照模型类</th>
				<th >参照 表</th>
				<th >ts</th>
				<th >dr</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_ref }">
						<td>${index.count }</td>
						<td>${item.pk_ref }</td>
						<td>${item.pk_module }</td>
						<td>${item.reftype }</td>
						<td>${item.pk_field }</td>
						<td>${item.showfield }</td>
						<td>${item.field_codenames }</td>
						<td>${item.modelclass }</td>
						<td>${item.tablename }</td>
						<td>${item.ts }</td>
						<td>${item.dr }</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
