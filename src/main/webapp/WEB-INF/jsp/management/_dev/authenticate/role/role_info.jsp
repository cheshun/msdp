<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/access/role/add'/>" target="navTab" mask="true"><span>添加角色</span></a></li>
			<li><a class="add" href="<c:url value='/management/access/role/add?pk_parent=${param.pk_data }'/>" target="dialog" mask="true"><span>添加子角色</span></a></li>
			<li><a class="delete" href="<c:url value='/management/access/role/delete?pk_data=${param.pk_data }'/>" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
			<li><a class="edit" href="<c:url value='/management/access/role/edit?pk_data=${param.pk_data }'/>" target="navTab" mask="true"><span>修改角色</span></a></li>
			<li class="line">line</li>
			<li><a class="edit" href="<c:url value='/management/access/assignment/node/index?pk_data=${param.pk_data }'/>" target="dialog" mask="true"><span>分配权限</span></a></li>
		</ul>
</div>
<div class="pageFormContent" >
			<!-- <p>
				<label>主键字段：</label>
				<input name="pk_role" type="text" size="30"  />
			</p> -->
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
</div>
<div class="pageContent" >
	<div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>用户信息</span></a></li>
					<li><a href="javascript:;"><span>其他信息</span></a></li>
					<li><a href="javascript:;"><span>其他信息2</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div>
				<div class="panelBar">
				<ul class="toolBar">
					<li><a class="add" href="management/access/role/adduser" target="dialog" mask="true"><span>添加用户</span></a></li>
					<li><a class="delete" href="?uid={sid_obj}" target="ajaxTodo" title="确定要删除该用户吗?"><span>删除</span></a></li>
					<li class="line">line</li>
				</ul>
				</div>
				<table class="table" width="99%" layoutH="280"  >
				<thead>
					<tr>
						<th width="80">序号</th>
						<th width="100">用户名称</th>
						<th width="120" >用户编码</th>

					</tr>
				</thead>
				<tbody>
					<c:if test="${not empty data}">
						<c:forEach items="${data}" var="iitem" varStatus="index">
							<tr target="pk_date" rel="${iitem.pk_user }">
								<td>${index.count }</td>
								<td>${iitem.user_name }</td>
								<td>${iitem.user_code }</td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
				</table>
				<div class="panelBar">
					<div class="pages">
						<span>显示</span>
						<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value}, 'jbsxBox')">
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
							<option value="200">200</option>
						</select>
						<span>条，共50条</span>
					</div>
					<div class="pagination" rel="jbsxBox" totalCount="200" numPerPage="20" pageNumShown="5" currentPage="1"></div>
				</div>
			</div>
			
			<div>用户其他信息</div>
			
			<div>用户其他信息2</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
</div>
