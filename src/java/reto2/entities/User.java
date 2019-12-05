/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jmarturi
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String login;
    private String name;
    private Department department;
    private Profile profile;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }    
    
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    } 
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the login fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "reto2.entities.User[ login=" + login + " ]";
    }
    
}
