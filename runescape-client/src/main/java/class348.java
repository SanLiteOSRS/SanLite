import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class348 {
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	public static class369 field3881;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltf;B)V",
		garbageValue = "-20"
	)
	static final void method6670(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 444
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 445
			Player var3 = Client.players[var2]; // L: 446
			int var4 = var0.readUnsignedByte(); // L: 447
			if ((var4 & 4) != 0) { // L: 448
				var4 += var0.readUnsignedByte() << 8;
			}

			if ((var4 & 16384) != 0) {
				var4 += var0.readUnsignedByte() << 16; // L: 449
			}

			AttackOption.method2721(var0, var2, var3, var4); // L: 450
		}

	} // L: 452

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1383543655"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 197
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 198
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 199
		}
	}
}
