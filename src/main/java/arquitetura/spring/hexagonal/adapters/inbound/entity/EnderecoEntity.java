package arquitetura.spring.hexagonal.adapters.inbound.entity;


import arquitetura.spring.hexagonal.application.core.domain.Endereco;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class EnderecoEntity extends Endereco {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

}
