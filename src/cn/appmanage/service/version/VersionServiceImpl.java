package cn.appmanage.service.version;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanage.dao.version.VersionMapper;
import cn.appmanage.entity.Version;

@Service("versionService")
public class VersionServiceImpl implements VersionService {
	@Resource(name="versionMapper")
	private VersionMapper versionMapper;
	
	@Override
	public boolean findModifyVerSion(Version version) {
		try {
			return versionMapper.modifyVersionById(version) > 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	
}
