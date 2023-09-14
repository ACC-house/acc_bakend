package com.example.acc_house.repository;

import com.example.acc_house.models.BudgetModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends JpaRepository<BudgetModels,Long> {
}
