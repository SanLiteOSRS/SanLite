import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ki")
public enum class296 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3511(0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3512(1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3517(2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3514(3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3515(4);

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 935531133
	)
	final int field3513;

	class296(int var3) {
		this.field3513 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3513; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1473991236"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (class161.method3220(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = World.World_worlds[var9]; // L: 185
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 186
					World.World_worlds[var7++] = var10; // L: 187
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 191
			World.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZS)I",
		garbageValue = "-5845"
	)
	static int method5654(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2143
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.cycle; // L: 2144
			return 1; // L: 2145
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2147
				Nameable.Interpreter_intStackSize -= 2; // L: 2148
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2149
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2150
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class433.method7491(var3, var4); // L: 2151
				return 1; // L: 2152
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2154
				Nameable.Interpreter_intStackSize -= 2; // L: 2155
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2156
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2157
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class161.ItemContainer_getCount(var3, var4); // L: 2158
				return 1; // L: 2159
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2161
				Nameable.Interpreter_intStackSize -= 2; // L: 2162
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2163
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2164
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class21.method296(var3, var4); // L: 2165
				return 1; // L: 2166
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2168
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2169
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class20.getInvDefinition(var3).size; // L: 2170
				return 1; // L: 2171
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2173
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2174
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2175
				return 1; // L: 2176
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2178
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2179
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2180
				return 1; // L: 2181
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2183
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2184
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2185
				return 1; // L: 2186
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2188
					var3 = class268.Client_plane; // L: 2189
					var4 = Decimator.baseX * 64 + (ScriptFrame.localPlayer.x >> 7); // L: 2190
					var5 = class7.baseY * 64 + (ScriptFrame.localPlayer.y >> 7); // L: 2191
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2192
					return 1; // L: 2193
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2195
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2196
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2197
					return 1; // L: 2198
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2200
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2201
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2202
					return 1; // L: 2203
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2205
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2206
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2207
					return 1; // L: 2208
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2210
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2211
					return 1; // L: 2212
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2214
					Nameable.Interpreter_intStackSize -= 2; // L: 2215
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] + 32768; // L: 2216
					var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2217
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class433.method7491(var3, var4); // L: 2218
					return 1; // L: 2219
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2221
					Nameable.Interpreter_intStackSize -= 2; // L: 2222
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] + 32768; // L: 2223
					var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2224
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class161.ItemContainer_getCount(var3, var4); // L: 2225
					return 1; // L: 2226
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2228
					Nameable.Interpreter_intStackSize -= 2; // L: 2229
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize] + 32768; // L: 2230
					var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2231
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class21.method296(var3, var4); // L: 2232
					return 1; // L: 2233
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2235
					if (Client.staffModLevel >= 2) { // L: 2236
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2237
					}

					return 1; // L: 2238
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2240
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2241
					return 1; // L: 2242
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2244
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.worldId; // L: 2245
					return 1; // L: 2246
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2248
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2249
					return 1; // L: 2250
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2252
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.weight; // L: 2253
					return 1; // L: 2254
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2256
					if (Client.playerMod) { // L: 2257
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2258
					}

					return 1; // L: 2259
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2261
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2262
					return 1; // L: 2263
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2265
					Nameable.Interpreter_intStackSize -= 4; // L: 2266
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 2267
					var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 2268
					var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 2269
					int var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 2270
					var3 += var4 << 14; // L: 2271
					var3 += var5 << 28; // L: 2272
					var3 += var6; // L: 2273
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3; // L: 2274
					return 1; // L: 2275
				} else if (var0 == 3326) { // L: 2277
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.field553; // L: 2278
					return 1; // L: 2279
				} else if (var0 == 3327) { // L: 2281
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.field688; // L: 2282
					return 1; // L: 2283
				} else {
					return 2; // L: 2285
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2096465248"
	)
	static int method5653(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 3855
	}
}
