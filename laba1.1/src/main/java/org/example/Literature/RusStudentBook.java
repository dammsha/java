package org.example.Literature;

import java.util.Random;

public class RusStudentBook extends StudentBook implements RusLanguage {
    private String name;
    private String discipline;
    private String kind;
    private Random random=new Random();
    String[] nameArray=new String[]{"Электрофизика пресных вод","Основы физики сверхпроводников","Голографические фотонные структуры в наноструктурированных материалах","Электродинамика","Колебательные и волновые процессы в технических системах","Динамика полупроводниковых лазеров","Электротехника и электроника. Виртуальный практикум в среде QUCS","Механика. Молекулярная (статистическая) физика","Астрономия","Волноводная фотоника.","Основы космологии","Молекулярная физика в жизни, технике и природе","\n" +
            "Основы электродинамики","Современная инфракрасная спектроскопия","Физика планет Солнечной системы"};
    String[] disciplineArray=new String[]{"Микропроцессорные системы электрофизических установок","Автоматизация проектирования","Материаловедение"," Физические установки","Ускорители заряженных частиц","Физика пучков заряженных частиц и ускорительная техника","Информатика","Микропроцессорные системы "};
    String[] kindArray=new String[]{"Учебник","Сборник","Пособие","Задачник","Решебник"};
    public RusStudentBook(){
        this.name=nameArray[random.nextInt(nameArray.length)];
        this.discipline=disciplineArray[random.nextInt(disciplineArray.length)];
        this.kind=kindArray[random.nextInt(kindArray.length)];
    }
    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getKind() {
        return kind;
    }
}
