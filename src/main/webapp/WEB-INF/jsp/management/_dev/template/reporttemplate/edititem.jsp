<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<form method="post" action="<c:url value='/management/ui/template/reporttemplate/saveitem'/>" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<input type="hidden" name="pk_data" value="${param.pk_data }"/>
		<input type="hidden" name="pk_parent" value="${param.pk_parent }"/>
		<input type="hidden" name="templateid" value="${param.templateid }"/>
		<input type="hidden" name="actiontype" value="${param.actiontype }"/>
		<input type="hidden" name="pk_reportitemtemplate" value="${item.pk_reportitemtemplate }"/>
		<input type="hidden" name="pk_reporttemplate" value="${item.pk_reporttemplate }"/>
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>列名称：</label>
				<input name="itemname"   type="text" size="30" value="${item.itemname }" />
			</p> 
			<p>
				<label>列编码：</label>
				<input name="itemcode"   type="text" size="30" value="${item.itemcode }" />
			</p> 
			<p>
				<label>显示顺序：</label>
				<input type="text" name="showorder" size="30" value="${item.showorder }" />
			</p>
			
			<p >
				<label>数据类型：</label>
				<input type="text" name="datatype" size="30" value="${item.datatype }" />
			</p>
			<p>
				<label>是否列表显示：</label>
				<input type="text" name="islistshow" size="30" value="${item.islistshow }" />
			</p>
			<p>
				<label>是否列表存在：</label>
				<input type="text" name="islist" size="30" value="${item.islist }" />
			</p>
			<p>
				<label>是否汇总：</label>
				<input type="text" name="istotal" size="30" value="${item.istotal }" />
			</p>
			<p>
				<label>宽度：</label>
				<input type="text" name="width" size="30" value="${item.width }" />
			</p>
			<p class="nowrap">
				<label>备注：</label>
				<textarea name="datatype" cols="80" rows="2" >${item.showorder }</textarea>
			</p>
			<!-- <p>
				<label>vdef1：</label>
				<input type="text" name="vdef1" size="30" />
			</p>
			<p>
				<label>vdef2：</label>
				<input type="text" name="vdef2" size="30" />
			</p>
			<p>
				<label>vdef3：</label>
				<input type="text" name="vdef3" size="30" />
			</p>
			<p>
				<label>vdef4：</label>
				<input type="text" name="vdef4" size="30" />
			</p>
			<p>
				<label>vdef5：</label>
				<input type="text" name="vdef5" size="30" />
			</p>
			<p>
				<label>vdef6：</label>
				<input type="text" name="vdef6" size="30" />
			</p>
			<p>
				<label>vdef7：</label>
				<input type="text" name="vdef7" size="30" />
			</p>
			<p>
				<label>vdef8：</label>
				<input type="text" name="vdef8" size="30" />
			</p>
			<p>
				<label>vdef9：</label>
				<input type="text" name="vdef9" size="30" />
			</p> -->
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
