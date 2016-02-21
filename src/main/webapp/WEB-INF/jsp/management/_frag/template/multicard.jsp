<%--
  Created by IntelliJ IDEA.
  User: cheng
  Date: 16/1/16
  Time: 下午8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/include.inc.jsp"%>
<form action="demo/common/ajaxDone.html?navTabId=masterList&callbackType=closeCurrent" method="post" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone)">
  <div class="pageContent">
    <div class="panelBar">
      <ul class="toolBar">
        <li><a class="add" href="demo/pagination/dialog2.html" target="dialog" mask="true"><span>添加尿检检测</span></a></li>
        <li><a class="delete" href="demo/pagination/ajaxDone3.html?uid={sid_obj}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
        <li><a class="edit" href="demo/pagination/dialog2.html?uid={sid_obj}" target="dialog" mask="true"><span>修改</span></a></li>
        <li class="line">line</li>
        <li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
      </ul>
    </div>
    <div class="pageFormContent" layoutH="97">
      <p>
        <label>客 户 号：</label>
        <input name="sn" type="text" size="30" value="100001" readonly="readonly"/>
      </p>
      <p>
        <label>客户名称：</label>
        <input name="name" class="required" type="text" size="30" value="张慧华" alt="请输入客户名称"/>
      </p>
      <p>
        <label>部门名称：</label>
        <input type="hidden" name="orgLookup.id" value="${orgLookup.id}"/>
        <input type="text" class="required" name="orgLookup.orgName" value="" suggestFields="orgNum,orgName" suggestUrl="demo/database/db_lookupSuggest.html" lookupGroup="orgLookup" />
        <a class="btnLook" href="demo/database/dwzOrgLookup.html" lookupGroup="orgLookup">查找带回</a>
      </p>
      <p>
        <label>部门编号：</label>
        <input type="text" readonly="readonly" value="" name="dwz_orgLookup.orgNum" class="textInput">
      </p>
      <p>
        <label>识 别 码：</label>
        <input name="code" class="digits" type="text" size="30" alt="请输入数字"/>
      </p>
      <p>
        <label>客户类型：</label>
        <select name="type" class="required combox">
          <option value="">请选择</option>
          <option value="个人">个人</option>
          <option value="公司" selected>公司</option>
        </select>
      </p>
      <p>
        <label>营业执照号：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>执照签发日期：</label>
        <input type="text" name="startDate" class="date" size="30" /><a class="inputDateButton" href="javascript:;">选择</a>
      </p>
      <p>
        <label>执照到期日期：</label>
        <input type="text" name="endDate" class="date" size="30" /><a class="inputDateButton" href="javascript:;">选择</a>
      </p>
      <p>
        <label>注册资金：</label>
        <select name="capital" class="required combox">
          <option value="">请选择</option>
          <option value="10">10</option>
          <option value="50" selected>50</option>
          <option value="100">100</option>
        </select>
        <span class="unit">万元</span>
      </p>
      <p>
        <label>注册类型：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>注册地址：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>所属行业：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>组织机构代码：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>国税登记证号码：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>地税登记证号码：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>贷款卡编码：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>法人姓名：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>法人代表身份证号：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>身份证到期日期：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>其他证件及号码：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>身份证到期日期：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>其他证件及号码：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>身份证到期日期：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>其他证件及号码：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>曾用名称：</label>
        <input type="text" size="30" />
      </p>
      <p>
        <label>首次贷款日期：</label>
        <input readonly="readonly" type="text" size="30" />
      </p>
      <div class="divider"></div>
      <p>
        <label>建档日期：</label>
        <input readonly="readonly" type="text" size="30" />
      </p>
      <p>
        <label>管户经理：</label>
        <input readonly="readonly" type="text" size="30" />
      </p>
      <p>
        <label>最新修改时间：</label>
        <input readonly="readonly" type="text" size="30" />
      </p>
      <p>
        <label>最新修改人员：</label>
        <input readonly="readonly" type="text" size="30" />
      </p>
      </dl>
      <div class="divider"></div>
      <div class="tabs">
        <div class="tabsHeader">
          <div class="tabsHeaderContent">
            <ul>
              <li class="selected"><a href="javascript:void(0)"><span>从表1【Struts2 示例】</span></a></li>
            </ul>
          </div>
        </div>
        <div class="tabsContent"    layoutH="375">
          <div>
            <table class="list nowrap itemDetail" addButton="增行" width="100%">
              <thead>
              <tr>
                <th type="text" name="items[#index#].itemString" size="12" fieldClass="required" fieldAttrs="{remote:'validate_remote.html', maxlength:10}">从字符串</th>
                <th type="text" name="items[#index#].itemInt" defaultVal="#index#" size="12" fieldClass="digits">从整数</th>
                <th type="text" name="items[#index#].itemFloat" defaultVal="0.8" size="12" fieldClass="number">从浮点</th>
                <th type="date" name="items[#index#].itemDate" defaultVal="2011-12-28" size="12">从日期</th>
                <th type="date" format="yyyy-MM-dd HH:mm:ss" name="items[#index#].itemDataTime" size="16">从日期时间</th>
                <th type="lookup" name="items[#index#].org.orgName" lookupGroup="items[#index#].org" lookupUrl="demo/database/dwzOrgLookup.html" suggestUrl="demo/database/db_lookupSuggest.html" suggestFields="orgName" postField="keywords" size="12" fieldClass="required1">部门名称</th>
                <th type="enum" name="items[#index#].itemEnum" enumUrl="demo/database/db_select.html" size="12">从枚举</th>
                <th type="attach" name="items[#index#].attachment.fileName" lookupGroup="items[#index#].attachment" lookupUrl="demo/database/db_attachmentLookup.html" size="12">从附件</th>
                <th type="del" width="60">操作</th>
              </tr>
              </thead>
              <tbody>
              </tbody>
            </table>
          </div>
        </div>
        <div class="tabsFooter">
          <div class="tabsFooterContent"></div>
        </div>
      </div>

    </div>
    <div class="formBar">
      <ul>
        <li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
        <li><div class="button"><div class="buttonContent"><button class="close" type="button">关闭</button></div></div></li>
      </ul>
    </div>
  </div>
</form>
