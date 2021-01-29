package com.schnabel.schnabel.drugs.service;
import com.schnabel.schnabel.drugs.model.Drug;
import com.schnabel.schnabel.misc.interfaces.ICrudService;

public interface IDrugService extends ICrudService<Drug, Integer>
{
    boolean getByName(String name);
}