import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1597617815
	)
	int field3486;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	MusicPatchNode2 field3489;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1901920991
	)
	int field3490;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2041435723
	)
	int field3491;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -822502617
	)
	int field3492;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1371213005
	)
	int field3493;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -972459931
	)
	int field3494;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1549742523
	)
	int field3500;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1483022355
	)
	int field3496;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2047062321
	)
	int field3497;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 384318191
	)
	int field3498;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1886139926
	)
	int field3507;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -629400247
	)
	int field3503;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -408800069
	)
	int field3501;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1199345775
	)
	int field3495;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1742747803
	)
	int field3505;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 896970821
	)
	int field3506;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1348319039
	)
	int field3487;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	void method6061() {
		this.table = null;
		this.rawSound = null;
		this.field3489 = null;
		this.stream = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "40"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					var2 = GrandExchangeOfferWorldComparator.method6935(var1);
				}

				if (var0 != null) { // L: 36
					if (var1 != null) { // L: 37
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 38
				}

				System.out.println("Error: " + var2); // L: 40
				var2 = var2.replace(':', '.'); // L: 41
				var2 = var2.replace('@', '_'); // L: 42
				var2 = var2.replace('&', '_'); // L: 43
				var2 = var2.replace('#', '_'); // L: 44
				if (RunException.RunException_applet == null) { // L: 45
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + Skeleton.field2553 + "&u=" + RunException.field5234 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class158.field1757 + "&e=" + var2); // L: 46
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 47
				var4.read(); // L: 48
				var4.close(); // L: 49
			} catch (Exception var5) { // L: 51
			}

		}
	} // L: 52

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-588315886"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class173.scene.getWallObjectTag(var0, var1, var2); // L: 6180
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (0L != var5) { // L: 6181
			var7 = class173.scene.getObjectFlags(var0, var1, var2, var5); // L: 6182
			var8 = var7 >> 6 & 3; // L: 6183
			var9 = var7 & 31; // L: 6184
			var10 = var3; // L: 6185
			boolean var11 = 0L != var5 && !JagexCache.method3599(var5); // L: 6188
			if (var11) { // L: 6190
				var10 = var4;
			}

			int[] var12 = InterfaceParent.sceneMinimapSprite.pixels; // L: 6191
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6192
			var14 = class318.Entity_unpackID(var5); // L: 6193
			ObjectComposition var15 = Language.getObjectDefinition(var14); // L: 6194
			if (var15.mapSceneId != -1) { // L: 6195
				IndexedSprite var16 = class47.mapSceneSprites[var15.mapSceneId]; // L: 6196
				if (var16 != null) { // L: 6197
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 6198
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 6199
					var16.drawAt(var1 * 4 + var17 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48); // L: 6200
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6204
					if (var8 == 0) { // L: 6205
						var12[var13] = var10; // L: 6206
						var12[var13 + 512] = var10; // L: 6207
						var12[var13 + 1024] = var10; // L: 6208
						var12[var13 + 1536] = var10; // L: 6209
					} else if (var8 == 1) { // L: 6211
						var12[var13] = var10; // L: 6212
						var12[var13 + 1] = var10; // L: 6213
						var12[var13 + 2] = var10; // L: 6214
						var12[var13 + 3] = var10; // L: 6215
					} else if (var8 == 2) { // L: 6217
						var12[var13 + 3] = var10; // L: 6218
						var12[var13 + 512 + 3] = var10; // L: 6219
						var12[var13 + 1024 + 3] = var10; // L: 6220
						var12[var13 + 1536 + 3] = var10; // L: 6221
					} else if (var8 == 3) { // L: 6223
						var12[var13 + 1536] = var10; // L: 6224
						var12[var13 + 1536 + 1] = var10; // L: 6225
						var12[var13 + 1536 + 2] = var10; // L: 6226
						var12[var13 + 1536 + 3] = var10; // L: 6227
					}
				}

				if (var9 == 3) { // L: 6230
					if (var8 == 0) { // L: 6231
						var12[var13] = var10;
					} else if (var8 == 1) { // L: 6232
						var12[var13 + 3] = var10;
					} else if (var8 == 2) { // L: 6233
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6234
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6236
					if (var8 == 3) { // L: 6237
						var12[var13] = var10; // L: 6238
						var12[var13 + 512] = var10; // L: 6239
						var12[var13 + 1024] = var10; // L: 6240
						var12[var13 + 1536] = var10; // L: 6241
					} else if (var8 == 0) { // L: 6243
						var12[var13] = var10; // L: 6244
						var12[var13 + 1] = var10; // L: 6245
						var12[var13 + 2] = var10; // L: 6246
						var12[var13 + 3] = var10; // L: 6247
					} else if (var8 == 1) { // L: 6249
						var12[var13 + 3] = var10; // L: 6250
						var12[var13 + 512 + 3] = var10; // L: 6251
						var12[var13 + 1024 + 3] = var10; // L: 6252
						var12[var13 + 1536 + 3] = var10; // L: 6253
					} else if (var8 == 2) { // L: 6255
						var12[var13 + 1536] = var10; // L: 6256
						var12[var13 + 1536 + 1] = var10; // L: 6257
						var12[var13 + 1536 + 2] = var10; // L: 6258
						var12[var13 + 1536 + 3] = var10; // L: 6259
					}
				}
			}
		}

		var5 = class173.scene.getGameObjectTag(var0, var1, var2); // L: 6264
		if (var5 != 0L) { // L: 6265
			var7 = class173.scene.getObjectFlags(var0, var1, var2, var5); // L: 6266
			var8 = var7 >> 6 & 3; // L: 6267
			var9 = var7 & 31; // L: 6268
			var10 = class318.Entity_unpackID(var5); // L: 6269
			ObjectComposition var19 = Language.getObjectDefinition(var10); // L: 6270
			if (var19.mapSceneId != -1) { // L: 6271
				IndexedSprite var26 = class47.mapSceneSprites[var19.mapSceneId]; // L: 6272
				if (var26 != null) { // L: 6273
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2; // L: 6274
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2; // L: 6275
					var26.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var19.sizeY) * 4 + var14 + 48); // L: 6276
				}
			} else if (var9 == 9) { // L: 6279
				int var20 = 15658734; // L: 6280
				boolean var27 = 0L != var5 && !JagexCache.method3599(var5); // L: 6283
				if (var27) { // L: 6285
					var20 = 15597568;
				}

				int[] var21 = InterfaceParent.sceneMinimapSprite.pixels; // L: 6286
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6287
				if (var8 != 0 && var8 != 2) { // L: 6288
					var21[var22] = var20; // L: 6295
					var21[var22 + 1 + 512] = var20; // L: 6296
					var21[var22 + 1024 + 2] = var20; // L: 6297
					var21[var22 + 1536 + 3] = var20; // L: 6298
				} else {
					var21[var22 + 1536] = var20; // L: 6289
					var21[var22 + 1 + 1024] = var20; // L: 6290
					var21[var22 + 512 + 2] = var20; // L: 6291
					var21[var22 + 3] = var20; // L: 6292
				}
			}
		}

		var5 = class173.scene.getGroundObjectTag(var0, var1, var2); // L: 6302
		if (0L != var5) { // L: 6303
			var7 = class318.Entity_unpackID(var5); // L: 6304
			ObjectComposition var23 = Language.getObjectDefinition(var7); // L: 6305
			if (var23.mapSceneId != -1) { // L: 6306
				IndexedSprite var24 = class47.mapSceneSprites[var23.mapSceneId]; // L: 6307
				if (var24 != null) { // L: 6308
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 6309
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 6310
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var25 + 48); // L: 6311
				}
			}
		}

	} // L: 6315
}
