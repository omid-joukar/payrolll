package com.pedantic.entities;

import javax.persistence.Entity;

@Entity
public class ApplicationUser extends AbstractEntity{

    private String email;




    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
