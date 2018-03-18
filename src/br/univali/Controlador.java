/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali;

/**
 *
 * @author Rafael
 */
public class Controlador {
    TelaPrincipal tela;

    public Controlador(TelaPrincipal tela) {
        this.tela = tela;
    }
    
    public void setProgress(int i){
        tela.getProgressBar().setValue(i);
    }
    
    public void setMaxProgress(int i){
        tela.getProgressBar().setMaximum(i);
    }
    
    public void aviso(String msg){
        tela.aviso(msg);
    }
    
    public void toggleBotao(boolean b){
        tela.getBotaoBackup().setEnabled(b);
    }
    
}
