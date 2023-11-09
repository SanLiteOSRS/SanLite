import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public enum class352 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4204(-1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4205(0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4206(1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	field4207(2);

	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1278177163
	)
	static int field4209;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -14830107
	)
	final int field4208;

	class352(int var3) {
		this.field4208 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4208; // L: 24
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static void method6688() {
		if (class348.field3881 != null) { // L: 12828
			Client.field673 = Client.cycle; // L: 12829
			class348.field3881.method6984(); // L: 12830

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12831
				if (Client.players[var0] != null) { // L: 12832
					class348.field3881.method6983(class166.baseX * 64 + (Client.players[var0].x >> 7), class9.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12833
				}
			}
		}

	} // L: 12837
}
