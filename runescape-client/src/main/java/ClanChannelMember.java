import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("f")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1827219617
	)
	@Export("world")
	public int world;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgy;",
		garbageValue = "-111"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "-20"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class88.World_worlds[var6]; // L: 180
			class88.World_worlds[var6] = class88.World_worlds[var1]; // L: 181
			class88.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = class88.World_worlds[var9]; // L: 185
				int var12 = Players.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = Players.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = class88.World_worlds[var9]; // L: 207
					class88.World_worlds[var9] = class88.World_worlds[var7]; // L: 208
					class88.World_worlds[var7++] = var14; // L: 209
				}
			}

			class88.World_worlds[var1] = class88.World_worlds[var7]; // L: 213
			class88.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218
}
