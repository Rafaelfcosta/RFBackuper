package br.univali;

import javax.swing.UIManager;

public class RFBackuper {

    public static void main(String[] args) throws Exception{        
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } 
        catch (Exception e) {
            System.out.println("Erro ao configurar look and feel");
        }
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setDefaultCloseOperation(TelaPrincipal.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    
    
    
}
