<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/access/role/save'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<!-- <p>
				<label>主键字段：</label>
				<input name="pk_role" type="text" size="30"  />
			</p> -->
			<input name="pk_role" value="${item.pk_role }" type="hidden" size="30"  />
			<input name="pk_parent_role" value="${item.pk_parent_role }" type="hidden" size="30"  />
			<p>
				<label>角色名称：</label>
				<input name="role_name" value="${item.role_name }" type="text" size="30" />
			</p>
			<p>
				<label>角色编码：</label>
				<input type="text" value="${item.role_code }" name="role_code" size="30" />
			</p>
			<p class="nowrap">
				<label>备注：</label>
				<textarea name="role_remark" value="${item.role_remark }" cols="90" rows="2" class="textInput"></textarea>
			</p>
			<%-- <div class="divider"></div>
			<p>
				<label>ts：</label>
				<input type="text" name="ts" value="${item.ts }"   size="30" />
			</p>
			<p>
				<label>dr：</label>
				<input type="text" name="dr" value="${item.dr }"   size="30" />
			</p> --%>
			
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
