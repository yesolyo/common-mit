package view;

import java.util.List;
import java.util.Map;

import domain.CommandType;

public class OutputView {

	public void printErrorMessage(Exception e) {
		System.out.println(e.getMessage());
	}

	public void printTaskResult(List<Map<String, Object>> result, CommandType commandType) {
		switch (commandType) {
			case LIST, ZLIB -> printEachFileSize(result);
			case HASH -> printEachFileHash(result);
		}
	}

	private void printEachFileSize(List<Map<String, Object>> result) {
		StringBuilder printResult = new StringBuilder();
		result
			.forEach(map -> map.forEach((k, v) -> printResult.append(k)
				.append(" ")
				.append((long) v).append("B\n")));
		System.out.println(printResult);
	}

	private void printEachFileHash(List<Map<String, Object>> result) {
		StringBuilder printResult = new StringBuilder();
		result
			.forEach(map -> map.forEach((k, v) -> printResult.append(k)
				.append(" = ")
				.append(v).append("\n")));
		System.out.println(printResult);
	}
}
