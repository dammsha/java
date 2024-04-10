package org.example.GUI;

import org.example.Library;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

public class Tree {
    DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Посетители");

    DefaultMutableTreeNode studentNode = new DefaultMutableTreeNode("Студенты", true);
    DefaultMutableTreeNode professorNode = new DefaultMutableTreeNode("Преподаватели", true);

    Library libraries;
    JTree tree;
    public Tree(ArrayList<Library> libraries){
        fillUser(libraries);
        rootNode.add(professorNode);
        rootNode.add(studentNode);

        this.tree=new JTree(rootNode);
    }
    public JTree getTree(){
        return tree;
    }
    public void fillUser(ArrayList<Library> libraries){
        DefaultMutableTreeNode users;
        for (int i=0; i<libraries.size() ; i++){

            if(libraries.get(i).getUser().getType().equals("преподаватель")){
                users=new DefaultMutableTreeNode(libraries.get(i).getUser().getSurname()+" "+libraries.get(i).getUser().getName()+" "+libraries.get(i).getUser().getPatronymic());
                for (int k=0;k<libraries.get(i).getBooksOnHandsList().size();k++){
                    users.add(new DefaultMutableTreeNode(libraries.get(i).getBooksOnHandsList().get(k).getName()));
                }
                professorNode.add(users);
                System.out.println(libraries.get(i).getUser().getSurname()+" "+libraries.get(i).getUser().getName()+" "+libraries.get(i).getUser().getPatronymic()+" prof");
            }else {
                users=new DefaultMutableTreeNode(libraries.get(i).getUser().getName()+" "+libraries.get(i).getUser().getSurname());
                for (int k=0;k<libraries.get(i).getBooksOnHandsList().size();k++){
                    users.add(new DefaultMutableTreeNode(libraries.get(i).getBooksOnHandsList().get(k).getName()));
                }
                studentNode.add(users);
                System.out.println(libraries.get(i).getUser().getName()+" "+libraries.get(i).getUser().getSurname()+" st");
            }
        }
    }
}
