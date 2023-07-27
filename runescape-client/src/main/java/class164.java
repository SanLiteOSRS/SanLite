import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class164 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltc;S)V",
		garbageValue = "15572"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 38
		int var1 = Client.localPlayerIndex; // L: 39
		Player var2 = class136.localPlayer = Client.players[var1] = new Player(); // L: 40
		var2.index = var1; // L: 41
		int var3 = var0.readBits(30); // L: 42
		byte var4 = (byte)(var3 >> 28); // L: 43
		int var5 = var3 >> 14 & 16383; // L: 44
		int var6 = var3 & 16383; // L: 45
		var2.pathX[0] = var5 - AbstractArchive.baseX * 64; // L: 46
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 47
		var2.pathY[0] = var6 - class148.baseY * 64;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		class36.Client_plane = var2.plane = var4;
		if (Players.field1360[var1] != null) { // L: 51
			var2.read(Players.field1360[var1]);
		}

		Players.Players_count = 0; // L: 52
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1362[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18); // L: 58
				int var9 = var8 >> 16; // L: 59
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1362[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1762704908"
	)
	static void method3394() {
		Tiles.field1024 = null;
		Tiles.field1025 = null;
		class19.field104 = null;
		UserComparator10.field1474 = null;
		BufferedNetSocket.field4681 = null;
		InvDefinition.field1899 = null;
		class135.field1601 = null;
		class172.Tiles_hue = null; // L: 68
		GameBuild.Tiles_saturation = null; // L: 69
		Tiles.Tiles_lightness = null; // L: 70
		Language.Tiles_hueMultiplier = null; // L: 71
		class159.field1755 = null; // L: 72
	} // L: 73

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "34"
	)
	public static void method3392(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "80"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 146
	}
}
