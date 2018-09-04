package se.cygni.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Presenter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    String firstName;
    String lastName;

    @ManyToOne
    Admin admin;

    private Presenter(){} //needed for JPA

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
}
