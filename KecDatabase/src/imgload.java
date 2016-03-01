/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.image.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.*;
import javax.swing.*;

public class imageloading extends JFrame {

    BufferedImage mImage;
    String name, name1;

    public imageloading() {
        JFrame frm = new JFrame("image loading test");
        String source = filechoose();
        File inputFile = new File(source);
        try {
            mImage = ImageIO.read(inputFile);
        } catch (IOException ex) {
//Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel lb = new JLabel(new ImageIcon(mImage));
        frm.getContentPane().add(lb);
        frm.show();
        frm.pack();
    }

    String filechoose() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                name = f.getName().toLowerCase();
                return name.endsWith(".gif") || name.endsWith(".jpg") || name.endsWith(".jpeg") || f.isDirectory();
            }

            public String getDescription() {
                return "Image files";
            }
        });

        int r = chooser.showOpenDialog(this);

        if (r == JFileChooser.APPROVE_OPTION) {
            name1 = chooser.getSelectedFile().getAbsolutePath();
            StringBuffer sb = new StringBuffer();
            sb.append(name1);

            int l = sb.length();
            for (int i = 0; i < 5; i++) {
                if (sb.charAt(i) == '\\') {
                    sb.insert(i, "\\");
                    i++;
                }
            }
        }
        return name1;
    }

    public static void main(String a[]) {
        new imageloading();
    }
}
