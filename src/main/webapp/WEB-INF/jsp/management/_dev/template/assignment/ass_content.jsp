<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/include.inc.jsp"%>

<div class="pageContent">
	<div class="tabs">
			<div class="tabsHeader">
				<div class="tabsHeaderContent">
					<ul>
						<li class="selected"><a href="javascript:void(0)"><span>分配单据模板</span></a></li>
						<li><a href="javascript:void(0)"><span>分配查询模板</span></a></li>
						<li><a href="javascript:void(0)"><span>分配报表模板</span></a></li>
						<li><a href="javascript:void(0)"><span>分配节点按钮</span></a></li>
					</ul>
				</div>
			</div>
			<div class="tabsContent" layoutH="105">
				<div>
					 <div class="panelBar">
						<ul class="toolBar">
							<li><a class="add" href="management/ui/template/doassignment?templatetype=bill&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>分配</span></a></li>
							<li><a class="edit" href="management/ui/template/doassignment?templatetype=bill&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>取消分配</span></a></li>
							<li class="line">line</li>
						</ul>
					</div>
					<table class="table" width="100%" layoutH="160">
						<thead>
							<tr>
								<th width="80">序号</th>
								<th width="80">单据模板名称</th>
								<th width="80">单据模板编码</th>
								<th width="80">单据模板描述</th>
							</tr>
						</thead>
						<tbody>
							<c:if test="${not empty listbill}">
								<c:forEach items="${listbill}" var="item" varStatus="index">
									<tr target="pk_data" rel="${item.pk_templet }">
										<td>${index.count }</td>
										<td>${item.templetuiname }</td>
										<td>${item.templatetypecode }</td>
										<td>${item.templetuicaption }</td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
				<div>
					<div class="panelBar">
						<ul class="toolBar">
							<li><a class="add" href="management/ui/template/doassignment?templatetype=query&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>分配</span></a></li>
							<li><a class="edit" href="management/ui/template/doassignment?templatetype=query&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>取消分配</span></a></li>
							<li class="line">line</li>
						</ul>
					</div>
					<table class="table" width="100%" layoutH="160">
						<thead>
							<tr>
								<th width="80">序号</th>
								<th width="80">查询模板名称</th>
								<th width="80">查询模板类型编码</th>
								<th width="80">查询模板描述</th>
							</tr>
						</thead>
						<tbody>
							 <c:if test="${not empty listquery}">
								<c:forEach items="${listquery}" var="item1" varStatus="index1">
									<tr target="pk_data" rel="${item1.pk_querytemplate }">
										<td>${index1.count }</td>
										<td>${item1.name }</td>
										<td>${item1.templatetypecode }</td>
										<td>${item1.remark }</td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
				<div>
					<div class="panelBar">
						<ul class="toolBar">
							<li><a class="add" href="management/ui/template/doassignment?templatetype=report&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>分配</span></a></li>
							<li><a class="edit" href="management/ui/template/doassignment?templatetype=report&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>取消分配</span></a></li>
							<li class="line">line</li>
						</ul>
					</div>
					<table class="table" width="100%" layoutH="160">
						<thead>
							<tr>
								<th width="80">序号</th>
								<th width="80">报表模板名称</th>
								<th width="80">报表模板编码</th>
								<th width="80">报表模板描述</th>
							</tr>
						</thead>
						<tbody>
							<tr target="pk_data" rel="1">
								<td>1</td>
								<td>政府机构</td>
								<td>2009-05-21</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div>
					<div class="panelBar">
						<ul class="toolBar">
							<li><a class="add" href="management/ui/template/doassignment?templatetype=button&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>分配按钮</span></a></li>
							<li><a class="edit" href="management/ui/template/doassignment?templatetype=button&pk_parent=${paramvo.pk_data }&pk_data={pk_data}" target="dialog"><span>取消分配</span></a></li>
							<li class="line">line</li>
						</ul>
					</div>
					<table class="table" width="100%" layoutH="160">
						<thead>
							<tr>
								<th width="80">序号</th>
								<th width="80">按钮名称</th>
								<th width="80">按钮编码</th>
								<th width="80">按钮描述</th>
							</tr>
						</thead>
						<tbody>
						<c:if test="${not empty listbutton}">
							<c:forEach items="${listbutton}" var="item3" varStatus="index3">
								<tr target="pk_data" rel="${item3.pk_button }">
									<td>${index3.count }</td>
									<td>${item3.btn_name }</td>
									<td>${item3.btn_code }</td>
									<td>${item3.btn_title }</td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
					</table>
				</div>
			</div>
			<div class="tabsFooter">
				<div class="tabsFooterContent"></div>
			</div>
		</div>
</div>
		 	
