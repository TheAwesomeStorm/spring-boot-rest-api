package alura.spring.boot.api.controllers;

import alura.spring.boot.api.dto.physician.CreatePhysicianDto;
import alura.spring.boot.api.entities.physician.Physician;
import alura.spring.boot.api.repositories.PhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/physicians")
public class PhysicianController {
    @Autowired
    private PhysicianRepository repository;
    @PostMapping
    public void createPhysician(@RequestBody CreatePhysicianDto dto) {
        repository.save(new Physician(dto));
    }
}
