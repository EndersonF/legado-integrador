package br.gov.ro.sefin.legadointegrador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContribuinteService {

    @Autowired
    private ContribuinteRepository repository;

    public Contribuinte salvar(Contribuinte contribuinte) {
        if (repository.existsByCpf(contribuinte.getCpf())) {
            throw new IllegalArgumentException("Erro: CPF já consta na base de dados da SEFIN.");
        }
        return repository.save(contribuinte);
    }

    public List<Contribuinte> listarTodos() {
        return repository.findAll();
    }
}