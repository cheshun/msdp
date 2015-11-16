<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/access/user/save'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			 <p style="display:none">
				<label>主键字段：</label>
				<input name="pk_user" type="text" size="30" value="${item.pk_user }" />
			</p> 
			<p>
				<label>用户名称：</label>
				<input name="user_name" type="text" size="30" value="${item.user_name }"/>
			</p>
			<p>
				<label>用户编码：</label>
				<input type="text" name="user_code" size="30" value="${item.user_code }" />
			</p>
			<%-- <p >
				<label>默认角色：</label>
				<input name="pk_role" type="text" size="30" value="${item.pk_role }" />
			</p> --%>
			<p>
				<label>默认角色：</label>
				<input type="hidden" id="orgLookup.pk_role" name="pk_role" value="${role.pk_role }"/>
				<input type="text" style="width:155px" class="required" id="orgLookup.orgName" value="${role.role_name }"  />
				<a class="btnLook" href="management/uicomponent/ref/index.action?reftype=SYS_ROLE&itemkey=pk_role" lookupGroup="orgLookup">查找带回</a>		
			</p>
			<p>
				<label>密码：</label>
				<input type="password" name="user_password" class="alphanumeric" value="${item.user_password }" size="30">
			</p>
			<p>
				<label>电话：</label>
				<input type="text" name="user_phone" class="phone" alt="请输入您的电话"  size="30" value="${item.user_phone }"/>
			</p> 
			<p>
				<label>邮箱：</label>
				<input type="text" size="30" name="user_mail" class="email" alt="请输入您的电子邮件" value="${item.user_mail }"/>
			</p>
			<p>
				<label>生日：</label>
				<input type="text" size="27" name="birthDate" class="date" value="${item.birthDate }"/>
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>启用日期：</label>
				<input type="text" name="able_date" class="date"  size="27"  value="${item.able_date }"/>
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>失效日期：</label>
				<input type="text" name="disable_date" class="date"  size="27" value="${item.disable_date }" />
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>锁定标志：</label>
				<input type="text" name="locked_tag"   size="30" value="${item.locked_tag }"/>
			</p>
			<p class="nowrap">
				<label>备注：</label>
				<textarea name="user_note" cols="90" rows="2" class="textInput">${item.user_note }</textarea>
			</p>
			<%-- <p>
				<label>ts：</label>
				<input type="text" name="ts"   size="30" value="${item.ts }" />
			</p>
			<p>
				<label>dr：</label>
				<input type="text" name="dr"   size="30" value="${item.dr }" />
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
