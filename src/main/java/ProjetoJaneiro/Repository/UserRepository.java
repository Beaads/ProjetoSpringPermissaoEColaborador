package ProjetoJaneiro.Repository;

import ProjetoJaneiro.Domain.Colaborador;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Colaborador,Integer> {}

