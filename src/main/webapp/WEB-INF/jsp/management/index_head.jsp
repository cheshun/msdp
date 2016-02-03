<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include.inc.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理平台_jmsdp.com</title>

<link href="resources/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="resources/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="resources/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="resources/js/dwz/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
<!--[if IE]>
<link href="resources/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->

<!--[if lte IE 9]>
<script src="resources/js/dwz/js/speedup.js" type="text/javascript"></script>
<![endif]-->
<script src="resources/js/dwz/fileupload.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/jquery-1.7.2.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/jquery.cookie.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/jquery.validate.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="resources/js/dwz/xheditor/xheditor-1.2.1.min.js" type="text/javascript"></script>
<script src="resources/js/dwz/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
<script src="resources/js/dwz/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>

<!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->
<script type="text/javascript" src="resources/js/dwz/chart/raphael.js"></script>
<script type="text/javascript" src="resources/js/dwz/chart/g.raphael.js"></script>
<script type="text/javascript" src="resources/js/dwz/chart/g.bar.js"></script>
<script type="text/javascript" src="resources/js/dwz/chart/g.line.js"></script>
<script type="text/javascript" src="resources/js/dwz/chart/g.pie.js"></script>
<script type="text/javascript" src="resources/js/dwz/chart/g.dot.js"></script>

<script src="resources/js/dwz/js/dwz.core.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.util.date.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.validate.method.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.barDrag.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.drag.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.tree.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.accordion.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.ui.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.theme.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.switchEnv.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.alertMsg.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.contextmenu.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.navTab.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.tab.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.resize.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.dialog.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.dialogDrag.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.sortDrag.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.cssTable.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.stable.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.taskBar.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.ajax.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.pagination.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.database.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.datepicker.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.effects.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.panel.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.checkbox.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.history.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.combox.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/dwz.print.js" type="text/javascript"></script>
<script src="resources/js/dwz/js/jquery.ztree.all-3.5.js" type="text/javascript"></script>

<!-- 可以用dwz.min.js替换前面全部dwz.*.js (注意：替换是下面dwz.regional.zh.js还需要引入)
<script src="bin/dwz.min.js" type="text/javascript"></script>
-->
<script src="resources/js/dwz/js/dwz.regional.zh.js" type="text/javascript"></script>

<script type="text/javascript">
$(function(){
	DWZ.init("resources/dwz.frag.xml", {
		loginUrl:"loginDialog.jsp", loginTitle:"登录",	// 弹出登录对话框
//		loginUrl:"login.html",	// 跳到登录页面
		statusCode:{ok:200, error:300, timeout:301}, //【可选】
		pageInfo:{pageNum:"pageNum", numPerPage:"numPerPage", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
		debug:true,	// 调试模式 【true|false】
		callback:function(){
			initEnv();
			$("#themeList").theme({themeBase:"themes"}); // themeBase 相对于index页面的主题base路径
		}
	});
});

</script>
</head>

<body scroll="no">
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<a class="logo" href="javascript:void(0)">Logo</a>
				<ul class="nav">
					<li><a target="_blank" href="/druid/login.html">系统监控</a></li>
					<li><a href="/logout">退出</a></li>
				</ul>
				<ul class="themeList" id="themeList">
					<li theme="default" style="display:none"><div class="selected">blue</div></li>
					<!-- <li theme="green"><div>green</div></li>
					<li theme="purple"><div>purple</div></li>
					<li theme="silver"><div>silver</div></li>
					<li theme="azure"><div>天蓝</div></li> -->
				</ul>
			</div>
		</div>
		
		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>菜单</h2><div>collapse</div></div>
				<div class="accordion" fillSpace="sideBar">
