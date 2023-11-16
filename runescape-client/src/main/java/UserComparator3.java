import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ji")
	static int[] field1448;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;I)I",
		garbageValue = "1490590572"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldr;",
		garbageValue = "-253012574"
	)
	static class90[] method2985() {
		return new class90[]{class90.field1087, class90.field1091, class90.field1092, class90.field1086, class90.field1085, class90.field1084}; // L: 17
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "868585172"
	)
	static int method2984(int var0, int var1) {
		if (var0 == -2) { // L: 63
			return 12345678;
		} else if (var0 == -1) { // L: 64
			if (var1 < 0) { // L: 65
				var1 = 0; // L: 66
			} else if (var1 > 127) { // L: 68
				var1 = 127; // L: 69
			}

			var1 = 127 - var1; // L: 71
			return var1; // L: 72
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 74
			if (var1 < 2) { // L: 75
				var1 = 2;
			} else if (var1 > 126) { // L: 76
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 77
		}
	}
}
