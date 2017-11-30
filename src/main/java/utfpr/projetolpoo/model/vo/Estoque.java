/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author NataN
 */
@Entity
public class Estoque {
    @Id
    @GeneratedValue
    private long codEstoque;
    
    @OneToMany
    private List<Produto> produtos;
            
    @OneToMany
    private Fornecedor fornecedor;

    public Estoque() {
        fornecedor = new Fornecedor();
    }
            
    boolean adicionar(Produto p){
        return false;
    }
    
    boolean remover(Produto p){
        return false;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}