import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("i")
	@Export("text")
	String text;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1596677031
	)
	@Export("width")
	int width;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 136381791
	)
	@Export("height")
	int height;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfo;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1622810143"
	)
	static final void method3970() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer;
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field592[++Client.field591 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field513[++Client.field512 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2258(var7, (byte)1);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field513[++Client.field512 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2258(var7, (byte)2);
							var8 = var0.readBits(3);
							var4.method2258(var8, (byte)2);
							int var9 = var0.readBits(1);
							if (var9 == 1) {
								Client.field513[++Client.field512 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field592[++Client.field591 - 1] = var3;
						}
					}
				}
			}

		}
	}
}
