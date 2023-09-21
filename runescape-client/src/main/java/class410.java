import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class410 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -443305391
	)
	int field4522;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class410(int var1, boolean var2) {
		this.field4522 = var1; // L: 7
	} // L: 8

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-15695"
	)
	public int method7603() {
		return this.field4522; // L: 11
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1656605881"
	)
	static final boolean method7606(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (Decimator.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class508.field5041; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class508.field5042; // L: 26

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) {
					return true; // L: 29
				}
			}

			return false; // L: 32
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1849908879"
	)
	static final void method7604(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class33.field184.method6242(var0)) { // L: 10626
			class9.field35 = null; // L: 10633
			Tile.drawInterface(class33.field184.field3587[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10634
			if (class9.field35 != null) { // L: 10635
				Tile.drawInterface(class9.field35, -1412584499, var1, var2, var3, var4, GrandExchangeEvent.field4389, class10.field48, var7); // L: 10636
				class9.field35 = null; // L: 10637
			}

		} else {
			if (var7 != -1) { // L: 10627
				Client.field739[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10629
					Client.field739[var8] = true;
				}
			}

		}
	} // L: 10631 10639
}
