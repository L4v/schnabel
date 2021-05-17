package com.schnabel.schnabel.pharmacies.dto;

import com.schnabel.schnabel.pharmacies.controller.PharmacyController;
import com.schnabel.schnabel.pharmacies.model.Pharmacy;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.stereotype.Component;

/**
 * Assembles PharmacyDTO
 */
@Component
public class PharmacyDTOAssembler extends RepresentationModelAssemblerSupport<Pharmacy, PharmacyDTO> {

    public PharmacyDTOAssembler() {
        super(PharmacyController.class, PharmacyDTO.class);
    }

    @Override
    public PharmacyDTO toModel(Pharmacy entity) {
        PharmacyDTO dto = instantiateModel(entity);
        dto.add(linkTo(methodOn(PharmacyController.class).get(entity.getId())).withSelfRel());
        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());
        // TODO(Jovan): Add warehouses, etc...


        return dto;
    }
    
}
