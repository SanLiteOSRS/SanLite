import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class6 extends class14 {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -753176319
	)
	int field47;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 239857617
	)
	int field45;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class6(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field47 = var1.readInt();
		this.field45 = var1.readInt();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method188(this.field47, this.field45);
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-719237513"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field862) {
			Decimator.method1169();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class4.clientPreferences.musicVolume != 0 && !Client.field862) {
			WorldMapIcon_1.playMusicTrack(2, DynamicObject.archive6, var0, 0, class4.clientPreferences.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		WorldMapID.method3717();
		Canvas.method495();
		int var1 = class1.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					UserComparator10.method2568(0.9D);
				}

				if (var2 == 2) {
					UserComparator10.method2568(0.8D);
				}

				if (var2 == 3) {
					UserComparator10.method2568(0.7D);
				}

				if (var2 == 4) {
					UserComparator10.method2568(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class0.method0(255);
				}

				if (var2 == 1) {
					class0.method0(192);
				}

				if (var2 == 2) {
					class0.method0(128);
				}

				if (var2 == 3) {
					class0.method0(64);
				}

				if (var2 == 4) {
					class0.method0(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class226.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					class226.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					class226.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					class226.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					class226.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field891 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					NPCComposition.method2882(127);
				}

				if (var2 == 1) {
					NPCComposition.method2882(96);
				}

				if (var2 == 2) {
					NPCComposition.method2882(64);
				}

				if (var2 == 3) {
					NPCComposition.method2882(32);
				}

				if (var2 == 4) {
					NPCComposition.method2882(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var1 == 18) {
				var3 = new AttackOption[]{AttackOption.field1344, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
				Client.playerAttackOption = (AttackOption)Clock.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				var3 = new AttackOption[]{AttackOption.field1344, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
				Client.npcAttackOption = (AttackOption)Clock.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
