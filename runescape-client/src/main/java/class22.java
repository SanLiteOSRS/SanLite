import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("a")
public class class22 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "Lly;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("gz")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(ILco;ZB)I",
		garbageValue = "-46"
	)
	static int method244(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			MilliClock.Interpreter_intStackSize -= 2;
			Client.field873 = (short)FontName.method5455(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]);
			if (Client.field873 <= 0) {
				Client.field873 = 256;
			}

			Client.field932 = (short)FontName.method5455(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]);
			if (Client.field932 <= 0) {
				Client.field932 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			MilliClock.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			MilliClock.Interpreter_intStackSize -= 4;
			Client.field865 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			if (Client.field865 <= 0) {
				Client.field865 = 1;
			}

			Client.field753 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			if (Client.field753 <= 0) {
				Client.field753 = 32767;
			} else if (Client.field753 < Client.field865) {
				Client.field753 = Client.field865;
			}

			Client.field937 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
			if (Client.field937 <= 0) {
				Client.field937 = 1;
			}

			Client.field935 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3];
			if (Client.field935 <= 0) {
				Client.field935 = 32767;
			} else if (Client.field935 < Client.field937) {
				Client.field935 = Client.field937;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				Coord.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = InterfaceParent.method1271(Client.field873);
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = InterfaceParent.method1271(Client.field932);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ItemContainer.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = HealthBar.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)V",
		garbageValue = "-649676839"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < HealthBar.ItemDefinition_fileCount; ++var4) {
			ItemComposition var5 = AbstractWorldMapData.ItemDefinition_get(var4);
			if ((!var1 || var5.isTradable) && var5.noteTemplate == -1 && var5.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					PendingSpawn.foundItemIdCount = -1;
					Message.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		Message.foundItemIds = var2;
		AbstractWorldMapIcon.foundItemIndex = 0;
		PendingSpawn.foundItemIdCount = var3;
		String[] var8 = new String[PendingSpawn.foundItemIdCount];

		for (int var9 = 0; var9 < PendingSpawn.foundItemIdCount; ++var9) {
			var8[var9] = AbstractWorldMapData.ItemDefinition_get(var2[var9]).name;
		}

		short[] var10 = Message.foundItemIds;
		Projectile.sortItemsByName(var8, var10, 0, var8.length - 1);
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		signature = "([BII)V",
		garbageValue = "594289847"
	)
	static void method246(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class311.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
