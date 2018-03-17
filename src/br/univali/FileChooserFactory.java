/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Rafael
 */
public class FileChooserFactory extends JFileChooser{

    public FileChooserFactory(File dir) {
        this.setDialogTitle("Selecione");
        this.setCurrentDirectory(dir);
    }
    
}
