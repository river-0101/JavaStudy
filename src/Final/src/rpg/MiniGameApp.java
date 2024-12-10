package rpg;

public class MiniGameApp {

	public static void main(String[] args) {
		Knight atomic = new Knight("아토믹");
		Knight uther = new HolyKnight("우서");
		Knight guyger = new MagicKnight("가이거");

		atomic.slash(guyger);
		uther.slash(guyger);
		guyger.slash(uther);
		uther.slash(guyger);
		guyger.slash(atomic);

		showStats(atomic, uther, guyger);
		healMe((HolyKnight) uther);
		abraKadabra((MagicKnight) guyger);
		showStats(atomic, uther, guyger);
	}

	static void healMe(Healer healer) {
		if (healer instanceof Knight) {
			Knight knight = (Knight) healer;
			if (knight.getHp() > 50) {
				healer.recover();
			} else {
				healer.heal();
			}
		}
	}

	static void abraKadabra(Magician magician) {
		if (magician instanceof Knight) {
			Knight knight= (Knight) magician;
			if (knight.getHp()>80) {
				healMe((Healer) magician);
			} else if (knight.getHp()>30) {
				magician.magicShield();
			} else {
				magician.teleport();
			}
		}
	}

	static void showStats(Knight... knights) {
		for (Knight knight : knights) {
			knight.show();
		}
	}

}

class Knight {
	String name;
	int hp;

	public Knight(String name) {
		this.name = name;
		this.hp = 100;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void getDamage(int damage) {
		this.hp = this.hp - damage;
	}

	public void slash(Knight enemy) {
		System.out.println("기사 [" + name + "]의 [" + enemy.name + "] 베기 공격!");
		enemy.getDamage(10);
	}

	public void show() {
		System.out.println("[" + name + "]의 hp=" + hp);
	}
}

class HolyKnight extends Knight implements Healer {
	int dp;
	int damage;

	public HolyKnight(String name) {
		super(name);
		this.dp = 100;
	}

	@Override
	public void slash(Knight enemy) {
		damage = 0;
		if (dp >= 70) {
			damage = 20;
		} else {
			damage = 10;
		}

		System.out.println("성기사 [" + name + "]의 [" + enemy.name + "] 베기 공격!");
		enemy.getDamage(damage);
	}

	@Override
	public void heal() {
		hp = 100;
		dp -= 20;
		System.out.println("[" + name + "]의 체력이 가득찹니다.");
	}

	@Override
	public void recover() {
		if (hp < 100) {
			hp += 10;
		} else {
			return;
		}
		dp -= 10;
		System.out.println("[" + name + "]의 회복력이 증가합니다.");
	}

	@Override
	public void show() {
		super.show();
		System.out.println("[" + name + "]의 dp=" + dp);
	}

}

class MagicKnight extends Knight implements Healer, Magician {
	int mp;

	public MagicKnight(String name) {
		super(name);
		this.mp = 100;
	}

	@Override
	public void slash(Knight enemy) {
		System.out.println("마검사 [" + name + "]의 [" + enemy.name + "] 베기 공격!");
		enemy.getDamage(10);
	}

	@Override
	public void magicShield() {
		mp -= 30;
		if (hp < 100) {
			hp += 20;
		} else {
			return;
		}
		System.out.println("[" + name + "]가 모든 공격을 튕겨냅니다.");
	}

	@Override
	public void teleport() {
		mp -= 50;
		hp = 100;
		System.out.println("[" + name + "]가 순간이동을 시전합니다.");
	}

	@Override
	public void heal() {
		hp = 100;
		mp -= 40;
		System.out.println("[" + name + "]의 체력이 가득찹니다.");
	}

	@Override
	public void recover() {
		hp = Math.min(hp + 10, 100);
		mp -= 20;
		System.out.println("[" + name + "]의 회복력이 증가합니다.");
	}

}

interface Healer {
	public void heal();

	public void recover();
}

interface Magician {
	public void magicShield();

	public void teleport();
}
