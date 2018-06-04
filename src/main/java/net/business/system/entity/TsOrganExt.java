package net.business.system.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TS_ORGAN_EXT")
public class TsOrganExt {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "INDUSTRY")
    private String industry;

    @Column(name = "ORG_SUMMARY")
    private String orgSummary;

    @Column(name = "ORG_LOGO")
    private String orgLogo;

    @Column(name = "ORG_MAP")
    private String orgMap;

    @Column(name = "ORG_IMAGES")
    private String orgImages;

    @Column(name = "WEB_URL")
    private String webUrl;

    @Column(name = "ORG_EMAIL")
    private String orgEmail;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "HOT_LINE")
    private String hotLine;

    @Column(name = "FOUND_DATE")
    private Date foundDate;

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
     * @return INDUSTRY
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * @param industry
     */
    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    /**
     * @return ORG_SUMMARY
     */
    public String getOrgSummary() {
        return orgSummary;
    }

    /**
     * @param orgSummary
     */
    public void setOrgSummary(String orgSummary) {
        this.orgSummary = orgSummary == null ? null : orgSummary.trim();
    }

    /**
     * @return ORG_LOGO
     */
    public String getOrgLogo() {
        return orgLogo;
    }

    /**
     * @param orgLogo
     */
    public void setOrgLogo(String orgLogo) {
        this.orgLogo = orgLogo == null ? null : orgLogo.trim();
    }

    /**
     * @return ORG_MAP
     */
    public String getOrgMap() {
        return orgMap;
    }

    /**
     * @param orgMap
     */
    public void setOrgMap(String orgMap) {
        this.orgMap = orgMap == null ? null : orgMap.trim();
    }

    /**
     * @return ORG_IMAGES
     */
    public String getOrgImages() {
        return orgImages;
    }

    /**
     * @param orgImages
     */
    public void setOrgImages(String orgImages) {
        this.orgImages = orgImages == null ? null : orgImages.trim();
    }

    /**
     * @return WEB_URL
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * @param webUrl
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl == null ? null : webUrl.trim();
    }

    /**
     * @return ORG_EMAIL
     */
    public String getOrgEmail() {
        return orgEmail;
    }

    /**
     * @param orgEmail
     */
    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail == null ? null : orgEmail.trim();
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
     * @return HOT_LINE
     */
    public String getHotLine() {
        return hotLine;
    }

    /**
     * @param hotLine
     */
    public void setHotLine(String hotLine) {
        this.hotLine = hotLine == null ? null : hotLine.trim();
    }

    /**
     * @return FOUND_DATE
     */
    public Date getFoundDate() {
        return foundDate;
    }

    /**
     * @param foundDate
     */
    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }
}