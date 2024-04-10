package org.example;

import org.example.User.User;
import org.example.User.UserGenerator;

import java.io.IOException;
import java.util.ArrayList;

public class LibraryCardsGenerator {
    UserGenerator userGenerator;
    ArrayList<Library> libraryCardsList;
    public LibraryCardsGenerator() throws IOException {
        this.userGenerator=new UserGenerator();
        this.libraryCardsList=generateLibraryCardsList();
    }
    public ArrayList<Library> generateLibraryCardsList() throws IOException {
        ArrayList<Library> lkList=new ArrayList<>();
        for (User userGenerator:userGenerator.getUserList()){
            lkList.add(new Library(userGenerator));
        }
        return lkList;
    }
    public UserGenerator getUserGenerator(){
        return userGenerator;
    }
    public ArrayList<Library> getLibraryCardsList(){
        return libraryCardsList;
    }
}
