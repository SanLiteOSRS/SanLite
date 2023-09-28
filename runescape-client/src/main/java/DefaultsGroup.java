import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static final DefaultsGroup field4747;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1604849899
	)
	@Export("group")
	final int group;

	static {
		field4747 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhj;",
		garbageValue = "-1"
	)
	public static HealthBarDefinition method8264(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.NpcDefinition_cachedModels.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			var1.field1982 = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2)); // L: 38
			}

			HealthBarDefinition.NpcDefinition_cachedModels.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1882017485"
	)
	static void method8263(int var0) {
		if (var0 != Client.gameState) { // L: 1258
			if (Client.gameState == 30) { // L: 1259
				Client.field756.method4232(); // L: 1260
			}

			if (Client.gameState == 0) { // L: 1262
				class159.client.method514();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1263
				class409.method7554(0); // L: 1264
				Client.field555 = 0; // L: 1265
				Client.field732 = 0; // L: 1266
				Client.timer.method7833(var0); // L: 1267
				if (var0 != 20) { // L: 1268
					UserComparator6.method2942(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class11.field59 != null) { // L: 1270 1271
				class11.field59.close(); // L: 1272
				class11.field59 = null; // L: 1273
			}

			if (Client.gameState == 25) { // L: 1276
				Client.field545 = 0; // L: 1277
				Client.field588 = 0; // L: 1278
				Client.field589 = 1; // L: 1279
				Client.field590 = 0; // L: 1280
				Client.field591 = 1; // L: 1281
			}

			if (var0 != 5 && var0 != 10) { // L: 1283
				if (var0 == 20) { // L: 1291
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1292
					ScriptEvent.method2328(class190.field1916, class199.field2010, false, var3); // L: 1293
				} else if (var0 == 11) { // L: 1295
					ScriptEvent.method2328(class190.field1916, class199.field2010, false, 4); // L: 1296
				} else if (var0 == 50) { // L: 1298
					AbstractWorldMapIcon.setLoginResponseString("", "Updating date of birth...", ""); // L: 1299
					ScriptEvent.method2328(class190.field1916, class199.field2010, false, 7); // L: 1300
				} else if (Login.clearLoginScreen) { // L: 1303
					Login.titleboxSprite = null; // L: 1304
					VarcInt.field1964 = null; // L: 1305
					Login.field948 = null; // L: 1306
					PcmPlayer.leftTitleSprite = null; // L: 1307
					Login.rightTitleSprite = null; // L: 1308
					Login.logoSprite = null; // L: 1309
					Login.title_muteSprite = null; // L: 1310
					class519.field5077 = null; // L: 1311
					class534.field5198 = null; // L: 1312
					SecureRandomCallable.worldSelectBackSprites = null; // L: 1313
					PendingSpawn.worldSelectFlagSprites = null; // L: 1314
					ModelData0.worldSelectArrows = null; // L: 1315
					TaskHandler.worldSelectStars = null; // L: 1316
					Varcs.field1405 = null; // L: 1317
					class544.loginScreenRunesAnimation.method2464(); // L: 1318
					ItemComposition.method4136(0, 100); // L: 1319
					class13.method167().method7000(true); // L: 1320
					Login.clearLoginScreen = false; // L: 1321
				}
			} else {
				boolean var1 = class91.clientPreferences.method2562() >= Client.field717; // L: 1286
				int var2 = var1 ? 0 : 12; // L: 1288
				ScriptEvent.method2328(class190.field1916, class199.field2010, true, var2); // L: 1289
			}

			Client.gameState = var0; // L: 1323
		}
	} // L: 1324
}
