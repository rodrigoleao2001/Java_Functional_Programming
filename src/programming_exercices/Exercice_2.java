package programming_exercices;

import java.util.List;

public class Exercice_2 {
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
		printAllCoursesIndividually(courses);
	}

	private static void printAllCoursesIndividually(List<String> courses) {
		courses.stream().forEach(System.out::println);
		
	}

}
