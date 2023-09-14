package com.example.acc_house.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "accHouse")
@Getter
@Setter
@CrossOrigin(origins = "*")

public class AccHouseModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "photo", nullable = false)
    private String photo;


    public  void AccHouseModels() {
    }

    public void AccHouseModels(String name,String description,String photo) {
        this.name = name;
        this.description = description;
        this.photo = photo;

    }
}
