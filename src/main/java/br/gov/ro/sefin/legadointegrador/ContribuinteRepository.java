package br.gov.ro.sefin.legadointegrador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContribuinteRepository extends JpaRepository<Contribuinte, Long> {
    boolean existsByCpf(String cpf);
}
