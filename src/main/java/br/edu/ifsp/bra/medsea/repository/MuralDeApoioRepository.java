package br.edu.ifsp.bra.medsea.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.ifsp.bra.medsea.model.MuralDeApoio;

public interface MuralDeApoioRepository extends CrudRepository<MuralDeApoio, Long> {
    MuralDeApoio findByUsuarioId(Long id); // Método para encontrar por ID de usuário
}
