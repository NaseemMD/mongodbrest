package io.codementor.gtommee.rest_tutorial.models;

import org.springframework.data.annotation.Id;

public class Pets {
    @Id
    public Integer _id;
    public String name;
    public String account;

    public Pets(Integer _id, String name, String account) {
        this._id = _id;
        this.name = name;
        this.account = account;
    }
    public Pets(){

    }
    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
