package dev.java10x.cadastroDeNijas.Missoes;

import java.util.List;

import dev.java10x.cadastroDeNijas.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldadeMissao;
    
    
    @OneToMany(mappedBy = "missoes") //Uma missao pode ter varios ninjas
    private List<NinjaModel> ninjas;


    public MissoesModel(String nomeMissao,String dificuldadeMissao){
        this.nomeMissao = nomeMissao;
        this.dificuldadeMissao = dificuldadeMissao;
    }




}
