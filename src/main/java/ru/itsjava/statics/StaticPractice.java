package ru.itsjava.statics;


public class StaticPractice {

    public static void main(String[] args) {
//        System.out.println("Salary.increaseCoefficient = " + Salary.increaseCoefficient);
        Salary cleanerSalary = new Salary(5_000.0);
        Salary targetSalary = new Salary(10_000.0);

        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());
        Salary.setIncreaseCoefficient(1.0);

        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        System.out.println("Salary.CEO = " + Salary.SALARY_CEO);
        System.out.println();

        //Car
        Car bentley = new Car("Бентли", "черный");
        Car giguli = new Car("Жигули", "ржавая");

        System.out.println(bentley.brand + " " + bentley.colour + " " + bentley.priceCar);
        System.out.println(giguli.brand + " " + giguli.colour + " " + giguli.priceCar);

//        bentley.setbrand("Мерседес");
//        System.out.println(bentley.brand + " " + bentley.colour + " " + bentley.priceCar);
    }
}
