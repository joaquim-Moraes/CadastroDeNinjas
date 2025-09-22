package dev.java10x.cadastroDeNijas.Ninjas;

import dev.java10x.cadastroDeNijas.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cdr_ninja")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;
    
    // @ManytoOne Um ninja tem uma unica missão 
    @ManyToOne
    @JoinColumn(name = "missoes_id")// Foreing Key
    private MissoesModel missoes;

    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;

    }
}
