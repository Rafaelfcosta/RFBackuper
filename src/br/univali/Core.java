package br.univali;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

public class Core {
    
    Controlador controlador;
    
    public Core(Controlador controlador) {
        this.controlador = controlador;
    }   
    
    public void fazerBackup(InputStream is, OutputStream os, long size) throws Exception{
        
        controlador.setMaxProgress((int)size);
        
        long inicio = System.currentTimeMillis();
        int cont = 0;
        int readByte;
        controlador.toggleBotao(false);
        while((readByte = is.read()) != -1){
            cont++;
            controlador.setProgress(cont);
            os.write(readByte);
        }    
        
        is.close();
        os.close();
        controlador.toggleBotao(true);
        long fim = System.currentTimeMillis();
        long tempo = fim-inicio;

        System.out.println(tempo);
        
        if(tempo > 999){
            long seconds = TimeUnit.MILLISECONDS.toSeconds(fim-inicio);
            String s = String.valueOf(seconds);
            controlador.aviso("Backup realizado em: " + s + " segundos");
        }else{
            controlador.aviso("Backup realizado em: " + tempo + " milisegundos");
        }
        
    }
}
