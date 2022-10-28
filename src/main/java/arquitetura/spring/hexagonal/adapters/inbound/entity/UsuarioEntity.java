package arquitetura.spring.hexagonal.adapters.inbound.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class UsuarioEntity{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    private String nome;

    private String instagram;

    private String linkedin;

    private String github;

    private LocalDate dataNascimento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private EnderecoEntity endereco;

}
