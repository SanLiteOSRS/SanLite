import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;I)I",
		garbageValue = "584410763"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "42"
	)
	static String method2879() {
		String var0;
		if (class10.clientPreferences.method2472()) { // L: 299
			String var2 = Login.Login_username; // L: 301
			String var1 = GrandExchangeOfferAgeComparator.method6832('*', var2.length()); // L: 303
			var0 = var1; // L: 305
		} else {
			var0 = Login.Login_username; // L: 307
		}

		return var0; // L: 308
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class36.scene.getWallObjectTag(var0, var1, var2); // L: 6254
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 6255
			var7 = class36.scene.getObjectFlags(var0, var1, var2, var5); // L: 6256
			var8 = var7 >> 6 & 3; // L: 6257
			var9 = var7 & 31; // L: 6258
			var10 = var3; // L: 6259
			if (GameEngine.method563(var5)) { // L: 6260
				var10 = var4;
			}

			int[] var11 = class33.sceneMinimapSprite.pixels; // L: 6261
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6262
			var13 = class215.Entity_unpackID(var5); // L: 6263
			ObjectComposition var14 = class175.getObjectDefinition(var13); // L: 6264
			if (var14.mapSceneId != -1) { // L: 6265
				IndexedSprite var15 = class47.mapSceneSprites[var14.mapSceneId]; // L: 6266
				if (var15 != null) { // L: 6267
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6268
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6269
					var15.drawAt(var1 * 4 + var16 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48); // L: 6270
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6274
					if (var8 == 0) { // L: 6275
						var11[var12] = var10; // L: 6276
						var11[var12 + 512] = var10; // L: 6277
						var11[var12 + 1024] = var10; // L: 6278
						var11[var12 + 1536] = var10; // L: 6279
					} else if (var8 == 1) { // L: 6281
						var11[var12] = var10; // L: 6282
						var11[var12 + 1] = var10; // L: 6283
						var11[var12 + 2] = var10; // L: 6284
						var11[var12 + 3] = var10; // L: 6285
					} else if (var8 == 2) { // L: 6287
						var11[var12 + 3] = var10; // L: 6288
						var11[var12 + 512 + 3] = var10; // L: 6289
						var11[var12 + 1024 + 3] = var10; // L: 6290
						var11[var12 + 1536 + 3] = var10; // L: 6291
					} else if (var8 == 3) { // L: 6293
						var11[var12 + 1536] = var10; // L: 6294
						var11[var12 + 1536 + 1] = var10; // L: 6295
						var11[var12 + 1536 + 2] = var10; // L: 6296
						var11[var12 + 1536 + 3] = var10; // L: 6297
					}
				}

				if (var9 == 3) { // L: 6300
					if (var8 == 0) { // L: 6301
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6302
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6303
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6304
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6306
					if (var8 == 3) { // L: 6307
						var11[var12] = var10; // L: 6308
						var11[var12 + 512] = var10; // L: 6309
						var11[var12 + 1024] = var10; // L: 6310
						var11[var12 + 1536] = var10; // L: 6311
					} else if (var8 == 0) { // L: 6313
						var11[var12] = var10; // L: 6314
						var11[var12 + 1] = var10; // L: 6315
						var11[var12 + 2] = var10; // L: 6316
						var11[var12 + 3] = var10; // L: 6317
					} else if (var8 == 1) { // L: 6319
						var11[var12 + 3] = var10; // L: 6320
						var11[var12 + 512 + 3] = var10; // L: 6321
						var11[var12 + 1024 + 3] = var10; // L: 6322
						var11[var12 + 1536 + 3] = var10; // L: 6323
					} else if (var8 == 2) { // L: 6325
						var11[var12 + 1536] = var10; // L: 6326
						var11[var12 + 1536 + 1] = var10; // L: 6327
						var11[var12 + 1536 + 2] = var10; // L: 6328
						var11[var12 + 1536 + 3] = var10; // L: 6329
					}
				}
			}
		}

		var5 = class36.scene.getGameObjectTag(var0, var1, var2); // L: 6334
		if (0L != var5) { // L: 6335
			var7 = class36.scene.getObjectFlags(var0, var1, var2, var5); // L: 6336
			var8 = var7 >> 6 & 3; // L: 6337
			var9 = var7 & 31; // L: 6338
			var10 = class215.Entity_unpackID(var5); // L: 6339
			ObjectComposition var24 = class175.getObjectDefinition(var10); // L: 6340
			int var19;
			if (var24.mapSceneId != -1) { // L: 6341
				IndexedSprite var20 = class47.mapSceneSprites[var24.mapSceneId]; // L: 6342
				if (var20 != null) { // L: 6343
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6344
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6345
					var20.drawAt(var1 * 4 + var13 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48); // L: 6346
				}
			} else if (var9 == 9) { // L: 6349
				var12 = 15658734; // L: 6350
				if (GameEngine.method563(var5)) { // L: 6351
					var12 = 15597568;
				}

				int[] var18 = class33.sceneMinimapSprite.pixels; // L: 6352
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6353
				if (var8 != 0 && var8 != 2) { // L: 6354
					var18[var19] = var12; // L: 6361
					var18[var19 + 1 + 512] = var12; // L: 6362
					var18[var19 + 1024 + 2] = var12; // L: 6363
					var18[var19 + 1536 + 3] = var12; // L: 6364
				} else {
					var18[var19 + 1536] = var12; // L: 6355
					var18[var19 + 1 + 1024] = var12; // L: 6356
					var18[var19 + 512 + 2] = var12; // L: 6357
					var18[var19 + 3] = var12; // L: 6358
				}
			}
		}

		var5 = class36.scene.getGroundObjectTag(var0, var1, var2); // L: 6368
		if (0L != var5) { // L: 6369
			var7 = class215.Entity_unpackID(var5); // L: 6370
			ObjectComposition var21 = class175.getObjectDefinition(var7); // L: 6371
			if (var21.mapSceneId != -1) { // L: 6372
				IndexedSprite var22 = class47.mapSceneSprites[var21.mapSceneId]; // L: 6373
				if (var22 != null) { // L: 6374
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6375
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6376
					var22.drawAt(var1 * 4 + var10 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 6377
				}
			}
		}

	} // L: 6381

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lmb;III)V",
		garbageValue = "993209306"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11920
			if (var0 != null) { // L: 11922
				Widget var5 = var0; // L: 11926
				int var6 = Interpreter.method1961(StudioGame.getWidgetFlags(var0)); // L: 11928
				Widget var4;
				int var7;
				if (var6 == 0) { // L: 11929
					var4 = null; // L: 11930
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5; // L: 11940
							break;
						}

						var5 = FriendSystem.getWidget(var5.parentId); // L: 11934
						if (var5 == null) { // L: 11935
							var4 = null; // L: 11936
							break; // L: 11937
						}

						++var7; // L: 11933
					}
				}

				Widget var8 = var4; // L: 11942
				if (var4 == null) { // L: 11943
					var8 = var0.parent;
				}

				if (var8 != null) { // L: 11946
					Client.clickedWidget = var0; // L: 11950
					var5 = var0; // L: 11954
					var6 = Interpreter.method1961(StudioGame.getWidgetFlags(var0)); // L: 11956
					if (var6 == 0) { // L: 11957
						var4 = null; // L: 11958
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5; // L: 11968
								break;
							}

							var5 = FriendSystem.getWidget(var5.parentId); // L: 11962
							if (var5 == null) { // L: 11963
								var4 = null; // L: 11964
								break; // L: 11965
							}

							++var7; // L: 11961
						}
					}

					var8 = var4; // L: 11970
					if (var4 == null) { // L: 11971
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8; // L: 11974
					Client.widgetClickX = var1; // L: 11975
					Client.widgetClickY = var2; // L: 11976
					class348.widgetDragDuration = 0; // L: 11977
					Client.isDraggingWidget = false; // L: 11978
					int var9 = class132.method3034(); // L: 11979
					if (var9 != -1) { // L: 11980
						VerticalAlignment.method3751(var9);
					}

					return; // L: 11981
				}
			}

		}
	} // L: 11948
}
