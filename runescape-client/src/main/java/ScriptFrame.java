import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1126556493
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ak")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ax")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1603981165"
	)
	public static boolean method1194() {
		return !class319.field3440.isEmpty(); // L: 144
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIII)V",
		garbageValue = "1957450993"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3770 == null) { // L: 1240
			throw new RuntimeException(); // L: 1241
		} else {
			var0.field3770[var1] = var2; // L: 1243
			var0.field3800[var1] = var3; // L: 1244
		}
	} // L: 1245
}
