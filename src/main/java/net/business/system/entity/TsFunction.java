package net.business.system.entity;

import java.io.Serializable;

import javax.persistence.*;

@Table(name = "TS_FUNCTION")
public class TsFunction implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8966827127509989316L;

	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private Integer id;

    @Column(name = "APP_ID")
    private String appId;

    @Column(name = "FUNC_CODE")
    private String funcCode;

    @Column(name = "FUNC_NAME")
    private String funcName;

    @Column(name = "FUNC_URL")
    private String funcUrl;

    @Column(name = "FUNC_METHOD")
    private String funcMethod;

    @Column(name = "FUNC_ICON")
    private String funcIcon;

    @Column(name = "PARENT_CODE")
    private String parentCode;

    @Column(name = "FUNC_TYPE")
    private String funcType;

    @Column(name = "PERMISSION")
    private String permission;

    @Column(name = "SORT_CODE")
    private Integer sortCode;

    @Column(name = "IS_VALID")
    private String isValid;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return APP_ID
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * @return FUNC_CODE
     */
    public String getFuncCode() {
        return funcCode;
    }

    /**
     * @param funcCode
     */
    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode == null ? null : funcCode.trim();
    }

    /**
     * @return FUNC_NAME
     */
    public String getFuncName() {
        return funcName;
    }

    /**
     * @param funcName
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    /**
     * @return FUNC_URL
     */
    public String getFuncUrl() {
        return funcUrl;
    }

    /**
     * @param funcUrl
     */
    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl == null ? null : funcUrl.trim();
    }

    /**
     * @return FUNC_METHOD
     */
    public String getFuncMethod() {
        return funcMethod;
    }

    /**
     * @param funcMethod
     */
    public void setFuncMethod(String funcMethod) {
        this.funcMethod = funcMethod == null ? null : funcMethod.trim();
    }

    /**
     * @return FUNC_ICON
     */
    public String getFuncIcon() {
        return funcIcon;
    }

    /**
     * @param funcIcon
     */
    public void setFuncIcon(String funcIcon) {
        this.funcIcon = funcIcon == null ? null : funcIcon.trim();
    }

    /**
     * @return PARENT_CODE
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * @param parentCode
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * @return FUNC_TYPE
     */
    public String getFuncType() {
        return funcType;
    }

    /**
     * @param funcType
     */
    public void setFuncType(String funcType) {
        this.funcType = funcType == null ? null : funcType.trim();
    }

    /**
     * @return PERMISSION
     */
    public String getPermission() {
        return permission;
    }

    /**
     * @param permission
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
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