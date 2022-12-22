import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 5;
        System.out.println(frog);
        frog = frog / 3.5;
        frog = frog + 4;
        System.out.println(frog);

        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var weightOfTwoFighters = oneBoxerWeight + twoBoxerWeight;
        System.out.println("Общий вес бойцов " + weightOfTwoFighters);
        var weightDifference = twoBoxerWeight - oneBoxerWeight;
        System.out.println("разница в весе бойцов " + weightDifference + " кг!");
        System.out.println("разница весов спортсменов " + weightDifference + " кг!");
        var difference = ( twoBoxerWeight % oneBoxerWeight );
        System.out.println("разница в весе боксеров " + difference + "кг!");

        var timeJob = 640;
        System.out.println("Время работы всех сотрудников " + timeJob + " часов!");
        var employeeWorkingTime = 8;
        System.out.println("Каждый сотрудник работает по " + employeeWorkingTime + " Часов!");
        var result = 640 / 8;
        System.out.println("Всего сотрудников в компании работает " + result + " человек!");
        result = result + 94;
        System.out.println("Теперь в компании работает " + result + " человека!");
        var newTimeJob = timeJob / result;
        System.out.println("Теперь время работы сотрудников составляет " + newTimeJob + " часа!");
        System.out.println("Если в компании работает " + result + " Человека,то всего " + newTimeJob + " часа работы может быть поделено между сотрудниками!");

    }
}