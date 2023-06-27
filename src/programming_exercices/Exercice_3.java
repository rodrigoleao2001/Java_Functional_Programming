package programming_exercices;

import java.util.List;

public class Exercice_3 {
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
		printAllCoursesContainingTheWordSpring(courses);
	}

	private static void printAllCoursesContainingTheWordSpring(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		
	}

	

}
