package cn.appmanage.service.app;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanage.dao.app.AppMapper;
import cn.appmanage.entity.App;
@Service("appService")
public class AppServiceImpl implements AppService {
	@Resource(name="appMapper")
	private AppMapper appMapper;
	
	
	@Override
	public App findAppInfoById(Integer id) {
		try {
			return appMapper.getAppInfoById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	@Override
	public boolean findDelAppInfoById(Integer id) {
		try {
			return appMapper.delAppInfoById(id) > 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	
}
