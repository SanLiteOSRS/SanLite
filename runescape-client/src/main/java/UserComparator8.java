import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ea")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -864785215
	)
	static int field1418;
	@ObfuscatedName("gd")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;I)I",
		garbageValue = "-1369824853"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "62977818"
	)
	public static int method2890(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "-1286212275"
	)
	static float[] method2886(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 329

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 331
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 332
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 333
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 334
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 335
		} catch (JSONException var4) { // L: 337
			var2[0] = 0.0F; // L: 338
			var2[1] = 0.0F; // L: 339
			var2[2] = 1.0F; // L: 340
			var2[3] = 1.0F; // L: 341
		}

		return var2; // L: 343
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-116"
	)
	static final void method2896() {
		if (GameEngine.Client_plane != Client.field729) { // L: 3562
			Client.field729 = GameEngine.Client_plane; // L: 3563
			int var0 = GameEngine.Client_plane; // L: 3564
			int[] var1 = UrlRequester.sceneMinimapSprite.pixels; // L: 3566
			int var2 = var1.length; // L: 3567

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 3568
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 3569
				var4 = (103 - var3) * 2048 + 24628; // L: 3570

				for (var5 = 1; var5 < 103; ++var5) { // L: 3571
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 3572
						class31.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 3573
						class31.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4; // L: 3574
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3577
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3578
			UrlRequester.sceneMinimapSprite.setRaster(); // L: 3579

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 3580
				for (var6 = 1; var6 < 103; ++var6) { // L: 3581
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 3582
						class149.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 3583
						class149.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 3586

			for (var5 = 0; var5 < 104; ++var5) { // L: 3587
				for (var6 = 0; var6 < 104; ++var6) { // L: 3588
					long var7 = class31.scene.getGroundObjectTag(GameEngine.Client_plane, var5, var6); // L: 3589
					if (var7 != 0L) { // L: 3590
						int var9 = InterfaceParent.Entity_unpackID(var7); // L: 3591
						int var10 = class144.getObjectDefinition(var9).mapIconId; // L: 3592
						if (var10 >= 0 && class354.WorldMapElement_get(var10).field1925) { // L: 3593 3594
							Client.mapIcons[Client.mapIconCount] = class354.WorldMapElement_get(var10).getSpriteBool(false); // L: 3597
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 3598
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 3599
							++Client.mapIconCount; // L: 3600
						}
					}
				}
			}

			RouteStrategy.rasterProvider.apply(); // L: 3605
		}

	} // L: 3608
}
