import service.MitService;
import view.InputView;

public class MitApplication {

	public static void main(String[] args) {
		MitService mitService = new MitService(new InputView());
		mitService.run();
	}
}
