package com.accenture.bank.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Data
@Entity
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContaCorrente;

    @Column
    @Length(max = 3, message = "O tamanho deve ser no máximo 3 caracteres.")
    private String contaCorrenteAgencia;

    @Column
    @Length(min = 3, max = 45, message = "O tamanho deve ser no entre 3 e 45 caracteres.")
    private String contaCorrenteNumero;

    @Column
    private Float contaCorrenteSaldo;


}
