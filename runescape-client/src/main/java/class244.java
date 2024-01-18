import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class244 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1903805237"
	)
	public static void method4940(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 49
		VarbitComposition var2;
		if (var3 != null) { // L: 50
			var2 = var3; // L: 51
		} else {
			byte[] var4 = class436.VarbitDefinition_archive.takeFile(14, var0); // L: 54
			var3 = new VarbitComposition(); // L: 55
			if (var4 != null) { // L: 56
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 57
			var2 = var3; // L: 58
		}

		int var8 = var2.baseVar; // L: 61
		int var5 = var2.startBit; // L: 62
		int var6 = var2.endBit; // L: 63
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 64
		if (var1 < 0 || var1 > var7) { // L: 65
			var1 = 0;
		}

		var7 <<= var5; // L: 66
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 67
	} // L: 68

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-184228770"
	)
	public static int method4942(String var0) {
		return var0.length() + 2; // L: 123
	}
}
