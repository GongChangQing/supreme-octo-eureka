package cn.appmanage.dao.version;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appmanage.entity.App;
import cn.appmanage.entity.Version;

public interface VersionMapper {
	/**
	 * 修改版本信息
	 * @param version
	 * @return
	 */
	public int modifyVersionById(Version version);
	
	/**
	 * 根据APP名称查询历史版本
	 * @param id
	 * @return
	 */
	public List<Version> getAppversionById(@Param("id")Integer id);
	
	/**
	 * 根据id查询最新版本信息
	 * @param id
	 * @return
	 */
	public Version getVersionById(@Param("id")Integer id);
	
	/**
	 * 根据APPId删除版本信息
	 * @param appId
	 * @return
	 */
	public int delVersionByAppId(@Param("appId")Integer appId);
	
	
	
	
	
}
