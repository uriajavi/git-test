/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity class for user's data. This class encapsulates info for a 
 * user belonging to an academic department.
 * @author jmarturi
 */
@Entity
@XmlRootElement
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Identification field for user.
     */
    @Id
    private String login;
    /**
     * Full name for the user.
     */
    private String name;
    /**
     * Department which the user belongs to.
     */
    @ManyToOne
    private Department department;
    /**
     * Profile for user: regular or administrator.
     */
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
    /**
     * Returns an int calculated from id for the user.
     * @return an int representing the instance of this entity. 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }
    /**
     * Compares two instances of user.
     * @param object another user instance to compare to.
     * @return true if instances are equal.
     */    @Override
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
    /**
     * Obtains an String representation including id value and class name.
     * @return String representation for user.
     */
    @Override
    public String toString() {
        return "reto2.entities.User[ login=" + login + " ]";
    }
    
}
