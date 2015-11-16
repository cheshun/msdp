<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/ui/template/reporttemplate/additem?pk_parent=${param.pk_data }'/>" target="dialog"><span>添加</span></a></li>
			<li><a class="edit" href="<c:url value='/management/ui/template/reporttemplate/edititem?pk_data={pk_data}'/>" target="dialog"><span>修改</span></a></li>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="75">
		<thead>
			<tr>
				<th >序号</th>
				<!-- <th >主键字段</th>
				<th >上级主键</th> -->
				<th >列名称</th>
				<th >列编码</th>
				<th >显示顺序</th>
				<th >数据类型</th>
				<th >是否列表显示</th>
				<th >是否列表存在</th>
				<th >是否汇总字段</th>
				<th >宽度</th>
				<th >备注</th>
				<!-- <th >ts</th>
				<th >dr</th>
				<th >vdef1</th>
				<th >vdef2</th>
				<th >vdef3</th>
				<th >vdef4</th>
				<th >vdef5</th>
				<th >vdef6</th>
				<th >vdef7</th>
				<th >vdef8</th>
				<th >vdef9</th>
				 -->
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_reportitemtemplate }">
						<td>${index.count }</td>
						<%-- <td>${item.pk_reportitemtemplate }</td>
						<td>${item.pk_reporttemplate }</td> --%>
						<td>${item.itemname }</td>
						<td>${item.itemcode }</td>
						<td>${item.showorder }</td>
						<td>${item.datatype }</td>
						<td>${item.islistshow }</td>
						<td>${item.islist }</td>
						<td>${item.istotal }</td>
						<td>${item.width }</td>
						<td>${item.remark }</td>
						<%-- <td>${item.ts }</td>
						<td>${item.dr }</td>
						<td>${item.vdef1 }</td>
						<td>${item.vdef2 }</td>
						<td>${item.vdef3 }</td>
						<td>${item.vdef4 }</td>
						<td>${item.vdef5 }</td>
						<td>${item.vdef6 }</td>
						<td>${item.vdef7 }</td>
						<td>${item.vdef8 }</td>
						<td>${item.vdef9 }</td>
						 --%>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
