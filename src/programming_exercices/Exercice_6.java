package programming_exercices;

import java.util.List;

public class Exercice_6 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker","Kubernetes");

		printNumberOfCharactersInEachCourseName(courses);

	}

	private static void printNumberOfCharactersInEachCourseName(List<String> courses) {

		courses.stream().map(course -> course.length()).forEach(System.out::println);

	}

}
