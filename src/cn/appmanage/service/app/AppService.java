package cn.appmanage.service.app;

import cn.appmanage.entity.App;

public interface AppService {
	/**
	 * ����id��ѯAPP��Ϣ
	 * @param id
	 * @return
	 */
	public App findAppInfoById(Integer id);
}
