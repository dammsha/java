package gui;

import generator.Generator;
import people.User;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;


public class PanelBSeeUser extends JPanel{
    User user = new User();
    DefaultListModel<String> dL;
    //    список, в который поступает модель с клиентами
    JList<String> list;
    GridLayout gr = new GridLayout(1,1);


    public PanelBSeeUser(Generator generator) throws IOException {
        this.dL = generateModel(generator);
        this.list = new JList<>(dL);
        setLayout(gr);
        list.setFixedCellHeight(30);
        list.setSize(new Dimension(500, 500));
        add(new JScrollPane(list));
    }

    DefaultListModel<String> generateModel(Generator generator){
        DefaultListModel<String> temp = new DefaultListModel<>();
        for(int i = 0; i < generator.getUser().getUsers().size(); i++){
            String name = generator.getUser().getUsers().get(i).getName();
            String lastName = generator.getUser().getUsers().get(i).getLastName();
            String middleName = generator.getUser().getUsers().get(i).getMiddleName();
            temp.add(i,name + " " + lastName + " " + middleName);
        }
        return temp;
    }

    public User getUser() {
        return user;
    }
}
