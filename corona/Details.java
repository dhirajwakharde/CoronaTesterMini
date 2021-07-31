/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corona;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author DHANASHREE
 */
@Entity
@Table(name = "DETAILS", catalog = "", schema = "DHANASHREE")
@NamedQueries({
    @NamedQuery(name = "Details.findAll", query = "SELECT d FROM Details d")
    , @NamedQuery(name = "Details.findByUsername", query = "SELECT d FROM Details d WHERE d.username = :username")
    , @NamedQuery(name = "Details.findByAge", query = "SELECT d FROM Details d WHERE d.age = :age")
    , @NamedQuery(name = "Details.findByGender", query = "SELECT d FROM Details d WHERE d.gender = :gender")
    , @NamedQuery(name = "Details.findByProfession", query = "SELECT d FROM Details d WHERE d.profession = :profession")
    , @NamedQuery(name = "Details.findByTravelHistory", query = "SELECT d FROM Details d WHERE d.travelHistory = :travelHistory")})
public class Details implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "AGE")
    private short age;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @Column(name = "PROFESSION")
    private String profession;
    @Basic(optional = false)
    @Column(name = "TRAVEL_HISTORY")
    private String travelHistory;

    public Details() {
    }

    public Details(String username) {
        this.username = username;
    }

    public Details(String username, short age, String gender, String profession, String travelHistory) {
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
        this.travelHistory = travelHistory;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        short oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        String oldProfession = this.profession;
        this.profession = profession;
        changeSupport.firePropertyChange("profession", oldProfession, profession);
    }

    public String getTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(String travelHistory) {
        String oldTravelHistory = this.travelHistory;
        this.travelHistory = travelHistory;
        changeSupport.firePropertyChange("travelHistory", oldTravelHistory, travelHistory);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Details)) {
            return false;
        }
        Details other = (Details) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "corona.Details[ username=" + username + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
