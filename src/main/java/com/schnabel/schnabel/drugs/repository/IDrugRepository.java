package com.schnabel.schnabel.drugs.repository;

import com.schnabel.schnabel.drugs.model.Drug;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Drug repository interface
 */
@RepositoryRestResource(collectionResourceRel = "drugs", path = "drug")
public interface IDrugRepository extends JpaRepository<Drug, Long>
{
        
}
