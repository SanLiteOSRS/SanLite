import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Laq;"
	)
	static final WorldMapID field295;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Laq;"
	)
	static final WorldMapID field292;
	@ObfuscatedName("c")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1395703893
	)
	@Export("value")
	final int value;

	static {
		field295 = new WorldMapID(0);
		field292 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;ZB)Lmr;",
		garbageValue = "-97"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (AbstractUserComparator.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (AbstractUserComparator.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class52.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "0"
	)
	static final int method665(int var0, int var1) {
		int var2 = SecureRandomFuture.method2252(var0 - 1, var1 - 1) + SecureRandomFuture.method2252(1 + var0, var1 - 1) + SecureRandomFuture.method2252(var0 - 1, 1 + var1) + SecureRandomFuture.method2252(var0 + 1, 1 + var1);
		int var3 = SecureRandomFuture.method2252(var0 - 1, var1) + SecureRandomFuture.method2252(1 + var0, var1) + SecureRandomFuture.method2252(var0, var1 - 1) + SecureRandomFuture.method2252(var0, 1 + var1);
		int var4 = SecureRandomFuture.method2252(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-610468122"
	)
	static int method667(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = JagexCache.method3625(WorldMapData_0.getWidgetClickMask(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		signature = "(Lcs;I)V",
		garbageValue = "1072079291"
	)
	static final void method666(Actor var0) {
		if (var0.field1024 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class105.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
			int var1 = var0.field1024 - var0.field1009;
			int var2 = Client.cycle - var0.field1009;
			int var3 = var0.field1017 * 128 + var0.field1011 * 64;
			int var4 = var0.field1019 * 128 + var0.field1011 * 64;
			int var5 = var0.field1018 * 128 + var0.field1011 * 64;
			int var6 = var0.field1020 * 128 + var0.field1011 * 64;
			var0.x = (var2 * var5 + var3 * (var1 - var2)) / var1;
			var0.y = (var6 * var2 + var4 * (var1 - var2)) / var1;
		}

		var0.field978 = 0;
		var0.orientation = var0.field1023;
		var0.rotation = var0.orientation;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		signature = "(Lht;II)I",
		garbageValue = "1789445641"
	)
	static final int method663(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = UserComparator4.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!AbstractWorldMapData.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = PlayerType.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = UserComparator4.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!AbstractWorldMapData.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = ApproximateRouteStrategy.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = FloorDecoration.baseX * 64 + (PlayerType.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = WorldMapData_0.baseY * 64 + (PlayerType.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		signature = "(Lht;I)V",
		garbageValue = "898207937"
	)
	static final void method664(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field945 == -1) {
				Client.field945 = var0.spriteId2;
				Client.field895 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field945;
			} else {
				var0.spriteId2 = Client.field895;
			}

		} else if (var1 == 325) {
			if (Client.field945 == -1) {
				Client.field945 = var0.spriteId2;
				Client.field895 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field895;
			} else {
				var0.spriteId2 = Client.field945;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
