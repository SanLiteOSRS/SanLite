import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
public class class43 {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcf;",
		garbageValue = "-16"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var5;
		if (var6 != null) {
			var5 = var6;
		} else {
			String var7 = String.valueOf(var3);
			int var8 = UserComparator5.archive12.getGroupId(var7);
			if (var8 == -1) {
				var5 = null;
			} else {
				label59: {
					byte[] var9 = UserComparator5.archive12.takeFileFlat(var8);
					if (var9 != null) {
						if (var9.length <= 1) {
							var5 = null;
							break label59;
						}

						var6 = NameableContainer.newScript(var9);
						if (var6 != null) {
							Script.Script_cached.put(var6, (long)(var3 << 16));
							var5 = var6;
							break label59;
						}
					}

					var5 = null;
				}
			}
		}

		if (var5 != null) {
			return var5;
		} else {
			int var13 = (-3 - var2 << 8) + var0;
			Script var15 = (Script)Script.Script_cached.get((long)(var13 << 16));
			Script var14;
			if (var15 != null) {
				var14 = var15;
			} else {
				String var10 = String.valueOf(var13);
				int var11 = UserComparator5.archive12.getGroupId(var10);
				if (var11 == -1) {
					var14 = null;
				} else {
					byte[] var12 = UserComparator5.archive12.takeFileFlat(var11);
					if (var12 != null) {
						if (var12.length <= 1) {
							var14 = null;
							return var14 != null ? var14 : null;
						}

						var15 = NameableContainer.newScript(var12);
						if (var15 != null) {
							Script.Script_cached.put(var15, (long)(var13 << 16));
							var14 = var15;
							return var14 != null ? var14 : null;
						}
					}

					var14 = null;
				}
			}

			return var14 != null ? var14 : null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "100"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class301.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1726965771"
	)
	static void method437() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1427864151"
	)
	static int method435(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		WorldMapCacheName.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class93.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			class44.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class260.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3013 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3013;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1591980574"
	)
	public static String method433(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = Username.method5877(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "323"
	)
	static int method436(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-56748890"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class124.garbageCollector == null || !class124.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						class124.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (class124.garbageCollector != null) {
			long var9 = ObjectComposition.currentTimeMillis();
			long var3 = class124.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1248092260"
	)
	static int method440() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field916;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lcu;ZI)V",
		garbageValue = "-2095467414"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) {
			HealthBarUpdate.Widget_archive.clearFilesGroup(var2);
			if (Widget.Widget_interfaceComponents[var2] != null) {
				boolean var4 = true;

				for (int var5 = 0; var5 < Widget.Widget_interfaceComponents[var2].length; ++var5) {
					if (Widget.Widget_interfaceComponents[var2][var5] != null) {
						if (Widget.Widget_interfaceComponents[var2][var5].type != 2) {
							Widget.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false;
						}
					}
				}

				if (var4) {
					Widget.Widget_interfaceComponents[var2] = null;
				}

				Widget.Widget_loadedInterfaces[var2] = false;
			}
		}

		for (IntegerNode var6 = (IntegerNode)Client.widgetFlags.first(); var6 != null; var6 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var6.key >> 48 & 65535L) == (long)var2) {
				var6.remove();
			}
		}

		Widget var7 = Frames.getWidget(var3);
		if (var7 != null) {
			WorldMapCacheName.invalidateWidget(var7);
		}

		class7.method68();
		if (Client.rootInterface != -1) {
			Login.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
