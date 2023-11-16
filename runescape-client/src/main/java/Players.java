import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("Players")
public class Players {
	@ObfuscatedName("ar")
	static byte[] field1366;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	static class228[] field1356;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Luj;"
	)
	static Buffer[] field1357;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1055695101
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("aa")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1867979841
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("al")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("az")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ap")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("av")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1718820051
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("as")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static Buffer field1367;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("Widget_cachedFonts")
	static class509 Widget_cachedFonts;

	static {
		field1366 = new byte[2048]; // L: 19
		field1356 = new class228[2048]; // L: 20
		field1357 = new Buffer[2048]; // L: 21
		Players_count = 0; // L: 22
		Players_indices = new int[2048]; // L: 23
		Players_emptyIdxCount = 0; // L: 24
		Players_emptyIndices = new int[2048]; // L: 25
		Players_regions = new int[2048]; // L: 26
		Players_orientations = new int[2048]; // L: 27
		Players_targetIndices = new int[2048]; // L: 28
		Players_pendingUpdateCount = 0; // L: 29
		Players_pendingUpdateIndices = new int[2048]; // L: 30
		field1367 = new Buffer(new byte[5000]); // L: 31
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V",
		garbageValue = "-823798047"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 38
		int var1 = Client.localPlayerIndex; // L: 39
		Player var2 = class229.localPlayer = Client.players[var1] = new Player(); // L: 40
		var2.index = var1; // L: 41
		int var3 = var0.readBits(30); // L: 42
		byte var4 = (byte)(var3 >> 28); // L: 43
		int var5 = var3 >> 14 & 16383; // L: 44
		int var6 = var3 & 16383; // L: 45
		var2.pathX[0] = var5 - class187.baseX * 64; // L: 46
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 47
		var2.pathY[0] = var6 - class101.baseY * 64; // L: 48
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 49
		ItemLayer.Client_plane = var2.plane = var4; // L: 50
		if (field1357[var1] != null) { // L: 51
			var2.read(field1357[var1]);
		}

		Players_count = 0; // L: 52
		Players_indices[++Players_count - 1] = var1; // L: 53
		field1366[var1] = 0; // L: 54
		Players_emptyIdxCount = 0; // L: 55

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 56
			if (var1 != var7) { // L: 57
				int var8 = var0.readBits(18); // L: 58
				int var9 = var8 >> 16; // L: 59
				int var10 = var8 >> 8 & 597; // L: 60
				int var11 = var8 & 597; // L: 61
				Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 62
				Players_orientations[var7] = 0; // L: 63
				Players_targetIndices[var7] = -1; // L: 64
				Players_emptyIndices[++Players_emptyIdxCount - 1] = var7; // L: 65
				field1366[var7] = 0; // L: 66
			}
		}

		var0.exportIndex(); // L: 68
	} // L: 69

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lol;Ljava/lang/String;Ljava/lang/String;I)[Luz;",
		garbageValue = "-669885727"
	)
	public static SpritePixels[] method2779(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 147
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 148
			int var4 = var0.getFileId(var3, var2); // L: 149
			return VertexNormal.method5702(var0, var3, var4); // L: 150
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-1100853766"
	)
	static String method2793(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 112
			if (var2 && var0 >= 0) { // L: 113
				int var3 = 2; // L: 114

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 115 116 118
					var4 /= var1; // L: 117
				}

				char[] var5 = new char[var3]; // L: 120
				var5[0] = '+'; // L: 121

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 122
					int var7 = var0; // L: 123
					var0 /= var1; // L: 124
					int var8 = var7 - var0 * var1; // L: 125
					if (var8 >= 10) { // L: 126
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 127
					}
				}

				return new String(var5); // L: 129
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
