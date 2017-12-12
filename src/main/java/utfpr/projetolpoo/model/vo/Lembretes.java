/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
@Entity
public class Lembretes {
    @Id
    @GeneratedValue
    Long id;
    
    Date data;
    String lembrete;
    String titulo;

    public Lembretes(Date data, JTextArea lembrete, JTextField titulo) {
        this.data = data;
        this.lembrete = lembrete.getText();
        this.titulo = titulo.getText();
    }

    public Lembretes() {
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getLembrete() {
        return lembrete;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
}
