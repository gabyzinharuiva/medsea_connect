package br.edu.ifsp.bra.medsea.repository;

import br.edu.ifsp.bra.medsea.model.Perfil;
import java.util.ArrayList;
import java.util.List;

public interface PerfilRepository {
    void addPerfil(Perfil perfil);
    Perfil getPerfil(String nomeUsuario);
    List<Perfil> getAllPerfis();
}

class PerfilRepositoryImpl implements PerfilRepository {
    private List<Perfil> perfis;

    public PerfilRepositoryImpl() {
        this.perfis = new ArrayList<>();
    }

    @Override
    public void addPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    @Override
    public Perfil getPerfil(String nomeUsuario) {
        for (Perfil perfil : perfis) {
            if (perfil.getNomeUsuario().equalsIgnoreCase(nomeUsuario)) {
                return perfil;
            }
        }
        return null; // ou lançar uma exceção
    }

    @Override
    public List<Perfil> getAllPerfis() {
        return new ArrayList<>(perfis);
    }
}
