package com.company.akira.model;

import javax.persistence.*;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_gen")
    @SequenceGenerator(name = "actor_gen", sequenceName = "actor_seq", allocationSize = 1)
    private Long id;
    private String imageUrl;
    private String name;
    private String phone;

    public Actor() {
    }

    public Actor(String imageUrl,String name, String phone ) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
