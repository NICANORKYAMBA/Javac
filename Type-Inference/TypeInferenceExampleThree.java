// Type Inference in Loops
import java.util.List;

public class TypeInferenceExampleThree {
	public static void main(String[] args) {
		var numbers = List.of(1, 2, 3, 4, 5);

		for (var number : numbers) {
			System.out.println(number);
		}

		for (var i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
