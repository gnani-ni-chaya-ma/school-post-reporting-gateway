package com.gnc.spr.proj.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Center {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cId;
    private String cName;

    public Center(){

    }

    public Center(String cName) {
        this.cName = cName;
    }


    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

}
