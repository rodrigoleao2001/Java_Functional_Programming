package programming_exercices;

import java.util.List;

public class Exercice_5 {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		
		printCubesOfOddNumbers(numbers);
	}

	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(number -> number%2==1)
		.map(number -> number*number*number).forEach(System.out::println);
		
	}





	

}
