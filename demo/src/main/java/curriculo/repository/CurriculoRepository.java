package curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import curriculo.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo,Long>{
}