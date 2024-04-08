package book;

import java.util.Random;

public class RusStudentBook extends StudentBook implements RussianLanguage{
    private String name;
    private String sort;
    private Random rm = new Random();
    private String[] sorts = {"Учебник", "Пособие", "Задачник", "Решебник"};
    private String[] names = {"Линейная алгебра", "Математический анализ", "Дифференциальные уравнения", "Теория функций комплексного переменного", "Математика", "Обыкновенные дифференциальные уравнения", "Теория вероятностей", "Mатематическая статистика", "Уравнения математической физики", "Bнтегральные уравнения"};

    RusStudentBook() {
        this.name = names[rm.nextInt(names.length - 1)];
        this.sort = sorts[rm.nextInt(sorts.length - 1)];
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSort() {
        return sort;
    }

    @Override
    public String getLanguage() {
        return language;
    }
}
