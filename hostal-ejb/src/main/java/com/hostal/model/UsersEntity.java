package com.hostal.model;


import javax.persistence.*;

/**
 * Created by Manuel on 01/03/2015.
 */
@Entity
@Table(name = "users", schema = "", catalog = "hostal")
public class UsersEntity {
    private String usrId;
    private String usrName;
    private String usrSurrname1;
    private String usrSurname2;
    private String usrPassword;

    @Id
    @Column(name = "usr_id")
    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    @Basic
    @Column(name = "usr_name")
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    @Basic
    @Column(name = "usr_surrname1")
    public String getUsrSurrname1() {
        return usrSurrname1;
    }

    public void setUsrSurrname1(String usrSurrname1) {
        this.usrSurrname1 = usrSurrname1;
    }

    @Basic
    @Column(name = "usr_surname2")
    public String getUsrSurname2() {
        return usrSurname2;
    }

    public void setUsrSurname2(String usrSurname2) {
        this.usrSurname2 = usrSurname2;
    }

    @Basic
    @Column(name = "usr_password")
    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (usrId != null ? !usrId.equals(that.usrId) : that.usrId != null) return false;
        if (usrName != null ? !usrName.equals(that.usrName) : that.usrName != null) return false;
        if (usrPassword != null ? !usrPassword.equals(that.usrPassword) : that.usrPassword != null) return false;
        if (usrSurname2 != null ? !usrSurname2.equals(that.usrSurname2) : that.usrSurname2 != null) return false;
        if (usrSurrname1 != null ? !usrSurrname1.equals(that.usrSurrname1) : that.usrSurrname1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usrId != null ? usrId.hashCode() : 0;
        result = 31 * result + (usrName != null ? usrName.hashCode() : 0);
        result = 31 * result + (usrSurrname1 != null ? usrSurrname1.hashCode() : 0);
        result = 31 * result + (usrSurname2 != null ? usrSurname2.hashCode() : 0);
        result = 31 * result + (usrPassword != null ? usrPassword.hashCode() : 0);
        return result;
    }
}
