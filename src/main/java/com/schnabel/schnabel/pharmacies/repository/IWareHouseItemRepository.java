package com.schnabel.schnabel.pharmacies.repository;

import com.schnabel.schnabel.pharmacies.model.WareHouseItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


/**
 * Warehouse item Jpa repository interface
 */
public interface IWareHouseItemRepository extends JpaRepository<WareHouseItem, Long> {
    @Query("SELECT w FROM WareHouseItem w WHERE w.pharmacy.id = ?2 and w.drugPrice.drug.id = ?1 ")
    Optional<WareHouseItem> findWareHouseItemByPharmacyAndDrugId(Long drugId, Long pharmacyId);
}


