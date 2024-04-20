package mx.utng.s34.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.utng.s34.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
    
}
