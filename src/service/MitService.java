package service;

import java.util.List;
import java.util.Map;

import domain.Command;
import view.InputView;
import view.OutputView;

public class MitService {

	private final InputView inputView;
	private final OutputView outputView;

	public MitService(InputView inputView, OutputView outputView) {
		this.inputView = inputView;
		this.outputView = outputView;
	}

	public void run() {
		Command command = getCommand();
		List<Map<String, Object>> taskResult = command.doTask();
		outputView.printEachFileSize(taskResult);
	}

	private Command getCommand() {
		try {
			String command = inputView.getCommand();
			return new Command(command);
		} catch (IllegalArgumentException e) {
			outputView.printErrorMessage(e);
			return getCommand();
		}
	}
}
