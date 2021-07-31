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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author DHANASHREE
 */
@Entity
@Table(name = "ANALYSE", catalog = "", schema = "DHANASHREE")
@NamedQueries({
    @NamedQuery(name = "Analyse.findAll", query = "SELECT a FROM Analyse a")
    , @NamedQuery(name = "Analyse.findByUsername", query = "SELECT a FROM Analyse a WHERE a.username = :username")
    , @NamedQuery(name = "Analyse.findBySymptoms", query = "SELECT a FROM Analyse a WHERE a.symptoms = :symptoms")
    , @NamedQuery(name = "Analyse.findByDisease", query = "SELECT a FROM Analyse a WHERE a.disease = :disease")
    , @NamedQuery(name = "Analyse.findByInternationalTravel", query = "SELECT a FROM Analyse a WHERE a.internationalTravel = :internationalTravel")})
public class Analyse implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "SYMPTOMS")
    private String symptoms;
    @Basic(optional = false)
    @Column(name = "DISEASE")
    private String disease;
    @Basic(optional = false)
    @Column(name = "INTERNATIONAL_TRAVEL")
    private String internationalTravel;
    @Basic(optional = false)
    @Lob
    @Column(name = "INTERACTION")
    private String interaction;

    public Analyse() {
    }

    public Analyse(String username) {
        this.username = username;
    }

    public Analyse(String username, String symptoms, String disease, String internationalTravel, String interaction) {
        this.username = username;
        this.symptoms = symptoms;
        this.disease = disease;
        this.internationalTravel = internationalTravel;
        this.interaction = interaction;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        String oldSymptoms = this.symptoms;
        this.symptoms = symptoms;
        changeSupport.firePropertyChange("symptoms", oldSymptoms, symptoms);
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        String oldDisease = this.disease;
        this.disease = disease;
        changeSupport.firePropertyChange("disease", oldDisease, disease);
    }

    public String getInternationalTravel() {
        return internationalTravel;
    }

    public void setInternationalTravel(String internationalTravel) {
        String oldInternationalTravel = this.internationalTravel;
        this.internationalTravel = internationalTravel;
        changeSupport.firePropertyChange("internationalTravel", oldInternationalTravel, internationalTravel);
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        String oldInteraction = this.interaction;
        this.interaction = interaction;
        changeSupport.firePropertyChange("interaction", oldInteraction, interaction);
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
        if (!(object instanceof Analyse)) {
            return false;
        }
        Analyse other = (Analyse) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "corona.Analyse[ username=" + username + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
