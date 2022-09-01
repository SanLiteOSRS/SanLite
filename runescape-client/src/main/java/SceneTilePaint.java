import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -246999917
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -874065581
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1159712219
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1006604365
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1851893905
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 503057411
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("q")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -532188411
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lco;S)V",
		garbageValue = "203"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		GraphicsObject.runScript(var0, 500000, 475000); // L: 117
	} // L: 118

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1527071876"
	)
	public static final boolean method4416(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 36
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	static void method4417() {
		Client.packetWriter.clearBuffer(); // L: 2657
		Client.packetWriter.packetBuffer.offset = 0; // L: 2658
		Client.packetWriter.serverPacket = null; // L: 2659
		Client.packetWriter.field1337 = null; // L: 2660
		Client.packetWriter.field1339 = null; // L: 2661
		Client.packetWriter.field1330 = null; // L: 2662
		Client.packetWriter.serverPacketLength = 0; // L: 2663
		Client.packetWriter.field1336 = 0; // L: 2664
		Client.rebootTimer = 0; // L: 2665
		Client.menuOptionsCount = 0; // L: 2667
		Client.isMenuOpen = false; // L: 2668
		Client.minimapState = 0; // L: 2670
		Client.destinationX = 0; // L: 2671

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2672
			Client.players[var0] = null;
		}

		ScriptFrame.localPlayer = null; // L: 2673

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2674
			NPC var1 = Client.npcs[var0]; // L: 2675
			if (var1 != null) { // L: 2676
				var1.targetIndex = -1; // L: 2677
				var1.false0 = false; // L: 2678
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2682
		class4.updateGameState(30); // L: 2684

		for (var0 = 0; var0 < 100; ++var0) { // L: 2685
			Client.field643[var0] = true;
		}

		PacketBufferNode var2 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher); // L: 2688
		var2.packetBuffer.writeByte(Canvas.getWindowedMode()); // L: 2689
		var2.packetBuffer.writeShort(class7.canvasWidth); // L: 2690
		var2.packetBuffer.writeShort(DecorativeObject.canvasHeight); // L: 2691
		Client.packetWriter.addNode(var2); // L: 2692
	} // L: 2694
}
