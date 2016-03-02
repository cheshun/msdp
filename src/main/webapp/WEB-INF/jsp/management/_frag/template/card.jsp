<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include.inc.jsp"%>
<div class="pageContent">
<div class="panelBar">
		<ul class="toolBar">
			<c:forEach items="${cardtemplatevo.listbuttons}" var="button" varStatus="sta1">
				<c:if test="${button.btn_type=='Y' }">
				<li><a class="${button.btn_class }" href="<c:url value='${button.btn_href }?templateid=${paramvo.templateid}&pk_button=${button.pk_button }&pk_data=${paramvo.pk_data}&pk_parent=${paramvo.pk_parent}'/>" target="${button.btn_target }" rel="${button.pk_button }" title="${button.btn_title }"><span>${button.btn_name }</span></a></li>
				</c:if>
				<c:if test="${button.btn_type=='N' }">
				<li><a class="${button.btn_class }" href="<c:url value='${button.btn_href }?templateid=${paramvo.templateid}&pk_button=${button.pk_button }&pk_parent=${paramvo.pk_parent}'/>" target="${button.btn_target }" rel="${button.pk_button }" title="${button.btn_title }"><span>${button.btn_name }</span></a></li>
				</c:if>
			</c:forEach>
		</ul>
	</div>
	<form method="post" action="<c:url value='/management/ui/businessprocess/save?navTabId=${paramvo.templateid}&callbackType=closeCurrent'/>" class="pageForm required-validate" onsubmit="return validateCallback(this,dialogAjaxDone);">
		<input type="hidden" name="templateid" value="${paramvo.templateid}" />
		<input type="hidden" name="pk_button" value="${paramvo.pk_button }" />
		<input type="hidden" name="pk_data" value="${paramvo.pk_data}" />
		<input type="hidden" name="pk_parent" value="${paramvo.pk_parent}" />
		<input type="hidden" name="actiontype" value="${paramvo.actiontype}" />
		<div class="pageFormContent" layoutH="80">
		<c:forEach items="${cardtemplatevo.itemlist}" var="clist">
			<c:if test="${clist.iscard=='Y'}">
				<c:if test="${clist.iscardshow=='Y'}">
					<!-- 文本 -->
					<c:if test="${clist.datatype=='text'}">
						<p> 
							<label>${clist.defaultshowname}：</label>    
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if>"  value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!--  数字 -->
					<c:if test="${clist.datatype=='number'}">
						<p> 
							<label>${clist.defaultshowname}：</label>    
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if> ${clist.datatype} " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!--   小数 -->
					<c:if test="${clist.datatype=='digits'}">
						<p> 
							<label>${clist.defaultshowname}：</label>    
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if> ${clist.datatype}"  value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!-- 日期 -->
					<c:if test="${clist.datatype=='date'}">
						<p> 
							<label>${clist.defaultshowname}：</label>    
							<input name="${clist.itemkey}" type="text" size="30" style="width:160px" class="<c:if test="${clist.isnull=='N'}">required</c:if> ${clist.datatype} " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  /><a class="inputDateButton" href="javascript:;">选择</a>
						</p>
					</c:if>
					<!-- 日期时间 -->
					<c:if test="${clist.datatype=='datetime'}">
						<p> 
							<label>${clist.defaultshowname}：</label>    
							<input name="${clist.itemkey}" dateFmt="yyyy-MM-dd HH:mm:ss" readonly="true" type="text" size="30" style="width:160px" class="<c:if test="${clist.isnull=='N'}">required</c:if> date " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  /><a class="inputDateButton" href="javascript:;">选择</a>
						</p>
					</c:if>
					
					<!-- 密码 -->
					<c:if test="${clist.datatype=='password'}">
						<p> 
							<label>${clist.defaultshowname}：</label>    
							<input name="${clist.itemkey}" type="password" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if>  " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!-- 下拉框 reftype_data -->
					<!-- 下拉框 reftype_data -->
					<c:if test="${clist.datatype=='select'}">
						<p> 
							<label>${clist.defaultshowname}：</label>
							<select name="${clist.itemkey}" <c:if test="${clist.isedit=='N'}">disabled=true</c:if> class="<c:if test="${clist.isnull=='N'}">required</select></c:if> combox1">
									<option value=""></option>
								<c:forEach items="${clist.reftype_data}"  var="select_data">
									<c:if test="${select_data.value==clist.defaultvalue}">
										<option value="${select_data.value}" selected="selected" >${select_data.name}</option>
									</c:if>
									<c:if test="${select_data.value!=clist.defaultvalue}">
										<option value="${select_data.value}">${select_data.name}</option>
									</c:if>
								</c:forEach>
							</select>
						</p>
					</c:if>
					<!-- 文本区域 -->
					<c:if test="${clist.datatype=='textarea'}">
						<p class="nowrap">
							<label>${clist.defaultshowname}：</label>
							<textarea name="${clist.itemkey}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if> cols="90" rows="2" class="textInput">${clist.defaultvalue}</textarea>
						</p>
					</c:if>
					<!-- 参照框--> 
					<c:if test="${clist.datatype=='ref'}">
						<p>
							<label>${clist.defaultshowname}：</label>
							<input type="hidden" id="orgLookup.${clist.itemkey}" name="${clist.itemkey}" value="${clist.defaultvalue}"/>
							<input type="text" style="width:155px" class="required" id="orgLookup.orgName" value="${clist.reftype_data[0].value}"  />
							<a class="btnLook" href="management/uicomponent/ref/index.action?reftype=${clist.reftype}&itemkey=${clist.itemkey}" lookupGroup="orgLookup">查找带回</a>		
						</p>
					</c:if>
					<!-- 图片-->
					<c:if test="${clist.datatype=='images'}">
						<p>
							<label>${clist.defaultshowname}：</label>
							<input type="hidden" id="imagesLookup.${clist.itemkey}" name="${clist.itemkey}" value="${clist.defaultvalue}"/>
							<input type="text" id="imagesLookup.orgNum"  value="${clist.defaultvalue}"  />
							<a class="btnAttach"  width="500" height="370" href="management/basecomponent/uploadfile/page?filetype=images&itemkey=${clist.itemkey}&refdata=${clist.reftype}" lookupGroup="imagesLookup">上传图片</a>
						</p>
					</c:if>
					<!-- 文件-->
					<c:if test="${clist.datatype=='files'}">
						<p>
							<label>${clist.defaultshowname}：</label>
							<input type="hidden" id="files.${clist.itemkey}" name="${clist.itemkey}" value="${clist.defaultvalue}"/>
							<input type="text" id="files.orgNum"  value="${clist.defaultvalue}"  />
							<a class="btnAttach"  width="500" height="300" href="management/basecomponent/uploadfile/page?filetype=files&itemkey=${clist.itemkey}&refdata=${clist.reftype}" lookupGroup="files">上传文件</a>
						</p>
					</c:if>
				</c:if>
				<c:if test="${clist.iscardshow=='N'}">
					<input type="hidden" name="${clist.itemkey}" value="${clist.defaultvalue}"/>
				</c:if>
			</c:if>
			
		</c:forEach>
		</div>
		<c:if test="${paramvo.actiontype!='view'}"> 
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li><div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div></li>
			</ul>
		</div>
		</c:if>  
	</form>
</div>
