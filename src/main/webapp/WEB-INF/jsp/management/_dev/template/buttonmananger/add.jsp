<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/ui/template/buttonmananger/save'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
		<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
		<input type="hidden" name="templateid" value="${param.templateid }"/>
		<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<div class="pageFormContent" layoutH="56">
			<!-- <p style="display:none">
				<label>按钮主键：</label>
				<input name="pk_button" type="text"  />
			</p>
			 -->
			<p>
				<label>按钮名称：</label>
				<input name="btn_name" type="text" size="30" />
			</p>
			<p>
				<label>按钮编码：</label>
				<input name="btn_code" type="text" size="30" />
			</p>
			<p>
				<label>按钮样式：</label>
				<select name="btn_class" class="required combox" size="30" >
					<option value="add" selected >增加</option>
					<option value="edit" >编辑</option>
					<option value="delete" >删除</option>
					<option value="icon" >其他</option>
				</select>
			</p>
			<p>
				<label>按钮连接：</label>
				<input type="text" name="btn_href" size="30" />
			</p>
			<p>
				<label>打开方式：</label>
				<select name="btn_target" class="required combox" size="30" >
					<option value="dialog" selected >弹层</option>
					<option value="navTab" >新页签</option>
					<option value="ajaxTodo" >异步</option>
				</select>
			</p>
			<p>
				<label>提示信息：</label>
				<input type="text" name="btn_title"   />
			</p>
			<p>
				<label>是否业务：</label>
				<select name="btn_type" class="required combox" size="30" >
					<option value="Y" selected="selected" >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>按钮顺序：</label>
				<input type="text"  name="btn_index" class="digits" >
			</p>
			<p class="nowrap">
				<label>动作处理类：</label>
				<textarea name="actionclass" cols="80" rows="2" ></textarea>
			</p>
			<p>
				<label>按钮状态：</label>
				<select name="btn_status" class="required combox"  >
					<option value="Y" selected="selected">可用</option>
					<option value="N" >禁用</option>
				</select>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>
