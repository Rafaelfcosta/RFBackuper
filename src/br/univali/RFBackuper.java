package br.univali;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class RFBackuper {

    public static void main(String[] args) throws Exception{
       
//        File arquivo = null;
//        InputStream is = null;
//        OutputStream os = null;
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } 
        catch (Exception e) {
            System.out.println("Erro ao configurar look and feel");
        }
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        
//        FileChooserFactory file = new FileChooserFactory(); 

//            int i= file.showOpenDialog(null);
//            //file.setFileSelectionMode(JFileChooser.FILES_ONLY);
//            //int i= file.showSaveDialog(null);
//        if (i==1){
//            
//        } else {
//            arquivo = file.getSelectedFile();
//            System.out.println(arquivo.getPath());
//        }
        
        //String[] opcoes = { "FileInputStream", "BufferedInputStream"};
        //String input = (String) JOptionPane.showInputDialog(null, "Escolha uma das operações",
        //"Selecionar tipo de backup", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        //System.out.println(input);
        
//        is = new FileInputStream(arquivo.getPath());
//        os = new FileOutputStream("backup.txt");
        
//        if(input.contains("Buffered")){
//            is = new BufferedInputStream(is);
//            os = new BufferedOutputStream(os);
//        }
        
        
//        InputStream is = new FileInputStream("aa.txt");
//        InputStream is = new FileInputStream(arquivo.getPath());
//        is = new BufferedInputStream(is);
//        OutputStream os = new FileOutputStream("backup.txt");
//        OutputStream os = new FileOutputStream("backup.txt");
//        os = new BufferedOutputStream(os);
        
//        long inicio = System.currentTimeMillis();
//        
//        int readByte = -1;
//        do{
//            readByte = is.read();
//            
//            if(readByte >= 0){
//                os.write(readByte);
//            }
//            
//        }while(readByte != -1);
//        
//        long fim = System.currentTimeMillis();
//        
//        System.out.println(fim-inicio);
    }
    
}
