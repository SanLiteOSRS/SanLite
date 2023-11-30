import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("ax")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("cq")
	static String field878;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 445021513
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1332337083
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 732979691
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 555130035
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1498864933
	)
	int field882;
	@ObfuscatedName("au")
	String field883;
	@ObfuscatedName("aa")
	String field881;

	MenuAction() {
	} // L: 13053

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldy;",
		garbageValue = "-180597093"
	)
	static AttackOption[] method2139() {
		return new AttackOption[]{AttackOption.field1334, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1337}; // L: 13010
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lol;II)V",
		garbageValue = "1404218002"
	)
	static void method2140(AbstractArchive var0, int var1) {
		if ((var1 & class522.field5122.rsOrdinal()) != 0) { // L: 314
			Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 315
		} else if ((var1 & class522.field5123.rsOrdinal()) != 0) { // L: 317
			Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 318
		} else if ((var1 & class522.field5094.rsOrdinal()) != 0) { // L: 320
			Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 321
		} else {
			Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 324
		}

	} // L: 326
}
