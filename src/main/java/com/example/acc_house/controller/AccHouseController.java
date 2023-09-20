package com.example.acc_house.controller;

import com.example.acc_house.models.AccHouseModels;
import com.example.acc_house.service.AccHouseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acc_house")
@CrossOrigin(origins = "*")
public class AccHouseController {
    @Autowired
     private AccHouseService accHouseService;

    @GetMapping
    public List<AccHouseModels> AccHouseList(){
        return accHouseService.getAccHouseModelsList();
    }

    @GetMapping ("/{id}")
    public ResponseEntity<AccHouseModels> getAccHouseById (@PathVariable Long id) {
        Optional<AccHouseModels> accHouse = accHouseService.getAccHouseListById(id);
        return ResponseEntity.of(accHouse);
    }

    @PostMapping ("/save")
    public AccHouseModels saveAccHouse(@RequestBody AccHouseModels accHouse){
        return accHouseService.saveAccHouse(accHouse);
    }

    @DeleteMapping("delete/{id}")
    public String deleteAccHouseById(@PathVariable Long id){
        accHouseService.deleteAccHouse(id);
        return "AccHouse delated with ID" + id;
    }
}
