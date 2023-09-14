package com.example.acc_house.controller;
import com.example.acc_house.models.AccHouseModels;
import com.example.acc_house.models.BudgetModels;
import com.example.acc_house.service.AccHouseService;
import com.example.acc_house.service.BudgetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/budget")


public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @GetMapping
    public List<BudgetModels> AccHouseList(){
        return budgetService.getBudgetModelsList();
    }

    @GetMapping ("/{id}")
    public ResponseEntity<BudgetModels> getBudgetById (@PathVariable Long id) {
        Optional<BudgetModels> budget = budgetService.getBudgetListById(id);
        return ResponseEntity.of(budget);
    }
    @PostMapping ("/save")
    public BudgetModels saveBudget(@RequestBody BudgetModels budget){
        return budgetService.saveBudget(budget);
    }

    @DeleteMapping("delete/{id}")
    public String deleteBudgetById(@PathVariable Long id){
        budgetService.deleteBudget(id);
        return "Budget delated with ID" + id;
    }
}
