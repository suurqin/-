package com.xfwb.app.entity;

import java.io.Serializable;

public class RoleHeadKey implements Serializable {
    private Integer headId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RoleHeadKey other = (RoleHeadKey) that;
        return (this.getHeadId() == null ? other.getHeadId() == null : this.getHeadId().equals(other.getHeadId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHeadId() == null) ? 0 : getHeadId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }
}