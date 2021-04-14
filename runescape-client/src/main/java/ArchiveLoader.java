import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1980734893
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -429442875
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		signature = "(Lig;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-2006264172"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method4440(var1) || this.archive.method4458(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Low;",
		garbageValue = "-237450232"
	)
	static IndexedSprite method2076() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class395.SpriteBuffer_spriteWidth;
		var0.height = class395.SpriteBuffer_spriteHeight;
		var0.xOffset = class0.SpriteBuffer_xOffsets[0];
		var0.yOffset = Interpreter.SpriteBuffer_yOffsets[0];
		var0.subWidth = class395.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class157.SpriteBuffer_spriteHeights[0];
		var0.palette = Varps.SpriteBuffer_spritePalette;
		var0.pixels = class223.SpriteBuffer_pixels[0];
		WorldMapDecorationType.method4370();
		return var0;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-231921181"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
