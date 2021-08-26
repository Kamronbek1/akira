package com.company.akira.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class Product<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String imageUrl;
    private String phone;
    private String mapUrl;
    private String[] categories;

    public Product() {
    }

    public Product(int id, String name, String imageUrl, String phone, String mapUrl, String... categories) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.phone = phone;
        this.mapUrl = mapUrl;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String... categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", phone='" + phone + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                ", categories=" + Arrays.toString(categories) +
                '}';
    }
}
