package com.accenture.bank.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class AgenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgencia;

    @Column
    @Length(min = 3, max = 45, message = "O tamanho deve ser entre 3 a 45 caracteres.")
    private String nomeAgencia;

    @Column
    @Length(min = 10, max = 45, message = "O tamanho deve ser entre 10 a 45 caracteres.")
    private String endereco;

    @Column
    @Length(min = 11, max = 15, message = "O tamanho deve ser entre 11 a 15 caracteres.")
    private String telefoneAgencia;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private ClienteModel clienteModel;

}
