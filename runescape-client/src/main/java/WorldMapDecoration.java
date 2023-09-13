import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -152771529
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1156952409
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1761099397
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)I",
		garbageValue = "1522435265"
	)
	static int method5480(Widget var0) {
		if (var0.type != 11) { // L: 1551
			--class137.Interpreter_stringStackSize; // L: 1552
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 1553
			return 1; // L: 1554
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1556
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var0.method6406(var1); // L: 1557
			return 1; // L: 1558
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class113.method2843(); // L: 12285

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 12287
			if (var1.obj != null) { // L: 12288
				var1.set();
			}
		}

		int var3 = ApproximateRouteStrategy.VarpDefinition_get(var0).type; // L: 12291
		if (var3 != 0) { // L: 12292
			int var2 = Varps.Varps_main[var0]; // L: 12293
			if (var3 == 1) { // L: 12294
				if (var2 == 1) { // L: 12295
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 12296
					((TextureProvider)Rasterizer3D.field2536.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 12297
					UrlRequester.method2832(); // L: 12298
					class449.clientPreferences.method2516(0.9D); // L: 12299
				}

				if (var2 == 2) { // L: 12301
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 12302
					((TextureProvider)Rasterizer3D.field2536.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 12303
					UrlRequester.method2832(); // L: 12304
					class449.clientPreferences.method2516(0.8D); // L: 12305
				}

				if (var2 == 3) { // L: 12307
					HealthBarUpdate.method2410(0.7D);
				}

				if (var2 == 4) { // L: 12308
					HealthBarUpdate.method2410(0.6D);
				}
			}

			if (var3 == 3) { // L: 12310
				if (var2 == 0) { // L: 12311
					WorldMapEvent.method5628(255);
				}

				if (var2 == 1) { // L: 12312
					WorldMapEvent.method5628(192);
				}

				if (var2 == 2) { // L: 12313
					WorldMapEvent.method5628(128);
				}

				if (var2 == 3) { // L: 12314
					WorldMapEvent.method5628(64);
				}

				if (var2 == 4) { // L: 12315
					WorldMapEvent.method5628(0);
				}
			}

			if (var3 == 4) { // L: 12317
				if (var2 == 0) { // L: 12318
					class385.method7164(127);
				}

				if (var2 == 1) { // L: 12319
					class385.method7164(96);
				}

				if (var2 == 2) { // L: 12320
					class385.method7164(64);
				}

				if (var2 == 3) { // L: 12321
					class385.method7164(32);
				}

				if (var2 == 4) { // L: 12322
					class385.method7164(0);
				}
			}

			if (var3 == 5) { // L: 12324
				Client.field673 = var2 == 1;
			}

			if (var3 == 6) { // L: 12325
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 12326
			}

			if (var3 == 10) { // L: 12327
				if (var2 == 0) { // L: 12328
					class14.method161(127);
				}

				if (var2 == 1) { // L: 12329
					class14.method161(96);
				}

				if (var2 == 2) { // L: 12330
					class14.method161(64);
				}

				if (var2 == 3) { // L: 12331
					class14.method161(32);
				}

				if (var2 == 4) { // L: 12332
					class14.method161(0);
				}
			}

			if (var3 == 17) { // L: 12334
				Client.followerIndex = var2 & 65535; // L: 12335
			}

			if (var3 == 18) { // L: 12337
				Client.playerAttackOption = (AttackOption)class25.findEnumerated(class359.method6821(), var2); // L: 12338
				if (Client.playerAttackOption == null) { // L: 12339
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 12341
				if (var2 == -1) { // L: 12342
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12343
				}
			}

			if (var3 == 22) { // L: 12345
				Client.npcAttackOption = (AttackOption)class25.findEnumerated(class359.method6821(), var2); // L: 12346
				if (Client.npcAttackOption == null) { // L: 12347
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12349
}
