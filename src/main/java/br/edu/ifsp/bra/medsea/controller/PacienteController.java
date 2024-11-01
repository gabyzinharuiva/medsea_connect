// PacienteController.java
package br.edu.ifsp.bra.medsea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.bra.medsea.model.Paciente;
import br.edu.ifsp.bra.medsea.repository.PacienteRepository;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepo;

    @PostMapping("/create")
    public ResponseEntity<Paciente> createPaciente(@RequestBody Paciente newPaciente) {
        if (newPaciente != null) {
            newPaciente.setTipoUsuario("Paciente");
            Paciente createdPaciente = pacienteRepo.save(newPaciente);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPaciente);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
