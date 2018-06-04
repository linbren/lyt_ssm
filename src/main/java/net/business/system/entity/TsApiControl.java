package net.business.system.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TS_API_CONTROL")
public class TsApiControl {
    @Id
    @Column(name = "API_NAME")
    private String apiName;

    @Column(name = "API_DESC")
    private String apiDesc;

    @Column(name = "API_VERSION")
    private String apiVersion;

    @Column(name = "API_STATUS")
    private String apiStatus;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EXPIRE_TIME")
    private Date expireTime;

    /**
     * @return API_NAME
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * @param apiName
     */
    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    /**
     * @return API_DESC
     */
    public String getApiDesc() {
        return apiDesc;
    }

    /**
     * @param apiDesc
     */
    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc == null ? null : apiDesc.trim();
    }

    /**
     * @return API_VERSION
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * @param apiVersion
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion == null ? null : apiVersion.trim();
    }

    /**
     * @return API_STATUS
     */
    public String getApiStatus() {
        return apiStatus;
    }

    /**
     * @param apiStatus
     */
    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus == null ? null : apiStatus.trim();
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
}