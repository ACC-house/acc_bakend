package com.example.acc_house.service;
import com.example.acc_house.models.AccHouseModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.acc_house.repository.AccHouseRepository;

import java.util.List;
import java.util.Optional;

@Service

public class AccHouseService {
    @Autowired
    AccHouseRepository accHouseModelsRepository;


    public List<AccHouseModels> getAccHouseModelsList() {
        return accHouseModelsRepository.findAll();
    }

    public Optional<AccHouseModels> getAccHouseListById(long id) {
        return accHouseModelsRepository.findById(id);
    }

    public AccHouseModels saveAccHouse(AccHouseModels accHouse) {
        return accHouseModelsRepository.save(accHouse);
    }

    public void deleteAccHouse(Long id) {
        accHouseModelsRepository.deleteById(id);
    }
}