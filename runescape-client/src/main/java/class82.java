import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public enum class82 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	field1072(0, -1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	field1062(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	field1069(2, 7),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	field1065(3, 8),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	field1064(4, 9);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("pcmPlayerProvider")
	public static class47 pcmPlayerProvider;
	@ObfuscatedName("ah")
	static Image field1066;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1199149819
	)
	final int field1067;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1326578977
	)
	final int field1068;

	class82(int var3, int var4) {
		this.field1067 = var3; // L: 20
		this.field1068 = var4; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1068; // L: 26
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-780421281"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2076696514"
	)
	public static int method2179(int var0) {
		return class141.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 89
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1628556325"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1186
			if (Client.gameState == 0) { // L: 1187
				class329.client.method442();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1188
				GameBuild.method5758(0); // L: 1189
				Client.field516 = 0; // L: 1190
				Client.field766 = 0; // L: 1191
				Client.timer.method6554(var0); // L: 1192
				if (var0 != 20) { // L: 1193
					FriendSystem.method1762(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class240.field2847 != null) { // L: 1195 1196
				class240.field2847.close(); // L: 1197
				class240.field2847 = null; // L: 1198
			}

			if (Client.gameState == 25) { // L: 1201
				Client.field552 = 0; // L: 1202
				Client.field613 = 0; // L: 1203
				Client.field774 = 1; // L: 1204
				Client.field609 = 0; // L: 1205
				Client.field551 = 1; // L: 1206
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1208
				if (var0 == 20) { // L: 1212
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1213
					class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, false, var1); // L: 1214
				} else if (var0 == 11) { // L: 1216
					class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, false, 4); // L: 1217
				} else if (var0 == 50) { // L: 1219
					HealthBarUpdate.setLoginResponseString("", "Updating date of birth...", ""); // L: 1220
					class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, false, 7); // L: 1221
				} else if (Login.clearLoginScreen) { // L: 1224
					class7.titleboxSprite = null; // L: 1225
					class229.titlebuttonSprite = null; // L: 1226
					Login.runesSprite = null; // L: 1227
					SpriteMask.leftTitleSprite = null; // L: 1228
					class356.rightTitleSprite = null; // L: 1229
					Canvas.logoSprite = null; // L: 1230
					Login.title_muteSprite = null; // L: 1231
					class11.options_buttons_0Sprite = null; // L: 1232
					Login.options_buttons_2Sprite = null; // L: 1233
					class12.worldSelectBackSprites = null; // L: 1234
					VerticalAlignment.worldSelectFlagSprites = null; // L: 1235
					Login.worldSelectArrows = null; // L: 1236
					class12.worldSelectStars = null; // L: 1237
					Login.field931 = null; // L: 1238
					RouteStrategy.loginScreenRunesAnimation.method2275(); // L: 1239
					class273.musicPlayerStatus = 1; // L: 1241
					class149.musicTrackArchive = null; // L: 1242
					class273.musicTrackGroupId = -1; // L: 1243
					UserComparator6.musicTrackFileId = -1; // L: 1244
					class273.musicTrackVolume = 0; // L: 1245
					class347.musicTrackBoolean = false; // L: 1246
					FaceNormal.pcmSampleLength = 2; // L: 1247
					StructComposition.method3597(true); // L: 1249
					Login.clearLoginScreen = false; // L: 1250
				}
			} else {
				var1 = AbstractWorldMapIcon.method5047() ? 0 : 12; // L: 1209
				class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, true, var1); // L: 1210
			}

			Client.gameState = var0; // L: 1252
		}
	} // L: 1253
}
