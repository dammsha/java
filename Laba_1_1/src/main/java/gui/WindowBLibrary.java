package gui;

import libraryCard.LibraryCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WindowBLibrary extends JFrame {
    WindowBLibrary(ArrayList<LibraryCard> generator) {
        setTitle("Библиотека");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setSize(new Dimension(1000,700));
        setLocationRelativeTo(null);

        getContentPane().add(new PanelBLibrary(generator));
    }
}
