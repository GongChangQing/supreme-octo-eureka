package cn.appmanage.service.version;

import cn.appmanage.entity.App;
import cn.appmanage.entity.Version;

public interface VersionService {
	/**
	 * �޸İ汾��Ϣ
	 * @param version
	 * @return
	 */
	public boolean findModifyVerSion(Version version);
	
	
}
