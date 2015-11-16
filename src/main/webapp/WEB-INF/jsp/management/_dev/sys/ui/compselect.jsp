<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include.inc.jsp"%>

<!-- <h2 class="contentTitle">文本框/文本域</h2> -->
<div class="pageContent">
	<form method="post" action="management/sys/ui/compsave" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
		<input type="hidden" name="pk_node" value="${pk_node }"/>
		<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
		<input type="hidden" name="templateid" value="${param.templateid }"/>
		<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>是否生成参照：</label>
				<label><input type="checkbox" name="isref" value="Y" /></label>
			</p> 
			<p>
				<label>是否缓存：</label>
				<label><input type="checkbox" name="iscache" value="Y" /></label>
			</p>
			<p>
				<label>是否生成单据模板：</label>
				<label><input type="checkbox" name="isbilltemplate" value="Y" /></label>
			</p>
			<p>
				<label>是否生成查询模板：</label>
				<label><input type="checkbox" name="isquerytemplate" value="Y" /></label>
			</p>
			<p>
				<label>是否建表：</label>
				<label><input type="checkbox" name="iscreatetable" value="Y" /></label>
			</p>
			 <div class="divider"></div>
			  
				<label>选中按钮：</label>
				<label><input type="checkbox" name="button" value="add" />增加</label>
				<label><input type="checkbox" name="button" value="edit" />修改</label>
				<label><input type="checkbox" name="button" value="delete" />删除</label>
				<label><input type="checkbox" name="button" value="query" />查询</label>
				<!-- <label><input type="checkbox" name="c1" value="5" />审核</label>
				<label><input type="checkbox" name="c1" value="6" />取消审核</label> -->
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>
