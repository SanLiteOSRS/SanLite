import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("StudioGame")
public enum StudioGame implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("au")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("av")
	@Export("name")
	public final String name;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1753159705
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1154729139"
	)
	static void method6344() {
		Client.packetWriter.clearBuffer(); // L: 2717
		Client.packetWriter.packetBuffer.offset = 0; // L: 2718
		Client.packetWriter.serverPacket = null; // L: 2719
		Client.packetWriter.field1388 = null; // L: 2720
		Client.packetWriter.field1389 = null; // L: 2721
		Client.packetWriter.field1390 = null; // L: 2722
		Client.packetWriter.serverPacketLength = 0; // L: 2723
		Client.packetWriter.field1383 = 0; // L: 2724
		Client.rebootTimer = 0; // L: 2725
		class60.method1159(); // L: 2726
		Client.minimapState = 0; // L: 2727
		Client.destinationX = 0; // L: 2728

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2729
			Client.players[var0] = null;
		}

		BuddyRankComparator.localPlayer = null; // L: 2730

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2731
			NPC var1 = Client.npcs[var0]; // L: 2732
			if (var1 != null) { // L: 2733
				var1.targetIndex = -1; // L: 2734
				var1.false0 = false; // L: 2735
			}
		}

		class206.method4067(); // L: 2738
		class19.method280(30); // L: 2739

		for (var0 = 0; var0 < 100; ++var0) { // L: 2740
			Client.field722[var0] = true;
		}

		PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.field3068, Client.packetWriter.isaacCipher); // L: 2743
		var2.packetBuffer.writeByte(class7.getWindowedMode()); // L: 2744
		var2.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2745
		var2.packetBuffer.writeShort(class143.canvasHeight); // L: 2746
		Client.packetWriter.addNode(var2); // L: 2747
	} // L: 2749
}
