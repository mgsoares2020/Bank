package com.accenture.bank.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;

    @Column
    @Length(min = 3, max = 50, message = "O tamanho deve ser entre 3 a 50 caracteres.")
    private String nome;

    @Column
    @Length(min = 11, max = 14, message = "O tamanho deve ser entre 11 a 14 caracteres.")
    private String cpf;

    @Column
    @Length(min = 11, max = 15, message = "O tamanho deve ser entre 11 a 15 caracteres.")
    private String telefoneCliente;

    @OneToMany (mappedBy = "CleintesModel")
    @Column
    private List<AgenciaModel> listaAgencia = new ArrayList<AgenciaModel>();

}
