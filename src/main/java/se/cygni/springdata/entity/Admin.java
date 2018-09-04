package se.cygni.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    String firstName;
    String lastName;

    @OneToMany(mappedBy = "admin")
    List<Presenter> presenterList;

    private Admin() {

    }

    public Admin(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Presenter> getPresenterList() {
        return presenterList;
    }
}
