package br.com.letscode.Repository;

import br.com.letscode.entity.CursoDisciplinaProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CursoDisciplinaRepository extends JpaRepository<CursoDisciplinaProfessor, Integer> {
}
