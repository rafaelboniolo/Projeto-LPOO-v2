/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author NataN
 */
@Entity
public class Produto {
    @Id
    @GeneratedValue
    private long codProduto;
    
    private long codigo;
    private String descricao;
    private double valor;
    private String nome;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Fornecedor fornecedor;

    public Produto() {
    }
    
    public Produto(long codigo, String descricao, double valor, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }
    
    void operation(){
        
    }
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
