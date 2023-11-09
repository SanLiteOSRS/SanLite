import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public final class class317 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1457607137"
	)
	static final void method6371(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString(); // L: 176
		KitDefinition.addGameMessage(30, "", var1); // L: 178
	} // L: 180

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Lgr;IIZS)V",
		garbageValue = "229"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 11121
		byte var6 = -1; // L: 11122
		String var7 = null; // L: 11123
		if (var5 != null && var5[var3] != null) { // L: 11124
			if (var3 == 0) { // L: 11125
				var6 = 33;
			} else if (var3 == 1) { // L: 11126
				var6 = 34;
			} else if (var3 == 2) { // L: 11127
				var6 = 35;
			} else if (var3 == 3) { // L: 11128
				var6 = 36;
			} else {
				var6 = 37; // L: 11129
			}

			var7 = var5[var3]; // L: 11130
		} else if (var3 == 4) { // L: 11133
			var6 = 37; // L: 11134
			var7 = "Drop"; // L: 11135
		}

		if (var6 != -1 && var7 != null) { // L: 11138
			class37.method706(var7, MouseRecorder.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4); // L: 11139
		}

	} // L: 11141
}
