<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<form method="post"  action="<c:url value='/management/ui/singletable/index'/>"  onsubmit="return navTabSearch(this,'${paramvo.templateid}')" >
<input type="hidden" name="templateid" value="${paramvo.templateid}" />
<div class="pageHeader">
	<div class="searchBar">
		<ul class="searchContent">
			<c:forEach items="${querylist}" var="clist">
			<%-- <c:if test="${clist.iscard}">
				<c:if test="${clist.iscardshow}"> --%>
					<!-- 文本 -->
					<c:if test="${clist.datatype=='text'}">
						<p> 
							<label>${clist.defaultshowname}：</label>  
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${!clist.isnull}">required</c:if>"  value="${clist.defaultvalue}" <c:if test="${!clist.isedit}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!--  数字 -->
					<c:if test="${clist.datatype=='number'}">
						<p> 
							<label>${clist.defaultshowname}：</label>    
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${!clist.isnull}">required</c:if> ${clist.datatype} " value="${clist.defaultvalue}" <c:if test="${!clist.isedit}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!--   小数 -->
					<c:if test="${clist.datatype=='digits'}">
						<p> 
							<label>${clist.defaultshowname}：</label>  
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>    
							<input name="${clist.itemkey}" type="text" size="30" class="<c:if test="${!clist.isnull}">required</c:if> ${clist.datatype}"  value="${clist.defaultvalue}" <c:if test="${!clist.isedit}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!-- 日期 -->
					<c:if test="${clist.datatype=='date'}">
						<p> 
							<label>${clist.defaultshowname}：</label> 
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>     
							<input name="${clist.itemkey}" type="text" size="30" style="width:160px" class="<c:if test="${!clist.isnull}">required</c:if> ${clist.datatype} " value="${clist.defaultvalue}" <c:if test="${!clist.isedit}">readonly="readonly"</c:if>  /><a class="inputDateButton" href="javascript:;">选择</a>
						</p>
					</c:if>
					
					<!-- 密码 -->
					<c:if test="${clist.datatype=='password'}">
						<p> 
							<label>${clist.defaultshowname}：</label> 
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>     
							<input name="${clist.itemkey}" type="password" size="30" class="<c:if test="${!clist.isnull}">required</c:if>  " value="${clist.defaultvalue}" <c:if test="${!clist.isedit}">readonly="readonly"</c:if>  />
						</p>
					</c:if>
					<!-- 下拉框 reftype_data -->
					<!-- 下拉框 reftype_data -->
					<c:if test="${clist.datatype=='select'}">
						<p> 
							<label>${clist.defaultshowname}：</label>
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<select name="${clist.itemkey}" <c:if test="${!clist.isedit}">disabled=true</c:if> class="<c:if test="${!clist.isnull}">required</select></c:if> combox1">
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
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<textarea name="${clist.itemkey}" <c:if test="${!clist.isedit}">readonly="readonly"</c:if> cols="80" rows="2" class="textInput">${clist.defaultvalue}</textarea>
						</p>
					</c:if>
					<!-- 参照框--> 
					<c:if test="${clist.datatype=='ref'}">
						<p>
							<label>${clist.defaultshowname}：</label>
							<select name="${clist.itemkey}">
								<c:forEach items="${clist.operatecode_data}"  var="code_data">
									<option value="${code_data.value}" >${code_data.name}</option>
								</c:forEach>
							</select>  
							<input type="hidden" name="orgLookup.${clist.itemkey}"/>
							<input type="text" style="width:155px" class="required" name="orgLookup.orgName"  />
							<a class="btnLook" href="template/refpanel/index.action?reftype=${clist.reftype}&itemkey=${clist.itemkey}" lookupGroup="orgLookup">查找带回</a>		
						</p>
					</c:if>
				<%-- </c:if>
				<c:if test="${!clist.iscardshow}">
					<input type="hidden" name="${clist.itemkey}" value="${clist.defaultvalue}"/>
				</c:if>
			</c:if> --%>
			
		</c:forEach>	
		</ul>
		<div class="subBar">
			<ul>						
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">搜索</button></div></div></li>
			</ul>
		</div>
	</div>
</div>
</form>
