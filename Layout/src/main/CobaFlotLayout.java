/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.*;
import javax.swing.*;

public class CobaFlotLayout extends JFrame{
    JButton tombolSave,tombolEdit,tombolDelete,tombolOpen;
    public CobaFlotLayout(){
	setTitle("FLOW LAYOUT");
	tombolOpen = new JButton("Open");
	tombolSave = new JButton ("Save");
	tombolEdit = new JButton ("Edit");
	tombolDelete = new JButton ("Delete");
        
        setLayout(new FlowLayout());  
	add(tombolOpen);
	add(tombolSave);
        add(tombolEdit);
        add(tombolDelete);

	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
