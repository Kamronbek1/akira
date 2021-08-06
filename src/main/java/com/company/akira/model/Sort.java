/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.model;

/**
 *
 * @author User
 */
public enum Sort {
    EYE("EYE"), JARROH("JARROH"), LOR("LOR");

    private String name;

    private Sort(String name) {
        this.name = name;
    }
    Sort() {
     /*1lor
     2ko'z
    1lor,koz
    */

    }

    @Override
    public String toString() {
        return name;
    }

}
