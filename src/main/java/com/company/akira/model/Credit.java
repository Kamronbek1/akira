package com.company.akira.model;

import javax.persistence.*;

@Entity
public class Credit extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "credit_gen")
    @SequenceGenerator(name = "credit_gen", sequenceName = "credit_seq", allocationSize = 1)
    private Long id;
    public Credit() {
    }

    public Credit(String name, String phone, String imageUrl) {
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
        return "AutoService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
