package janken;

public class GameController {

    // 勝利回数を管理するフィールド変数
    private int winCountA = 0;
    private int winCountB = 0;

    // プログラムの開始地点
    public static void main(String[] args) {
        GameController game = new GameController();
        game.startGame();
    }

    // ゲーム全体の進行を管理する
    private void startGame() {

        // 必要なオブジェクトを作成
        HumanPlayer playerA = new HumanPlayer();
        ComputerPlayer playerB = new ComputerPlayer();
        Judge judge = new Judge();

        // どちらかが3勝するまで繰り返す
        while (winCountA < 3 && winCountB < 3) {

            // それぞれのプレイヤーが手を選ぶ
            System.out.println("グー・チョキ・パーを入力してください");
            playerA.selectHand();
            playerB.selectHand();

            // 選んだ手を取得する
            String handA = playerA.getHand();
            String handB = playerB.getHand();

            // それぞれの手を表示
            System.out.println("人間：" + handA);
            System.out.println("コンピュータ：" + handB);

            // 勝敗判定
            String result = judge.judge(handA, handB);

            // 勝利回数を更新
            countWin(result);

            // 現在の勝利回数を表示
            System.out.println("人間：" + winCountA + "勝");
            System.out.println("コンピュータ：" + winCountB + "勝");
            System.out.println("--------------------");
        }

        // 最終的な勝者を表示
        if (winCountA == 3) {
            System.out.println("人間の勝利！");
        } else {
            System.out.println("コンピュータの勝利！");
        }
    }

    // 勝敗結果に応じて勝利回数を更新する
    private void countWin(String result) {

        if (result.equals("A_WIN")) {
            winCountA++;

        } else if (result.equals("B_WIN")) {
            winCountB++;
        }

        // DRAWの場合は何もしない
    }
}