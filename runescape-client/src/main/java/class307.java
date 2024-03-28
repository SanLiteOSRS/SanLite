import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class307 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1584361082"
	)
	public static int method5908(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var1;
		} else if (var2 == 1) { // L: 24
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 25
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "0"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 178
			int var6 = (var0 + var1) / 2; // L: 179
			int var7 = var0; // L: 180
			World var8 = World.World_worlds[var6]; // L: 181
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 182
			World.World_worlds[var1] = var8; // L: 183

			for (int var9 = var0; var9 < var1; ++var9) { // L: 184
				World var11 = World.World_worlds[var9]; // L: 186
				int var12 = class438.compareWorlds(var11, var8, var2, var3); // L: 188
				int var10;
				if (var12 != 0) { // L: 189
					if (var3) { // L: 190
						var10 = -var12; // L: 191
					} else {
						var10 = var12; // L: 195
					}
				} else if (var4 == -1) { // L: 199
					var10 = 0; // L: 200
				} else {
					int var13 = class438.compareWorlds(var11, var8, var4, var5); // L: 203
					if (var5) { // L: 204
						var10 = -var13;
					} else {
						var10 = var13; // L: 205
					}
				}

				if (var10 <= 0) { // L: 207
					World var14 = World.World_worlds[var9]; // L: 208
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 209
					World.World_worlds[var7++] = var14; // L: 210
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 214
			World.World_worlds[var7] = var8; // L: 215
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 216
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 217
		}

	} // L: 219

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1464619508"
	)
	static final void method5910() {
		int[] var0 = Players.Players_indices; // L: 3990

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3991
			Player var4 = Client.players[var0[var1]]; // L: 3992
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3993
				--var4.overheadTextCyclesRemaining; // L: 3994
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null; // L: 3995
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3998
			int var2 = Client.npcIndices[var1]; // L: 3999
			NPC var3 = Client.npcs[var2]; // L: 4000
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 4001
				--var3.overheadTextCyclesRemaining; // L: 4002
				if (var3.overheadTextCyclesRemaining == 0) { // L: 4003
					var3.overheadText = null;
				}
			}
		}

	} // L: 4006
}
