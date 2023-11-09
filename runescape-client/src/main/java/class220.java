import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class220 {
	@ObfuscatedName("d")
	public static short[] field2674;
	@ObfuscatedName("hd")
	@Export("xteaKeys")
	static int[][] xteaKeys;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lky;",
		garbageValue = "-305511498"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3959, PlayerType.field3953, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3965, PlayerType.field3960, PlayerType.field3952, PlayerType.PlayerType_jagexModerator, PlayerType.field3958, PlayerType.field3956, PlayerType.PlayerType_normal, PlayerType.PlayerType_ironman, PlayerType.PlayerType_playerModerator, PlayerType.field3946, PlayerType.field3955, PlayerType.field3961}; // L: 29
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-23"
	)
	public static void method4448(int var0, int var1) {
		VarbitComposition var2 = class118.method2721(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41
}
