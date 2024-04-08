package gui;

import book.Library;
import generator.Generator;
import libraryCard.LibraryCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelBLibrary extends JPanel {
    DefaultListModel<String> dL;
    //    список, в который поступает модель с клиентами
    JList<String> list;
    GridLayout gr = new GridLayout(1,1);
    public PanelBLibrary(ArrayList<LibraryCard> libraryCards) {
        this.dL = generateModel(libraryCards);
        this.list = new JList<>(dL);
        setLayout(gr);
        list.setFixedCellHeight(50);
        list.setSize(new Dimension(500, 500));
        add(new JScrollPane(list));
    }

    DefaultListModel<String> generateModel(ArrayList<LibraryCard> libraryCards){
        DefaultListModel<String> temp = new DefaultListModel<>();
        for (int i = 0; i < libraryCards.size(); i++){
            for (int j = 0; j < libraryCards.get(i).getBorrowedBooksList().size(); j++) {
                String language = libraryCards.get(i).getBorrowedBooksList().get(j).getLanguage();
                String name = libraryCards.get(i).getBorrowedBooksList().get(j).getName();
                String type = libraryCards.get(i).getBorrowedBooksList().get(j).getType();
                temp.add(i, " " + name + ". Тип: " + type + ". Язык: " + language);
            }
        }
        return temp;
    }
}
