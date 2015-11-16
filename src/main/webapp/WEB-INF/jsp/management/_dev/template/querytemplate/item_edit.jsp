<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="management/ui/template/querytemplate/item_save" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
		<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
		<input type="hidden" name="templateid" value="${param.templateid }"/>
		<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<div class="pageFormContent" layoutH="56">
			<p style="display:none">
				<label>主键字段：</label>
				<input name="pk_queryconditiontemplate" value="${item.pk_queryconditiontemplate }" type="text" size="30"   />
			</p>
			<p style="display:none">
				<label>查询模板主键：</label>
				<input name="pk_querytemplate"  value="${item.pk_querytemplate }" type="text" size="30"  />
			</p> 
			<p>
				<label>字段编码：</label>
				<input name="itemkey" value="${item.itemkey }"   type="text" size="30" />
			</p> 
			<p>
				<label>字段名称：</label>
				<input name="defaultshowname" value="${item.defaultshowname }"   type="text" size="30" />
			</p> 
			<p>
				<label>操作符：</label>
				<input type="text" value="${item.operatecode }" name="operatecode" size="30"  />
			</p>
			<p>
				<label>默认值：</label>
				<input type="text" value="${item.defaultvalue }" name="defaultvalue" size="30" />
			</p>
			<p>
				<label>字段位置：</label>
				<input type="text" value="${item.itempos }" name="itempos" size="30"  />
			</p>
			<p>
				<label>数据类型：</label>
				<select name="datatype" class=" combox" >
					<option value="${item.datatype }" selected ></option>
					<option value="text">文本</option>
					<option value="date">日期</option>
					<option value="password" >密码</option>
					<option value="digits" >整数</option>
					<option value="number" >小数</option>
					<option value="textarea" >大文本</option>
					<option value="select" >下拉</option>
					<option value="ref" >参照</option>
				</select>
			</p>
			<p>
				<label>css类型：</label>
				<select name="csstype" class="required combox" >
					<option value="${item.csstype }" selected ></option>
					<option value="text">文本</option>
					<option value="date">日期</option>
					<option value="password" >密码</option>
					<option value="digits" >整数</option>
					<option value="number" >小数</option>
					<option value="textarea" >大文本</option>
					<option value="select" >下拉</option>
					<option value="ref" >参照</option>
				</select>
			</p>
			<p>
				<label>参照类型：</label>
				<input type="text" value="${item.reftype }" name="reftype" size="30"  />
			</p>
			<p>
				<label>是否编辑：</label>
				<select name="isedit" class="required combox"  >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否为空：</label>
				<select name="isnull" class="required combox"  >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否使用：</label>
				<select name="isuse" class="required combox"  >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>vdef1：</label>
				<input name="vdef1"  type="text" value="${item.vdef1 }" size="30" />
			</p>
			<p>
				<label>vdef2：</label>
				<input name="vdef2"  type="text" value="${item.vdef2 }" size="30" />
			</p>
			<p>
				<label>vdef3：</label>
				<input name="vdef3"  type="text" value="${item.vdef3 }" size="30" />
			</p>
			<p>
				<label>vdef4：</label>
				<input name="vdef4"  type="text" value="${item.vdef4 }" size="30" />
			</p>
			<p>
				<label>vdef5：</label>
				<input name="vdef5"  type="text" value="${item.vdef5 }" size="30" />
			</p>
			<p>
				<label>vdef6：</label>
				<input name="vdef6"  type="text" value="${item.vdef6 }" size="30" />
			</p>
			<p>
				<label>vdef7：</label>
				<input name="vdef7"  type="text" value="${item.vdef7 }" size="30" />
			</p>
			<p>
				<label>vdef8：</label>
				<input name="vdef8"  type="text" value="${item.vdef8 }" size="30" />
			</p>
			<p>
				<label>vdef9：</label>
				<input name="vdef9"  type="text" value="${item.vdef9 }" size="30" />
			</p>
			<p>
				<label>ts：</label>
				<input type="text" value="${item.ts }" name="ts" size="30" />
			</p>
			<p>
				<label>dr：</label>
				<input type="text" value="${item.dr }" name="dr" value="0" size="30" />
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
