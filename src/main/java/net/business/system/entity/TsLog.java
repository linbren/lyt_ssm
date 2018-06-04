package net.business.system.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TS_LOG")
public class TsLog {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private Integer id;

    @Column(name = "APP_ID")
    private String appId;

    @Column(name = "USER_CODE")
    private String userCode;

    @Column(name = "OPT_NAME")
    private String optName;

    @Column(name = "OPT_CONTENT")
    private String optContent;

    @Column(name = "REQUEST_URL")
    private String requestUrl;

    @Column(name = "REQUEST_IP")
    private String requestIp;

    @Column(name = "CREATE_TIME")
    private Date createTime;

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
     * @return OPT_NAME
     */
    public String getOptName() {
        return optName;
    }

    /**
     * @param optName
     */
    public void setOptName(String optName) {
        this.optName = optName == null ? null : optName.trim();
    }

    /**
     * @return OPT_CONTENT
     */
    public String getOptContent() {
        return optContent;
    }

    /**
     * @param optContent
     */
    public void setOptContent(String optContent) {
        this.optContent = optContent == null ? null : optContent.trim();
    }

    /**
     * @return REQUEST_URL
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * @param requestUrl
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    /**
     * @return REQUEST_IP
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * @param requestIp
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
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
}