import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class302 {
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	static ArchiveDisk field3118;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -616078041
	)
	static int field3119;

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIB)V",
		garbageValue = "51"
	)
	public static void method5906(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3717; // L: 984
		boolean var4 = var2 != var3.field3600; // L: 985
		var3.field3600 = var2; // L: 986
		if (var4) { // L: 987
			int var5;
			int var7;
			if (var3.field3600 == var1) { // L: 988
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 989
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 990
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 991
						var3.equipment[var7] = var3.field3596[var7]; // L: 992
					}
				}
			} else {
				label74: {
					if (var3.equipment[0] >= 512) { // L: 998
						boolean var8;
						if (var3.equipment[0] < 512) { // L: 1001
							var8 = false; // L: 1006
						} else {
							ItemComposition var6 = class214.ItemComposition_get(var3.equipment[0] - 512); // L: 1002
							var8 = var6.maleModel1 != class205.field2231.field2245 && var6.maleModel2 != class205.field2231.field2245; // L: 1003
						}

						if (!var8) { // L: 1008
							break label74;
						}
					}

					var3.equipment[class205.field2231.field2245] = 1; // L: 1010
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1012
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 1013
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 1014
						class228.method4438(var2, var3.equipment, var5); // L: 1015
					}
				}
			}
		}

		var3.method6323(); // L: 1020
	} // L: 1021

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ldc;ZB)V",
		garbageValue = "-113"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12493
		int var3 = (int)var0.key; // L: 12494
		var0.remove(); // L: 12495
		if (var1) { // L: 12496
			HealthBarDefinition.field1877.method6283(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) { // L: 12498
			if ((var4.key >> 48 & 65535L) == (long)var2) { // L: 12499
				var4.remove(); // L: 12500
			}
		}

		Widget var5 = HealthBarDefinition.field1877.method6285(var3); // L: 12504
		if (var5 != null) {
			class159.invalidateWidget(var5); // L: 12505
		}

		if (Client.rootInterface != -1) { // L: 12506
			class514.method9131(Client.rootInterface, 1);
		}

	} // L: 12507
}
