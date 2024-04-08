package gui;

import gui.PanelBSeeUser;
import libraryCard.LibraryCard;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.IOException;
import java.util.ArrayList;


public class Tree {
    JTree tree;
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Корневая запись");
    String[] typesUsers = new String[] {"Студенты", "Преподаватели"};
    DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode(typesUsers[0]);
    DefaultMutableTreeNode professorsNode = new DefaultMutableTreeNode(typesUsers[1]);

    public Tree(ArrayList<LibraryCard> libraryCards) throws IOException {
        fillUsers(libraryCards);
        root.add(studentsNode);
        root.add(professorsNode);
        this.tree = new JTree(root);
    }

    public JTree getTree() {
        return tree;
    }

    public void fillUsers(ArrayList<LibraryCard> libraryCards) {
        DefaultMutableTreeNode books;

        for (int i = 0; i < libraryCards.size(); i++) {
            if (libraryCards.get(i).getUser().getType().equals("Студент")) {
                books = new DefaultMutableTreeNode(libraryCards.get(i).getUser().getName() + " " + libraryCards.get(i).getUser().getLastName());
               for (int j = 0; j < libraryCards.get(i).getBorrowedBooksList().size(); j++) {
                    books.add(new DefaultMutableTreeNode(libraryCards.get(i).getBorrowedBooksList().get(j).getName() + " " + libraryCards.get(i).getBorrowedBooksList().get(j).getType() + " " + libraryCards.get(i).getBorrowedBooksList().get(j).getLanguage()));
               }
               studentsNode.add(books);

            } else {
            books = new DefaultMutableTreeNode(libraryCards.get(i).getUser().getName() + " " + libraryCards.get(i).getUser().getLastName() + " " + libraryCards.get(i).getUser().getMiddleName());
               for (int j = 0; j < libraryCards.get(i).getBorrowedBooksList().size(); j++) {
                    books.add(new DefaultMutableTreeNode(libraryCards.get(i).getBorrowedBooksList().get(j).getName() + " " + libraryCards.get(i).getBorrowedBooksList().get(j).getType() + " " + libraryCards.get(i).getBorrowedBooksList().get(j).getLanguage()));
               }
               professorsNode.add(books);
            }
        }
    }
}


