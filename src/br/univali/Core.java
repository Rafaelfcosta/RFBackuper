package br.univali;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

public class Core {
    
    TelaPrincipal tela;
    
    public Core(TelaPrincipal t) {
        this.tela = t;
    }   
    
    public void fazerBackup(InputStream is, OutputStream os) throws Exception{        
        long inicio = System.currentTimeMillis();
        int readByte;
        while((readByte = is.read()) != -1){
            os.write(readByte);
        }    
        
        is.close();
        os.close();
        
        long fim = System.currentTimeMillis();
        long tempo = fim-inicio;

        System.out.println(tempo);
        
        if(tempo > 999){
            long seconds = TimeUnit.MILLISECONDS.toSeconds(fim-inicio);
            String s = String.valueOf(seconds);
            tela.aviso("Backup realizado em: " + s + " segundos");
        }else{
            tela.aviso("Backup realizado em: " + tempo + " milisegundos");
        }
        
    }
}
