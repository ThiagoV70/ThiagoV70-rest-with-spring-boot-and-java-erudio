package br.com.erudio.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String fristname;
    private String lastname;
    private String address;
    private String genter;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGenter() {
        return genter;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getFristname(), person.getFristname()) && Objects.equals(getLastname(), person.getLastname()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getGenter(), person.getGenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFristname(), getLastname(), getAddress(), getGenter());
    }
}
