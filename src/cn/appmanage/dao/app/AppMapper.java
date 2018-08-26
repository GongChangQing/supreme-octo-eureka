package cn.appmanage.dao.app;

import org.apache.ibatis.annotations.Param;

import cn.appmanage.entity.App;

public interface AppMapper {
	/**
	 * 根据id查询APP信息
	 * @param id
	 * @return
	 */
	public App getAppInfoById(@Param("id")Integer id);
}
