package br.com.letscode.Repository;

import br.com.letscode.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
