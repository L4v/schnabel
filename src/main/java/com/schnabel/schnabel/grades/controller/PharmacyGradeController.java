package com.schnabel.schnabel.grades.controller;

import javax.validation.Valid;

import com.schnabel.schnabel.grades.dto.GradeRequest;
import com.schnabel.schnabel.grades.service.IPharmacyGradeService;
import com.schnabel.schnabel.pharmacies.dto.PharmacyDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PharmacyGrade REST controller
 */
@RestController
@RequestMapping("api/grade")
public class PharmacyGradeController 
{
    private final IPharmacyGradeService service;
    @Autowired
    public PharmacyGradeController(IPharmacyGradeService service)
    {
        this.service = service;
    }

    @PostMapping("pharmacy")
    public ResponseEntity<String> ratePharmacy(@Valid @RequestBody GradeRequest req, @RequestHeader("Authorization") String auth) {
        return service.ratePharmacy(req, auth) ?
            ResponseEntity.ok("Rated")
            : ResponseEntity.badRequest().build();
    }

    @GetMapping("patient/graded_pharmacies")
    public ResponseEntity<PagedModel<PharmacyDTO>> getGradedPharmacies(@RequestHeader ("Authorization") String auth, Pageable pageable) {
        return ResponseEntity.ok(service.findGraded(auth, pageable));
    }

    @GetMapping("patient/gradeable_pharmacies")
    public ResponseEntity<PagedModel<PharmacyDTO>> getGradeablePharmacies(@RequestHeader("Authorization") String auth, Pageable pageable) {
        return ResponseEntity.ok(service.findGradeable(auth, pageable));
    }
}
