import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Kairat";
        student.age = 18;
        student.grup = "Java";
        System.out.println("Name ; " + student.name);
        System.out.println("Age ; " + student.age);
        System.out.println("Grup ; " + student.grup);
        System.out.println();

        Student student1 = new Student();
        student1.name = "Erenasar";
        student1.age = 19;
        student1.grup = "Java";
        System.out.println("Name ; " + student1.name);
        System.out.println("Age ; " + student1.age);
        System.out.println("Grup ; " + student1.grup);
        System.out.println();

        Student student2 = new Student();
        student2.name = "Aizat";
        student2.age = 19;
        student2.grup = "Java";
        System.out.println("Name ; " + student2.name);
        System.out.println("Age ; " + student2.age);
        System.out.println("Grup ; " + student2.grup);
        System.out.println();

        Student student3 = new Student();
        student3.name = "Azim";
        student3.age = 18;
        student3.grup = "Javajs";
        System.out.println("Name ; " + student3.name);
        System.out.println("Age ; " + student3.age);
        System.out.println("Grup ; " + student3.grup);
        System.out.println();

        Student student4 = new Student();
        student4.name = "Mairam";
        student4.age = 18;
        student4.grup = "Javajs";
        System.out.println("Name ; " + student4.name);
        System.out.println("Age ; " + student4.age);
        System.out.println("Grup ; " + student4.grup);

        Student[] masiv = {student, student1, student2, student3, student4};
        double a = 0;
        double f = 0;
        for (int s = 0; s < masiv.length; s++) {
            if (masiv[s].grup.equals("Java")) {
                a = masiv[s].age + a;
                f++;
                System.out.println("\n" + masiv[s].name);
            }
        }
        System.out.println("\n" + "Ortocho arhimetikalyk jash = " + (a / f));


        Scanner sc = new Scanner(System.in);
        while (true) {
            Seasons seasons = new Seasons();
            seasons.sezon(sc.nextInt());
            Pasport pasport = new Pasport();
            pasport.firstName = "Nuridinov";
            pasport.lastname = "Kairat";
            pasport.gender = "E/M";
            pasport.Birth = "Kyrgyz Respublikasy";

            pasport.id = 976032004;
            System.out.println("____________________________________");
            System.out.println("|   ________    " + pasport.firstName + "           |");
            System.out.println("|  | ^    ^ |   " + pasport.lastname + "              |");
            System.out.println("|   |  __  |    " + pasport.gender + "                 | ");
            System.out.println("|     ____      " + pasport.Birth + " |");
            System.out.println("|   [      ]    " + pasport.localDate + "          |");
            System.out.println("|     foto             ID" + pasport.id + "  |");
            System.out.println("-------------------------------------");

        }
    }
}