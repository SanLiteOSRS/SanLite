import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class280 {
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqx;I)V",
		garbageValue = "785365671"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class155.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - class154.baseX * 64; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - class365.baseY * 64; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		class383.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1372[var1] != null) { // L: 50
			var2.read(Players.field1372[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1370[var1] = 0; // L: 53
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
				Players.field1370[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "63"
	)
	static final void method5498(int var0, int var1, int var2) {
		if (class145.cameraX < var0) { // L: 3680
			class145.cameraX = (var0 - class145.cameraX) * Tile.field2481 / 1000 + class145.cameraX + class31.field181; // L: 3681
			if (class145.cameraX > var0) { // L: 3682
				class145.cameraX = var0;
			}
		}

		if (class145.cameraX > var0) { // L: 3684
			class145.cameraX -= (class145.cameraX - var0) * Tile.field2481 / 1000 + class31.field181; // L: 3685
			if (class145.cameraX < var0) { // L: 3686
				class145.cameraX = var0;
			}
		}

		if (class414.cameraY < var1) { // L: 3688
			class414.cameraY = (var1 - class414.cameraY) * Tile.field2481 / 1000 + class414.cameraY + class31.field181; // L: 3689
			if (class414.cameraY > var1) { // L: 3690
				class414.cameraY = var1;
			}
		}

		if (class414.cameraY > var1) { // L: 3692
			class414.cameraY -= (class414.cameraY - var1) * Tile.field2481 / 1000 + class31.field181; // L: 3693
			if (class414.cameraY < var1) { // L: 3694
				class414.cameraY = var1;
			}
		}

		if (ClanChannel.cameraZ < var2) { // L: 3696
			ClanChannel.cameraZ = (var2 - ClanChannel.cameraZ) * Tile.field2481 / 1000 + ClanChannel.cameraZ + class31.field181; // L: 3697
			if (ClanChannel.cameraZ > var2) { // L: 3698
				ClanChannel.cameraZ = var2;
			}
		}

		if (ClanChannel.cameraZ > var2) { // L: 3700
			ClanChannel.cameraZ -= (ClanChannel.cameraZ - var2) * Tile.field2481 / 1000 + class31.field181; // L: 3701
			if (ClanChannel.cameraZ < var2) { // L: 3702
				ClanChannel.cameraZ = var2;
			}
		}

	} // L: 3704
}
