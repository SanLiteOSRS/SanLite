import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("i")
	@Export("name")
	public final String name;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -516259997
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lln;IIIBZI)V",
		garbageValue = "-416470101"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 204
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 205
		if (var8 == null) { // L: 206
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 207
			if (var8 == null) { // L: 208
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 209
				if (var8 != null) { // L: 210
					if (var5) { // L: 211
						var8.removeDual(); // L: 212
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 213
						--NetCache.NetCache_pendingWritesCount; // L: 214
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 215
					}

				} else {
					if (!var5) { // L: 219
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 220
						if (var8 != null) { // L: 221
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 223
					var8.archive = var0; // L: 224
					var8.crc = var3; // L: 225
					var8.padding = var4; // L: 226
					if (var5) { // L: 227
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 228
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 229
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 232
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 233
						++NetCache.NetCache_pendingWritesCount; // L: 234
					}

				}
			}
		}
	} // L: 217 236

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2087155591"
	)
	static void method5676(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12066
			if ((long)var0 == (var1.key >> 48 & 65535L)) { // L: 12067
				var1.remove(); // L: 12068
			}
		}

	} // L: 12071
}
