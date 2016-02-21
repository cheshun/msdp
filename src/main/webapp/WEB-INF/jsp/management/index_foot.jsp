					 
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main"><a href="javascript:void(0)"><span><span class="home_icon">个人中心</span></span></a></li>
						</ul>
					</div>
					<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div> 
				<ul class="tabsMoreList">
					<li><a href="javascript:void(0)">个人中心</a></li>
				</ul> 
				<div class="navTab-panel tabsPageContent layoutBox">
					<div>
						<div class="accountInfo">
							<div class="right">
								<p><fmt:formatDate value="${now}"  dateStyle="full" /></p><!-- pattern="yyyy MMMM dd , EEEE" -->
							</div>
							<p><span>Welcome,${user.user_name }  </span></p>
							<p> </p>
						</div>
						
						<div class="pageFormContent" layoutH="80">
							<p>
								<label>用户名称:</label><span class="unit">${user.user_name }</span>
							</p>
							<p>
								<label>姓名编码:</label><span class="unit">${user.user_code }</span>
							</p>

							<p>
								<label>用户电话:</label><span class="unit">${user.user_phone }</span>
							</p>
							<p>
								<label>用户Email:</label><span class="unit">${user.user_mail }</span>
							</p>
							<p>
								<label>备注:</label><span class="unit">${user.user_note }</span>
							</p>
							<p>
								<label>测试标签:</label><span class="unit"><web:getValueByKey fieldName="jd" tableName="asass" uniqueKey="0001"/></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">http://www.chengyingsheng.com</div>
</body>
</html>