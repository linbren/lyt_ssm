package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_RESOURCE_CONFIG")
public class TsResourceConfig {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "RESOURCE_NAME")
    private String resourceName;

    @Column(name = "PRIMARY_FIELD")
    private String primaryField;

    @Column(name = "DISPLAY_FIELD")
    private String displayField;

    @Column(name = "PARENT_ID_FIELD")
    private String parentIdField;

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
     * @return RESOURCE_NAME
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * @return PRIMARY_FIELD
     */
    public String getPrimaryField() {
        return primaryField;
    }

    /**
     * @param primaryField
     */
    public void setPrimaryField(String primaryField) {
        this.primaryField = primaryField == null ? null : primaryField.trim();
    }

    /**
     * @return DISPLAY_FIELD
     */
    public String getDisplayField() {
        return displayField;
    }

    /**
     * @param displayField
     */
    public void setDisplayField(String displayField) {
        this.displayField = displayField == null ? null : displayField.trim();
    }

    /**
     * @return PARENT_ID_FIELD
     */
    public String getParentIdField() {
        return parentIdField;
    }

    /**
     * @param parentIdField
     */
    public void setParentIdField(String parentIdField) {
        this.parentIdField = parentIdField == null ? null : parentIdField.trim();
    }
}