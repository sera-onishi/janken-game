package janken;
import java.util.Scanner;

public class HumanPlayer extends Player {

	@Override
	public void selectHand() {
		// ここに人間が手を選ぶ処理を書く
        Scanner scanner = new Scanner(System.in);
        String hand = scanner.nextLine();
        setHand(hand);

	}

}
