package net.business.system.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "TS_AREA")
public class TsArea {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "AREA_NAME")
    private String areaName;

    @Column(name = "PARENT_ID")
    private String parentId;

    @Column(name = "AREA_CODE")
    private String areaCode;

    @Column(name = "TELPHONE")
    private String telphone;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "AREA_LEVEL")
    private Integer areaLevel;

    @Column(name = "IS_LEAF")
    private String isLeaf;

    @Column(name = "LONGITUDE")
    private BigDecimal longitude;

    @Column(name = "LATITUDE")
    private BigDecimal latitude;

    @Column(name = "SORT_CODE")
    private Integer sortCode;

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
     * @return AREA_NAME
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * @return PARENT_ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * @return AREA_CODE
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
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
     * @return ZIP_CODE
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * @return AREA_LEVEL
     */
    public Integer getAreaLevel() {
        return areaLevel;
    }

    /**
     * @param areaLevel
     */
    public void setAreaLevel(Integer areaLevel) {
        this.areaLevel = areaLevel;
    }

    /**
     * @return IS_LEAF
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * @param isLeaf
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    /**
     * @return LONGITUDE
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * @return LATITUDE
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
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