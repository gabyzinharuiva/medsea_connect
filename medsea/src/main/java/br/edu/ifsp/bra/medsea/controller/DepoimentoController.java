package br.edu.ifsp.bra.medsea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.bra.medsea.model.Depoimento;

@RestController
public class DepoimentoController {
     List<Depoimento> historicoDepoimentos = new ArrayList<> ();

    public DepoimentoController(){
        historicoDepoimentos.add(new Depoimento("Meu Cotidiano", "AAAA"));
    }

    @GetMapping("/depoimento")
    public List<Depoimento> getAllDepoimentos() {
        return historicoDepoimentos;
    }   

    @PostMapping("/depoimento")
    public Depoimento createNewDepoimento(@RequestBody Depoimento newDepoimento){
        historicoDepoimentos.add(newDepoimento);
        return newDepoimento;
    }
    
}
