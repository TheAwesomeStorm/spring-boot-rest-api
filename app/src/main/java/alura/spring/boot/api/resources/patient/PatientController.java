package alura.spring.boot.api.resources.patient;

import alura.spring.boot.api.resources.patient.dto.CreatePatientDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @PostMapping
    public void createPatient(@RequestBody CreatePatientDto dto) {
        System.out.println(dto);
    }
}
