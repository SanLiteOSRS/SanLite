import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@pc
@mq
@ObfuscatedName("pv")
@Implements("Language")
public class Language implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lpv;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("aw")
	final String field4516;
	@ObfuscatedName("ad")
	@Export("language")
	final String language;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1671051427
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4531, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4531, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4531, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4531, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4522, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4522, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4531, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_DE, Language_ES_MX, Language_FR, Language_EN, Language_PT, Language_ES, Language_NL}; // L: 27
		Language_valuesOrdered = new Language[var0.length]; // L: 30
		Language[] var2 = var0; // L: 32

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3]; // L: 34
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpm;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4516 = var1;
		this.language = var2; // L: 47
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	} // L: 55

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-888813315"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldn;",
		garbageValue = "385838864"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = Frames.method4890(var1, var0); // L: 38
		Script var4 = class25.method356(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = class133.method3067(var2, var0); // L: 43
			var4 = class25.method356(var3, var0); // L: 44
			if (var4 != null) { // L: 45
				return var4; // L: 46
			} else {
				var3 = SceneTilePaint.method5104(var0); // L: 48
				var4 = class25.method356(var3, var0); // L: 49
				return var4 != null ? var4 : null; // L: 50 53
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lfd;",
		garbageValue = "-825407731"
	)
	static class132 method7195(int var0) {
		class132[] var1 = new class132[]{class132.field1590, class132.field1583, class132.field1593, class132.field1585, class132.field1586, class132.field1582}; // L: 33
		class132 var2 = (class132)KitDefinition.findEnumerated(var1, var0); // L: 35
		if (var2 == null) { // L: 36
			var2 = class132.field1590;
		}

		return var2; // L: 37
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lix;B)V",
		garbageValue = "-19"
	)
	static final void method7192(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					FriendSystem.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1824685090"
	)
	static int method7200() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1487
			int var0 = 0; // L: 1488

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1489
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1490
			}

			return var0 * 10000 / Client.field773; // L: 1492
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "275520879"
	)
	static boolean method7199() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5229
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(ZLun;S)V",
		garbageValue = "24287"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field637 = 0; // L: 8792
		Client.field571 = 0; // L: 8793
		SoundCache.method836(var1); // L: 8794
		class4.method19(var0, var1); // L: 8795
		class102.method2657(var1); // L: 8796

		int var2;
		for (var2 = 0; var2 < Client.field637; ++var2) { // L: 8797
			int var3 = Client.field643[var2]; // L: 8798
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8799
				Client.npcs[var3].definition = null; // L: 8800
				Client.npcs[var3] = null; // L: 8801
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8804
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8805
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8807
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8808
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8809
				}
			}

		}
	} // L: 8812

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "919163409"
	)
	static final void method7194() {
		int var0 = class16.menuX; // L: 9252
		int var1 = LoginScreenAnimation.menuY; // L: 9253
		int var2 = HealthBarDefinition.menuWidth; // L: 9254
		int var3 = class1.menuHeight; // L: 9255
		int var4 = 6116423; // L: 9256
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 9257
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 9258
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 9259
		DevicePcmPlayerProvider.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 9260
		int var5 = MouseHandler.MouseHandler_x; // L: 9261
		int var6 = MouseHandler.MouseHandler_y; // L: 9262

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 9263
			var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31; // L: 9264
			var9 = 16777215; // L: 9265
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 9266
				var9 = 16776960;
			}

			DevicePcmPlayerProvider.fontBold12.draw(class225.method4275(var7), var0 + 3, var8, var9, 0); // L: 9267
		}

		var7 = class16.menuX; // L: 9269
		var8 = LoginScreenAnimation.menuY; // L: 9270
		var9 = HealthBarDefinition.menuWidth; // L: 9271
		int var10 = class1.menuHeight; // L: 9272

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 9274
			if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 9275
				Client.field816[var11] = true;
			}
		}

	} // L: 9278

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(II)Luh;",
		garbageValue = "1981114215"
	)
	static class526 method7198(int var0) {
		class526 var1 = (class526)Client.Widget_cachedModels.get((long)var0); // L: 12987
		if (var1 == null) { // L: 12988
			var1 = new class526(class439.field4743, StructComposition.method4042(var0), class163.method3378(var0)); // L: 12989
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12990
		}

		return var1; // L: 12992
	}
}
