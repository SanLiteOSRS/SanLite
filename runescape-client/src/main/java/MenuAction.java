import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 111037751
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1776571377
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1823377325
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 163193161
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -292471689
	)
	int field912;
	@ObfuscatedName("aj")
	String field913;
	@ObfuscatedName("ag")
	String field911;

	MenuAction() {
	} // L: 13001

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfg;",
		garbageValue = "-994330440"
	)
	static class132[] method2085() {
		return new class132[]{class132.field1575, class132.field1571, class132.field1572, class132.field1573, class132.field1582, class132.field1584, class132.field1570, class132.field1577, class132.field1578, class132.field1579, class132.field1580, class132.field1586, class132.field1576, class132.field1583, class132.field1581, class132.field1585, class132.field1592}; // L: 64
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "4"
	)
	static int method2084(int var0, Script var1, boolean var2) {
		return 2; // L: 5280
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1834048836"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class508.method9006(); // L: 12302
		class19.method277(); // L: 12303
		int var1 = class158.VarpDefinition_get(var0).type; // L: 12304
		if (var1 != 0) { // L: 12305
			int var2 = Varps.Varps_main[var0]; // L: 12306
			if (var1 == 1) { // L: 12307
				if (var2 == 1) { // L: 12308
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 12309
					((TextureProvider)Rasterizer3D.field2510.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 12310
					HealthBar.method2579(); // L: 12311
					class150.clientPreferences.method2475(0.9D); // L: 12312
				}

				if (var2 == 2) { // L: 12314
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 12315
					((TextureProvider)Rasterizer3D.field2510.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 12316
					HealthBar.method2579(); // L: 12317
					class150.clientPreferences.method2475(0.8D); // L: 12318
				}

				if (var2 == 3) { // L: 12320
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 12321
					((TextureProvider)Rasterizer3D.field2510.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 12322
					HealthBar.method2579(); // L: 12323
					class150.clientPreferences.method2475(0.7D); // L: 12324
				}

				if (var2 == 4) { // L: 12326
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 12327
					((TextureProvider)Rasterizer3D.field2510.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 12328
					HealthBar.method2579(); // L: 12329
					class150.clientPreferences.method2475(0.6D); // L: 12330
				}
			}

			if (var1 == 3) { // L: 12333
				if (var2 == 0) { // L: 12334
					StudioGame.method6652(255);
				}

				if (var2 == 1) { // L: 12335
					StudioGame.method6652(192);
				}

				if (var2 == 2) { // L: 12336
					StudioGame.method6652(128);
				}

				if (var2 == 3) { // L: 12337
					StudioGame.method6652(64);
				}

				if (var2 == 4) { // L: 12338
					StudioGame.method6652(0);
				}
			}

			if (var1 == 4) { // L: 12340
				if (var2 == 0) { // L: 12341
					FriendsChatMember.method7938(127);
				}

				if (var2 == 1) { // L: 12342
					FriendsChatMember.method7938(96);
				}

				if (var2 == 2) { // L: 12343
					FriendsChatMember.method7938(64);
				}

				if (var2 == 3) { // L: 12344
					FriendsChatMember.method7938(32);
				}

				if (var2 == 4) { // L: 12345
					FriendsChatMember.method7938(0);
				}
			}

			if (var1 == 5) { // L: 12347
				Client.field659 = var2 == 1;
			}

			if (var1 == 6) { // L: 12348
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 12349
			}

			if (var1 == 10) { // L: 12350
				if (var2 == 0) { // L: 12351
					Interpreter.method1966(127);
				}

				if (var2 == 1) { // L: 12352
					Interpreter.method1966(96);
				}

				if (var2 == 2) { // L: 12353
					Interpreter.method1966(64);
				}

				if (var2 == 3) { // L: 12354
					Interpreter.method1966(32);
				}

				if (var2 == 4) { // L: 12355
					Interpreter.method1966(0);
				}
			}

			if (var1 == 17) { // L: 12357
				Client.followerIndex = var2 & 65535; // L: 12358
			}

			if (var1 == 18) { // L: 12360
				Client.playerAttackOption = (AttackOption)ClientPreferences.findEnumerated(ItemLayer.method4293(), var2); // L: 12361
				if (Client.playerAttackOption == null) { // L: 12362
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12364
				if (var2 == -1) { // L: 12365
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12366
				}
			}

			if (var1 == 22) { // L: 12368
				Client.npcAttackOption = (AttackOption)ClientPreferences.findEnumerated(ItemLayer.method4293(), var2); // L: 12369
				if (Client.npcAttackOption == null) { // L: 12370
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12372
}
