<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li ><a class="add" href="<c:url value='/management/ui/template/billtemplate/add?pk_parent=${param.pk_data }'/>" target="dialog"><span>添加</span></a></li>
			<li><a class="icon" href="<c:url value='/management/ui/template/billtemplate/copy?pk_data={pk_data}'/>" target="dialog" title="复制模板"><span>复制模板</span></a></li>
			<li><a class="edit" href="<c:url value='/management/ui/template/billtemplate/edit?pk_data={pk_data}'/>" target="dialog"><span>修改</span></a></li>
			<li><a class="icon" href="<c:url value='/management/ui/template/billtemplate/item?templateid=${param.templateid }&pk_data={pk_data}'/>" target="navTab" title="模板字段管理"><span>模板字段管理</span></a></li>
			
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="50">
		<thead>
			<tr>
				<th >序号</th>
				<!-- <th >主键字段</th>
				<th >节点主键</th> -->
				<th >模板名称</th>
				<th >模板类型编码</th>
				<th >模板描述</th>
				<!-- <th >ts</th>
				<th >dr</th> -->
				<!-- <th >vdef1</th>
				<th >vdef2</th>
				<th >vdef3</th>
				<th >vdef4</th>
				<th >vdef5</th>
				<th >vdef6</th>
				<th >vdef7</th>
				<th >vdef8</th>
				<th >vdef9</th> -->
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_templet }">
						<td>${index.count }</td>
						<%-- <td>${item.pk_templet }</td>
						<td>${item.pk_node }</td> --%>
						<td>${item.templetuiname }</td>
						<td>${item.templatetypecode }</td>
						<td>${item.templetuicaption }</td>
						<%-- <td>${item.ts }</td>
						<td>${item.dr }</td> --%>
						<%-- <td>${item.vdef1 }</td>
						<td>${item.vdef2 }</td>
						<td>${item.vdef3 }</td>
						<td>${item.vdef4 }</td>
						<td>${item.vdef5 }</td>
						<td>${item.vdef6 }</td>
						<td>${item.vdef7 }</td>
						<td>${item.vdef8 }</td>
						<td>${item.vdef9 }</td> --%>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
