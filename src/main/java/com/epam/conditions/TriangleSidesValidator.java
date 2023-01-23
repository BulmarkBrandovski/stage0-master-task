package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide <= thirdSide) {
            System.out.println("it's not a triangle");
            return;
        } else if (firstSide + thirdSide <= secondSide) {
            System.out.println("it's not a triangle");
            return;
        } else if (secondSide + thirdSide <= firstSide) {
            System.out.println("it's not a triangle");
            return;
        }

        System.out.println("this is a valid triangle");
    }

}
