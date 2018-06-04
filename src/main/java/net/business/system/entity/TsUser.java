package net.business.system.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Table(name = "TS_USER")
public class TsUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2103188760155551524L;

	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private Integer id;

    @Column(name = "APP_ID")
    private String appId;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "USER_CODE")
    private String userCode;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PASS")
    private String userPass;

    @Column(name = "USER_PHOTO")
    private String userPhoto;

    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "USER_EMAIL")
    private String userEmail;

    @Column(name = "TELPHONE")
    private String telphone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "BIRTH_DATE")
    private String birthDate;

    @Column(name = "SORT_CODE")
    private Integer sortCode;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "SECRET_KEY")
    private String secretKey;

    @Column(name = "ACCESS_TOKEN")
    private String accessToken;

    @Column(name = "EXPIRE_TIME")
    private Date expireTime;

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
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * @return USER_CODE
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @param userCode
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return USER_PASS
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * @param userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * @return USER_PHOTO
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * @param userPhoto
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    /**
     * @return ID_NUMBER
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * @return SEX
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return USER_EMAIL
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * @return TELPHONE
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * @param telphone
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return BIRTH_DATE
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
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
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return SECRET_KEY
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * @param secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    /**
     * @return ACCESS_TOKEN
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    /**
     * @return EXPIRE_TIME
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * @param expireTime
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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