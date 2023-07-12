import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class393 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1829488267
	)
	static int field4436;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1441168841
	)
	int field4437;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class393(int var1, boolean var2) {
		this.field4437 = var1; // L: 7
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2065900127"
	)
	public int method7412() {
		return this.field4437; // L: 11
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-26"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		PlatformInfo.method8310(); // L: 12250
		TileItem.method2662(); // L: 12251
		int var1 = class100.VarpDefinition_get(var0).type; // L: 12252
		if (var1 != 0) { // L: 12253
			int var2 = Varps.Varps_main[var0]; // L: 12254
			if (var1 == 1) { // L: 12255
				if (var2 == 1) { // L: 12256
					class392.method7411(0.9D);
				}

				if (var2 == 2) { // L: 12257
					class392.method7411(0.8D);
				}

				if (var2 == 3) { // L: 12258
					class392.method7411(0.7D);
				}

				if (var2 == 4) { // L: 12259
					class392.method7411(0.6D);
				}
			}

			if (var1 == 3) { // L: 12261
				if (var2 == 0) { // L: 12262
					class209.method4117(255);
				}

				if (var2 == 1) { // L: 12263
					class209.method4117(192);
				}

				if (var2 == 2) { // L: 12264
					class209.method4117(128);
				}

				if (var2 == 3) { // L: 12265
					class209.method4117(64);
				}

				if (var2 == 4) { // L: 12266
					class209.method4117(0);
				}
			}

			if (var1 == 4) { // L: 12268
				if (var2 == 0) { // L: 12269
					ClanChannelMember.method3136(127);
				}

				if (var2 == 1) { // L: 12270
					ClanChannelMember.method3136(96);
				}

				if (var2 == 2) { // L: 12271
					ClanChannelMember.method3136(64);
				}

				if (var2 == 3) { // L: 12272
					ClanChannelMember.method3136(32);
				}

				if (var2 == 4) { // L: 12273
					ClanChannelMember.method3136(0);
				}
			}

			if (var1 == 5) { // L: 12275
				Client.field648 = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2; // L: 12276
			}

			if (var1 == 9) { // L: 12277
			}

			if (var1 == 10) { // L: 12278
				if (var2 == 0) { // L: 12279
					class134.method3041(127);
				}

				if (var2 == 1) { // L: 12280
					class134.method3041(96);
				}

				if (var2 == 2) { // L: 12281
					class134.method3041(64);
				}

				if (var2 == 3) { // L: 12282
					class134.method3041(32);
				}

				if (var2 == 4) { // L: 12283
					class134.method3041(0);
				}
			}

			if (var1 == 17) { // L: 12285
				Client.followerIndex = var2 & 65535; // L: 12286
			}

			if (var1 == 18) { // L: 12288
				Client.playerAttackOption = (AttackOption)GameObject.findEnumerated(class404.method7634(), var2); // L: 12289
				if (Client.playerAttackOption == null) { // L: 12290
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12292
				if (var2 == -1) { // L: 12293
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12294
				}
			}

			if (var1 == 22) { // L: 12296
				Client.npcAttackOption = (AttackOption)GameObject.findEnumerated(class404.method7634(), var2); // L: 12297
				if (Client.npcAttackOption == null) { // L: 12298
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12300
}
