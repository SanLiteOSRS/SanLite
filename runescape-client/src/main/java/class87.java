import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
public class class87 {
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 234034519
	)
	@Export("Client_plane")
	static int Client_plane;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1072817040"
	)
	static void method2311() {
		synchronized(ArchiveDiskActionHandler.field4292) { // L: 56
			if (ArchiveDiskActionHandler.field4294 == 0) { // L: 57
				UserComparator3.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 58
				UserComparator3.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 59
				UserComparator3.ArchiveDiskActionHandler_thread.start(); // L: 60
				UserComparator3.ArchiveDiskActionHandler_thread.setPriority(5); // L: 61
			}

			ArchiveDiskActionHandler.field4294 = 600; // L: 63
			ArchiveDiskActionHandler.field4300 = false; // L: 64
		}
	} // L: 66

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "949731211"
	)
	static int method2309(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1341
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1342
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1343
			return 1; // L: 1344
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1346
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1350
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1351
			return 1; // L: 1352
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1354
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1355
			return 1; // L: 1356
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1358
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1359
			return 1; // L: 1360
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1362
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1363
			return 1; // L: 1364
		} else {
			return 2; // L: 1366
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-103317779"
	)
	static final void method2310(int var0) {
		int[] var1 = SpriteMask.field3559.pixels; // L: 6299
		int var2 = var1.length; // L: 6300

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6301
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6302
			var4 = (103 - var3) * 2048 + 24628; // L: 6303

			for (var5 = 1; var5 < 103; ++var5) { // L: 6304
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6305
					class10.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6306
					class10.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6307
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6310
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6311
		SpriteMask.field3559.setRaster(); // L: 6312

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6313
			for (var6 = 1; var6 < 103; ++var6) { // L: 6314
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6315
					class6.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6316
					class6.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.field599 = 0; // L: 6319

		for (var5 = 0; var5 < 104; ++var5) { // L: 6320
			for (var6 = 0; var6 < 104; ++var6) { // L: 6321
				long var7 = class10.scene.getGroundObjectTag(Client_plane, var5, var6); // L: 6322
				if (0L != var7) { // L: 6323
					int var9 = SecureRandomFuture.Entity_unpackID(var7); // L: 6324
					int var10 = class91.getObjectDefinition(var9).mapIconId; // L: 6325
					if (var10 >= 0 && class148.WorldMapElement_get(var10).field1941) { // L: 6326 6327
						Client.field767[Client.field599] = class148.WorldMapElement_get(var10).getSpriteBool(false); // L: 6330
						Client.field765[Client.field599] = var5; // L: 6331
						Client.field766[Client.field599] = var6; // L: 6332
						++Client.field599; // L: 6333
					}
				}
			}
		}

		class223.rasterProvider.apply(); // L: 6339
	} // L: 6341
}
