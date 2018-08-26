package cn.appmanage.service.version;

import java.util.List;

import cn.appmanage.entity.App;
import cn.appmanage.entity.Version;

public interface VersionService {
	/**
	 * �޸İ汾��Ϣ
	 * @param version
	 * @return
	 */
	public boolean findModifyVerSion(Version version);
	
	/**
	 * ����APP��Ų�ѯ��ʷ�汾
	 * @param id
	 * @return
	 */
	public List<Version> findVersionById(Integer id);
	
	/**
	 * ����id��ѯ���°汾��Ϣ
	 * @param id
	 * @return
	 */
	public Version findAppVersionById(Integer id);
	
	/**
	 * ����Appidɾ���汾��Ϣ
	 * @param appId
	 * @return
	 */
	public boolean findDelVersionByAppId(Integer appId);
	

}
