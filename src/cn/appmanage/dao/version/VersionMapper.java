package cn.appmanage.dao.version;

import cn.appmanage.entity.Version;

public interface VersionMapper {
	/**
	 * 修改版本信息
	 * @param version
	 * @return
	 */
	public int modifyVersionById(Version version);
}
