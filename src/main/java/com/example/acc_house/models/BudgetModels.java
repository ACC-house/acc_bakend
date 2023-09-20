package com.example.acc_house.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "budget")
@Getter
@Setter
@CrossOrigin(origins = "*")

public class BudgetModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private Long phone;

    private String work;

    private Long meters;

    private Long budget_price;

    public BudgetModels() {
    }

}
