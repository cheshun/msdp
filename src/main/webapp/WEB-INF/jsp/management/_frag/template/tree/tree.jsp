<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<div layoutH="0" style="float:left;display:block;overflow:auto;width:300px;heigth:240px; border:solid 1px #CCC; line-height:21px; background:#fff "> 
		<ul class="tree treeFolder">
		
			<li><a href="javascript">任务中心</a>
				<ul>
					<li><a href="<c:url value='/management/ui/singletable/edit?templateid=0001AA1000000000ABDY&pk_data=0001AA1000000000ABCJ'/>" target="ajax" rel="jbsxBox">任务注册</a></li>
				</ul>	
			</li>
			<li><a href="javascript">系统功能</a>
				<ul>
					<li><a href="<c:url value='/management/ui/singletable/edit?templateid=0001AA1000000000ABDY&pk_data=0001AA1000000000ABDY'/>" target="ajax" rel="jbsxBox">节点管理</a></li>
				</ul>	
			</li>	
			
					
		</ul>
	</div>
	
	<div id="jbsxBox" class="unitBox" style="margin-left:246px;">
					<!--#include virtual="list1.html" -->
	</div>
</div>
