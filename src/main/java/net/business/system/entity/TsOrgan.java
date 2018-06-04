package net.business.system.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "TS_ORGAN")
public class TsOrgan {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "ORG_NAME")
    private String orgName;

    @Column(name = "PARENT_ID")
    private String parentId;

    @Column(name = "CHARGER")
    private String charger;

    @Column(name = "TELPHONE")
    private String telphone;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "LONGITUDE")
    private BigDecimal longitude;

    @Column(name = "LATITUDE")
    private BigDecimal latitude;

    @Column(name = "AREA_ID")
    private String areaId;

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
     * @return ORG_NAME
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
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
     * @return CHARGER
     */
    public String getCharger() {
        return charger;
    }

    /**
     * @param charger
     */
    public void setCharger(String charger) {
        this.charger = charger == null ? null : charger.trim();
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
     * @return FAX
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
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
     * @return AREA_ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * @param areaId
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
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