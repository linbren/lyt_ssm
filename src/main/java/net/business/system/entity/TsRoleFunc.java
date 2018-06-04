package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_ROLE_FUNC")
public class TsRoleFunc {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private Integer id;

    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "FUNC_ID")
    private Integer funcId;

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
     * @return ROLE_ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return FUNC_ID
     */
    public Integer getFuncId() {
        return funcId;
    }

    /**
     * @param funcId
     */
    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }
}