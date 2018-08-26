package cn.appmanage.dao.version;
import java.util.List;

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
	
	/**
	 * ����APP���Ʋ�ѯ��ʷ�汾
	 * @param id
	 * @return
	 */
	public List<Version> getAppversionById(@Param("id")Integer id);
	
	/**
	 * ����id��ѯ���°汾��Ϣ
	 * @param id
	 * @return
	 */
	public Version getVersionById(@Param("id")Integer id);
	
	/**
	 * ����APPIdɾ���汾��Ϣ
	 * @param appId
	 * @return
	 */
	public int delVersionByAppId(@Param("appId")Integer appId);
	
	
	
	
	
}
