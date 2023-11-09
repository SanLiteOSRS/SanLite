import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class101 {
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -1072603264
	)
	static int field1296;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1529271125
	)
	int field1293;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 719339141
	)
	int field1292;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2000353391
	)
	int field1299;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2059915861
	)
	int field1294;

	class101(int var1, int var2, int var3, int var4) {
		this.field1293 = var1; // L: 10
		this.field1292 = var2; // L: 11
		this.field1299 = var3; // L: 12
		this.field1294 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "110"
	)
	int method2621() {
		return this.field1293; // L: 17
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2112298995"
	)
	int method2622() {
		return this.field1292; // L: 21
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	int method2635() {
		return this.field1299; // L: 25
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-444559359"
	)
	int method2623() {
		return this.field1294; // L: 29
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltn;I)V",
		garbageValue = "365050912"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 38
		int var1 = Client.localPlayerIndex; // L: 39
		Player var2 = HitSplatDefinition.localPlayer = Client.players[var1] = new Player(); // L: 40
		var2.index = var1; // L: 41
		int var3 = var0.readBits(30); // L: 42
		byte var4 = (byte)(var3 >> 28); // L: 43
		int var5 = var3 >> 14 & 16383; // L: 44
		int var6 = var3 & 16383; // L: 45
		var2.pathX[0] = var5 - class147.baseX * 64; // L: 46
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 47
		var2.pathY[0] = var6 - ModeWhere.baseY * 64; // L: 48
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 49
		NetFileRequest.Client_plane = var2.plane = var4; // L: 50
		if (Players.field1329[var1] != null) { // L: 51
			var2.read(Players.field1329[var1]);
		}

		Players.Players_count = 0; // L: 52
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 53
		Players.field1327[var1] = 0; // L: 54
		Players.Players_emptyIdxCount = 0; // L: 55

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 56
			if (var1 != var7) { // L: 57
				int var8 = var0.readBits(18); // L: 58
				int var9 = var8 >> 16; // L: 59
				int var10 = var8 >> 8 & 597; // L: 60
				int var11 = var8 & 597; // L: 61
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 62
				Players.Players_orientations[var7] = 0; // L: 63
				Players.Players_targetIndices[var7] = -1; // L: 64
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 65
				Players.field1327[var7] = 0; // L: 66
			}
		}

		var0.exportIndex(); // L: 68
	} // L: 69

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(B)Lot;",
		garbageValue = "-21"
	)
	public static NodeDeque method2634() {
		return Client.scriptEvents; // L: 4988
	}
}
