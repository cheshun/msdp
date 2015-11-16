<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include
	file="/include.inc.jsp"%>

<style type="text/css">
ul.rightTools {
	float: right;
	display: block;
}

ul.rightTools li {
	float: left;
	display: block;
	margin-left: 5px
}
</style>
<div class="pageContent" style="padding: 0px">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add"
				href="management/ui/template/billtemplate/item_add?pk_parent=${param.pk_data }"
				target="dialog"><span>添加</span></a></li>
			<li><a class="edit"
				href="management/ui/template/billtemplate/item_edit?pk_data={pk_data}"
				target="dialog"><span>修改</span></a></li>
		</ul>
	</div>
	<!-- layoutH="75"
	<c:if test="${not empty data.body}">
		<table class="table" width="200%" layoutH="330">
		 <c:if test="${ empty data.body}">
		 </c:if> 
	</c:if> -->
		<table class="table" width="200%" layoutH="50">
		<thead>
			<tr>
				<!-- <th>pk_templet_item</th>
				<th>pk_templet</th> 
				<th>组编码</th>
				<th>页签编码</th>-->
				<th>字段编码</th>
				<th>字段默认显示名称</th>
				<th>字段默认值</th>
				<!-- <th>字段显示位置</th> -->
				<th>字段数据类型</th>
				<th>字段显示顺序</th>
				<!-- <th>字段css类型 </th> -->
				<th>字段参照类型</th>
				<th>是否编辑</th>
				<th>是否为空</th>
				<th>是否卡片显示</th>
				<th>是否列表显示</th>
				<th>是否列表</th>
				<th>是否卡片</th>
				
				
				<th>加载公式</th>
				<th>编辑公式</th>
				<th>字段输入最大长度</th>
				<th>字段颜色 </th>
				<th>是否锁定</th>
				<th>是否汇总</th>
				<th>校验公式</th>
				<th>字段宽度</th>
				<!-- <th>ts</th>
				<th>dr</th> -->
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty data.head.listitem}">
				<c:forEach items="${data.head.listitem}" var="item" varStatus="index">
					<tr target="pk_data" rel="${item.pk_templet_item }">
						<%-- <td>${item.pk_templet_item }</td>
						<td>${item.pk_templet }</td> --%>
						<%-- <td>${item.group_code }</td>
						<td>${item.tabcode }</td> --%>
						<td>${item.itemkey }</td>
						<td>${item.defaultshowname }</td>
						
						<td>${item.defaultvalue }</td>
						<%-- <td>${item.itempos }</td> --%>
						<td>${item.datatype }</td>
						<td>${item.showorder }</td>
						<%-- <td>${item.csstype }</td> --%>
						<td>${item.reftype }</td>
						<td>${item.isedit }</td>
						<td>${item.isnull }</td>
						<td>${item.iscardshow }</td>
						<td>${item.islistshow }</td>
						<td>${item.islist }</td>
						<td>${item.iscard }</td>
						
						<td>${item.loadformula }</td>
						<td>${item.editformula }</td>
						<td>${item.itemcolor }</td>
						<td>${item.inputlength }</td>
						<td>${item.islock }</td>
						<td>${item.istotal }</td>
						<td>${item.validateformula }</td>
						<td>${item.width }</td>
						<%-- <td>${item.ts }</td>
						<td>${item.dr }</td> --%>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<c:if test="${not empty data.body}">
	  <div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
				<c:forEach items="${data.body}" var="bodyitem" >
					<li><a href="javascript:;" title="${bodyitem.tabvo.tabname}"><span>${bodyitem.tabvo.tabname}</span></a></li>
				</c:forEach>
				</ul>
			</div>
		</div>
		<div class="tabsContent" style="overflow: auto;">
		<c:forEach items="${data.body}" var="bodyitem" >
			<div id="${bodyitem.tabvo.tabcode}">
				<div class="panelBar">
					<ul class="toolBar">
						<li><a class="add" href="management/ui/template/billtemplate/item_add?pk_parent=${param.pk_data }&templatetype=${bodyitem.tabvo.tabcode}"
							target="dialog"><span>添加</span></a></li>
						<li><a class="edit" href="management/ui/template/billtemplate/item_edit?pk_data={pk_data}"
							target="dialog"><span>修改</span></a></li>
					</ul>
				</div>
				<table class="table" width="200%" layoutH="320">
					<thead>
						<tr>
							<th>pk_templet_item</th>
							<th>pk_templet</th>
							<th>group_code</th>
							<th>页签编码</th>
							<th>字段编码</th>
							<th>字段默认显示名称</th>
							<th>字段颜色 必输时红色 默认黑色</th>
							<th>字段默认值</th>
							<th>字段显示位置</th>
							<th>字段数据类型</th>
							<th>字段css类型 </th>
							<th>字段参照类型</th>
							<th>加载公式</th>
							<th>编辑公式</th>
							<th>是否编辑</th>
							<th>是否为空</th>
							<th>是否卡片显示</th>
							<th>是否列表显示</th>
							<th>是否列表</th>
							<th>是否卡片</th>
							<th>字段输入最大长度</th>
							<th>字段显示顺序</th>
							<th>是否锁定</th>
							<th>是否汇总</th>
							<th>校验公式</th>
							<th>字段宽度</th>
							<th>ts</th>
							<th>dr</th>
						</tr>
					</thead>
					<tbody>
							<c:forEach items="${bodyitem.listitem}" var="bodyitem1" varStatus="index">
								<tr target="pk_data" rel="${bodyitem1.pk_templet_item }">
									<td>${bodyitem1.pk_templet_item }</td>
									<td>${bodyitem1.pk_templet }</td>
									<td>${bodyitem1.group_code }</td>
									<td>${bodyitem1.tabcode }</td>
									<td>${bodyitem1.itemkey }</td>
									<td>${bodyitem1.defaultshowname }</td>
									<td>${bodyitem1.itemcolor }</td>
									<td>${bodyitem1.defaultvalue }</td>
									<td>${bodyitem1.itempos }</td>
									<td>${bodyitem1.datatype }</td>
									<td>${bodyitem1.csstype }</td>
									<td>${bodyitem1.reftype }</td>
									<td>${bodyitem1.loadformula }</td>
									<td>${bodyitem1.editformula }</td>
									<td>${bodyitem1.isedit }</td>
									<td>${bodyitem1.isnull }</td>
									<td>${bodyitem1.iscardshow }</td>
									<td>${bodyitem1.islistshow }</td>
									<td>${bodyitem1.islist }</td>
									<td>${bodyitem1.iscard }</td>
									<td>${bodyitem1.inputlength }</td>
									<td>${bodyitem1.showorder }</td>
									<td>${bodyitem1.islock }</td>
									<td>${bodyitem1.istotal }</td>
									<td>${bodyitem1.validateformula }</td>
									<td>${bodyitem1.width }</td>
									<td>${bodyitem1.ts }</td>
									<td>${bodyitem1.dr }</td>
								</tr>
							</c:forEach>
					</tbody>
				</table>
			</div>
		</c:forEach>
			<div id="tab_2">病人处方页签内容</div>

			<div id="tab_3">病人服药情况页签内容</div>

			<div id="tab_4">基线调查页签内容</div>

			<div id="tab_5">随访页签内容</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>  
	</c:if>
</div>
