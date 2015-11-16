<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/ui/template/billtemplate/item_save'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<input type="hidden" name="pk_data" value="${param.pk_data }"/>
			<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
			<input type="hidden" name="templateid" value="${param.templateid }"/>
			<input type="hidden" name="actiontype" value="${param.actiontype }"/>
			<input name="pk_templet" type="hidden" size="30" value="${item.pk_templet }"  />
			<input name="pk_templet_item" type="hidden" value="${item.pk_templet_item }" />
			<p style="display:none">
				<label>组编码：</label>
				<input name="group_code" type="text" size="30" value="${item.group_code }"  />
			</p>
			<p style="display:none">
				<label>页签编码：</label>
				<input name="tabcode" type="text" size="30" value="${item.tabcode }"  />
			</p>
			<p>
				<label>字段编码：</label>
				<input type="text" name="itemkey" value="${item.itemkey }"  />
			</p>
			<p>
				<label>字段显示名称：</label>
				<input type="text" name="defaultshowname" class="textInput" value="${item.defaultshowname }"/>
			</p>
			
			<p>
				<label>默认值：</label>
				<input type="text" size="30" name="defaultvalue" value="${item.defaultvalue }" />
			</p>
			
			<p>
				<label>数据类型：</label>
				<select name="datatype" class="combox" >
					<option value="${item.datatype }"></option>
					<option value="text">文本</option>
					<option value="date">日期</option>
					<option value="datetime">日期时间</option>
					<option value="password" >密码</option>
					<option value="digits" >整数</option>
					<option value="number" >小数</option>
					<option value="textarea" >大文本</option>
					<option value="select" >下拉</option>
					<option value="ref" >参照</option>
				</select>
			</p>
			<%-- <p>
				<label>css类型：</label>
				<select name="csstype" class="combox" size="30" >
					<option value="${item.csstype }" ></option>
					<option value="text">文本</option>
					<option value="date">日期</option>
					<option value="password" >密码</option>
					<option value="digits" >整数</option>
					<option value="number" >小数</option>
					<option value="textarea" >大文本</option>
					<option value="select" >下拉</option>
					<option value="ref" >参照</option>
				</select>
			</p> --%>
			<p>
				<label>字段显示顺序：</label>
				<input type="text" name="showorder"   size="30" value="${item.showorder }" />
			</p>
			<p class="nowrap">
				<label>参照类型：</label>
				<textarea name="reftype" cols="60" rows="2" >${item.reftype }</textarea> 
			</p>
			<p style="display:none">
				<label>加载公式：</label>
				<input type="text" name="loadformula"   size="30" value="${item.loadformula }" />
			</p>
			
			<p>
				<label>能否编辑：</label>
				<select name="isedit" class="required combox" size="30" >
					<option value="${item.isedit }" selected ></option>
					<option value="Y"  >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>能否为空：</label>
				<select name="isnull" class="required combox" size="30" >
					<option value="${item.isnull }" selected ></option>
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否卡片显示：</label>
				<select name="iscardshow" class="required combox" size="30" >
					<option value="${item.iscardshow }" selected ></option>
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否列表显示：</label>
				<select name="islistshow" class="required combox" size="30" >
					<option value="${item.islistshow }" selected ></option>
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否列表：</label>
				<select name="islist" class="required combox" size="30" >
					<option value="${item.islist }" selected ></option>
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否卡片：</label>
				<select name="iscard" class="required combox" size="30" >
					<option value="${item.iscard }" selected ></option>
					<option value="Y" >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>输入长度：</label>
				<input type="text" name="inputlength"   size="30" value="${item.inputlength }" />
			</p>
			
			<p>
				<label>islock：</label>
				<input type="text" name="islock"   size="30" value="${item.islock }" />
			</p>
			<p>
				<label>istotal：</label>
				<input type="text" name="istotal"   size="30" value="${item.istotal }" />
			</p>
			<p>
				<label>字段颜色：</label>
				<input name="itemcolor"   type="text" size="30" value="${item.itemcolor }" />
			</p> 
			<p>
				<label>编辑公式：</label>
				<input type="text" name="editformula"   size="30" value="${item.editformula }" />
			</p>
			<p>
				<label>validateformula：</label>
				<input type="text" name="validateformula"   size="30" value="${item.validateformula }" />
			</p>
			<p>
				<label>字段位置：</label>
				<input type="text" size="30" name="itempos" value="${item.itempos }" />
			</p>
			<p>
				<label>width：</label>
				<input type="text" name="width"   size="30" value="${item.width }" />
			</p>
			<p>
				<label>ts：</label>
				<input type="text" name="ts"   size="30" value="${item.ts }" />
			</p>
			<p>
				<label>dr：</label>
				<input type="text" name="dr"   size="30" value="${item.dr }" />
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
