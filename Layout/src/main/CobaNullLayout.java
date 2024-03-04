/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.*;
import javax.swing.*;

public class CobaNullLayout extends JFrame{
    JButton tombolSave,tombolEdit,tombolDelete,tombolOpen;

   public CobaNullLayout(){
	setTitle("NULL LAYOUT");
	tombolOpen = new JButton("Open");
	tombolSave = new JButton ("Save");
	tombolEdit = new JButton ("Edit");
	tombolDelete = new JButton ("Delete");

	setLayout(null);
	add(tombolOpen);
	add(tombolSave);
        add(tombolEdit);
        add(tombolDelete);
        tombolOpen.setBounds(10,10,150,20);
	tombolSave.setBounds(150,15,150,20);
	tombolEdit.setBounds(100,30,150,20);
	tombolDelete.setBounds(40,50,150,20);

	setSize(350,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
