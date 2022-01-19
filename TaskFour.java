public class TaskFour {

//    Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
//    На вход функции подаётся время в виде двух переменных: "hours" и "minutes"

    public static void main(String[] args) {
        convertTime(23, 60);
    }

    public static void convertTime(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || hours > 24 || minutes > 60) {
            System.out.println("Wrong input");
        } else {
            if (hours > 12) {
                hours = hours - 12;
            }
            if (hours == 12) {
                hours = 0;
            }
            if (minutes == 60) {
                minutes = 0;
                hours += 1;
                if (hours > 12) {
                    hours = hours - 12;
                }
            }
            double result = Math.abs(((hours * 30.0 + minutes * 0.5) - minutes * 6));
            System.out.println(result);
        }

    }
}

