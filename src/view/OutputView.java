package view;

import java.util.List;
import java.util.Map;

public class OutputView {

	public void printErrorMessage(Exception e) {
		System.out.println(e.getMessage());
	}

	public void printEachFileSize(List<Map<String, Object>> result) {
		StringBuilder printResult = new StringBuilder();
		result
			.forEach(map -> map.forEach((k, v) -> printResult.append(k)
				.append(" ")
				.append((long) v).append("B\n")));
		System.out.println(printResult);
	}
}
