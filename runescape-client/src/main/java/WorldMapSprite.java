import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("w")
	public static short[][] field253;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("k")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1945716520"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-1682041122"
	)
	public static final boolean method496(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class204.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class348.field4067;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class348.field4065;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IS)Z",
		garbageValue = "20454"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Bounds.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Bounds.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) {
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							Widget.Widget_interfaceComponents[var0][var2] = new Widget();
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				Bounds.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-2072659501"
	)
	static void method493(int var0, int var1) {
		int var2 = class4.fontBold12.stringWidth("Choose Option");

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			Font var4 = class4.fontBold12;
			String var5;
			if (var3 < 0) {
				var5 = "";
			} else if (Client.menuTargets[var3].length() > 0) {
				var5 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var5 = Client.menuActions[var3];
			}

			int var6 = var4.stringWidth(var5);
			if (var6 > var2) {
				var2 = var6;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		int var7 = var0 - var2 / 2;
		if (var2 + var7 > FloorDecoration.canvasWidth) {
			var7 = FloorDecoration.canvasWidth - var2;
		}

		if (var7 < 0) {
			var7 = 0;
		}

		int var8 = var1;
		if (var3 + var1 > GameEngine.canvasHeight) {
			var8 = GameEngine.canvasHeight - var3;
		}

		if (var8 < 0) {
			var8 = 0;
		}

		ChatChannel.menuX = var7;
		Client.menuY = var8;
		DevicePcmPlayerProvider.menuWidth = var2;
		WorldMapManager.menuHeight = Client.menuOptionsCount * 15 + 22;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		signature = "(IIIB)Lbq;",
		garbageValue = "-81"
	)
	static final InterfaceParent method494(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		PacketWriter.Widget_resetModelFrames(var1);
		Widget var4 = TileItem.getWidget(var0);
		class52.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class52.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class2.method24();
		class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		class235.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			ClientPacket.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
