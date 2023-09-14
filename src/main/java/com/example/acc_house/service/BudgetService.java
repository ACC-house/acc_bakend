package com.example.acc_house.service;


import com.example.acc_house.models.BudgetModels;
import com.example.acc_house.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BudgetService {


    @Autowired
    BudgetRepository budgetModelsRepository;

    public List<BudgetModels> getBudgetModelsList() {
        return budgetModelsRepository.findAll();
    }

    public Optional<BudgetModels> getBudgetListById(long id) {
        return budgetModelsRepository.findById(id);
    }

    public BudgetModels saveBudget(BudgetModels accHouse) {
        return budgetModelsRepository.save(accHouse);
    }

    public void deleteBudget(Long id) {
        budgetModelsRepository.deleteById(id);
    }
}



