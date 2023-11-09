import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class271 {
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -293795815
	)
	static int field3186;
	@ObfuscatedName("ud")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("s")
	static int[] field3185;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive4")
	static Archive archive4;

	static {
		new Object();
		field3185 = new int[33]; // L: 8
		field3185[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3185[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;IZI)Ldk;",
		garbageValue = "269488385"
	)
	public static class122 method5169(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 21
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 22
		if (var5 == null) { // L: 23
			var4 = false; // L: 24
			return null; // L: 25
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 27
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6); // L: 29
			} else {
				var7 = var1.getFile(var6, 0); // L: 30
			}

			if (var7 == null) { // L: 31
				var4 = false;
			}

			if (!var4) { // L: 32
				return null;
			} else {
				try {
					return new class122(var0, var1, var2, var3); // L: 34
				} catch (Exception var9) { // L: 36
					return null; // L: 37
				}
			}
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	static final void method5170() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11956
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11957
			var1.clearIsFriend(); // L: 11958
		}

		Archive.method5750(); // L: 11960
		if (class19.friendsChatManager != null) { // L: 11961
			class19.friendsChatManager.clearFriends(); // L: 11962
		}

	} // L: 11964
}
