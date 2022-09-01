import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1371988127
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -761624157
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -863337605
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1361182691"
	)
	public static int method4914(int var0) {
		--var0; // L: 64
		var0 |= var0 >>> 1; // L: 65
		var0 |= var0 >>> 2; // L: 66
		var0 |= var0 >>> 4; // L: 67
		var0 |= var0 >>> 8; // L: 68
		var0 |= var0 >>> 16; // L: 69
		return var0 + 1; // L: 70
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)Ljava/lang/String;",
		garbageValue = "87"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var0)) == 0) { // L: 12092
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12093 12094 12096
		}
	}
}
