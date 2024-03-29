package cheng.wechat.conf;

import cheng.msdp.ui.tree.AbstractIdTreeData;
import cheng.wechat.model.AccountModel;

/**
 * Created by cheng on 2015/5/17.
 */
public class WechatMenuTree extends AbstractIdTreeData {
	@Override
	public Class<?> getTreeModel() {
		return AccountModel.class;
	}
	@Override
	public String getIDFieldName() {
		return "pk_wechat_account";
	}

	@Override
	public String getParentIDFieldName() {
		return null;
	}

	@Override
	public String getShowFieldName() {
		return "accountname";
	}

	@Override
	public String getTreeNodeUIType() {
		return "/management/ui/singletable/index";
	}
}
