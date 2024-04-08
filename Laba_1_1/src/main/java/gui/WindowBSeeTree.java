package gui;

import libraryCard.LibraryCard;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class WindowBSeeTree extends JFrame {
    WindowBSeeTree(ArrayList<LibraryCard> libraryCards) throws IOException {
        setTitle("Литература на семестр");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(new Dimension(1000,800));
        setLocationRelativeTo(null);

        getContentPane().add(new JScrollPane(new Tree(libraryCards).getTree()));
    }
}
