import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field1441;
	@ObfuscatedName("jd")
	static int[] field1444;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;I)I",
		garbageValue = "1768375186"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-90"
	)
	static void method2966(int var0) {
		if (var0 != Login.loginIndex) { // L: 2266
			Login.loginIndex = var0; // L: 2267
		}
	} // L: 2268

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1939309328"
	)
	static String method2959(String var0) {
		PlayerType[] var1 = class320.PlayerType_values(); // L: 12907

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12908
			PlayerType var3 = var1[var2]; // L: 12909
			if (var3.modIcon != -1 && var0.startsWith(FloorUnderlayDefinition.method3799(var3.modIcon))) { // L: 12911 12912
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12913
				break;
			}
		}

		return var0; // L: 12920
	}
}
