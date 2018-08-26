package cn.appmanage.service.version;

import java.util.List;

import cn.appmanage.entity.App;
import cn.appmanage.entity.Version;

public interface VersionService {
	/**
	 * 修改版本信息
	 * @param version
	 * @return
	 */
	public boolean findModifyVerSion(Version version);
	
	/**
	 * 根据APP编号查询历史版本
	 * @param id
	 * @return
	 */
	public List<Version> findVersionById(Integer id);
	
	/**
	 * 根据id查询最新版本信息
	 * @param id
	 * @return
	 */
	public Version findAppVersionById(Integer id);
	
	/**
	 * 根据Appid删除版本信息
	 * @param appId
	 * @return
	 */
	public boolean findDelVersionByAppId(Integer appId);
	

}
