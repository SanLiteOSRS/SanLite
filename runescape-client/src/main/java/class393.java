import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class393 extends AbstractQueue {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	class391[] field4455;
	@ObfuscatedName("ay")
	Map field4456;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1516026649
	)
	int field4457;
	@ObfuscatedName("am")
	final Comparator field4458;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -719774473
	)
	int field4459;

	public class393(int var1, Comparator var2) {
		this.field4459 = 0; // L: 10
		this.field4455 = new class391[var1]; // L: 17
		this.field4456 = new HashMap(); // L: 18
		this.field4458 = var2; // L: 19
	} // L: 20

	public class393(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1737767650"
	)
	void method7272() {
		int var1 = (this.field4455.length << 1) + 1; // L: 23
		this.field4455 = (class391[])((class391[])Arrays.copyOf(this.field4455, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	void method7276(int var1) {
		class391 var2;
		int var3;
		for (var2 = this.field4455[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class391 var4 = this.field4455[var3]; // L: 99
			if (this.field4458 != null) { // L: 100
				if (this.field4458.compare(var2.field4450, var4.field4450) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4450).compareTo(var4.field4450) >= 0) { // L: 104
				break;
			}

			this.field4455[var1] = var4; // L: 106
			this.field4455[var1].field4448 = var1; // L: 107
		}

		this.field4455[var1] = var2; // L: 110
		this.field4455[var1].field4448 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	void method7277(int var1) {
		class391 var2 = this.field4455[var1]; // L: 116

		int var8;
		for (int var3 = this.field4457 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class391 var5 = this.field4455[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class391 var7 = this.field4455[var6]; // L: 122
			if (this.field4458 != null) { // L: 124
				if (var6 < this.field4457 && this.field4458.compare(var5.field4450, var7.field4450) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4457 && ((Comparable)var5.field4450).compareTo(var7.field4450) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4458 != null) { // L: 132
				if (this.field4458.compare(var2.field4450, this.field4455[var8].field4450) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4450).compareTo(this.field4455[var8].field4450) <= 0) { // L: 136
				break;
			}

			this.field4455[var1] = this.field4455[var8]; // L: 138
			this.field4455[var1].field4448 = var1; // L: 139
		}

		this.field4455[var1] = var2; // L: 142
		this.field4455[var1].field4448 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class391 var2 = (class391)this.field4456.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4459; // L: 79
			--this.field4457; // L: 80
			if (var2.field4448 == this.field4457) { // L: 81
				this.field4455[this.field4457] = null; // L: 82
				return true; // L: 83
			} else {
				class391 var3 = this.field4455[this.field4457]; // L: 85
				this.field4455[this.field4457] = null; // L: 86
				this.field4455[var2.field4448] = var3; // L: 87
				this.field4455[var2.field4448].field4448 = var2.field4448; // L: 88
				this.method7277(var2.field4448); // L: 89
				if (var3 == this.field4455[var2.field4448]) { // L: 90
					this.method7276(var2.field4448);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4457 == 0 ? null : this.field4455[0].field4450; // L: 54 55
	}

	public int size() {
		return this.field4457; // L: 29
	}

	public boolean contains(Object var1) {
		return this.field4456.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4458 != null) {
			Arrays.sort(var1, this.field4458); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class392(this); // L: 162
	}

	public Object poll() {
		if (this.field4457 == 0) { // L: 61
			return null;
		} else {
			++this.field4459; // L: 62
			Object var1 = this.field4455[0].field4450; // L: 63
			this.field4456.remove(var1); // L: 64
			--this.field4457; // L: 65
			if (this.field4457 == 0) {
				this.field4455[this.field4457] = null; // L: 66
			} else {
				this.field4455[0] = this.field4455[this.field4457]; // L: 68
				this.field4455[0].field4448 = 0; // L: 69
				this.field4455[this.field4457] = null; // L: 70
				this.method7277(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean offer(Object var1) {
		if (this.field4456.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4459; // L: 35
			int var2 = this.field4457; // L: 36
			if (var2 >= this.field4455.length) { // L: 37
				this.method7272();
			}

			++this.field4457; // L: 38
			if (var2 == 0) { // L: 39
				this.field4455[0] = new class391(var1, 0); // L: 40
				this.field4456.put(var1, this.field4455[0]); // L: 41
			} else {
				this.field4455[var2] = new class391(var1, var2); // L: 44
				this.field4456.put(var1, this.field4455[var2]); // L: 45
				this.method7276(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-408081757"
	)
	static final void method7302() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 5035 5036 5053
			if (var0.plane == class36.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 5037
				if (Client.cycle >= var0.cycleStart) { // L: 5038
					if (var0.targetIndex > 0) { // L: 5039
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 5040
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 5041
							var0.setDestination(var1.x, var1.y, class306.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 5043
						int var2 = -var0.targetIndex - 1; // L: 5045
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 5046
							var3 = class136.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 5047
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, class306.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 5048
						}
					}

					var0.advance(Client.field702); // L: 5050
					UserComparator5.scene.drawEntity(class36.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 5051
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5055
}
