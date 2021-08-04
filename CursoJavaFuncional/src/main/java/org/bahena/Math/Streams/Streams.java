package org.bahena.Math.Streams;

import org.bahena.Math.NombresUtils;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList("Java",
                "FrontEnd",
                "BackEnd",
                "FullStack");
        for (String course : courseList) {
            String newCourseName = course.toLowerCase().replace("!", "!!");
            //System.out.println(newCourseName);
            //System.out.printf(course);
        }

        Stream<String> coursesStream = Stream.of("Java",
                "FrontEnd",
                "BackEnd",
                "FullStack");
        //Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());

        //Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));
        //emphasisCourses.forEach(System.out::println);
        //justJavaCourses.forEach(System.out::println);

        Stream<String> coursesStream2 = courseList.stream();
        addOperator(
        coursesStream2.map(course -> course + "!!")
                .filter(course -> course.contains("Java"))

        ).forEach(System.out::println);
    }

    static <T>Stream<T> addOperator(Stream<T> stream){
        return stream.peek(data -> System.out.println("Dato: " + data));
    }
}
