package alura.spring.boot.api.resources.physician;

import alura.spring.boot.api.resources.physician.dto.CreatePhysicianDto;
import alura.spring.boot.api.resources.physician.entities.Physician;
import jakarta.transaction.Transactional;
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
    @Transactional
    public void createPhysician(@RequestBody CreatePhysicianDto dto) {
        repository.save(new Physician(dto));
    }
}
