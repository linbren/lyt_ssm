package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_APP")
public class TsApp {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "APP_NAME")
    private String appName;

    @Column(name = "APP_URL")
    private String appUrl;

    @Column(name = "APP_ICON")
    private String appIcon;

    @Column(name = "APP_TYPE")
    private String appType;

    @Column(name = "APP_VERSION")
    private String appVersion;

    @Column(name = "SORT_CODE")
    private Integer sortCode;

    @Column(name = "IS_VALID")
    private String isValid;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return APP_NAME
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * @return APP_URL
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * @param appUrl
     */
    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }

    /**
     * @return APP_ICON
     */
    public String getAppIcon() {
        return appIcon;
    }

    /**
     * @param appIcon
     */
    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon == null ? null : appIcon.trim();
    }

    /**
     * @return APP_TYPE
     */
    public String getAppType() {
        return appType;
    }

    /**
     * @param appType
     */
    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    /**
     * @return APP_VERSION
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    /**
     * @return SORT_CODE
     */
    public Integer getSortCode() {
        return sortCode;
    }

    /**
     * @param sortCode
     */
    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * @return IS_VALID
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * @param isValid
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}