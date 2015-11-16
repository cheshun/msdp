<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/access/user/add'/>" target="navTab" mask="true"><span>添加用户</span></a></li>
			<li><a class="delete" href="<c:url value='/management/access/user/delete?pk_data=${param.pk_data }'/>" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
			<li><a class="edit" href="<c:url value='/management/access/user/edit?pk_data=${param.pk_data }'/>" target="navTab" mask="true"><span>修改用户</span></a></li>
			<li class="line">line</li>
			<li><a class="add" href="<c:url value='/management/access/assignment/role/index?pk_data=${param.pk_data }'/>" target="dialog" mask="true"><span>分配角色</span></a></li>
		</ul>
</div>
<div class="pageFormContent" layoutH="350" >
			<p style="display:none">
				<label>主键字段：</label>
				<input name="pk_user" disabled=true type="text" size="30"  />
			</p>
			<p>
				<label>用户名称：</label>
				<input name="user_name" disabled=true value="${item.user_name }" type="text" size="30" />
			</p>
			<p>
				<label>用户编码：</label>
				<input type="text" name="user_code" disabled=true value="${item.user_code }" size="30" />
			</p>
			<p >
				<label>默认角色：</label>
				<input type="hidden" name="pk_role" value="${item.pk_role }"/>
				<input type="text" disabled=true size="30" value="${role.role_name }"  />
			</p>
			<p>
				<label>用户类型：</label>
				<select name="user_type" disabled=true class="combox" size="30" >
					<option value="0001" selected >后台用户</option>
					<option value="0002" >前台用户</option>
				</select>
			</p>
			<p>
				<label>密码：</label>
				<input type="password" disabled=true name="user_password"  value="${item.user_password }" size="30">
			</p>
			<p>
				<label>电话：</label>
				<input type="text" disabled=true name="user_phone" class="phone"  value="${item.user_phone }"  size="30" />
			</p> 
			<p>
				<label>邮箱：</label>
				<input type="text" disabled=true size="30" name="user_mail" class="email"  value="${item.user_mail }"/>
			</p>
			<p>
				<label>生日：</label>
				<input type="text" disabled=true size="27"  value="${item.birthDate }" name="birthDate" class="date" />
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>启用日期：</label>
				<input type="text" name="able_date" disabled=true  value="${item.able_date }" class="date"  size="27" />
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>失效日期：</label>
				<input type="text" name="disable_date" disabled=true  value="${item.disable_date }" class="date"  size="27" />
				<a class="inputDateButton" href="javascript:;">选择</a>
			</p>
			<p>
				<label>锁定标志：</label>
				<input type="text" name="locked_tag" disabled=true  value="${item.locked_tag }"  size="30" />
			</p>
			<p class="nowrap">
				<label>备注：</label>
				<textarea name="user_note" cols="90" disabled=true rows="2" class="textInput">${item.user_note }</textarea>
			</p>
			
			<!-- 
			<div class="divider"></div>
			<p>
				<label>ts：</label>
				<input type="text" name="ts"   size="30" />
			</p>
			<p>
				<label>dr：</label>
				<input type="text" name="dr"   size="30" />
			</p> -->
		</div>
</div>
<div class="pageContent" >
	<div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>角色信息</span></a></li>
					<li><a href="javascript:;"><span>用户其他信息</span></a></li>
					<li><a href="javascript:;"><span>用户其他信息2</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div>
				<table class="table" width="100%" layoutH="335">
					<thead>
						<tr>
							<th width="80">序号</th>
							<th width="120">角色编码</th>
							<th width="100">角色名称</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${not empty data}">
							<c:forEach items="${data}" var="iitem" varStatus="index">
								<tr target="pk_date" rel="${iitem.pk_role }">
									<td>${index.count }</td>
									<td>${iitem.role_code }</td>
									<td>${iitem.role_name }</td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
			</div>
			
			<div>用户其他信息</div>
			
			<div>用户其他信息2</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
</div>
