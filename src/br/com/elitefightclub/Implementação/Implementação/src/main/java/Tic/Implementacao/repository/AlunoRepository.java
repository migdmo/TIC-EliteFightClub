package Tic.Implementacao.repository;


import Tic.Implementacao.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}