package programming_exercices;

import java.util.List;

public class Exercice_4 {
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
		printAllCoursesWithAtLeast4Letters(courses);
	}

	private static void printAllCoursesWithAtLeast4Letters(List<String> courses) {
		courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
		
	}



	

}
