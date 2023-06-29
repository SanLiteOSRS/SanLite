import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 989275023
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 68756671
	)
	@Export("size")
	int size;
	@ObfuscatedName("av")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("as")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ax")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ap")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ab")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ak")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;Lsv;I)Lsv;",
		garbageValue = "1995679010"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = class128.method2970(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	static void method669() {
		if (Login.clearLoginScreen) { // L: 321
			class481.titleboxSprite = null; // L: 322
			Login.field921 = null; // L: 323
			Login.field920 = null; // L: 324
			Decimator.leftTitleSprite = null; // L: 325
			Login.rightTitleSprite = null; // L: 326
			class13.logoSprite = null; // L: 327
			SpriteMask.title_muteSprite = null; // L: 328
			class104.field1322 = null; // L: 329
			class177.field1856 = null; // L: 330
			class16.worldSelectBackSprites = null; // L: 331
			class134.worldSelectFlagSprites = null; // L: 332
			class1.worldSelectArrows = null; // L: 333
			class342.worldSelectStars = null; // L: 334
			class19.field97 = null; // L: 335
			class237.loginScreenRunesAnimation.method2402(); // L: 336
			class304.musicPlayerStatus = 1; // L: 338
			UserComparator9.musicTrackArchive = null; // L: 339
			VarbitComposition.musicTrackGroupId = -1; // L: 340
			class304.musicTrackFileId = -1; // L: 341
			class304.musicTrackVolume = 0; // L: 342
			class132.musicTrackBoolean = false; // L: 343
			class157.pcmSampleLength = 2; // L: 344
			if (NetCache.NetCache_socket != null) { // L: 347
				try {
					Buffer var0 = new Buffer(4); // L: 349
					var0.writeByte(2); // L: 350
					var0.writeMedium(0); // L: 351
					NetCache.NetCache_socket.write(var0.array, 0, 4); // L: 352
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close(); // L: 356
					} catch (Exception var2) { // L: 358
					}

					++NetCache.NetCache_ioExceptions; // L: 359
					NetCache.NetCache_socket = null; // L: 360
				}
			}

			Login.clearLoginScreen = false; // L: 363
		}
	} // L: 364

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "22"
	)
	static final void method670(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class208.field2314 || class182.field1891 != var1) { // L: 5909
			class208.field2314 = var0; // L: 5912
			class182.field1891 = var1; // L: 5913
			UserComparator8.method2855(25); // L: 5914
			class230.drawLoadingMessage("Loading - please wait.", true); // L: 5915
			int var3 = class213.baseX * 64; // L: 5916
			int var4 = class101.baseY * 64; // L: 5917
			class213.baseX = (var0 - 6) * 8; // L: 5918
			class101.baseY = (var1 - 6) * 8; // L: 5919
			int var5 = class213.baseX * 64 - var3; // L: 5920
			int var6 = class101.baseY * 64 - var4; // L: 5921
			var3 = class213.baseX * 64; // L: 5922
			var4 = class101.baseY * 64; // L: 5923

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5924
				NPC var19 = Client.npcs[var7]; // L: 5925
				if (var19 != null) { // L: 5926
					for (var9 = 0; var9 < 10; ++var9) { // L: 5927
						var10000 = var19.pathX; // L: 5928
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5929
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5931
					var19.y -= var6 * 128; // L: 5932
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5935
				Player var22 = Client.players[var7]; // L: 5936
				if (var22 != null) { // L: 5937
					for (var9 = 0; var9 < 10; ++var9) { // L: 5938
						var10000 = var22.pathX; // L: 5939
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5940
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5942
					var22.y -= var6 * 128; // L: 5943
				}
			}

			byte var20 = 0; // L: 5946
			byte var8 = 104; // L: 5947
			byte var21 = 1; // L: 5948
			if (var5 < 0) { // L: 5949
				var20 = 103; // L: 5950
				var8 = -1; // L: 5951
				var21 = -1; // L: 5952
			}

			byte var10 = 0; // L: 5954
			byte var11 = 104; // L: 5955
			byte var12 = 1; // L: 5956
			if (var6 < 0) { // L: 5957
				var10 = 103; // L: 5958
				var11 = -1; // L: 5959
				var12 = -1; // L: 5960
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5962
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5963
					int var15 = var13 + var5; // L: 5964
					int var16 = var6 + var14; // L: 5965

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5966
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5967
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5968
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5972 5973 5977
				var18.x -= var5; // L: 5974
				var18.y -= var6; // L: 5975
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5976
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5979
				Client.destinationX -= var5; // L: 5980
				Client.destinationY -= var6; // L: 5981
			}

			Client.soundEffectCount = 0; // L: 5983
			Client.isCameraLocked = false; // L: 5984
			class208.cameraX -= var5 << 7; // L: 5985
			ByteArrayPool.cameraZ -= var6 << 7; // L: 5986
			ModeWhere.oculusOrbFocalPointX -= var5 << 7; // L: 5987
			GrandExchangeEvents.oculusOrbFocalPointY -= var6 << 7; // L: 5988
			Client.field747 = -1; // L: 5989
			Client.graphicsObjects.clear(); // L: 5990
			Client.projectiles.clear(); // L: 5991

			for (var14 = 0; var14 < 4; ++var14) { // L: 5992
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5910 5993
}
