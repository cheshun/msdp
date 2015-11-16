<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include
	file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post"
		action="<c:url value='/management/access/assignment/index?pk_date=${param.pk_data }'/>"
		class="pageForm required-validate"
		onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<ul class="tree treeFolder treeCheck expand">
				<li><a>框架面板</a>
					<ul>
						<li><a tname="name" tvalue="value1" checked="true">我的主页</a></li>
						<li><a tname="name" tvalue="value2">页面一</a></li>
						<li><a tname="name" tvalue="value3">替换页面一</a></li>
						<li><a tname="name" tvalue="value4">页面二</a></li>
						<li><a tname="name" tvalue="value5">页面三</a></li>
					</ul></li>

				<li><a tname="name" tvalue="test1">Test 1</a>
					<ul>
						<li><a tname="name" tvalue="test1.1">Test 1.1</a>
							<ul>
								<li><a tname="name" tvalue="test1.1.1" checked="true">Test
										1.1.1</a></li>
								<li><a tname="name" tvalue="test1.1.2" checked="false">Test
										1.1.2</a></li>
							</ul></li>
						<li><a tname="name" tvalue="test1.2" checked="true">Test
								1.2</a></li>
					</ul></li>
				<li><a tname="name" tvalue="test2" checked="true">Test 2</a></li>
			</ul>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">保存</button>
						</div>
					</div></li>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</form>
</div>