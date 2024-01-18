import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class113 extends UrlRequester {
	@ObfuscatedName("ao")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 2003804321
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("aq")
	final boolean field1431;

	public class113(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1431 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)V",
		garbageValue = "-630521525"
	)
	void vmethod2905(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label131: {
			label125: {
				try {
					label115: {
						var9 = true; // L: 21
						String var3 = var1.field1440.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2913(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1436 = UrlRequest.field1435; // L: 29
								var9 = false;
								break label115;
							}

							var2 = this.method2904(var1); // L: 26
						}

						this.method2878(var2, var1); // L: 32
						var9 = false;
						break label131;
					}
				} catch (IOException var10) { // L: 34
					var1.field1436 = UrlRequest.field1435; // L: 35
					var9 = false;
					break label125;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) { // L: 38
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return; // L: 30
			}

			if (var2 != null && var2 instanceof HttpURLConnection) { // L: 39
				var12 = (HttpURLConnection)var2; // L: 40
				var12.disconnect(); // L: 41
			}

			return; // L: 45
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Ljava/net/URLConnection;",
		garbageValue = "2121934963"
	)
	URLConnection method2913(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1440.openConnection(); // L: 48
		this.method2877(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Ljava/net/URLConnection;",
		garbageValue = "-1382211858"
	)
	URLConnection method2904(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1440.openConnection(); // L: 54
		if (!this.field1431) { // L: 55
			var2.setSSLSocketFactory(class15.method208()); // L: 56
		}

		this.method2877(var2);
		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Ldd;",
		garbageValue = "-149009670"
	)
	static Script method2914(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2; // L: 59
		} else {
			String var3 = String.valueOf(var0); // L: 61
			int var4 = WorldMapDecorationType.archive12.getGroupId(var3); // L: 62
			if (var4 == -1) {
				return null; // L: 64
			} else {
				byte[] var5 = WorldMapDecorationType.archive12.takeFileFlat(var4); // L: 66
				if (var5 != null) { // L: 67
					if (var5.length <= 1) { // L: 68
						return null; // L: 69
					}

					var2 = class90.newScript(var5); // L: 71
					if (var2 != null) { // L: 72
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 73
						return var2; // L: 74
					}
				}

				return null; // L: 77
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1145814280"
	)
	static void method2916() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromFriend(); // L: 60
		}

	} // L: 63

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1427712263"
	)
	static boolean method2915() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5151
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIII)V",
		garbageValue = "65561455"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		WorldMapRectangle.method5020(); // L: 12326
		SpriteMask var4 = var0.method6745(class380.field4414, false); // L: 12327
		if (var4 != null) { // L: 12328
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12329
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12330
				int var5 = Client.camAngleY & 2047; // L: 12331
				int var6 = class25.localPlayer.x / 32 + 48; // L: 12332
				int var7 = 464 - class25.localPlayer.y / 32; // L: 12333
				class482.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12334

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12335
					var16 = Client.mapIconXs[var8] * 4 + 2 - class25.localPlayer.x / 32; // L: 12336
					var10 = Client.mapIconYs[var8] * 4 + 2 - class25.localPlayer.y / 32; // L: 12337
					TileItem.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12338
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12340
					for (var16 = 0; var16 < 104; ++var16) { // L: 12341
						NodeDeque var14 = Client.groundItems[Client_plane][var8][var16]; // L: 12342
						if (var14 != null) { // L: 12343
							var11 = var8 * 4 + 2 - class25.localPlayer.x / 32; // L: 12344
							var12 = var16 * 4 + 2 - class25.localPlayer.y / 32; // L: 12345
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, class142.field1634[0], var4); // L: 12346
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12350
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12351
					if (var9 != null && var9.isVisible()) { // L: 12352
						NPCComposition var18 = var9.definition; // L: 12353
						if (var18 != null && var18.transforms != null) { // L: 12354
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12355
							var11 = var9.x / 32 - class25.localPlayer.x / 32; // L: 12356
							var12 = var9.y / 32 - class25.localPlayer.y / 32; // L: 12357
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, class142.field1634[1], var4); // L: 12358
						}
					}
				}

				var8 = Players.Players_count; // L: 12362
				int[] var17 = Players.Players_indices; // L: 12363

				for (var10 = 0; var10 < var8; ++var10) { // L: 12364
					Player var15 = Client.players[var17[var10]]; // L: 12365
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class25.localPlayer) { // L: 12366
						var12 = var15.x / 32 - class25.localPlayer.x / 32; // L: 12367
						int var13 = var15.y / 32 - class25.localPlayer.y / 32; // L: 12368
						if (var15.method2388()) { // L: 12369
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[3], var4);
						} else if (class25.localPlayer.team != 0 && var15.team != 0 && var15.team == class25.localPlayer.team) { // L: 12370
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[4], var4);
						} else if (var15.method2391()) { // L: 12371
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[5], var4);
						} else if (var15.isClanMember()) { // L: 12372
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[6], var4);
						} else {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[2], var4); // L: 12373
						}
					}
				}

				if (Client.field513 != 0 && Client.cycle % 20 < 10) { // L: 12376
					if (Client.field513 == 1 && Client.field508 >= 0 && Client.field508 < Client.npcs.length) { // L: 12377
						NPC var19 = Client.npcs[Client.field508]; // L: 12378
						if (var19 != null) { // L: 12379
							var11 = var19.x / 32 - class25.localPlayer.x / 32; // L: 12380
							var12 = var19.y / 32 - class25.localPlayer.y / 32; // L: 12381
							class341.worldToMinimap(var1, var2, var11, var12, class365.field3973[1], var4); // L: 12382
						}
					}

					if (Client.field513 == 2) { // L: 12385
						var10 = Client.field525 * 4 - HealthBarDefinition.baseX * 256 + 2 - class25.localPlayer.x / 32; // L: 12386
						var11 = Client.field613 * 4 - WorldMapScaleHandler.baseY * 256 + 2 - class25.localPlayer.y / 32; // L: 12387
						class341.worldToMinimap(var1, var2, var10, var11, class365.field3973[1], var4); // L: 12388
					}

					if (Client.field513 == 10 && Client.field519 >= 0 && Client.field519 < Client.players.length) { // L: 12390
						Player var20 = Client.players[Client.field519]; // L: 12391
						if (var20 != null) { // L: 12392
							var11 = var20.x / 32 - class25.localPlayer.x / 32; // L: 12393
							var12 = var20.y / 32 - class25.localPlayer.y / 32; // L: 12394
							class341.worldToMinimap(var1, var2, var11, var12, class365.field3973[1], var4); // L: 12395
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12399
					var10 = Client.destinationX * 4 + 2 - class25.localPlayer.x / 32; // L: 12400
					var11 = Client.destinationY * 4 + 2 - class25.localPlayer.y / 32; // L: 12401
					TileItem.drawSpriteOnMinimap(var1, var2, var10, var11, class365.field3973[0], var4); // L: 12402
				}

				if (!class25.localPlayer.isHidden) { // L: 12404
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12406
			}

			Client.field663[var3] = true; // L: 12407
		}
	} // L: 12408
}
