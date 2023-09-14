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

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone", nullable = false)
    private Long phone;
    @Column(name = "work", nullable = false)
    private String work;
    @Column(name = "metros,", nullable = false)
    private Long metros;
    @Column(name = "budget_price", nullable = false)
    private Long budget_price;

    public void BudgetModels() {
    }

    public void BudgetModels(String name, String email, Long phone, String work, Long metros, Long budget_price) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.work = work;
        this.metros = metros;
        this.budget_price = budget_price;
    }
}
