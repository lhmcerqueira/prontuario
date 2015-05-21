package prontuario.repository;

import org.springframework.data.repository.CrudRepository;
import prontuario.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
	Funcionario findByEmail(String email);
}
