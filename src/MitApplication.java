import service.MitService;
import view.InputView;
import view.OutputView;

public class MitApplication {

	public static void main(String[] args) {
		MitService mitService = new MitService(new InputView(), new OutputView());
		mitService.run();
	}
}
