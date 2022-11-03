import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	public static final WorldMapCacheName field2954;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	public static final WorldMapCacheName field2949;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	public static final WorldMapCacheName field2948;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final WorldMapCacheName field2950;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	public static final WorldMapCacheName field2952;
	@ObfuscatedName("j")
	@Export("name")
	public final String name;

	static {
		field2954 = new WorldMapCacheName("details"); // L: 4
		field2949 = new WorldMapCacheName("compositemap"); // L: 5
		field2948 = new WorldMapCacheName("compositetexture"); // L: 6
		field2950 = new WorldMapCacheName("area"); // L: 7
		field2952 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqk;B)V",
		garbageValue = "-81"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class296.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - class26.baseX * 64; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - class158.baseY * 64; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		ApproximateRouteStrategy.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1315[var1] != null) { // L: 50
			var2.read(Players.field1315[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1323[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var1 != var7) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1323[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqk;II)V",
		garbageValue = "1119932413"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		TaskHandler.method3340(var0); // L: 73
		class21.method297(var0); // L: 74
		if (var0.offset - var2 != var1) { // L: 75
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 76
		}
	} // L: 78

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2038399298"
	)
	static final void method5228(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 80
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 81
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 82
					class32.field179[0][var5][var4] = 127; // L: 83
					if (var0 == var5 && var5 > 0) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 87
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 91

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-101"
	)
	public static boolean method5229(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 17
	}
}
