<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/ui/template/buttonmananger/save'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
		<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
		<input type="hidden" name="templateid" value="${param.templateid }"/>
		<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<div class="pageFormContent" layoutH="56">
			<input name="pk_node" type="hidden" value="${item.pk_node }"  />
			<input name="pk_button"  type="hidden" value="${item.pk_button }"  />
			<input name="ts"  type="hidden" value="${item.ts }"  />
			<input name="dr"  type="hidden" value="${item.dr }"  />
			<p>
				<label>按钮类型：</label>
				<select name="btn_type" class="required combox"  >
					<option value="${item.btn_type }" ></option>
					<option value="Y" >业务</option>
					<option value="N" >非业务</option>
				</select>
			</p>
			<p>
				<label>按钮顺序：</label>
				<input type="text"  name="btn_index" value="${item.btn_index }" />
			</p>
			<p>
				<label>按钮名称：</label>
				<input name="btn_name" type="text" size="30" value="${item.btn_name }" />
			</p>
			<p>
				<label>按钮编码：</label>
				<input name="btn_code" type="text" size="30" value="${item.btn_code }" />
			</p>
			<p>
				<label>按钮状态：</label>
				<select name="btn_status" class="required combox"  >
					<option value="${item.btn_status }" ></option>
					<option value="N" >禁用</option>
					<option value="Y" >可用</option>
				</select>
			</p>
			<p>
				<label>按钮样式：</label>
				<select name="btn_class" class="required combox" >
					<option value="${item.btn_class }" selected ></option>
					<option value="add" >增加</option>
					<option value="edit" >编辑</option>
					<option value="delete" >删除</option>
					<option value="icon" >其他</option>
				</select>
			</p>
			<p>
				<label>按钮连接：</label>
				<input type="text" name="btn_href"  value="${item.btn_href }" size="30" />
			</p>
			<p>
				<label>打开方式：</label>
				<select name="btn_target" class="required combox"  >
					<option value="${item.btn_target }" selected ></option>
					<option value="dialog"  >弹层</option>
					<option value="navTab" >新页签</option>
					<option value="ajaxTodo" >异步</option>
				</select>
			</p>
			<p>
				<label>提示信息：</label>
				<input type="text" name="btn_title" value="${item.btn_title }"  />
			</p>
			<p class="nowrap">
				<label>动作处理类：</label>
				<textarea name=actionclass cols="80" rows="2" class="textInput">${item.actionclass }</textarea>
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
