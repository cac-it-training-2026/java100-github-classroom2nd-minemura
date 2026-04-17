/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citron = 30;
		int chocolate = 30;
		int pistache = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　\\250・・・残り" + citron + "個");
		System.out.println("ショコラ　　\\280・・・残り" + chocolate + "個");
		System.out.println("ピスターシュ　　\\320・・・残り" + pistache + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		String citronBuyCountStr = br.readLine();
		int citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		int chocolatBuyCount = Integer.parseInt(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		int pistacheBuyCount = Integer.parseInt(pistacheBuyCountStr);

		int sum = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		int sumprice = 250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount;

		System.out.println("\n合計個数    " + sum + "個");
		System.out.println("合計金額    " + sumprice + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		citron = citron - citronBuyCount;
		chocolate = chocolate - chocolatBuyCount;
		pistache = pistache - pistacheBuyCount;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・残り" + citron + "個");
		System.out.println("ショコラ      \\280・・・残り" + chocolate + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pistache + "個");

	}

}
