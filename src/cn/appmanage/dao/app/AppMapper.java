package cn.appmanage.dao.app;

import org.apache.ibatis.annotations.Param;

import cn.appmanage.entity.App;

public interface AppMapper {
	/**
	 * ����id��ѯAPP��Ϣ
	 * @param id
	 * @return
	 */
	public App getAppInfoById(@Param("id")Integer id);
}
