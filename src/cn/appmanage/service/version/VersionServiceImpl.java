package cn.appmanage.service.version;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanage.dao.version.VersionMapper;
import cn.appmanage.entity.App;
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
	
	
	@Override
	public List<Version> findVersionById(Integer id) {
		try {
			return versionMapper.getAppversionById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	@Override
	public Version findAppVersionById(Integer id) {
		try {
			return versionMapper.getVersionById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	@Override
	public boolean findDelVersionByAppId(Integer appId) {
		try {
			return versionMapper.delVersionByAppId(appId) > 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
}
