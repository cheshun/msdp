<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<form id="pagerForm" method="post" action="/management/book/edit/${book.id}">
	<input type="hidden" name="pageNum" value="1" />
</form>

<div class="pageContent">
<form method="post" action="<c:url value='/management/task/deploy/save?navTabId=task_deploy&callbackType=closeCurrent'/>" class="pageForm required-validate" onsubmit="return validateCallback(this,dialogAjaxDone);">
	<input type="hidden" name="pk_taskdeploy" value="${item.pk_taskdeploy}"/>
	<input type="hidden" name="ts" value="${item.ts}"/>
	<input type="hidden" name="pk_taskplugin" value="${item.pk_taskplugin}"/>
	<div class="pageFormContent" layoutH="57">
		<p>
			<label>任务名称: </label>
			<input type="text" name="taskname" value="${item.taskname}" />
		</p>
		<p>
			<label>任务描述: </label>
			<input type="text" name="taskdescription" value="${item.taskdescription}" />
		</p>
		<p>
			<label>优先级别: </label>
			<select name="priority">
				<option value="${item.priority}" >${item.priority}</option>
				<option value="high" >high</option>
				<option value="normal" >normal</option>
				<option value="low" >low</option>
			</select>
			<!-- high,normal,low 优先级 线程相关 -->
		</p>
		<p>
			<label>周期 数字: </label>
			<input type="text" name="period" value="${item.period}" class="required digits" />
		</p>
		<p>
			<label>周期单位: </label>
			<select name="period_unit" class="required">
				<option value="${item.period_unit}" >${item.period_unit}</option>
				<option value="SECOND" >秒</option>
				<option value="MINUTE" >分</option>
				<option value="HOUR" >时</option>
				<option value="DAY" >天</option>
				<option value="WEEK" >周</option>
				<option value="MONTH" >月</option>
				<option value="YEAR" >年</option>
			</select>
			<!-- SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,YEAR -->
		</p>
		<p>
			<label>延迟时间: </label>
			<input type="text" name="delay" value="${item.delay}" maxlength="30"/>
		</p>
		<p>
			<label>开始时间: </label>
			<input type="text" name="startTime" class="date" datefmt="yyyy-MM-dd HH:mm:ss"  value="${item.startTime}"/>
			<a href="javascript:;" class="inputDateButton">选择</a>
		</p>
		<p>
			<label>结束时间: </label>
			<input type="text" name="overTime" class="date" datefmt="yyyy-MM-dd HH:mm:ss"  value="${item.overTime}"/>
			<a href="javascript:;" class="inputDateButton">选择</a>
		</p>
		<p>
			<label>是否可以: </label>
			<select name="runnable">
				<option value="${item.runnable}" >${item.runnable}</option>
				<option value="true" >true</option>
				<option value="false" >false</option>
			</select>
		</p>

	</div>

	<div class="formBar">
		<ul>
			<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
			<li><div class="button"><div class="buttonContent"><button type="button" class="close">关闭</button></div></div></li>
		</ul>
	</div>
</form>
</div>