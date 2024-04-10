package org.example.GUI;

import org.example.Library;
import org.example.LibraryCardsGenerator;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.IOException;
import java.util.ArrayList;

public class GUI extends JFrame {


    LibraryCardsGenerator generator=new LibraryCardsGenerator();
    public GUI() throws IOException {

        JFrame frame = new JFrame("Библиотека");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contents=new JPanel();
        contents.add(new JScrollPane(new Tree(generator.getLibraryCardsList()).getTree()));
        setContentPane(contents);
        contents.setSize(900,900);
        setSize(1000, 1000);
        setVisible(true);

    }
}
