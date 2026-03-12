package com.itb.inf3cn.fitbox.model.entity;


import com.itb.inf3cn.fitbox.model.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario",discriminatorType = DiscriminatorType.STRING)
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // Otimizar a busca dentro de coleções e evitar duplicidade de objetos
public class Usuario {

    @Id // Chave Primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremet (identificado de 1 em 1)
        private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String password;
    private String sexo;
    private String Logradouro;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private boolean codStatus;


    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuarrio", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;


}
