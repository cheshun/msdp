<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<form id="pagerForm" method="post" action="demo_page1.html">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<c:url value='/management/access/user/add'/>" target="navTab"><span>添加</span></a></li>
			<li><a class="edit" href="<c:url value='/management/access/user/edit?pk_data={pk_data}'/>" target="navTab"><span>修改</span></a></li>
		</ul>
	 </div> 
	<!-- layoutH="138" -->
	<table class="table" width="100%" layoutH="75">
		<thead>
			<tr>
				<th >序号</th>
				<th >pk_user</th>
				<th >用户名称</th>
				<th >用户编码</th>
				<th >用户备注</th>
				<th >用户密码</th>
				<th >电话</th>
				<th >邮箱</th>
				<th >出生年月日</th>
				<th >启用日期</th>
				<th >失效日期</th>
				<th >锁定标志</th>
				<th >ts</th>
				<th >dr</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data}">
				<c:forEach items="${data}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_user }">
						<td>${index.count }</td>
						<td>${item.pk_user }</td>
						<td>${item.user_name }</td>
						<td>${item.user_code }</td>
						<td>${item.user_note }</td>
						<td>${item.user_password }</td>
						<td>${item.user_phone }</td>
						<td>${item.user_mail }</td>
						<td>${item.birthDate }</td>
						<td>${item.disable_date }</td>
						<td>${item.able_date }</td>
						<td>${item.locked_tag }</td>
						<td>${item.ts }</td>
						<td>${item.dr }</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
