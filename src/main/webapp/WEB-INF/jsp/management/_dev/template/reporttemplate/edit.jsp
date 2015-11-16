<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/ui/template/reporttemplate/save'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
		<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
		<input type="hidden" name="templateid" value="${param.templateid }"/>
		<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<div class="pageFormContent" layoutH="56">
			
			<input type="hidden" name="pk_node" value="${item.pk_node }"/>
			<input type="hidden" name="pk_reporttemplate" value="${item.pk_reporttemplate }"/>
			<%-- <p>
				<label>主键字段：</label>
				<input name="pk_reporttemplate" type="text" size="30" value="${item.pk_reporttemplate }"  />
			</p>
			<p>
				<label>节点主键：</label>
				<input name="pk_node" type="text" size="30"  value="${item.pk_node }" />
			</p>  
			--%>  
			<p>
				<label>模板名称：</label>
				<input name="templatename"   type="text" size="30"  value="${item.templatename }" />
			</p>
			<p>
				<label>模板编码：</label>
				<input name="templatecode"   type="text" size="30"  value="${item.templatecode }" />
			</p> 
			<p>
				<label>模板类型编码：</label>
				<input type="text" size="30" name="templatetypecode"  value="${item.templatetypecode }" />
			</p>
			<p>
				<label>模板备注：</label>
				<input type="text" size="30" name="remark"   value="${item.remark }" />
			</p>
			
			<p>
				<label>vdef1：</label>
				<input type="text" name="vdef1" size="30"  value="${item.vdef1 }" />
			</p>
			<p>
				<label>vdef2：</label>
				<input type="text" name="vdef2" size="30"  value="${item.vdef2 }" />
			</p>
			<p>
				<label>vdef3：</label>
				<input type="text" name="vdef3" size="30"  value="${item.vdef3 }" />
			</p>
			<p>
				<label>vdef4：</label>
				<input type="text" name="vdef4" size="30"  value="${item.vdef4 }" />
			</p>
			<p>
				<label>vdef5：</label>
				<input type="text" name="vdef5" size="30"  value="${item.vdef5 }" />
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>
