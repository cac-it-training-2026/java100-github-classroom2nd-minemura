package lesson05.challenge10;

public class superRobot {
	private String name;
	private int energy; //エネルギー
	private int skillLevel;//調理スキル

	/**
	 * @param name
	 * @param energy
	 * @param skillLevel
	 */
	public superRobot(String name, int energy, int skillLevel) {
		this.name = name;
		this.energy = energy;
		this.skillLevel = skillLevel;

	}

	String makeLuxuryDish(int meat, int fish, int spice) {
		String menu;

		int randommode = (int) (Math.random() * 3);

		if (randommode == 0 && skillLevel >= 8 && meat >= 5) {
			menu = "プレミアムステーキ";
		} else if (randommode == 1 && fish >= 3) {
			menu = "極上寿司";
		} else if (randommode == 2) {
			menu = "シェフおまかせプレート";
		} else {
			menu = "丸焦げ";
		}

		energy -= 10;

		return menu;
	}

	void systemCheck() {
		System.out.println("名前：" + name);
		System.out.println("エネルギー：" + energy);
		System.out.println("スキル：" + skillLevel);
	}

	public static void main(String[] args) {
		System.out.println("superRobot起動");

		superRobot robot = new superRobot("SuperRobot", 100, 8);

		robot.systemCheck();
		int meat = 6;
		int fish = 2;
		int spice = 4;

		String menu = robot.makeLuxuryDish(meat, fish, spice);
		System.out.println(menu + "ができました。");
		System.out.println("後片付けをします。");

		int[] ingredients = { meat, fish, spice };

		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;

		}
		System.out.println("片付け完了");
	}

}
