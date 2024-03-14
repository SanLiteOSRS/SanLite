import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public final class class442 {
	@ObfuscatedName("aq")
	final Comparator field4720;
	@ObfuscatedName("aw")
	final Map field4718;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class411 field4716;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class411 field4717;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -5769429091078843289L
	)
	final long field4714;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	final class440 field4719;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1008373307
	)
	final int field4715;

	@ObfuscatedSignature(
		descriptor = "(JILqb;)V"
	)
	class442(long var1, int var3, class440 var4) {
		this.field4720 = new class441(this); // L: 7
		this.field4714 = var1; // L: 34
		this.field4715 = var3; // L: 35
		this.field4719 = var4; // L: 36
		if (this.field4715 == -1) { // L: 37
			this.field4718 = new HashMap(64); // L: 38
			this.field4716 = new class411(64, this.field4720); // L: 39
			this.field4717 = null; // L: 40
		} else {
			if (this.field4719 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4718 = new HashMap(this.field4715); // L: 44
			this.field4716 = new class411(this.field4715, this.field4720); // L: 45
			this.field4717 = new class411(this.field4715); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqb;)V"
	)
	public class442(int var1, class440 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-35"
	)
	boolean method8199() {
		return this.field4715 != -1; // L: 51
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-60"
	)
	public Object method8198(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4714) { // L: 56
				this.method8210();
			}

			class443 var3 = (class443)this.field4718.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method8202(var3, false); // L: 59
				return var3.field4722; // L: 60
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "238417323"
	)
	public Object method8201(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4714) { // L: 66
				this.method8210();
			}

			class443 var4 = (class443)this.field4718.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4722; // L: 69
				var4.field4722 = var2; // L: 70
				this.method8202(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class443 var5;
				if (this.method8199() && this.field4718.size() == this.field4715) { // L: 74
					var5 = (class443)this.field4717.remove(); // L: 75
					this.field4718.remove(var5.field4721); // L: 76
					this.field4716.remove(var5); // L: 77
				}

				var5 = new class443(var2, var1); // L: 79
				this.field4718.put(var1, var5); // L: 80
				this.method8202(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrq;ZB)V",
		garbageValue = "-1"
	)
	void method8202(class443 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4716.remove(var1); // L: 89
			if (this.method8199() && !this.field4717.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4723 = System.currentTimeMillis(); // L: 94
		if (this.method8199()) { // L: 95
			switch(this.field4719.field4711) { // L: 96
			case 0:
				var1.field4724 = var1.field4723; // L: 98
				break;
			case 1:
				++var1.field4724; // L: 101
			}

			this.field4717.add(var1); // L: 104
		}

		this.field4716.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method8210() {
		if (this.field4714 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4714; // L: 112

			while (!this.field4716.isEmpty()) { // L: 113
				class443 var3 = (class443)this.field4716.peek(); // L: 114
				if (var3.field4723 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4718.remove(var3.field4721); // L: 116
				this.field4716.remove(var3); // L: 117
				if (this.method8199()) { // L: 118
					this.field4717.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1682413099"
	)
	public void method8197() {
		synchronized(this) { // L: 125
			this.field4718.clear(); // L: 126
			this.field4716.clear(); // L: 127
			if (this.method8199()) {
				this.field4717.clear(); // L: 128
			}

		}
	} // L: 130

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1623528561"
	)
	static void method8216() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 5121
			class475.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 5122
		}

	} // L: 5124
}
