/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.*;
import javax.swing.*;

class CobaBorderLayout extends JFrame{
   JButton tombolSave,tombolEdit,tombolDelete,tombolOpen;
   JLabel labelGambar;
   public CobaBorderLayout(){
	setTitle("Border Layout");

	tombolOpen = new JButton("Open");
	tombolSave = new JButton ("Save");
	tombolEdit = new JButton ("Edit");
	tombolDelete = new JButton ("Delete");
        labelGambar = new JLabel("Ini Center");

	setLayout(new BorderLayout());
	add(tombolOpen,"North");
	add(tombolSave,"West");
	add(labelGambar,"Center");
	add(tombolEdit,"East");
	add(tombolDelete,"South");

	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}

