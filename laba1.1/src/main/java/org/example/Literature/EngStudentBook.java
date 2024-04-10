package org.example.Literature;

import java.util.Random;

public class EngStudentBook extends StudentBook implements EngLanguage {
    private String name;
    private String level;
    private String discipline;
    private String author;
    private String university;
    String[] nameArray=new String[]{"Entangled Life","How To","Cosmic Queries","Elon Musk","A Brief History of Time","The Hidden Life of Trees","The Code Breaker","Midnight in Chernobyl","The Gene","Einstein","The China Study","Deadliest Enemy","Chernobyl","The Radium Girls","Lifespan","Hidden Figures"};
    String[] levelArray=new String[]{"master's degree","bachelor's degree"};
    String[] disciplineArray=new String[]{"Federal law","Labor law","Philosophy of history","Bioethics","Marxism","Anthropology of Religion","Buddhist theology","Cultural anthropology","Econometrics","Industrial organization","Geobiology","Human geography","Community psychology","Quantum field theory","Econometrics"};
    String[] authorArray=new String[]{"by Margot Lee Shetterly","by David A. Sinclair","by Kate Moore","by Bill Bryson","by Dr. Jason Fung","by Serhii Plokhy","by Christian Davenport","by Stephen Hawking","by Walter Isaacson","by Siddhartha Mukherjee","by Chris Hadfield","by Adam Higginbotham","by Walter Isaacson"};
    String[] universityArray=new String[]{"Harvard University","University of Cambridge","Columbia University","University of Oxford","Yale University","Stanford University","University of Paris","University of Chicago","University of Michigan","Princeton University"};
    private Random random=new Random();
    public EngStudentBook(){
        this.name=nameArray[random.nextInt(nameArray.length)];
        this.level=levelArray[random.nextInt(levelArray.length)];
        this.discipline=disciplineArray[random.nextInt(disciplineArray.length)];
        this.author=authorArray[random.nextInt(authorArray.length)];
        this.university=universityArray[random.nextInt(universityArray.length)];

    }
    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getAuthor() {
        return author;
    }

    public String getUniversity() {
        return university;
    }
}
