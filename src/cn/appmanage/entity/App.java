package cn.appmanage.entity;

public class App {// APP ��Ϣ
	private int id;// id
	private String softwareName;// �������
	private String APKName;// APK���ƣ�Ψһ��
	private String supportROM;// ֧��ROM
	private String interfaceLanguage;// ��������
	private double softwareSize;// �����С����λ��M��
	private String updateDate;// ��������
	private int devId;// ������id����Դ�ڣ�dev_user��Ŀ�����id��
	private String appInfo;// Ӧ�ü��
	private int status;// ״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5
						// ���¼ܣ�
	private String onSaleDate;// �ϼ�ʱ��
	private String offSaleDate;// �¼�ʱ��
	private int flatformId;// ����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
	private int categoryLevel3;// �����������ࣨ��Դ�ڣ�data_dictionary��
	private int downloads;// ����������λ���Σ�
	private int createdBy;// �����ߣ���Դ��dev_user��������Ϣ����û�id��
	private String creationDate;// ����ʱ��
	private int modifyBy;// �����ߣ���Դ��dev_user��������Ϣ����û�id��
	private String modifyDate;// ���¸���ʱ��
	private int categoryLevel1;// ����һ�����ࣨ��Դ�ڣ�data_dictionary��
	private int categoryLevel2;// �����������ࣨ��Դ�ڣ�data_dictionary��
	private String logoPicPath;// LOGOͼƬurl·��
	private String logoLocPath;// LOGOͼƬ�ķ������洢·��
	private int versionId;// ���µİ汾id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getAPKName() {
		return APKName;
	}

	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}

	public String getSupportROM() {
		return supportROM;
	}

	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}

	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}

	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}

	public double getSoftwareSize() {
		return softwareSize;
	}

	public void setSoftwareSize(double softwareSize) {
		this.softwareSize = softwareSize;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public int getDevId() {
		return devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public String getAppInfo() {
		return appInfo;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getOnSaleDate() {
		return onSaleDate;
	}

	public void setOnSaleDate(String onSaleDate) {
		this.onSaleDate = onSaleDate;
	}

	public String getOffSaleDate() {
		return offSaleDate;
	}

	public void setOffSaleDate(String offSaleDate) {
		this.offSaleDate = offSaleDate;
	}

	public int getFlatformId() {
		return flatformId;
	}

	public void setFlatformId(int flatformId) {
		this.flatformId = flatformId;
	}

	public int getCategoryLevel3() {
		return categoryLevel3;
	}

	public void setCategoryLevel3(int categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}

	public int getDownloads() {
		return downloads;
	}

	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public int getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public int getCategoryLevel1() {
		return categoryLevel1;
	}

	public void setCategoryLevel1(int categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}

	public int getCategoryLevel2() {
		return categoryLevel2;
	}

	public void setCategoryLevel2(int categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}

	public String getLogoPicPath() {
		return logoPicPath;
	}

	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}

	public String getLogoLocPath() {
		return logoLocPath;
	}

	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}

	public int getVersionId() {
		return versionId;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

}
