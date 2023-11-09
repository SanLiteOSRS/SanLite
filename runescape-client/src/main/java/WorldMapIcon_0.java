import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 1466718761
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 670708255
	)
	@Export("element")
	final int element;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1702276997
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 803917295
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;ILil;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class4.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1964880024"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "-1317041670"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1769700454"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)V",
		garbageValue = "-1549197642"
	)
	public static void method5264(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.field1927 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	public static void method5262() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 44
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 45
			} // L: 46

			if (var0 == null) { // L: 47
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 48
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1016590193"
	)
	public static int method5265(int var0) {
		return (var0 & class469.field4922) - 1; // L: 26
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-90"
	)
	static void method5263(int var0, String var1) {
		int var2 = Players.Players_count; // L: 10224
		int[] var3 = Players.Players_indices; // L: 10225
		boolean var4 = false; // L: 10226
		Username var5 = new Username(var1, WorldMapCacheName.loginType); // L: 10227

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10228
			Player var7 = Client.players[var3[var6]]; // L: 10229
			if (var7 != null && var7 != class387.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10230
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10231
					var8 = Renderable.getPacketBufferNode(ClientPacket.field3082, Client.packetWriter.isaacCipher); // L: 10233
					var8.packetBuffer.writeIntME(var3[var6]); // L: 10234
					var8.packetBuffer.method8765(0); // L: 10235
					Client.packetWriter.addNode(var8); // L: 10236
				} else if (var0 == 4) { // L: 10238
					var8 = Renderable.getPacketBufferNode(ClientPacket.field3149, Client.packetWriter.isaacCipher); // L: 10240
					var8.packetBuffer.writeShort(var3[var6]); // L: 10241
					var8.packetBuffer.method8674(0); // L: 10242
					Client.packetWriter.addNode(var8); // L: 10243
				} else if (var0 == 6) { // L: 10245
					var8 = Renderable.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 10247
					var8.packetBuffer.method8674(0); // L: 10248
					var8.packetBuffer.writeShort(var3[var6]); // L: 10249
					Client.packetWriter.addNode(var8); // L: 10250
				} else if (var0 == 7) { // L: 10252
					var8 = Renderable.getPacketBufferNode(ClientPacket.field3070, Client.packetWriter.isaacCipher); // L: 10254
					var8.packetBuffer.writeIntME(var3[var6]); // L: 10255
					var8.packetBuffer.method8673(0); // L: 10256
					Client.packetWriter.addNode(var8); // L: 10257
				}

				var4 = true; // L: 10259
				break;
			}
		}

		if (!var4) { // L: 10263
			class280.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10264
}
