package br.gov.ro.sefin.legadointegrador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/contribuintes")
public class ContribuinteController {

    @Autowired
    private ContribuinteService service;

    // Endpoint para Cadastrar (POST)
    @PostMapping
    public ResponseEntity<?> cadastrar(@Valid @RequestBody Contribuinte contribuinte) {
        try {
            Contribuinte salvo = service.salvar(contribuinte);
            return ResponseEntity.ok(salvo);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public List<Contribuinte> listar() {
        return service.listarTodos();
    }
}
