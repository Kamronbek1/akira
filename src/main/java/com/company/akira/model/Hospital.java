/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author User
 */
@Entity
public class Hospital extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hos_gen")
    @SequenceGenerator(name = "hos_gen", sequenceName = "hos_seq", allocationSize = 1)
    private Long id;

    private String address;
    private String mapUrl;

    @ElementCollection(targetClass = Sort.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "hos_sort", joinColumns = @JoinColumn(name = "hos_id"))
    @Enumerated(EnumType.STRING)
    private Set<Sort> sort;

    public Hospital(String name, String phone, String address, Set<Sort> sort, String imageUrl) {
        super(name, phone, imageUrl);
        this.address = address;
        this.sort = sort;
    }

    public Hospital() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Sort> getSort() {
        return sort;
    }

    public void setSort(Set<Sort> sort) {
        this.sort = sort;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                ", sort=" + sort +
                '}';
    }

}
