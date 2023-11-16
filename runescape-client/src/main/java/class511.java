import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
final class class511 implements class510 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luj;B)V",
		garbageValue = "-42"
	)
	public void vmethod9135(Object var1, Buffer var2) {
		this.method9091((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)Ljava/lang/Object;",
		garbageValue = "-69"
	)
	public Object vmethod9141(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Luj;I)V",
		garbageValue = "-1691146966"
	)
	void method9091(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-83"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class36.scene.getWallObjectTag(var0, var1, var2); // L: 6146
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 6147
			var7 = class36.scene.getObjectFlags(var0, var1, var2, var5); // L: 6148
			var8 = var7 >> 6 & 3; // L: 6149
			var9 = var7 & 31; // L: 6150
			var10 = var3; // L: 6151
			if (class207.method4113(var5)) { // L: 6152
				var10 = var4;
			}

			int[] var11 = class102.sceneMinimapSprite.pixels; // L: 6153
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6154
			var13 = class232.Entity_unpackID(var5); // L: 6155
			ObjectComposition var14 = WorldMapSection2.getObjectDefinition(var13); // L: 6156
			if (var14.mapSceneId != -1) { // L: 6157
				IndexedSprite var15 = VarpDefinition.mapSceneSprites[var14.mapSceneId]; // L: 6158
				if (var15 != null) { // L: 6159
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6160
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6161
					var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 6162
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6166
					if (var8 == 0) { // L: 6167
						var11[var12] = var10; // L: 6168
						var11[var12 + 512] = var10; // L: 6169
						var11[var12 + 1024] = var10; // L: 6170
						var11[var12 + 1536] = var10; // L: 6171
					} else if (var8 == 1) { // L: 6173
						var11[var12] = var10; // L: 6174
						var11[var12 + 1] = var10; // L: 6175
						var11[var12 + 2] = var10; // L: 6176
						var11[var12 + 3] = var10; // L: 6177
					} else if (var8 == 2) { // L: 6179
						var11[var12 + 3] = var10; // L: 6180
						var11[var12 + 512 + 3] = var10; // L: 6181
						var11[var12 + 1024 + 3] = var10; // L: 6182
						var11[var12 + 1536 + 3] = var10; // L: 6183
					} else if (var8 == 3) { // L: 6185
						var11[var12 + 1536] = var10; // L: 6186
						var11[var12 + 1536 + 1] = var10; // L: 6187
						var11[var12 + 1536 + 2] = var10; // L: 6188
						var11[var12 + 1536 + 3] = var10; // L: 6189
					}
				}

				if (var9 == 3) { // L: 6192
					if (var8 == 0) { // L: 6193
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6194
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6195
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6196
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6198
					if (var8 == 3) { // L: 6199
						var11[var12] = var10; // L: 6200
						var11[var12 + 512] = var10; // L: 6201
						var11[var12 + 1024] = var10; // L: 6202
						var11[var12 + 1536] = var10; // L: 6203
					} else if (var8 == 0) { // L: 6205
						var11[var12] = var10; // L: 6206
						var11[var12 + 1] = var10; // L: 6207
						var11[var12 + 2] = var10; // L: 6208
						var11[var12 + 3] = var10; // L: 6209
					} else if (var8 == 1) { // L: 6211
						var11[var12 + 3] = var10; // L: 6212
						var11[var12 + 512 + 3] = var10; // L: 6213
						var11[var12 + 1024 + 3] = var10; // L: 6214
						var11[var12 + 1536 + 3] = var10; // L: 6215
					} else if (var8 == 2) { // L: 6217
						var11[var12 + 1536] = var10; // L: 6218
						var11[var12 + 1536 + 1] = var10; // L: 6219
						var11[var12 + 1536 + 2] = var10; // L: 6220
						var11[var12 + 1536 + 3] = var10; // L: 6221
					}
				}
			}
		}

		var5 = class36.scene.getGameObjectTag(var0, var1, var2); // L: 6226
		if (var5 != 0L) { // L: 6227
			var7 = class36.scene.getObjectFlags(var0, var1, var2, var5); // L: 6228
			var8 = var7 >> 6 & 3; // L: 6229
			var9 = var7 & 31; // L: 6230
			var10 = class232.Entity_unpackID(var5); // L: 6231
			ObjectComposition var24 = WorldMapSection2.getObjectDefinition(var10); // L: 6232
			int var19;
			if (var24.mapSceneId != -1) { // L: 6233
				IndexedSprite var20 = VarpDefinition.mapSceneSprites[var24.mapSceneId]; // L: 6234
				if (var20 != null) { // L: 6235
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6236
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6237
					var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6238
				}
			} else if (var9 == 9) { // L: 6241
				var12 = 15658734; // L: 6242
				if (class207.method4113(var5)) { // L: 6243
					var12 = 15597568;
				}

				int[] var18 = class102.sceneMinimapSprite.pixels; // L: 6244
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6245
				if (var8 != 0 && var8 != 2) { // L: 6246
					var18[var19] = var12; // L: 6253
					var18[var19 + 1 + 512] = var12; // L: 6254
					var18[var19 + 1024 + 2] = var12; // L: 6255
					var18[var19 + 1536 + 3] = var12; // L: 6256
				} else {
					var18[var19 + 1536] = var12; // L: 6247
					var18[var19 + 1 + 1024] = var12; // L: 6248
					var18[var19 + 512 + 2] = var12; // L: 6249
					var18[var19 + 3] = var12; // L: 6250
				}
			}
		}

		var5 = class36.scene.getGroundObjectTag(var0, var1, var2); // L: 6260
		if (var5 != 0L) { // L: 6261
			var7 = class232.Entity_unpackID(var5); // L: 6262
			ObjectComposition var21 = WorldMapSection2.getObjectDefinition(var7); // L: 6263
			if (var21.mapSceneId != -1) { // L: 6264
				IndexedSprite var22 = VarpDefinition.mapSceneSprites[var21.mapSceneId]; // L: 6265
				if (var22 != null) { // L: 6266
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6267
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6268
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6269
				}
			}
		}

	} // L: 6273
}
