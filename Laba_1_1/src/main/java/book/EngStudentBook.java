package book;

import java.util.Random;

public class EngStudentBook extends StudentBook implements EnglishLanguage{
    private String name;
    private String level;
    private String author;
    private String university;
    private Random rm = new Random();
    private String[] names = {"Instructional Design", "Computer Science", "Public Health", "Science (Honours) in Data Science", "Cyber Security", "Advanced Study in Engineering", "Computer and Information Technology", "Artificial Intelligence", "Information Systems", "Business Administration", "Arts", "Electrical Engineering", "Analytics"};
    private String[] levels = {"Baccalaureate", "Magistracy"};
    private String[] authors = {"Wenhao David Huang", "Enjung Grace Oh", "Kingsley Moore", "Aaron Martinez", "Raegan Williams", "Harper Taylor", "Simon Miller", "Kale Young", "Bristol Harris", "Avery Nelson", "Natalie Hill", "Mario Collins", "Darrell Collins", "Jennifer Walker", "Kendal Martin", "Russell Clark"};
    private String[] universities = {"Univercity of London", "University of Illinois", "Imperial College London", "Indian Institute of Technology Guwahati", "UC Berkeley College of Engineering", "University of Pennsylvania", "Northeastern University", "University of Colorado Boulder", "Dartmouth College"};

    public EngStudentBook() {
        this.name = names[rm.nextInt(names.length - 1)];
        this.level = levels[rm.nextInt(levels.length - 1)];
        this.author = authors[rm.nextInt(authors.length - 1)];
        this.university = universities[rm.nextInt(universities.length - 1)];
    }

    @Override
    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getLevel() {
        return level;
    }

    public String getAuthor() {
        return author;
    }

    public String getUniversity() {
        return university;
    }
}
