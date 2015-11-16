<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<div class="pageHeader">
<form id="pagerForm" action="management/uicomponent/ref/" method="post" onsubmit="return dialogSearch(this, 'dialog');" >
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage"  value="10"  />
	<input type="hidden" name="orderField" />
	<input type="hidden" name="orderDirection" />
	 <div class="searchBar">
		<ul class="searchContent">
			<li>
				<label>部门名称:</label>
				<input class="textInput" name="orgName" value="" type="text">
			</li>	
		</ul>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">查询</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
   </div>
<div class="pageContent">

	<table class="table" layoutH="118" targetType="dialog" width="100%">
		<thead>
			<tr>
			<c:forEach items="${headlist}" var="head" varStatus="sta">
			<th orderfield="${head.value}">${head.name}</th>
			</c:forEach>
			<th width="80">查找带回</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${valuelist}" var="value" varStatus="sta">
			<tr onclick="javascript:$.bringBack({<c:forEach items="${value.bringlist}" var="brvalue" >${brvalue.name}:'${brvalue.value}'  ,</c:forEach>})">
				<c:forEach items="${value.refdatalist}" var="tdvalue" >
					<td>${tdvalue}</td>
				</c:forEach>
				<td><a class="btnSelect" href="javascript:$.bringBack({<c:forEach items="${value.bringlist}" var="brvalue" >${brvalue.name}:'${brvalue.value}'  ,</c:forEach>})" title="查找带回">选择</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

	<div class="panelBar">
		<div class="pages">
			<span>每页</span>
			<select name="numPerPage" onchange="dwzPageBreak({targetType:dialog, numPerPage:'10'})">
				<option value="10" selected="selected">10</option>
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
			</select>
			<span>条，共2条</span>
		</div>
		<div class="pagination" targetType="dialog" totalCount="2" numPerPage="10" pageNumShown="1" currentPage="1"></div>
	</div>
</div>