import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public abstract class class160 extends Node {
	class160() {
	} // L: 51

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	abstract void vmethod3414(Buffer var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	abstract void vmethod3413(ClanChannel var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "739287375"
	)
	static boolean method3354(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance(); // L: 1113
		var1.set(1, var1.get(1) - 13); // L: 1114
		var1.set(5, var1.get(5) + 1); // L: 1115
		var1.set(11, 0); // L: 1116
		var1.set(12, 0); // L: 1117
		var1.set(13, 0); // L: 1118
		var1.set(14, 0); // L: 1119
		Date var2 = var1.getTime(); // L: 1120
		return var0.before(var2); // L: 1121
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Ljava/lang/String;",
		garbageValue = "1764004105"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class342.Widget_unpackTargetMask(class33.getWidgetFlags(var0)) == 0) { // L: 12826
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12827 12828 12830
		}
	}
}
