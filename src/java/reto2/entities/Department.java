/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity class representing departments for a user´s management application.
 * Comment added for testing git.
 * @author jmarturi
 */
@Entity
@XmlRootElement
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Id field for department. 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
     * Name for the department.
     */
    private String name;
    /**
     * Long description for department
     */
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }
    /**
     * Returns an int calculated from id for the department.
     * @return an int representing the instance of this entity. 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    /**
     * Compares two instances of department.
     * @param object another department instance to compare to.
     * @return true if instances are equal.
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    /**
     * Obtains an String representation including id value and class name.
     * @return String representation for department.
     */
    @Override
    public String toString() {
        return name+" "+description+" "+id;
    }
    
}
