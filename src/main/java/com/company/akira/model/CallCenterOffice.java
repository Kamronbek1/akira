package com.company.akira.model;

import javax.persistence.*;

@Entity
public class CallCenterOffice extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cco_gen")
    @SequenceGenerator(name = "cco_gen", sequenceName = "cco_seq", allocationSize = 1)
    private Long id;
    public CallCenterOffice() {
    }

    public CallCenterOffice(String name, String phone, String imageUrl) {
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
