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
        System.out.println(" Общий вес бойцов " + weightOfTwoFighters);
        var weightDifference = twoBoxerWeight - oneBoxerWeight;
        System.out.println(" разница в весе бойцов " + weightDifference + " кг");
    }
}