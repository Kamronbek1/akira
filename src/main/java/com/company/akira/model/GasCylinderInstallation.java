package com.company.akira.model;

import javax.persistence.*;

@Entity
public class GasCylinderInstallation extends Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gci_gen")
    @SequenceGenerator(name = "gci_gen", sequenceName = "gci_seq", allocationSize = 1)
    private Long id;

    public GasCylinderInstallation() {
    }

    public GasCylinderInstallation(String name, String address, String phone, String imageUrl, String mapUrl) {
        super(name, address, phone, imageUrl, mapUrl);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "GasCylinderInstallation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
