// Inference with Collections

import java.util.List;
import java.util.Map;

public class TypeInferenceExampleTwo {
	public static void main(String[] args) {
		var list = List.of("apple", "banana", "cherry");
		var map = Map.of("apple", 1, "banana", 2, "cherry", 3);

		for (var item : list) {
			System.out.println(item);
		}

		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " =  " + entry.getValue());
		}
	}
}
