package cn.appmanage.service.app;

import cn.appmanage.entity.App;

public interface AppService {
	/**
	 * 根据id查询APP信息
	 * @param id
	 * @return
	 */
	public App findAppInfoById(Integer id);
}
