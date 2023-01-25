package the_dice;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class DiceMaster {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner stdIn = new Scanner(System.in);

		String[] Diceresult = { "丁", "半" };
		int retry = 0;
		int humanplayer;

		do {
			do {
				System.out.println("丁半ゲーム！さぁ張った張った！");
				for (int i = 0; i < Diceresult.length; i++)
					System.out.printf("(%d)%s", i, Diceresult[i]);
				System.out.print(":");
				humanplayer = stdIn.nextInt();
			} while (humanplayer < 0 || humanplayer > 1);

			System.out.printf("あなたは%sを選びました！勝負！\n", Diceresult[humanplayer]);

			int compdice1 = random.nextInt(6)+1;
			int compdice2 = random.nextInt(6)+1;

			if (compdice1 == 1 && compdice2 == 1) {
				System.out.print("⚀　⚀　ピンゾロの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 1 && compdice2 == 2||compdice1 == 2 && compdice2 == 1) {
				System.out.print("⚀　⚁　イチニノの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
					}
			}
			if (compdice1 == 1 && compdice2 == 3||compdice1 == 3 && compdice2 == 1) {
				System.out.print("⚀　⚂　サンミチの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 1 && compdice2 == 4||compdice1 == 4 && compdice2 == 1) {
				System.out.print("⚀　⚃　ヨイチの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 1 && compdice2 == 5||compdice1 == 5 && compdice2 == 1) {
				System.out.print("⚀　⚄　グイチの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 1 && compdice2 == 6||compdice1 == 6 && compdice2 == 1) {
				System.out.print("⚀　⚅　イチロクの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 2 && compdice2 == 2) {
				System.out.print("⚁　⚁　ニゾロの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 2 && compdice2 == 3||compdice1 == 3 && compdice2 == 2) {
				System.out.print("⚁　⚂　サニの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 2 && compdice2 == 4||compdice1 == 4 && compdice2 == 2) {
				System.out.print("⚁　⚃　シニの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 2 && compdice2 == 5||compdice1 == 5 && compdice2 == 2) {
				System.out.print("⚁　⚄　ゴニの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 2 && compdice2 == 6||compdice1 == 6 && compdice2 == 2) {
				System.out.print("⚁　⚅　ニロクの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 3 && compdice2 == 3) {
				System.out.print("⚂　⚂　サンゾロの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 3 && compdice2 == 4||compdice1 == 4 && compdice2 == 3) {
				System.out.print("⚂　⚃　シソウの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 3 && compdice2 == 5||compdice1 == 5 && compdice2 == 3) {
				System.out.print("⚂　⚄　グサンの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 3 && compdice2 == 6||compdice1 == 6 && compdice2 == 3) {
				System.out.print("⚂　⚅　サブロクの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}

			if (compdice1 == 4 && compdice2 == 4) {
				System.out.print("⚃　⚃　シゾロの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 4 && compdice2 == 5||compdice1 == 5 && compdice2 == 4) {
				System.out.print("⚃　⚄　グシの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 4 && compdice2 == 6||compdice1 == 6 && compdice2 == 4) {
				System.out.print("⚃　⚅　シロクの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 5 && compdice2 == 5) {
				System.out.print("⚄　⚄　ゴゾロの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 5 && compdice2 == 6||compdice1 == 6 && compdice2 == 5) {
				System.out.print("⚄　⚅　ゴロクの半！");
				if (humanplayer == 1) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}
			}
			if (compdice1 == 6 && compdice2 == 6) {
				System.out.print("⚅　⚅　ロクゾロの丁！");
				if (humanplayer == 0) {
					System.out.println("あなたの勝ちです！\n");
				} else {
					System.out.println("あなたの負けです！\n");
				}

			}
			do {
				System.out.print("もう一度勝負しますか？ (0)はい（1）いいえ:");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 0);

		System.out.print("ゲーム終了");
	}
}
