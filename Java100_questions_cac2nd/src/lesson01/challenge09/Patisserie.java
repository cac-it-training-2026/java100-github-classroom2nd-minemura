/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCountStr);

		double sum = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		int sumprice = (int) (250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount);

		System.out.println("\n合計個数    " + sum + "個");
		System.out.println("合計金額    " + sumprice + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		citron = (int) (citron - citronBuyCount);
		chocolate = (int) (chocolate - chocolatBuyCount);
		pistache = (int) (pistache - pistacheBuyCount);

		int citronPercentage = (int) ((250 * citronBuyCount) / sumprice * 100);
		int chocolatPercentage = (int) ((280 * chocolatBuyCount) / sumprice * 100);
		int pistachePercentage = (int) ((320 * pistacheBuyCount) / sumprice * 100);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・残り" + citron + "個");
		System.out.println("ショコラ      \\280・・・残り" + chocolate + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pistache + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計\\" + sumprice);
		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (250 * citronBuyCount) + "・・・" + citronPercentage + "%");
		System.out.println("ショコラ      \\" + (int) (280 * chocolatBuyCount) + "・・・" + chocolatPercentage + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pistacheBuyCount) + "・・・" + pistachePercentage + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味　　・・・" + citronPercentage + "%");
		System.out.println("ショコラの味　　　・・・" + chocolatPercentage + "%");
		System.out.println("ピスターシュの味　・・・" + pistachePercentage + "%");

		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + ((sumprice / (int) sum) / 10 * 10) + "です。");

	}
}
