package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_API_PARAM")
public class TsApiParam {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private Integer id;

    @Column(name = "API_NAME")
    private String apiName;

    @Column(name = "PARAM_NAME")
    private String paramName;

    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Column(name = "PARAM_DESC")
    private String paramDesc;

    @Column(name = "PARAM_TYPE")
    private String paramType;

    @Column(name = "IS_NEED")
    private String isNeed;

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
     * @return PARAM_NAME
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * @param paramName
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    /**
     * @return PARAM_VALUE
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * @return PARAM_DESC
     */
    public String getParamDesc() {
        return paramDesc;
    }

    /**
     * @param paramDesc
     */
    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }

    /**
     * @return PARAM_TYPE
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * @param paramType
     */
    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    /**
     * @return IS_NEED
     */
    public String getIsNeed() {
        return isNeed;
    }

    /**
     * @param isNeed
     */
    public void setIsNeed(String isNeed) {
        this.isNeed = isNeed == null ? null : isNeed.trim();
    }
}