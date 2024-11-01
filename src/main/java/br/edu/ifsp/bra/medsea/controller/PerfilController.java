package br.edu.ifsp.bra.medsea.controller;

import org.springframework.web.bind.annotation.*;
import br.edu.ifsp.bra.medsea.model.Perfil;
import br.edu.ifsp.bra.medsea.repository.PerfilRepository;

import java.util.List;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    private PerfilRepository perfilRepository;

    public PerfilController(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    @PostMapping("/adicionar")
    public void adicionarPerfil(@RequestBody Perfil perfil) {
        perfilRepository.addPerfil(perfil);
    }

    @GetMapping("/buscar/{nomeUsuario}")
    public Perfil buscarPerfil(@PathVariable String nomeUsuario) {
        return perfilRepository.getPerfil(nomeUsuario);
    }

    @GetMapping("/listar")
    public List<Perfil> listarPerfis() {
        return perfilRepository.getAllPerfis();
    }
}
