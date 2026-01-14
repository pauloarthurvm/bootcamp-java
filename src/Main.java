import domain.*;

import javax.management.MalformedObjectNameException;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setName("Java Course");
        course1.setDescription("Learn Java with the best");
        course1.setCourseLoad(20);

        Course course2 = new Course();
        course2.setName("NextJS Course");
        course2.setDescription("Build your NextJS app");
        course2.setCourseLoad(20);

        System.out.println(course1.toString());
        System.out.println(course2.toString());

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setName("Java Mentoring");
        mentoring1.setDescription("Build Java backend");
        mentoring1.setDate(LocalDate.of(LocalDate.now().getYear(), Month.FEBRUARY, 10));

        System.out.println(mentoring1);

        Content content1 = new Course();
        System.out.println(content1.getClass().toString());

        Content content2 = new Mentoring();
        System.out.println(content2.getClass().toString());

        System.out.println("\n");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Learn Java with the best proffesionals");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring1);

        Dev dev1 = new Dev();
        dev1.setName("Josh");
        dev1.enrollBootcamp(bootcamp);
        System.out.println("Enrolled contents:\n" + dev1.getContentsEnrolled());
        dev1.progress();
        System.out.println("Finished contents:\n" + dev1.getContentsFinished());
        System.out.println("Enrolled contents:\n" + dev1.getContentsEnrolled());
        System.out.println("XP:\n" + dev1.calculateTotalXp());
        System.out.println();

        Dev dev2 = new Dev();
        dev2.setName("Mike");
        dev2.enrollBootcamp(bootcamp);
        System.out.println("Enrolled contents:\n" + dev2.getContentsEnrolled());
        dev2.progress();
        System.out.println("Finished contents:\n" + dev2.getContentsFinished());
        System.out.println("Enrolled contents:\n" + dev2.getContentsEnrolled());
        System.out.println("XP:\n" + dev1.calculateTotalXp());
        System.out.println();

    }
}
