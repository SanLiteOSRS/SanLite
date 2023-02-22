import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("AttackOption")
public enum AttackOption implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	field1314(2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	field1318(4);

	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -620769605
	)
	static int field1320;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1823309479
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 13437
	} // L: 13438

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 13442
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "2124220394"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 52
				} catch (Exception var4) { // L: 34
				}
			}

			if (class31.field186.startsWith("win")) { // L: 36
				class158.method3351(var0, 0); // L: 38
			} else if (class31.field186.startsWith("mac")) { // L: 42
				class154.method3319(var0, 1, "openjs"); // L: 43
			} else {
				class158.method3351(var0, 2); // L: 46
			}
		} else {
			class158.method3351(var0, 3); // L: 49
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "457231157"
	)
	static final void method2710(int var0) {
		int[] var1 = class31.sceneMinimapSprite.pixels; // L: 6180
		int var2 = var1.length; // L: 6181

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6182
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6183
			var4 = (103 - var3) * 2048 + 24628; // L: 6184

			for (var5 = 1; var5 < 103; ++var5) { // L: 6185
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6186
					WorldMapAreaData.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6187
					WorldMapAreaData.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6188
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6191
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6192
		class31.sceneMinimapSprite.setRaster(); // L: 6193

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6194
			for (var6 = 1; var6 < 103; ++var6) { // L: 6195
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6196
					AbstractWorldMapIcon.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6197
					AbstractWorldMapIcon.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 6200

		for (var5 = 0; var5 < 104; ++var5) { // L: 6201
			for (var6 = 0; var6 < 104; ++var6) { // L: 6202
				long var7 = WorldMapAreaData.scene.getGroundObjectTag(class103.Client_plane, var5, var6); // L: 6203
				if (0L != var7) { // L: 6204
					int var9 = class124.Entity_unpackID(var7); // L: 6205
					int var10 = class463.getObjectDefinition(var9).mapIconId; // L: 6206
					if (var10 >= 0 && class4.WorldMapElement_get(var10).field1953) { // L: 6207 6208
						Client.mapIcons[Client.mapIconCount] = class4.WorldMapElement_get(var10).getSpriteBool(false); // L: 6211
						Client.field607[Client.mapIconCount] = var5; // L: 6212
						Client.field591[Client.mapIconCount] = var6; // L: 6213
						++Client.mapIconCount; // L: 6214
					}
				}
			}
		}

		class25.rasterProvider.apply(); // L: 6219
	} // L: 6220
}
