package br.edu.ifsp.bra.medsea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.bra.medsea.model.Cadastro;
import br.edu.ifsp.bra.medsea.model.Familiar;
import br.edu.ifsp.bra.medsea.model.Paciente;
import br.edu.ifsp.bra.medsea.repository.PacienteRepository;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private PacienteRepository pacienteRepo;

    @PostMapping("/create")
    public ResponseEntity<Cadastro> createUsuario(@RequestBody Cadastro newCadastro) {
        if (newCadastro != null) {
            newCadastro.setTipoUsuario(newCadastro instanceof Paciente ? "Paciente" : newCadastro instanceof Familiar ? "Familiar" : "Visitante");
            Cadastro createdCadastro = pacienteRepo.save(newCadastro);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdCadastro);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
