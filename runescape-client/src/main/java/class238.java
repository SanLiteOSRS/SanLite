import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class238 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lih;"
	)
	static final class238 field3116;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lih;"
	)
	static final class238 field3113;
	@ObfuscatedName("e")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -537874473
	)
	final int field3112;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 397493923
	)
	final int field3117;

	static {
		field3116 = new class238(51, 27, 800, 0, 16, 16);
		field3113 = new class238(25, 28, 800, 656, 40, 40);
	}

	class238(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3112 = var5;
		this.field3117 = var6;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1821590309"
	)
	static final void method4271() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var10 = Rasterizer3D.method3196(var7, var4, var1, var0);
			int var11 = Rasterizer3D.method3161(var7, var4, var1, var0);
			var7 = var10;
			var10 = Rasterizer3D.method3196(var9, var5, var1, var0);
			int var12 = Rasterizer3D.method3161(var9, var5, var1, var0);
			var9 = var10;
			var10 = Rasterizer3D.method3158(var6, var11, var3, var2);
			var11 = Rasterizer3D.method3159(var6, var11, var3, var2);
			var6 = var10;
			var10 = Rasterizer3D.method3158(var8, var12, var3, var2);
			var12 = Rasterizer3D.method3159(var8, var12, var3, var2);
			ViewportMouse.field1770 = (var6 + var10) / 2;
			WorldMapEvent.field377 = (var9 + var7) / 2;
			ViewportMouse.field1768 = (var12 + var11) / 2;
			ViewportMouse.field1771 = (var10 - var6) / 2;
			GrandExchangeOfferTotalQuantityComparator.field81 = (var9 - var7) / 2;
			SecureRandomCallable.field553 = (var12 - var11) / 2;
			class1.field3 = Math.abs(ViewportMouse.field1771);
			ItemContainer.field570 = Math.abs(GrandExchangeOfferTotalQuantityComparator.field81);
			ViewportMouse.field1772 = Math.abs(SecureRandomCallable.field553);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1256117842"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (WorldMapSection2.garbageCollector == null || !WorldMapSection2.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						WorldMapSection2.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (WorldMapSection2.garbageCollector != null) {
			long var9 = Nameable.currentTimeMillis();
			long var3 = WorldMapSection2.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		signature = "(Lht;IIB)V",
		garbageValue = "-13"
	)
	static final void method4268(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = PendingSpawn.method1843(var0);
			if (var3 != null) {
				ModelData0.insertMenuItemNoShift(var3, Client.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			ModelData0.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var6;
		int var7;
		int var19;
		if (var0.type == 2) {
			var19 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var5 = 0; var5 < var0.width; ++var5) {
					var6 = (var0.paddingX + 32) * var5;
					var7 = (var0.paddingY + 32) * var4;
					if (var19 < 20) {
						var6 += var0.inventoryXOffsets[var19];
						var7 += var0.inventoryYOffsets[var19];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var19;
						class217.field2532 = var0;
						if (var0.itemIds[var19] > 0) {
							label397: {
								ItemComposition var8 = AbstractWorldMapData.ItemDefinition_get(var0.itemIds[var19] - 1);
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) {
									var10 = WorldMapData_0.getWidgetClickMask(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if (var0.id != SpotAnimationDefinition.selectedItemWidget || var19 != InvDefinition.selectedItemSlot) {
											ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id);
										}
										break label397;
									}
								}

								if (Client.isSpellSelected) {
									var10 = WorldMapData_0.getWidgetClickMask(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if ((class105.selectedSpellFlags & 16) == 16) {
											ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id);
										}
										break label397;
									}
								}

								String[] var22 = var8.inventoryActions;
								var10 = -1;
								boolean var11;
								if (Client.shiftClickDrop) {
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}

								int var12 = WorldMapData_0.getWidgetClickMask(var0);
								var11 = (var12 >> 30 & 1) != 0;
								if (var11) {
									for (int var13 = 4; var13 >= 3; --var13) {
										if (var13 != var10) {
											SecureRandomCallable.addWidgetItemMenuItem(var0, var8, var19, var13, false);
										}
									}
								}

								int var14 = WorldMapData_0.getWidgetClickMask(var0);
								boolean var26 = (var14 >> 31 & 1) != 0;
								if (var26) {
									ModelData0.insertMenuItemNoShift("Use", Client.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id);
								}

								int var16 = WorldMapData_0.getWidgetClickMask(var0);
								boolean var15 = (var16 >> 30 & 1) != 0;
								int var17;
								if (var15) {
									for (var17 = 2; var17 >= 0; --var17) {
										if (var10 != var17) {
											SecureRandomCallable.addWidgetItemMenuItem(var0, var8, var19, var17, false);
										}
									}

									if (var10 >= 0) {
										SecureRandomCallable.addWidgetItemMenuItem(var0, var8, var19, var10, true);
									}
								}

								var22 = var0.itemActions;
								if (var22 != null) {
									for (var17 = 4; var17 >= 0; --var17) {
										if (var22[var17] != null) {
											byte var18 = 0;
											if (var17 == 0) {
												var18 = 39;
											}

											if (var17 == 1) {
												var18 = 40;
											}

											if (var17 == 2) {
												var18 = 41;
											}

											if (var17 == 3) {
												var18 = 42;
											}

											if (var17 == 4) {
												var18 = 43;
											}

											ModelData0.insertMenuItemNoShift(var22[var17], Client.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id);
										}
									}
								}

								ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id);
							}
						}
					}

					++var19;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = WorldMapData_0.getWidgetClickMask(var0);
				boolean var27 = (var4 >> 21 & 1) != 0;
				if (var27 && (class105.selectedSpellFlags & 32) == 32) {
					ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) {
					var6 = WorldMapData_0.getWidgetClickMask(var0);
					boolean var24 = (var6 >> var19 + 1 & 1) != 0;
					String var20;
					if (!var24 && var0.onOp == null) {
						var20 = null;
					} else if (var0.actions != null && var0.actions.length > var19 && var0.actions[var19] != null && var0.actions[var19].trim().length() != 0) {
						var20 = var0.actions[var19];
					} else {
						var20 = null;
					}

					if (var20 != null) {
						ModelData0.insertMenuItemNoShift(var20, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = PendingSpawn.method1843(var0);
				if (var3 != null) {
					ModelData0.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					var7 = WorldMapData_0.getWidgetClickMask(var0);
					boolean var25 = (var7 >> var4 + 1 & 1) != 0;
					String var21;
					if (!var25 && var0.onOp == null) {
						var21 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var21 = var0.actions[var4];
					} else {
						var21 = null;
					}

					if (var21 != null) {
						KeyHandler.insertMenuItem(var21, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.field2735);
					}
				}

				if (class195.method3756(WorldMapData_0.getWidgetClickMask(var0))) {
					ModelData0.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
