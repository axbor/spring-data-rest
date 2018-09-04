package se.cygni.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Presenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    @ManyToOne
    private Admin admin;

    private Presenter(){/* needed by JPA*/}

    public Presenter(final String firstName, final String lastName, final Admin admin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.admin = admin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setAdmin(final Admin admin) {
        this.admin = admin;
    }

}