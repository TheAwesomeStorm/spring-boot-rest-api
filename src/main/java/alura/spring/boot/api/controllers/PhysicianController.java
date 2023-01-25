package alura.spring.boot.api.controllers;

import alura.spring.boot.api.dto.physician.CreatePhysicianDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/physicians")
public class PhysicianController {
    @PostMapping
    public void createPhysician(@RequestBody CreatePhysicianDto dto) {
        System.out.println(dto);
    }
}
