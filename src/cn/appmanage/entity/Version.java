package cn.appmanage.entity;

public class Version { //版本信息
	private int id;//ID
	private int appId; //APP ID
	private String versionNo;//APP 版本号（来源于：app_info表的主键id）
	private String versionInfo;//APP 版本描述
	private int publishStatus;//APP 发布状态发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
	private String downloadLink;//APP 下载连接
	private double versionSize;//APP 大小
	private int createdBy;//APP 创建人（来源于dev_user开发者信息表的用户id）
	private String creationDate;//APP 创建时间
	private int modifyBy;//APP 修改人（来源于dev_user开发者信息表的用户id）
	private String modifyDate;// APP 修改时间
	private String apkLocPath;//APP 图标路径
	private String apkFileName;//APP 安装包名称

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getVersionInfo() {
		return versionInfo;
	}

	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}

	public int getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}

	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public double getVersionSize() {
		return versionSize;
	}

	public void setVersionSize(double versionSize) {
		this.versionSize = versionSize;
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

	public String getApkLocPath() {
		return apkLocPath;
	}

	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}

	public String getApkFileName() {
		return apkFileName;
	}

	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}

}
