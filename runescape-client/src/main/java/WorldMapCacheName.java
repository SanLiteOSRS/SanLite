import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 1131188791
	)
	static int field326;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	public static final WorldMapCacheName field320;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	public static final WorldMapCacheName field319;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	public static final WorldMapCacheName field321;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	static final WorldMapCacheName field322;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	public static final WorldMapCacheName field328;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("q")
	@Export("name")
	public final String name;

	static {
		field320 = new WorldMapCacheName("details");
		field319 = new WorldMapCacheName("compositemap");
		field321 = new WorldMapCacheName("compositetexture");
		field322 = new WorldMapCacheName("area");
		field328 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("z")
	static boolean method725(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		signature = "(ZLks;B)V",
		garbageValue = "10"
	)
	static final void method724(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				int var2 = var1.readBits(15);
				if (var2 != 32767) {
					boolean var3 = false;
					if (Client.npcs[var2] == null) {
						Client.npcs[var2] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.npcs[var2];
					Client.npcIndices[++Client.npcCount - 1] = var2;
					var4.npcCycle = Client.cycle;
					int var5 = var1.readBits(1);
					int var6 = var1.readBits(1);
					if (var6 == 1) {
						Client.field727[++Client.field726 - 1] = var2;
					}

					int var7 = Client.field807[var1.readBits(3)];
					if (var3) {
						var4.orientation = var4.rotation = var7;
					}

					int var8;
					if (var0) {
						var8 = var1.readBits(8);
						if (var8 > 127) {
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5);
						if (var8 > 15) {
							var8 -= 32;
						}
					}

					int var9;
					if (var0) {
						var9 = var1.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					var4.definition = Clock.getNpcDefinition(var1.readBits(14));
					var4.field1011 = var4.definition.size;
					var4.field1028 = var4.definition.rotation;
					if (var4.field1028 == 0) {
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence;
					var4.walkBackSequence = var4.definition.walkBackSequence;
					var4.walkLeftSequence = var4.definition.walkLeftSequence;
					var4.walkRightSequence = var4.definition.walkRightSequence;
					var4.readySequence = var4.definition.readySequence;
					var4.turnLeftSequence = var4.definition.turnLeftSequence;
					var4.turnRightSequence = var4.definition.turnRightSequence;
					var4.method2144(PlayerType.localPlayer.pathX[0] + var9, PlayerType.localPlayer.pathY[0] + var8, var5 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}
}
