package com.schnabel.schnabel.users.service;

import com.schnabel.schnabel.misc.interfaces.IJpaService;
import com.schnabel.schnabel.misc.model.Address;
import com.schnabel.schnabel.users.model.Supplier;

/**
 * Supplier service interface
 */
public interface ISupplierService extends IJpaService<Supplier, Long>
{
    boolean registerSupplier(String name, String surname, String email, String password, Address address, String company );
}
