<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<form method="post"  action="<c:url value='/management/task/list'/>"  onsubmit="return navTabSearch(this,'${navTabId}')" >
<div class="pageHeader">
	<div class="searchBar">
		<ul class="searchContent">
		<%
		for(int i=0;i<1;i++){
		%>
			<li>
				<label>关键词<%=i %>：</label>
				<select name="priority">
					<option>不等于</option>
					<option>12</option>
				</select>
				<input type="text" name="templatetype" value="${param.keywords}"/>
			</li>	
			
		<%
		}
		%>
		</ul>
		<div class="subBar">
			<ul>						
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">搜索</button></div></div></li>
			</ul>
		</div>
	</div>
</div>
</form>
