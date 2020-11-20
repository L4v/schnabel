package com.schnabel.schnabel.pswregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HospitalService implements IHospitalService{
    @Autowired
    private HospitalRepository repository;

    @Override
    public boolean add(Hospital hospital)
    {
        if(get(hospital.getApiKey()) == null)
        {
            hospital.setName(hospital.getName().toLowerCase().replace(' ', '_'));
            hospital.setApiKey(("api" + hospital.getName() + "1234").replace(' ', '_'));
            repository.save(hospital);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(String apiKey)
    {
        Hospital h = get(apiKey);
        if(h == null)
        {
            return false;
        }
        repository.delete(h);
        return true;
    }

    @Override
    public boolean update(Hospital hospital)
    {
        if(get(hospital.getApiKey()) == null) return false;
        repository.save(hospital);
        return true;
    }

    @Override
    public Hospital get(String apiKey)
    {
        return repository.findById(apiKey.toLowerCase()).orElse(null);
    }

    @Override
    public List<Hospital> getAll()
    {
        return (List<Hospital>) repository.findAll();
    }
}
