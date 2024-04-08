package gui;

import generator.Generator;
import libraryCard.LibraryCard;
import people.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Panel extends JPanel {
    JButton buttonSeeUsers = new JButton("Посмотреть пользователей");
    JButton buttonSeeTree = new JButton("Начать семестр");
    JButton buttonExit = new JButton("Выйти");
    JButton buttonLibrary = new JButton("Библиотека");
    Generator generator = new Generator();
    GridLayout gr = new GridLayout(4,1);
    Panel() throws IOException {
        setLayout(gr);
        add(buttonSeeUsers);
        add(buttonSeeTree);
        add(buttonLibrary);
        add(buttonExit);
        buttonSeeUsers.setForeground(Color.PINK);
        buttonSeeTree.setForeground(Color.GREEN);
        buttonExit.setForeground(Color.BLUE);

        buttonSeeUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new WindowBSeeUser(generator);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        buttonSeeTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new WindowBSeeTree(generator.getLibraryCardsList());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        buttonLibrary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WindowBLibrary(generator.getLibraryCardsList());
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
