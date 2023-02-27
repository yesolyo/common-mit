package service;

import domain.Command;
import view.InputView;

public class MitService {

	private final InputView inputView;

	public MitService(InputView inputView) {
		this.inputView = inputView;
	}

	public void run() {
		Command command = getCommand();
	}

	private Command getCommand() {
		String command = inputView.getCommand();
		return new Command(command);
	}
}
