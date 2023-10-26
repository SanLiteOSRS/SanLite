import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1919932593
	)
	@Export("group")
	int group;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1828374187
	)
	@Export("type")
	int type;
	@ObfuscatedName("ak")
	boolean field1074;

	InterfaceParent() {
		this.field1074 = false; // L: 8
	} // L: 10

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I[B[BI)V",
		garbageValue = "101462872"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3752 == null) { // L: 1216
			if (var2 == null) { // L: 1217
				return; // L: 1223
			}

			var0.field3752 = new byte[11][]; // L: 1218
			var0.field3779 = new byte[11][]; // L: 1219
			var0.field3770 = new int[11]; // L: 1220
			var0.field3800 = new int[11]; // L: 1221
		}

		var0.field3752[var1] = var2; // L: 1225
		if (var2 != null) {
			var0.field3751 = true; // L: 1226
		} else {
			var0.field3751 = false; // L: 1228

			for (int var4 = 0; var4 < var0.field3752.length; ++var4) { // L: 1229
				if (var0.field3752[var4] != null) { // L: 1230
					var0.field3751 = true; // L: 1231
					break;
				}
			}
		}

		var0.field3779[var1] = var3; // L: 1236
	} // L: 1237

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "554905289"
	)
	static String method2312(String var0) {
		PlayerType[] var1 = class183.PlayerType_values(); // L: 12843

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12844
			PlayerType var3 = var1[var2]; // L: 12845
			if (var3.modIcon != -1 && var0.startsWith(class436.method7916(var3.modIcon))) { // L: 12847 12848
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12849
				break;
			}
		}

		return var0; // L: 12856
	}
}
