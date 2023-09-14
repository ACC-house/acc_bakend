package com.example.acc_house.repository;
import com.example.acc_house.models.AccHouseModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccHouseRepository extends JpaRepository<AccHouseModels,Long> {
}
