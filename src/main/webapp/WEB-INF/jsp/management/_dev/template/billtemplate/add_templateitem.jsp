<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/ui/template/billtemplate/item_save'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
			<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
			<input type="hidden" name="templateid" value="${param.templateid }"/>
			<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<div class="pageFormContent" layoutH="56">
			<!-- <p style="display:none">
				<label>外键字段：</label>
				<input name="pk_templet" type="text" size="30"  />
			</p>
			<p style="display:none">
				<label>主键字段：</label>
				<input name="pk_templet_item" type="text" />
			</p> -->
			<p>
				<label>字段编码：</label>
				<input type="text" name="itemkey" size="30" />
			</p>
			<p>
				<label>字段显示名称：</label>
				<input type="text" name="defaultshowname" size="30" />
			</p>
			<p style="display:none">
				<label>字段颜色：</label>
				<input type="text" name="itemcolor"   size="30" />
			</p> 
			<p>
				<label>默认值：</label>
				<input type="text" name="defaultvalue" size="30" />
			</p>
			<p style="display:none" > 
				<label>组编码：</label>
				<input type="text" name="group_code"  size="30"/>
			</p>
			<p style="display:none" >
				<label>页签编码：</label>
				<input type="text" name="tabcode" readonly="readonly" value="${param.templatetype }" size="30"/>
			</p>
			<p>
				<label>字段位置：</label>
				<select name="itempos" class="required combox" size="30" >
					<option value="1" selected >表头</option>
					<option value="2">标体</option>
				</select>
			</p>
			<p>
				<label>显示顺序：</label>
				<input type="text" name="showorder" class="digits" size="30" />
			</p>
			<p>
				<label>数据类型：</label>
				<select name="datatype" class="required combox" size="30" >
					<option value="text" selected ></option>
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
			<!-- <p>
				<label>css类型：</label>
				<select name="csstype" class="required combox" size="30" >
					<option value="text" selected ></option>
					<option value="text">文本</option>
					<option value="date">日期</option>
					<option value="password" >密码</option>
					<option value="digits" >整数</option>
					<option value="number" >小数</option>
					<option value="textarea" >大文本</option>
					<option value="select" >下拉</option>
					<option value="ref" >参照</option>
				</select>
			</p> -->
			<p class="nowrap">
				<label>参照类型：</label>
				<textarea name="reftype" cols="60" rows="2" ></textarea>
			</p>
			<p>
				<label>能否编辑：</label>
				<select name="isedit" class="required combox" size="30" >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>能够为空：</label>
				<select name="isnull" class="required combox" size="30" >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否卡片显示：</label>
				<select name="iscardshow" class="required combox" size="30" >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>是否列表显示：</label>
				<select name="islistshow" class="required combox" size="30" >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>列表是否存在：</label>
				<select name="islist" class="required combox" size="30" >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			<p>
				<label>卡片是否存在：</label>
				<select name="iscard" class="required combox" size="30" >
					<option value="Y" selected >是</option>
					<option value="N" >否</option>
				</select>
			</p>
			
			<p>
				<label>是否锁定：</label>
				<select name="islock" class="required combox" size="30" >
					<option value="Y" >是</option>
					<option value="N" selected >否</option>
				</select>
			</p>
			<p>
				<label>是否汇总字段：</label>
				<select name="istotal" class="required combox" size="30" >
					<option value="Y" >是</option>
					<option value="N" selected >否</option>
				</select>
			</p>
			<p class="nowrap">
				<label>加载公式：</label>
				<textarea name="loadformula" cols="80" rows="2" ></textarea>
			</p>
			<p class="nowrap">
				<label>编辑公式：</label>
				<textarea name="editformula" cols="80" rows="2" ></textarea>
			</p>
			<p class="nowrap">
				<label>验证公式：</label>
				<textarea name="validateformula" cols="80" rows="2" ></textarea>
			</p>
			<p>
				<label>输入长度：</label>
				<input type="text" class="digits" name="inputlength"  size="30" />
			</p>
			<p>
				<label>宽度：</label>
				<select name="width" class="combox" size="30" >
					<option value="" selected >默认</option>
					<option value="30" >中</option>
					<option value="42" >长</option>
				</select>
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
