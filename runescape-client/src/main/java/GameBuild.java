import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ij")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("i")
	@Export("name")
	public final String name;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1493317811
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lic;III)[Llp;",
		garbageValue = "-1533970303"
	)
	public static SpritePixels[] method4214(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			Occluder.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class335.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class335.SpriteBuffer_spriteCount; ++var6) {
				SpritePixels var7 = var5[var6] = new SpritePixels();
				var7.width = class335.SpriteBuffer_spriteWidth;
				var7.height = class335.SpriteBuffer_spriteHeight;
				var7.xOffset = Username.SpriteBuffer_xOffsets[var6];
				var7.yOffset = class335.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class335.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class335.SpriteBuffer_spriteHeights[var6];
				int var8 = var7.subWidth * var7.subHeight;
				byte[] var9 = class92.SpriteBuffer_pixels[var6];
				var7.pixels = new int[var8];

				for (int var10 = 0; var10 < var8; ++var10) {
					var7.pixels[var10] = TaskHandler.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			Username.SpriteBuffer_xOffsets = null;
			class335.SpriteBuffer_yOffsets = null;
			class335.SpriteBuffer_spriteWidths = null;
			class335.SpriteBuffer_spriteHeights = null;
			TaskHandler.SpriteBuffer_spritePalette = null;
			class92.SpriteBuffer_pixels = null;
			return var5;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "-1136402672"
	)
	static int method4218(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var4 = TileItem.getWidget(var3);
		} else {
			var4 = var2 ? Canvas.field438 : class3.field12;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			class52.invalidateWidget(var4);
			class2.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			class52.invalidateWidget(var4);
			class2.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class52.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lbw;B)V",
		garbageValue = "30"
	)
	static void method4217(GameEngine var0) {
		while (class60.isKeyDown()) {
			if (PlayerComposition.field2581 == 13) {
				PacketBufferNode.method3726();
				return;
			}

			if (PlayerComposition.field2581 == 96) {
				if (Login.worldSelectPage > 0 && WorldMapIcon_0.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (PlayerComposition.field2581 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && ArchiveDiskActionHandler.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				AbstractWorldMapData.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				PacketBufferNode.method3726();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var5 = AbstractByteArrayCopier.World_worlds[Login.hoveredWorldIndex];
				Canvas.changeWorld(var5);
				PacketBufferNode.method3726();
				return;
			}

			if (Login.worldSelectPage > 0 && WorldMapIcon_0.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= WorldMapIcon_0.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && ArchiveDiskActionHandler.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= FloorDecoration.canvasWidth - ArchiveDiskActionHandler.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= FloorDecoration.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
