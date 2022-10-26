import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("AttackOption")
public enum AttackOption implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	field1285(2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	field1289(4);

	@ObfuscatedName("ak")
	static Image field1295;
	@ObfuscatedName("al")
	protected static String field1294;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 827039641
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12857
	} // L: 12858

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12862
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1633135416"
	)
	public static int method2540(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}

	@ObfuscatedName("y")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 80
	}
}
