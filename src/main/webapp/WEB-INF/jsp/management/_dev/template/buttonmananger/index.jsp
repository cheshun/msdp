<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/ui/template/buttonmananger/add?pk_parent=${param.pk_data }'/>" target="dialog"><span>添加</span></a></li>
			<li><a class="edit" href="<c:url value='/management/ui/template/buttonmananger/edit?pk_data={pk_data}'/>" target="dialog"><span>修改</span></a></li>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="75">
		<thead>
			<tr>
				<!-- <th >pk_node</th>
				<th >pk_button</th> -->
				<th >按钮类型</th>
				<th >排序编号</th>
				<th >名称</th>
				<th >编码</th>
				<th >css类型</th>
				<th >链接</th>
				<th >打开方式</th>
				<th >鼠标覆盖时提示信息</th>
				<th >动作执行类型</th>
				<th >按钮状态</th>
				<!-- <th >ts</th>
				<th >dr</th> -->
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_button }">
						<%-- <td>${item.pk_node }</td>
						<td>${item.pk_button }</td> --%>
						<td>${item.btn_type }</td>
						<td>${item.btn_index }</td>
						<td>${item.btn_name }</td>
						<td>${item.btn_code }</td>
						<td>${item.btn_class }</td>
						<td>${item.btn_href }</td>
						<td>${item.btn_target }</td>
						<td>${item.btn_title }</td>
						<td>${item.actionclass }</td>
						<td>${item.btn_status }</td>
						<%-- <td>${item.ts }</td>
						<td>${item.dr }</td> --%>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
