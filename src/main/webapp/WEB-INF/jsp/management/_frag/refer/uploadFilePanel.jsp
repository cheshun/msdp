<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<h2 class="contentTitle">文件上传</h2>
<div class="pageContent" style="padding-left: 0px;" layoutH="50">
	<div>
		<div id="fileuploads" class="uploadify" style="height: 25px; width: 94px;" ></div>
		<input type="hidden" name="filePath" value="" id="filePath" /> 
		<span id="fileName" ></span>
		<c:if test="${filetype=='images' }">
		<img id="images" style="width: 250px;height: 200px; "  src="">
		</c:if>
		<div id="errorinfo"> </div>
		<input type="hidden" id="itemkey" value="${itemkey}"/>
		<a  style="float:right;margin-right: 25px;" href="javascript:abc()" title="确认上传选择的文件">确认上传</a>
	</div>
	<script>
		 (function(){ //上传xls  javascript:$.bringBack({pk_taskplugin:'1', orgName:'技术部', orgNum:'1001'})
		      var upload_files = $('#fileuploads'),
		      url = "management/basecomponent/uploadfile/upload?folder=excel";
		      upload_files.uploadify(utils.fileUpload({element:upload_files,path:url,type:"*.*",typeText:"All Files"}));
		  })();
		 function abc(){ 
			 var fpath = $("#filePath").val();
			 $.bringBack({filePath :fpath, orgName:fpath, orgNum:fpath})
		 } 
		 
 	</script>
<!-- 
	<div class="divider"></div>
<input id="testFileInput" type="file" name="image" 
		uploaderOption="{
			swf:'resources/js/dwz/uploadify/scripts/uploadify.swf',
			uploader:'management/basecomponent/uploadfile/upload',
			formData:{PHPSESSID:'xxx', ajax:1},
			buttonText:'请选择文件',
			fileSizeLimit:'200KB',
			fileTypeDesc:'*.jpg;*.jpeg;*.gif;*.png;',
			fileTypeExts:'*.jpg;*.jpeg;*.gif;*.png;',
			auto:true,
			multi:true,
			onUploadSuccess:uploadifySuccess,
			onQueueComplete:uploadifyQueueComplete
		}"
	/>
	<input id="testFileInput2" type="file" name="image2" 
		uploaderOption="{
			swf:'uploadify/scripts/uploadify.swf',
			uploader:'demo/common/ajaxDone.html',
			formData:{PHPSESSID:'xxx', ajax:1},
			queueID:'fileQueue',
			buttonImage:'uploadify/img/add.jpg',
			buttonClass:'my-uploadify-button',
			width:102,
			auto:false
		}"
	/>
	
	<div id="fileQueue" class="fileQueue"></div>
	
	<input type="image" src="uploadify/img/upload.jpg" onclick="$('#testFileInput2').uploadify('upload', '*');"/>
	<input type="image" src="uploadify/img/cancel.jpg" onclick="$('#testFileInput2').uploadify('cancel', '*');"/>


	<div class="divider"></div>
	<p style="margin:10px"><a href="http://www.uploadify.com/documentation/" target="_blank">Uploadify 在线文档</a></p>
	
<textarea cols="160" rows="10">
uploaderOption: http://www.uploadify.com/documentation/
	auto            : true,               // Automatically upload files when added to the queue
	buttonClass     : '',                 // A class name to add to the browse button DOM object
	buttonCursor    : 'hand',             // The cursor to use with the browse button
	buttonImage     : null,               // (String or null) The path to an image to use for the Flash browse button if not using CSS to style the button
	buttonText      : 'SELECT FILES',     // The text to use for the browse button
	checkExisting   : false,              // The path to a server-side script that checks for existing files on the server
	debug           : false,              // Turn on swfUpload debugging mode
	fileObjName     : 'Filedata',         // The name of the file object to use in your server-side script
	fileSizeLimit   : 0,                  // The maximum size of an uploadable file in KB (Accepts units B KB MB GB if string, 0 for no limit)
	fileTypeDesc    : 'All Files',        // The description for file types in the browse dialog
	fileTypeExts    : '*.*',              // Allowed extensions in the browse dialog (server-side validation should also be used)
	height          : 30,                 // The height of the browse button
	itemTemplate    : false,              // The template for the file item in the queue
	method          : 'post',             // The method to use when sending files to the server-side upload script
	multi           : true,               // Allow multiple file selection in the browse dialog
	formData        : {},                 // An object with additional data to send to the server-side upload script with every file upload
	preventCaching  : true,               // Adds a random value to the Flash URL to prevent caching of it (conflicts with existing parameters)
	progressData    : 'percentage',       // ('percentage' or 'speed') Data to show in the queue item during a file upload
	queueID         : false,              // The ID of the DOM object to use as a file queue (without the #)
	queueSizeLimit  : 999,                // The maximum number of files that can be in the queue at one time
	removeCompleted : true,               // Remove queue items from the queue when they are done uploading
	removeTimeout   : 3,                  // The delay in seconds before removing a queue item if removeCompleted is set to true
	requeueErrors   : false,              // Keep errored files in the queue and keep trying to upload them
	successTimeout  : 30,                 // The number of seconds to wait for Flash to detect the server's response after the file has finished uploading
	uploadLimit     : 0,                  // The maximum number of files you can upload
	width           : 120,                // The width of the browse button
</textarea>
 -->
</div>