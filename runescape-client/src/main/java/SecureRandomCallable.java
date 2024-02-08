import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -468262039
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 1545273285
	)
	static int field1027;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 48
		var2.nextInt(); // L: 49
		return var2; // L: 52
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-2115998407"
	)
	static int method2323(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2911
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2912
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field661.method4426(var3) ? 1 : 0; // L: 2913
			return 1; // L: 2914
		} else if (var0 == 3501) { // L: 2916
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2917
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field661.method4425(var3) ? 1 : 0; // L: 2918
			return 1; // L: 2919
		} else if (var0 == 3502) { // L: 2921
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2922
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field661.method4427(var3) ? 1 : 0; // L: 2923
			return 1; // L: 2924
		} else {
			return 2; // L: 2926
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IS)I",
		garbageValue = "-32405"
	)
	static final int method2318(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11139
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11141
				int var3 = 0; // L: 11142
				int var4 = 0; // L: 11143
				byte var5 = 0; // L: 11144

				while (true) {
					int var6 = var2[var4++]; // L: 11146
					int var7 = 0; // L: 11147
					byte var8 = 0; // L: 11148
					if (var6 == 0) { // L: 11149
						return var3;
					}

					if (var6 == 1) { // L: 11150
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11151
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11152
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11153
						var9 = var2[var4++] << 16; // L: 11154
						var9 += var2[var4++]; // L: 11155
						var10 = class380.field4414.method6348(var9); // L: 11156
						var11 = var2[var4++]; // L: 11157
						if (var11 != -1 && (!class341.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11158
							for (var12 = 0; var12 < var10.field3834.length; ++var12) { // L: 11159
								if (var11 + 1 == var10.field3834[var12]) { // L: 11160
									var7 += var10.field3833[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11164
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11165
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11166
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11167
						var7 = class25.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11168
						for (var9 = 0; var9 < 25; ++var9) { // L: 11169
							if (Skills.Skills_enabled[var9]) { // L: 11170
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11173
						var9 = var2[var4++] << 16; // L: 11174
						var9 += var2[var4++]; // L: 11175
						var10 = class380.field4414.method6348(var9); // L: 11176
						var11 = var2[var4++]; // L: 11177
						if (var11 != -1 && (!class341.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11178
							for (var12 = 0; var12 < var10.field3834.length; ++var12) { // L: 11179
								if (var11 + 1 == var10.field3834[var12]) { // L: 11180
									var7 = 999999999; // L: 11181
									break; // L: 11182
								}
							}
						}
					}

					if (var6 == 11) { // L: 11187
						var7 = Client.field671;
					}

					if (var6 == 12) { // L: 11188
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11189
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11190
						int var13 = var2[var4++]; // L: 11191
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11192
					}

					if (var6 == 14) { // L: 11194
						var9 = var2[var4++]; // L: 11195
						var7 = class59.getVarbit(var9); // L: 11196
					}

					if (var6 == 15) { // L: 11198
						var8 = 1;
					}

					if (var6 == 16) { // L: 11199
						var8 = 2;
					}

					if (var6 == 17) { // L: 11200
						var8 = 3;
					}

					if (var6 == 18) { // L: 11201
						var7 = HealthBarDefinition.baseX * 64 + (class25.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11202
						var7 = WorldMapScaleHandler.baseY * 64 + (class25.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11203
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11204
						if (var5 == 0) { // L: 11205
							var3 += var7;
						}

						if (var5 == 1) { // L: 11206
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11207
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11208
							var3 *= var7;
						}

						var5 = 0; // L: 11209
					} else {
						var5 = var8; // L: 11211
					}
				}
			} catch (Exception var14) { // L: 11214
				return -1; // L: 11215
			}
		} else {
			return -2;
		}
	}
}
