package com.schnabel.schnabel.users.service;

import com.schnabel.schnabel.misc.implementations.JpaService;
import com.schnabel.schnabel.users.model.Supplier;
import com.schnabel.schnabel.users.repository.ISupplierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Supplier service implementation
 */
@Service
public class SupplierService extends JpaService<Supplier, Long> implements ISupplierService
{
    @Autowired
    public SupplierService(ISupplierRepository repository)
    {
        super(repository);
    }
}
