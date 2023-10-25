package n3exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
         new Student("Jose",  38,"Java",  8),
         new Student("Oscar",50,"Java",9),
         new Student("Marc",25,"PHP",6),
         new Student("Ainoa",42,"Java",10),
         new Student("Juanma",43,"Java",8),
         new Student("Pedro",38,"PHP",5),
         new Student("Maria",16,"C++",8),
         new Student("Miguel",28,"C++",7),
         new Student("Arnoldo",17,"PHP",3),
         new Student("Iñaki",35,"PHP",6)
         );

        System.out.println("\nNom i l’edat de cada alumne/a:");
        students.forEach(s -> System.out.println(s.getName() + " - " + s.getAge()));


        System.out.println("\nAlumnes que el seu nom comença per ‘a’:");
        List<Student> studentsWithA = students.stream()
                .filter(s -> s.getName().toLowerCase().startsWith("a"))
                .toList();

        studentsWithA.forEach(System.out::println);

        System.out.println("\nAlumnes que tenen una nota de 5 o superior:");
        students.stream()
                .filter(s -> s.getGrade() >= 5)
                .forEach(System.out::println);

        System.out.println("\nAlumnes que tenen un nota de 5 o més, i que no són de PHP:");
        students.stream()
                .filter(s -> s.getGrade() >= 5 && !s.getCourse().equalsIgnoreCase("PHP"))
                .forEach(System.out::println);

        System.out.println("\nalumnes que fan JAVA i són majors d’edat:");
        students.stream()
                .filter(s -> s.getCourse().equalsIgnoreCase("JAVA") && s.getAge() >= 18)
                .forEach(System.out::println);
    }
}
