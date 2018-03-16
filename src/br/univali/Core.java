package br.univali;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Core {
    
    TelaPrincipal tela;
    
    public Core(TelaPrincipal t) {
        this.tela = t;
    }   
    
    public void fazerBackup(InputStream is, OutputStream os) throws Exception{
//        tela.getProgressBar().setValue(100);
        long inicio = System.currentTimeMillis();
        int readByte = -1;
        do{
            readByte = is.read();

            if(readByte >= 0){
                os.write(readByte);
            }
            
        }while(readByte != -1);

        long fim = System.currentTimeMillis();

        System.out.println(fim-inicio);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(fim-inicio);
        System.out.println(seconds);
        String s = String.valueOf(seconds);
        exibirAviso( "Backup realizado em: " + s + " segundos");
        }

        public void exibirAviso(String msg){
          JOptionPane.showMessageDialog(null, msg);
        }
}
