/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import utfpr.projetolpoo.model.vo.abstrato.Pessoa;

/**
 *
 * @author NataN
 */
@Entity
public class Fornecedor extends Pessoa{
    //@Column(nullable=false, unique=true)
    @ManyToOne
    private Estoque estoque;
    
    //@Column(nullable=false, unique=true)
    @OneToOne(mappedBy = "fornecedor")
    private DadosBancarios dadosBancarios;
    
    //@Column(nullable=false, unique=true)
    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;

    public Fornecedor() {
        //dadosBancarios = new DadosBancarios();
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public DadosBancarios getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(DadosBancarios dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }
    
    
}
