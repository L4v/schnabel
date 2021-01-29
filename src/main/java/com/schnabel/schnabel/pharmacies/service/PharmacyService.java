package com.schnabel.schnabel.pharmacies.service;

import com.schnabel.schnabel.misc.implementations.CrudService;
import com.schnabel.schnabel.pharmacies.model.Pharmacy;
import com.schnabel.schnabel.pharmacies.repository.IPharmacyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService extends CrudService<Pharmacy, Integer> implements IPharmacyService
{
    @Autowired
    public PharmacyService(IPharmacyRepository pharmacyRepository)
    {
		super(pharmacyRepository);
    }
}