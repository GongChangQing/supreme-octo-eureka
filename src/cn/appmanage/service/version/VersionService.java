package cn.appmanage.service.version;

import cn.appmanage.entity.App;
import cn.appmanage.entity.Version;

public interface VersionService {
	/**
	 * 修改版本信息
	 * @param version
	 * @return
	 */
	public boolean findModifyVerSion(Version version);
	
	
}
