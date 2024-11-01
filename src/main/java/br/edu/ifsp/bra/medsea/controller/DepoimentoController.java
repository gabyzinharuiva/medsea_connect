package br.edu.ifsp.bra.medsea.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.bra.medsea.model.Depoimento;

@RestController
@RequestMapping("/depoimento")
public class DepoimentoController {
    private List<Depoimento> historicoDepoimentos = new ArrayList<>();

    public DepoimentoController() {
        historicoDepoimentos.add(new Depoimento(1L, "Meu Cotidiano", "AAAA", 1L));
    }

    @PostMapping("/create")
    public Depoimento createNewDepoimento(@RequestBody Depoimento newDepoimento) {
        newDepoimento.setId((long) (historicoDepoimentos.size() + 1));
        historicoDepoimentos.add(newDepoimento);
        return newDepoimento;
    }

    @DeleteMapping("/{id}")
    public String deleteDepoimento(@PathVariable Long id) {
        Optional<Depoimento> depoimentoToRemove = historicoDepoimentos.stream()
            .filter(d -> d.getId().equals(id))
            .findFirst();

        if (depoimentoToRemove.isPresent()) {
            historicoDepoimentos.remove(depoimentoToRemove.get());
            return "Depoimento deletado com sucesso.";
        } else {
            return "Depoimento não encontrado.";
        }
    }
}
