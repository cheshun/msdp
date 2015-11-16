<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>
<div class="pageContent">
<form method="post"  action="/management/ui/singletable/index"  onsubmit="return navTabSearch(this,'${paramvo.templateid}')" >
		<div class="pageFormContent" layoutH="58">
			<input type="hidden" name="templateid" value="${paramvo.templateid}" />
			<input type="hidden" name="pk_button" value="${paramvo.pk_button }" />
			<input type="hidden" name="pk_data" value="${paramvo.pk_data}" />
			<input type="hidden" name="pk_parent" value="${paramvo.pk_parent}" />
			<input type="hidden" name="actiontype" value="${paramvo.actiontype}" />
			<c:forEach items="${querylist}" var="clist">
					<!-- 文本 -->
					<c:if test="${clist.datatype=='text'}">
						<div class="unit"> 
							<label>${clist.defaultshowname}：</label>  
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if>"  value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</div>
					</c:if>
					<!--  数字 -->
					<c:if test="${clist.datatype=='number'}">
						<div class="unit"> 
							<label>${clist.defaultshowname}：</label>    
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if> ${clist.datatype} " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</div>
					</c:if>
					<!--   小数 -->
					<c:if test="${clist.datatype=='digits'}">
						<div class="unit">
							<label>${clist.defaultshowname}：</label>  
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>    
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if> ${clist.datatype}"  value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</div>
					</c:if>
					<!-- 日期 -->
					<c:if test="${clist.datatype=='date'}">
						<div class="unit"> 
							<label>${clist.defaultshowname}：</label> 
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>     
							<input name="${clist.itemkey}" type="text" size="30" style="width:160px" class="<c:if test="${clist.isnull=='N'}">required</c:if> ${clist.datatype} " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  /><a class="inputDateButton" href="javascript:;">选择</a>
						</div>
					</c:if>
					<!-- 日期时间-->
					<c:if test="${clist.datatype=='datetime'}">
						<div class="unit"> 
							<label>${clist.defaultshowname}：</label> 
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>     
							<input name="${clist.itemkey}" dateFmt="yyyy-MM-dd HH:mm:ss" type="text" size="30" style="width:160px" class="<c:if test="${clist.isnull=='N'}">required</c:if>  date " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  /><a class="inputDateButton" href="javascript:;">选择</a>
						</div>
					</c:if>
					<!-- 密码 -->
					<c:if test="${clist.datatype=='password'}">
						<div class="unit">
							<label>${clist.defaultshowname}：</label> 
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>     
							<input name="${clist.itemkey}" type="password" size="30" class="<c:if test="${clist.isnull=='N'}">required</c:if>  " value="${clist.defaultvalue}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if>  />
						</div>
					</c:if>
					<!-- 下拉框 reftype_data -->
					<!-- 下拉框 reftype_data -->
					<c:if test="${clist.datatype=='select'}">
						<div class="unit">
							<label>${clist.defaultshowname}：</label>
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
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
						</div>
					</c:if>
					<!-- 文本区域 -->
					<c:if test="${clist.datatype=='textarea'}">
						<div class="unit">
							<label>${clist.defaultshowname}：</label>
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<textarea name="${clist.itemkey}" <c:if test="${clist.isedit=='N'}">readonly="readonly"</c:if> cols="80" rows="2" class="textInput">${clist.defaultvalue}</textarea>
						</div>
					</c:if>
					<!-- 参照框--> 
					<c:if test="${clist.datatype=='ref'}">
						<div class="unit">
							<label>${clist.defaultshowname}：</label>
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<input type="hidden" id="orgLookup.${clist.itemkey}" name="${clist.itemkey}" />
							<input type="text" style="width:155px" class="required" id="orgLookup.orgName" />
							<a class="btnLook" href="management/uicomponent/ref/index.action?reftype=${clist.reftype}&itemkey=${clist.itemkey}" lookupGroup="orgLookup">查找带回</a>		
						</div>
					</c:if>
		</c:forEach>	
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">开始检索</button></div></div></li>
				<li><div class="button"><div class="buttonContent"><button type="reset">清空重输</button></div></div></li>
			</ul>
		</div>
</form>
</div>
