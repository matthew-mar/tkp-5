/**
 * Базовый класс, описывающий поведение мебели
 * Свойства: <b>name</b>, <b>color</b>
 * @author Матвей Марьюшкин
 */
public class Furniture {
    /** Поле название */
    private String name;

    /** Поле цвет */
    private String color;

    /** Конструктор без параметров
     * @see Furniture#Furniture(String, String)
     */
    public Furniture() {
        color = "black";
    }

    /**
     * Конструктор с параметрами
     * @param furName - название мебели
     * @param furColor - цвет мебели
     * @see Furniture#Furniture()
     */
    public Furniture(String furName, String furColor) {
        name = furName;
        color = furColor;
    }

    /**
     * Метод инициализации поля name {@link Furniture#name}
     * @param furName - название мебели
     */
    public void setName(String furName) {
        name = furName;
    }

    /**
     * Метод инициализации поля color {@link Furniture#color}
     * @param furColor - цвет мебели
     */
    public void setColor(String furColor) {
        color = furColor;
    }

    /**
     * Метод получения значения поля name {@link Furniture#name}
     * @return строка "название мебели"
     */
    public String getName() {
        return name;
    }

    /**
     * Метод получения значения поля color {@link Furniture#color}
     * @return строка "цвет мебели"
     */
    public String getColor() {
        return color;
    }
}
