public class BaseConverter {

//    Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//    Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
//    и делает конвертацию.

    public static void main(String[] args) {
        convert("C", 27);
    }

    public static void convert(String calculusSystem, double deg) {
        if (calculusSystem == "C") {
            double degF = (deg * 1.8 + 32);
            System.out.println("F° = " + degF);
            double degK = (deg + 273.15);
            System.out.println("K° = " + degK);
        } else if (calculusSystem == "F") {
            double degC = ((deg - 32) / 1.8);
            System.out.println("C° = " + degC);
            double degK = ((deg + 459.67) * 1.8);
            System.out.println("K° = " + degK);
        } else if (calculusSystem == "K") {
            double degF = (deg * 1.8 - 459.67);
            System.out.println("F° = " + degF);
            double degC = (deg - 273.15);
            System.out.println("C° = " + degC);
        } else {
            System.out.println("Incorrect value (\"C\", \"K\", \"F\")");
        }
    }
}
