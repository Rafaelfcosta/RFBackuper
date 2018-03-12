package br.univali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Core {
    
    
    public void FileStream(String caminho) throws FileNotFoundException{
        InputStream is = new FileInputStream(caminho);
    }
    
   
}
