/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");
		System.out.println("\nシトロン    >");
		String citronstr = read.readLine();
		int citron = Integer.parseInt(citronstr);

		System.out.println("ショコラ    >");
		String chocolatestr = read.readLine();
		int chocolate = Integer.parseInt(chocolatestr);

		System.out.println("ピスターシュ    >");
		String pistachestr = read.readLine();
		int pistache = Integer.parseInt(pistachestr);

		System.out.println("シトロン   " + citronstr + "個");
		System.out.println("ショコラ   " + chocolatestr + "個");
		System.out.println("ピスターシュ   " + pistachestr);

		int sum = citron + chocolate + pistache;
		int sumprice = 250 * citron + 280 * chocolate + 320 * pistache;

		System.out.println("\n合計個数    " + sum + "個");
		System.out.println("合計金額    " + sumprice + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

	}
}
