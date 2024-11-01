package br.edu.ifsp.bra.medsea.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.bra.medsea.model.Cadastro;

public interface PacienteRepository extends CrudRepository<Cadastro, Long> {
    public Cadastro findByPerfilId(long id);
    
}
