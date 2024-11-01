package br.edu.ifsp.bra.medsea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.bra.medsea.model.Comentario;
import br.edu.ifsp.bra.medsea.model.MuralDeApoio;
import br.edu.ifsp.bra.medsea.repository.MuralDeApoioRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mural")
public class MuralDeApoioController {

    @Autowired
    private MuralDeApoioRepository muralDeApoioRepo;

    @GetMapping("/comentario/{usuarioId}")
    public List<Comentario> getAllComentarios(@PathVariable Long usuarioId) {
        MuralDeApoio mural = muralDeApoioRepo.findByUsuarioId(usuarioId);
        return mural != null ? mural.getComentarios() : new ArrayList<>();
    }

    @PostMapping("/comentario/create")
    public ResponseEntity<MuralDeApoio> createNewComentario(@RequestBody MuralDeApoio newComentario) {
        MuralDeApoio savedComentario = muralDeApoioRepo.save(newComentario);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComentario);
    }

    @DeleteMapping("/comentario/delete/{id}")
    public ResponseEntity<String> deleteComentario(@PathVariable Long id) {
        if (muralDeApoioRepo.existsById(id)) {
            muralDeApoioRepo.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Comentário deletado com sucesso.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Comentário não encontrado.");
    }
}
