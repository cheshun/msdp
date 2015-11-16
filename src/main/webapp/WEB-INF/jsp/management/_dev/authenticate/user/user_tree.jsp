<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<style type="text/css">
	ul.rightTools {float:right; display:block;}
	ul.rightTools li{float:left; display:block; margin-left:5px}
</style>
<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="demo/pagination/dialog2.html" target="dialog" mask="true"><span>添加尿检检测</span></a></li>
			<li><a class="delete" href="demo/pagination/ajaxDone3.html?uid={sid_obj}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
			<li><a class="edit" href="demo/pagination/dialog2.html?uid={sid_obj}" target="dialog" mask="true"><span>修改</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
		</ul>
	</div>
<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="demo_page1.html" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					用户名称：<input type="text" name="user_name" />
				</td>
				<td>
					用户编码：<input type="text" name="user_code" />
				</td>
				<td>
					用户类型：<input type="text" name="user_type" />
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
				<li><a class="button" href="demo_page6.html" target="dialog" mask="true" title="查询框"><span>高级检索</span></a></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div layoutH="146" style="float:left; display:block; overflow:auto; width:240px; border:solid 1px #CCC; line-height:21px; background:#fff">
		<ul class="tree treeFolder">
			<li><a href="javascript">实验室检测</a>
				<ul>
					<li><a href="demo/pagination/list1.html" target="ajax" rel="user_jbsxBox">用户A</a></li>
					<li><a href="demo/pagination/list1.html" target="ajax" rel="user_jbsxBox">用户B</a></li>
					<li><a href="demo/pagination/list1.html" target="ajax" rel="user_jbsxBox">用户C</a></li>
					<li><a href="demo/pagination/list1.html" target="ajax" rel="user_jbsxBox">用户D</a></li>
				</ul>
			</li>
						
		</ul>
	</div>
	<div id="user_jbsxBox" class="unitBox" style="margin-left:246px;">
					<!--#include virtual="list1.html" -->
	</div>
</div>
