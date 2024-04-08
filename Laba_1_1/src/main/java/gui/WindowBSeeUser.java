package gui;

import generator.Generator;
import libraryCard.LibraryCard;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class WindowBSeeUser extends JFrame {
    WindowBSeeUser(Generator generator) throws IOException {
        setTitle("Список пользователей");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(new Dimension(500,700));
        setLocationRelativeTo(null);

        getContentPane().add(new PanelBSeeUser(generator));

    }
}
