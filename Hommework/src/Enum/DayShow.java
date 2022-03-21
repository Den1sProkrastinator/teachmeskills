package Enum;

public class DayShow {
    public static void main(String[] args) {

            for (int i = 0; i < WeekDays.values().length; i++) {

                if (i < 5) {

                    System.out.println(WeekDays.values()[i] + " рабочий");
                } else {
                    System.out.println(WeekDays.values()[i] + " выходной");
                }
            }
        }
    }

