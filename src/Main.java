import domain.Course;
import domain.Mentoring;

import javax.management.MalformedObjectNameException;
import java.time.LocalDate;
import java.time.Month;

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

    }
}
