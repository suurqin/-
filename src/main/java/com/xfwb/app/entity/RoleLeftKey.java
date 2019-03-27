package com.xfwb.app.entity;

import java.io.Serializable;

public class RoleLeftKey implements Serializable {
    private Integer leftId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getLeftId() {
        return leftId;
    }

    public void setLeftId(Integer leftId) {
        this.leftId = leftId;
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
        RoleLeftKey other = (RoleLeftKey) that;
        return (this.getLeftId() == null ? other.getLeftId() == null : this.getLeftId().equals(other.getLeftId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLeftId() == null) ? 0 : getLeftId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }
}