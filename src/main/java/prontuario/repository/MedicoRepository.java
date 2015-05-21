package prontuario.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import prontuario.model.Medico;

public interface MedicoRepository extends PagingAndSortingRepository<Medico, Integer> {
    Page<Medico> findByDisponivel(Pageable pageable, String disponivel);
}