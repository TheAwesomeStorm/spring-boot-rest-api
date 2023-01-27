package alura.spring.boot.api.resources.physician;

import alura.spring.boot.api.resources.physician.dto.CreatePhysicianDto;
import alura.spring.boot.api.resources.physician.dto.ReadPhysicianDto;
import alura.spring.boot.api.resources.physician.dto.UpdatePhysicianDto;
import alura.spring.boot.api.resources.physician.entities.Physician;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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
    public Page<ReadPhysicianDto> readAllPhysicians(@PageableDefault(size = 5, sort = {"name"}) Pageable pagination) {
        return repository.findAll(pagination).map(ReadPhysicianDto::new);
    }

    @PutMapping
    @Transactional
    public void updatePhysician(@RequestBody UpdatePhysicianDto dto) {
        var physician = repository.getReferenceById(dto.id());
        physician.updateInformations(dto);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletePhysician(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
