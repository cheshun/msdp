<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="management/ui/template/querytemplate/save" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
		<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
		<input type="hidden" name="templateid" value="${param.templateid }"/>
		<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<div class="pageFormContent" layoutH="56">
			<p style="display:none">
				<label>主键字段：</label>
				<input name="pk_querytemplate" type="text" size="30"   />
			</p>
			<p style="display:none">
				<label>节点主键：</label>
				<input name="pk_node" type="text" size="30"  />
			</p> 
			<p>
				<label>模板名称：</label>
				<input name="name"   type="text" size="30" />
			</p> 
			<p>
				<label>模板编码：</label>
				<input name="code"   type="text" size="30" />
			</p> 
			<p>
				<label>模板类型编码：</label>
				<input type="text" name="templatetypecode" size="30" value="SYSTEM"/>
			</p>
			<p class="nowrap">
				<label>模板描述：</label>
				<textarea name="remark" cols="80" rows="2" ></textarea>
			</p>
			<p>
				<label>ts：</label>
				<input type="text" name="ts" size="30" />
			</p>
			<p>
				<label>dr：</label>
				<input type="text" name="dr" value="0" size="30" />
			</p>
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
