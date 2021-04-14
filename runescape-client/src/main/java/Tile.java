import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fx")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 290208105
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1592009021
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1758245997
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 528170581
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1400903317
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lfj;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lgh;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lfz;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lfk;"
	)
	@Export("tileItemPile")
	ItemLayer tileItemPile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1333584157
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "[Lgb;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("d")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 710748349
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1452251067
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("q")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("t")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 551470887
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1164753335
	)
	int field1889;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 210470001
	)
	int field1890;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1446822029
	)
	int field1882;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lfx;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)[B",
		garbageValue = "-20"
	)
	public static byte[] method3356() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-860783313"
	)
	static int method3358(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class16.Interpreter_intStackSize -= 3;
			ArchiveDiskAction.queueSoundEffect(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class4.playSong(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class16.Interpreter_intStackSize -= 2;
			HealthBarUpdate.method2175(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			if (var0 == 3203) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100);
				Messages.method2367(Math.round(2.55F * (float)var3));
				return 1;
			} else if (var0 == 3204) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Math.round((float)Login.clientPreferences.musicVolume / 2.55F);
				return 1;
			} else if (var0 == 3205) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100);
				Canvas.method478(Math.round((float)var3 * 1.27F));
				return 1;
			} else if (var0 == 3206) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Math.round((float)Login.clientPreferences.soundEffectsVolume / 1.27F);
				return 1;
			} else if (var0 == 3207) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100);
				MusicPatchPcmStream.method4126(Math.round((float)var3 * 1.27F));
				return 1;
			} else if (var0 == 3208) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Math.round((float)Login.clientPreferences.areaSoundEffectsVolume / 1.27F);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "149089395"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field819 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (WorldMapScaleHandler.getWindowedMode() == 1) {
			class10.client.setMaxCanvasSize(765, 503);
		} else {
			class10.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			ItemContainer.method2093();
		}

	}
}
