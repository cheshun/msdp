<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<form id="pagerForm" method="post" action="demo_page1.html">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="management/task/deploy/detail?action=add" target="dialog" rel="deploy_add" title="添加任务部署" ><span>添加</span></a></li>
			<li><a class="edit" href="management/task/deploy/detail?action=update&pk={pk_taskdeploy}" target="dialog" rel="deploy_update" title="修改任务部署"><span>修改</span></a></li> 
			<li><a class="delete" href="demo/common/ajaxDone.html?pk_taskplugin={pk_taskplugin}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="75">
		<thead>
			<tr>
				<th width="40">序号</th>
				<th >任务名称</th>
				<th >周期数字</th>
				<th >周期单位</th>
				<th title="执行任务前的延迟时间单位是毫秒。">延迟时间</th>
				<th title="#yyyy-MM-dd-hh-mm-ss" >开始时间</th>
				<th title="#yyyy-MM-dd-hh-mm-ss" >结束时间</th>
				<th >任务是否可用</th>
				<th title=" 线程相关">优先级</th>
				<th >任务描述</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="sta">
					<tr target="pk_taskdeploy" rel="${item.pk_taskdeploy}">
						<td>${sta.count}</td>
						<td>${item.taskname}</td>
						<td>${item.period}</td>
						<td>${item.period_unit}</td>
						<td>${item.delay}</td>
						<td>${item.startTime}</td>
						<td>${item.overTime}</td>
						<td>${item.runnable}</td>
						<td>${item.priority}</td>
						<td>${item.taskdescription}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>条，共${totalCount}条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="200" numPerPage="20" pageNumShown="10" currentPage="1"></div>

	</div>
</div>
