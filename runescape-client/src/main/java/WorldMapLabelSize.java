import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fo")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -55906983
	)
	final int field2014;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1208925503
	)
	final int field2011;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1826409873
	)
	final int field2016;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2014 = var1;
		this.field2011 = var2;
		this.field2016 = var3;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-2129729185"
	)
	boolean method3533(float var1) {
		return var1 >= (float)this.field2016;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "-2058322957"
	)
	static WorldMapLabelSize method3538(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium};
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field2011) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;",
		garbageValue = "0"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-2112381958"
	)
	static int method3540(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class14.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = UserComparator9.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						class120.scriptDotWidget = var12;
					} else {
						Frames.scriptActiveWidget = var12;
					}

					class184.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
				Widget var10 = UserComparator9.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				class184.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
				var3.children = null;
				class184.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				class14.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--class14.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class120.scriptDotWidget = var3;
						} else {
							Frames.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				class14.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				Widget var5 = ItemContainer.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class120.scriptDotWidget = var5;
					} else {
						Frames.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "1223728297"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			class14.method180(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1082 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "([Ljf;IIIZB)V",
		garbageValue = "124"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				WorldMapScaleHandler.alignWidgetSize(var6, var2, var3, var4);
				LoginPacket.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class81.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "28"
	)
	static final String method3534(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ItemComposition.method3406();
		FriendLoginUpdate.method6058();
		int var1 = ArchiveLoader.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					class354.method6396(0.9D);
				}

				if (var2 == 2) {
					class354.method6396(0.8D);
				}

				if (var2 == 3) {
					class354.method6396(0.7D);
				}

				if (var2 == 4) {
					class354.method6396(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class14.method178(255);
				}

				if (var2 == 1) {
					class14.method178(192);
				}

				if (var2 == 2) {
					class14.method178(128);
				}

				if (var2 == 3) {
					class14.method178(64);
				}

				if (var2 == 4) {
					class14.method178(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					WorldMapSection1.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					WorldMapSection1.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					WorldMapSection1.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					WorldMapSection1.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					WorldMapSection1.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field656 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					ClanChannel.method2825(127);
				}

				if (var2 == 1) {
					ClanChannel.method2825(96);
				}

				if (var2 == 2) {
					ClanChannel.method2825(64);
				}

				if (var2 == 3) {
					ClanChannel.method2825(32);
				}

				if (var2 == 4) {
					ClanChannel.method2825(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)UserComparator4.findEnumerated(Login.method1950(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)UserComparator4.findEnumerated(Login.method1950(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
