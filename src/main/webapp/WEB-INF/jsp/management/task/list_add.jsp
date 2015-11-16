<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<form id="pagerForm" method="post" action="/management/book/edit/${book.id}">
	<input type="hidden" name="pageNum" value="1" />
</form>

<div class="pageContent">
<form method="post" action="<c:url value='/management/task/list/save?navTabId=${paramvo.pk_node}&callbackType=closeCurrent'/>" class="pageForm required-validate" onsubmit="return validateCallback(this,dialogAjaxDone);">
	<input type="hidden" name="pk_taskplugin" value="${item.pk_taskplugin}"/>
	<input type="hidden" name="ts" value="${item.ts}"/>
	<div class="pageFormContent" layoutH="57">
		<p>
			<label>文件信息：</label>
			<input type="hidden" id="pk.filePath" name="pk_taskplugin"/>
			<input type="text" id="pk.orgNum"  value=""  />
			<a class="btnLook"  width="500" height="370" href="management/basecomponent/uploadfile/page?filetype=images&itemkey=filePath" rel="lookup_111" lookupGroup="pk">查找带回</a>		
		</p>
		<p>
			<!-- <label>文件一：</label>
			<div class="uploadbox">
			<input type="hidden" id="filePath" name="filePath"/>
			<input name="fileName" id="fileName" type="file" />
			<div id="sendmsg_excel" class="uploadify"></div>
			</div>
			<script>
			 (function(){ //上传xls
			      var upload_excel = $('#fileName'),
			      url = "management/basecomponent/uploadfile/upload?folder=excel";
			      upload_excel.uploadify(utils.fileUpload({element:fileName,path:url,type:"*.*",typeText:"All Files"}));
			  })();
 			</script> -->
		</p>
		<p>
			<label>插件名称: </label>
			<input type="text" name="pluginname" class="" value="${item.pluginname}" />
		</p>
		<p class="nowrap">
			<label>插件类: </label>
			<textarea name="pluginclass" cols="40" rows="3">${item.pluginclass}</textarea>
		</p>
		<p class="nowrap">
			<label>任务描述: </label>
			<textarea name="plugindescription" cols="40" rows="3">${item.plugindescription}</textarea>
		</p>
		<p>
			<label>所属模块: </label>
			<input type="text" name="belong_system" value="${item.belong_system}" maxlength="30"/>
		</p>
		<p>
			<label>插件类型: </label>
			<select name="plugintype">
				<option value="${item.plugintype}" >${item.plugintype}</option>
			</select>
		</p>
	</div>

	<div class="formBar">
		<ul>
			<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
			<li><div class="button"><div class="buttonContent"><button type="button" class="close">关闭</button></div></div></li>
		</ul>
	</div>
</form>
</div>