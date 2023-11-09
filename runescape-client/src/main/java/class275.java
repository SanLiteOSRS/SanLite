import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class275 {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "124"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (PacketWriter.clientPreferences.method2497() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 4020
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 4021
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 4022
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 4023
			Client.soundEffects[Client.soundEffectCount] = null; // L: 4024
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 4025
			++Client.soundEffectCount; // L: 4026
		}

	} // L: 4028

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1888348445"
	)
	static final void method5532(int var0, int var1, int var2) {
		if (ClanSettings.cameraX < var0) { // L: 4165
			ClanSettings.cameraX = (var0 - ClanSettings.cameraX) * UserComparator7.field1444 / 1000 + ClanSettings.cameraX + ModeWhere.field4340; // L: 4166
			if (ClanSettings.cameraX > var0) { // L: 4167
				ClanSettings.cameraX = var0;
			}
		}

		if (ClanSettings.cameraX > var0) { // L: 4169
			ClanSettings.cameraX -= (ClanSettings.cameraX - var0) * UserComparator7.field1444 / 1000 + ModeWhere.field4340; // L: 4170
			if (ClanSettings.cameraX < var0) { // L: 4171
				ClanSettings.cameraX = var0;
			}
		}

		if (UserComparator10.cameraY < var1) { // L: 4173
			UserComparator10.cameraY = (var1 - UserComparator10.cameraY) * UserComparator7.field1444 / 1000 + UserComparator10.cameraY + ModeWhere.field4340; // L: 4174
			if (UserComparator10.cameraY > var1) { // L: 4175
				UserComparator10.cameraY = var1;
			}
		}

		if (UserComparator10.cameraY > var1) { // L: 4177
			UserComparator10.cameraY -= (UserComparator10.cameraY - var1) * UserComparator7.field1444 / 1000 + ModeWhere.field4340; // L: 4178
			if (UserComparator10.cameraY < var1) { // L: 4179
				UserComparator10.cameraY = var1;
			}
		}

		if (class366.cameraZ < var2) { // L: 4181
			class366.cameraZ = (var2 - class366.cameraZ) * UserComparator7.field1444 / 1000 + class366.cameraZ + ModeWhere.field4340; // L: 4182
			if (class366.cameraZ > var2) { // L: 4183
				class366.cameraZ = var2;
			}
		}

		if (class366.cameraZ > var2) { // L: 4185
			class366.cameraZ -= (class366.cameraZ - var2) * UserComparator7.field1444 / 1000 + ModeWhere.field4340; // L: 4186
			if (class366.cameraZ < var2) { // L: 4187
				class366.cameraZ = var2;
			}
		}

	} // L: 4189

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "117"
	)
	static void method5531(int var0, int var1) {
		int var2 = class19.fontBold12.stringWidth("Choose Option"); // L: 9367

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 9368
			var4 = class19.fontBold12.stringWidth(TriBool.method7753(var3)); // L: 9369
			if (var4 > var2) { // L: 9370
				var2 = var4;
			}
		}

		var2 += 8; // L: 9372
		var3 = Client.menuOptionsCount * 15 + 22; // L: 9373
		var4 = var0 - var2 / 2; // L: 9374
		if (var4 + var2 > GameEngine.canvasWidth) { // L: 9375
			var4 = GameEngine.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 9376
			var4 = 0;
		}

		int var5 = var1; // L: 9377
		if (var1 + var3 > class127.canvasHeight) { // L: 9378
			var5 = class127.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 9379
			var5 = 0;
		}

		class130.menuX = var4; // L: 9380
		ModeWhere.menuY = var5; // L: 9381
		class7.menuWidth = var2; // L: 9382
		PlayerType.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 9383
	} // L: 9384
}
