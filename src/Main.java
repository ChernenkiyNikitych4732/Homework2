public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача №1");
        var dog = 8.0;
        dog = 11.0;
        System.out.println(dog);
        var cat = 3.6;
        cat = 6.9;
        System.out.println(cat);
        var paper = 763789;
        paper = 763800;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача №2");
        var dog = 8.0;
        dog = dog + 4;
        dog = 11.0;
        dog = dog + 7;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = 6.9;
        cat = cat + 7;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = 763800;
        paper = paper + 7;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача №3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        dog = 11.0;
        dog = dog + 7;
        dog = dog - 6.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        cat = 6.9;
        cat = cat + 7;
        cat = cat - 5.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        paper = 763800;
        paper = paper + 7;
        paper = paper - 7680;
        System.out.println(paper);

    }
    public static void task4() {
        System.out.println("Задача №4");
        var friend = 19;
        friend = 22;
        System.out.println(friend);
        friend = friend + 2;
        friend = friend + 5;
        System.out.println(friend);
        friend = friend / 7;
        friend = friend / 10;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача №5");
        var frog = 3.5;
        frog = 6.5;
        System.out.println(frog);
        frog = frog * 10;
        frog = frog * 13;
        System.out.println(frog);
        frog = frog / 3.5;
        frog = frog / 6.5;
        System.out.println(frog);
        frog = frog + 4;
        frog = frog + 7;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача №6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        boxerWeight1 = 81.2;
        boxerWeight2 = 85.7;
        var totalPounds = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов " + totalPounds + " кг");
    }
    public static void task7() {
        System.out.println("Задача №7");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        boxerWeight1 = 81.2;
        boxerWeight2 = 85.7;
        var poundsDifferential1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе бойцов 1 " + poundsDifferential1 + " кг");
        var totalPounds = boxerWeight1 + boxerWeight2;
        var poundsDifferential2 = (boxerWeight2 - boxerWeight1) % totalPounds;
        System.out.println("Разница в весе бойцов 2 " + poundsDifferential2 + " кг!");
    }
    public static void task8() {
        System.out.println("Задача №8");
        var totalHours = 640;
        var perHoursEmployee = 8;
        totalHours = 643;
        perHoursEmployee = 11;
        var totalEmployees = totalHours / perHoursEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalEmployees = totalEmployees + 97;
        var employeeHours = totalHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + employeeHours + " часа работы может быть поделено между сотрудниками.");
    }
}
