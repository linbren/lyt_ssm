package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_DICTTYPE")
public class TsDicttype {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private String id;

    @Column(name = "DICT_NAME")
    private String dictName;

    @Column(name = "IS_VALID")
    private String isValid;

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
     * @return DICT_NAME
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * @param dictName
     */
    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    /**
     * @return IS_VALID
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * @param isValid
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }
}