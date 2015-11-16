<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/ui/template/reporttemplate/add?pk_parent=${param.pk_data }'/>" target="dialog"><span>添加</span></a></li>
			<li><a class="edit" href="<c:url value='/management/ui/template/reporttemplate/edit?pk_data={pk_data}'/>" target="dialog"><span>修改</span></a></li>
			<li><a class="icon" href="<c:url value='/management/ui/template/reporttemplate/itemindex?pk_data={pk_data}'/>" target="navTab" title="模板管理"><span>模板管理</span></a></li>
			<%-- <li><a class="icon" href="<c:url value='/management/ui/template/button?pk_dtata={pk_data}'/>" target="navTab" title="模板管理"><span>模板按钮管理</span></a></li> --%>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="75">
		<thead>
			<tr>
				<th >序号</th>
				<!-- <th >主键字段</th>
				<th >节点主键</th> -->
				<th >模板名称</th>
				<th >模板编码</th>
				<th >模板类型编码</th>
				<th >备注</th>
				<!-- <th >ts</th>
				<th >dr</th>
				<th >vdef1</th>
				<th >vdef2</th>
				<th >vdef3</th>
				<th >vdef4</th>
				<th >vdef5</th> -->
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_reporttemplate }">
						<td>${index.count }</td>
						<%-- <td>${item.pk_reporttemplate }</td>
						<td>${item.pk_node }</td> --%>
						<td>${item.templatename }</td>
						<td>${item.templatecode }</td>
						<td>${item.templatetypecode }</td>
						<td>${item.remark }</td>
						<%-- <td>${item.ts }</td>
						<td>${item.dr }</td>
						<td>${item.vdef1 }</td>
						<td>${item.vdef2 }</td>
						<td>${item.vdef3 }</td>
						<td>${item.vdef4 }</td>
						<td>${item.vdef5 }</td> --%>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
