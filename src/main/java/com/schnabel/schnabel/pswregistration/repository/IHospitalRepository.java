package com.schnabel.schnabel.pswregistration.repository;

import com.schnabel.schnabel.pswregistration.model.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHospitalRepository extends CrudRepository<Hospital, String>{
    
}