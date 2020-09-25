

import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.sp.fatec.springbootapp.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}