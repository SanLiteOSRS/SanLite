import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class27 extends class14 {
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "Lij;"
	)
	static StudioGame field208;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -455433791
	)
	int field209;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class27(class2 var1) {
		this.this$0 = var1;
		this.field209 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field209 = var1.readUnsignedShort();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method190(this.field209);
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "190996497"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "862148066"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class105.method2255();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var4 = class303.VarpDefinition_get(var0).type;
		if (var4 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var4 == 1) {
				if (var2 == 1) {
					MouseRecorder.method2109(0.9D);
				}

				if (var2 == 2) {
					MouseRecorder.method2109(0.8D);
				}

				if (var2 == 3) {
					MouseRecorder.method2109(0.7D);
				}

				if (var2 == 4) {
					MouseRecorder.method2109(0.6D);
				}
			}

			if (var4 == 3) {
				if (var2 == 0) {
					Messages.method2367(255);
				}

				if (var2 == 1) {
					Messages.method2367(192);
				}

				if (var2 == 2) {
					Messages.method2367(128);
				}

				if (var2 == 3) {
					Messages.method2367(64);
				}

				if (var2 == 4) {
					Messages.method2367(0);
				}
			}

			if (var4 == 4) {
				if (var2 == 0) {
					Canvas.method478(127);
				}

				if (var2 == 1) {
					Canvas.method478(96);
				}

				if (var2 == 2) {
					Canvas.method478(64);
				}

				if (var2 == 3) {
					Canvas.method478(32);
				}

				if (var2 == 4) {
					Canvas.method478(0);
				}
			}

			if (var4 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var4 == 6) {
				Client.chatEffects = var2;
			}

			if (var4 == 9) {
				Client.field767 = var2;
			}

			if (var4 == 10) {
				if (var2 == 0) {
					MusicPatchPcmStream.method4126(127);
				}

				if (var2 == 1) {
					MusicPatchPcmStream.method4126(96);
				}

				if (var2 == 2) {
					MusicPatchPcmStream.method4126(64);
				}

				if (var2 == 3) {
					MusicPatchPcmStream.method4126(32);
				}

				if (var2 == 4) {
					MusicPatchPcmStream.method4126(0);
				}
			}

			if (var4 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var4 == 18) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1336, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick};
				Client.playerAttackOption = (AttackOption)UserComparator8.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var4 == 22) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1336, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick};
				Client.npcAttackOption = (AttackOption)UserComparator8.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
