package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_DICTIONARY")
public class TsDictionary {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private Integer id;

    @Column(name = "DICT_TYPE")
    private String dictType;

    @Column(name = "ITEM_CODE")
    private String itemCode;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "ITEM_VALUE")
    private String itemValue;

    @Column(name = "PARENT_CODE")
    private String parentCode;

    @Column(name = "SORT_CODE")
    private Integer sortCode;

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
     * @return DICT_TYPE
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * @param dictType
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * @return ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    /**
     * @return ITEM_NAME
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * @return ITEM_VALUE
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * @param itemValue
     */
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue == null ? null : itemValue.trim();
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