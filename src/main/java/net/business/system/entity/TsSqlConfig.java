package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_SQL_CONFIG")
public class TsSqlConfig {
    @Id
    @Column(name = "SQL_CODE")
    private String sqlCode;

    @Column(name = "SQL_NAME")
    private String sqlName;

    @Column(name = "SQL_CONTENT")
    private String sqlContent;

    @Column(name = "SQL_TYPE")
    private String sqlType;

    @Column(name = "PURPOSE")
    private String purpose;

    /**
     * @return SQL_CODE
     */
    public String getSqlCode() {
        return sqlCode;
    }

    /**
     * @param sqlCode
     */
    public void setSqlCode(String sqlCode) {
        this.sqlCode = sqlCode == null ? null : sqlCode.trim();
    }

    /**
     * @return SQL_NAME
     */
    public String getSqlName() {
        return sqlName;
    }

    /**
     * @param sqlName
     */
    public void setSqlName(String sqlName) {
        this.sqlName = sqlName == null ? null : sqlName.trim();
    }

    /**
     * @return SQL_CONTENT
     */
    public String getSqlContent() {
        return sqlContent;
    }

    /**
     * @param sqlContent
     */
    public void setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent == null ? null : sqlContent.trim();
    }

    /**
     * @return SQL_TYPE
     */
    public String getSqlType() {
        return sqlType;
    }

    /**
     * @param sqlType
     */
    public void setSqlType(String sqlType) {
        this.sqlType = sqlType == null ? null : sqlType.trim();
    }

    /**
     * @return PURPOSE
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }
}