package alura.spring.boot.api.resources.physician;

import alura.spring.boot.api.resources.physician.dto.CreatePhysicianDto;
import alura.spring.boot.api.resources.physician.dto.ReadPhysicianDto;
import alura.spring.boot.api.resources.physician.entities.Physician;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/physicians")
public class PhysicianController {
    @Autowired
    private PhysicianRepository repository;
    @PostMapping
    @Transactional
    public void createPhysician(@RequestBody @Valid CreatePhysicianDto dto) {
        repository.save(new Physician(dto));
    }

    @GetMapping
    public List<ReadPhysicianDto> readAllPhysicians() {
        return repository.findAll().stream().map(ReadPhysicianDto::new).toList();
    }
}
