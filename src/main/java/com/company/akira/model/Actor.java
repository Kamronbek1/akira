package com.company.akira.model;

import javax.persistence.*;

@Entity
public class Actor extends Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_gen")
    @SequenceGenerator(name = "actor_gen", sequenceName = "actor_seq", allocationSize = 1)
    private Long id;
    public Actor() {
    }

    public Actor(String name, String phone, String imageUrl) {
        super(name, phone, imageUrl);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
