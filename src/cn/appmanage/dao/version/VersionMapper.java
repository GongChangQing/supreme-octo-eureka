package cn.appmanage.dao.version;

import org.apache.ibatis.annotations.Param;

import cn.appmanage.entity.App;
import cn.appmanage.entity.Version;

public interface VersionMapper {
	/**
	 * �޸İ汾��Ϣ
	 * @param version
	 * @return
	 */
	public int modifyVersionById(Version version);
	
	
}
