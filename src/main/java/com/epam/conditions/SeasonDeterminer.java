package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 13 || monthNumber <= 0) {
            System.out.println("Wrong month number");
        } else if (monthNumber <= 2 || monthNumber == 12) {
            System.out.println("Winter");
        } else if (monthNumber <= 5) {
            System.out.println("Spring");
        } else if (monthNumber <= 8) {
            System.out.println("Summer");
        } else  {
            System.out.println("Autumn");
        }
    }

}
