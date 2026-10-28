package janken;

import java.util.Random;

public class ComputerPlayer extends Player {

	@Override
	public void selectHand() {
		// コンピュータがランダムに選ぶ処理
		
        //、0・1・2のいずれかを生成し、number に保存
		Random random = new Random();
		int number = random.nextInt(3);
		
		// 保存する変数を用意
		String hand;
        
		// 数字を手に変換して保存
		if (number == 0) {
		    hand = "グー";
		} else if (number == 1) {
		    hand = "チョキ";
		} else {
		    hand = "パー";
		}

		setHand(hand);

	}

}
