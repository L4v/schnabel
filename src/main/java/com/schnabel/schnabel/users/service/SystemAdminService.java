package com.schnabel.schnabel.users.service;

import com.schnabel.schnabel.misc.implementations.CrudService;
import com.schnabel.schnabel.users.model.SystemAdmin;
import org.springframework.data.repository.CrudRepository;

public class SystemAdminService extends CrudService<SystemAdmin, Long> implements ISystemAdminService
{
    public SystemAdminService(CrudRepository<SystemAdmin, Long> repository) {
        super(repository);
    }
}