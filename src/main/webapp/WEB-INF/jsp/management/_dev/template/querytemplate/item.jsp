<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include
	file="/include.inc.jsp"%>
<div class="pageContent" style="padding: 0px">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add"
				href="management/ui/template/querytemplate/item_add?pk_parent=${param.pk_data }"
				target="dialog"><span>添加</span></a></li>
			<li><a class="edit"
				href="management/ui/template/querytemplate/item_edit?pk_data={pk_data}"
				target="dialog"><span>修改</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="50">
		<thead>
			<tr>
				<!-- <th>pk_queryconditiontemplate</th>
				<th>pk_querytemplate</th> -->
				<th>编码</th>
				<th>显示名称</th>
				<th>操作符</th>
				<th>默认值</th>
				<th>显示位置</th>
				<th>数据类型</th>
				<th>css类型</th>
				<th>参照类型</th>
				<th>是否编辑</th>
				<th>是否为空</th>
				<th>是否使用</th>
				<th>ts</th>
				<th>dr</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_queryconditiontemplate }">
						<%-- <td>${item.pk_queryconditiontemplate }</td>
						<td>${item.pk_querytemplate }</td> --%>
						<td>${item.itemkey }</td>
						<td>${item.defaultshowname }</td>
						<td>${item.operatecode }</td>
						<td>${item.defaultvalue }</td>
						<td>${item.itempos }</td>
						<td>${item.datatype }</td>
						<td>${item.csstype }</td>
						<td>${item.reftype }</td>
						<td>${item.isedit }</td>
						<td>${item.isnull }</td>
						<td>${item.isuse }</td>
						<td>${item.ts }</td>
						<td>${item.dr }</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
