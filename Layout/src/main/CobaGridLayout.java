/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.*;
import javax.swing.*;

public class CobaGridLayout extends JFrame{
    JButton tombolSave,tombolEdit,tombolDelete,tombolOpen;

    public CobaGridLayout(){
	setTitle("GRID LAYOUT");
	tombolOpen = new JButton("Open");
	tombolSave = new JButton ("Save");
	tombolEdit = new JButton ("Edit");
	tombolDelete = new JButton ("Delete");

	setLayout(new GridLayout(2,2));
	add(tombolOpen);
	add(tombolSave);
        add(tombolEdit);
        add(tombolDelete);

	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
