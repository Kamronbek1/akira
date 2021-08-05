/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String phone;
    private String adress;
   // private Point location;
    @Enumerated(EnumType.STRING)
    private Sort sort;

    public Hospital(String name, String phone, String adress/*, Point location*/, Sort sort) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
       // this.location = location;
        this.sort = sort;
    }

    public Hospital() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

  /*  public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }*/

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "ShifoService{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", adress=" + adress + /*", location=" + location + */", sort=" + sort + '}';
    }

}
