<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<c:import url="../_frag/pager/pagerForm.jsp"></c:import>

<form method="post" rel="pagerForm" action="<c:url value='/management/task/list'/>" onsubmit="return navTabSearch(this)">
</form>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/task/search?navTabId=${paramvo.templateid}'/>" target="dialog" rel="list_search"><span>查询</span></a></li>
			<li><a class="add" href="<c:url value='/management/task/listdetail?action=add'/>" target="dialog" rel="list_add"><span>添加</span></a></li>
			<li><a class="edit" href="<c:url value='/management/task/listdetail?action=update&pk={pk_taskplugin}'/>" target="dialog" rel="list_update"><span>修改</span></a></li> 
			<li><a class="delete" href="demo/common/ajaxDone.html?pk_taskplugin={pk_taskplugin}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="75">
		<thead>
			<tr>
				<th width="40">序号</th>
				<th width="80">插件名称</th>
				<th width="120">任务插件类</th>
				<th width="170">插件描述</th>
				<th width="100">插件类型</th>
				<th width="50">所属模块</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty pagedata.data}">
				<c:forEach items="${pagedata.data}" var="item" varStatus="sta">
					<tr target="pk_taskplugin" rel="${item.pk_taskplugin}">
						<td>${sta.count}</td>
						<td>${item.pluginname}</td>
						<td>${item.pluginclass}</td>
						<td>${item.plugindescription}</td>
						<td>${item.plugintype}</td>
						<td>${item.belong_system}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<c:import url="../_frag/pager/panelBar.jsp"></c:import>
</div>
