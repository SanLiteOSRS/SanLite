import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public enum class140 implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1619(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1615(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1614(2, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1611(3, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1612(4, 4),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1616(5, 5),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1617(6, 6),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1618(7, 7),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1613(8, 8);

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1424108141
	)
	final int field1620;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1565037463
	)
	final int field1621;

	class140(int var3, int var4) {
		this.field1620 = var3; // L: 113
		this.field1621 = var4; // L: 114
	} // L: 115

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1621; // L: 118
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	static void method3120() {
		if (class33.varcs.hasUnwrittenChanges()) { // L: 1193
			class33.varcs.write();
		}

		MusicPatchNode2.method5928(); // L: 1194
		if (class233.mouseRecorder != null) { // L: 1195
			class233.mouseRecorder.isRunning = false;
		}

		class233.mouseRecorder = null; // L: 1196
		Client.packetWriter.close(); // L: 1197
		if (GameEngine.taskHandler != null) { // L: 1198
			try {
				GameEngine.taskHandler.close(); // L: 1200
			} catch (Exception var3) { // L: 1202
			}
		}

		GameEngine.taskHandler = null; // L: 1204
		class214.method3909(); // L: 1205
		WorldMapSection0.method5608(); // L: 1206
		class10.scene.clear(); // L: 1207

		for (int var1 = 0; var1 < 4; ++var1) { // L: 1208
			Client.collisionMaps[var1].clear();
		}

		class434.worldMap = null; // L: 1209
		ItemComposition.method4136(0, 0); // L: 1210
		class470.method8459(); // L: 1211
		Client.playingJingle = false; // L: 1212
		SoundCache.method866(); // L: 1213
		if (class171.pcmPlayer1 != null) { // L: 1214
			class171.pcmPlayer1.shutdown();
		}

		class59.field452.method7008(); // L: 1215
		WorldMapDecorationType.method6792(); // L: 1216
		if (AbstractWorldMapIcon.urlRequester != null) { // L: 1217
			AbstractWorldMapIcon.urlRequester.close(); // L: 1218
		}

		HealthBar.method2615(); // L: 1220
		JagexCache.JagexCache_dat2File = null; // L: 1221
		JagexCache.JagexCache_idx255File = null; // L: 1222
		UserComparator8.JagexCache_idxFiles = null; // L: 1223
		class232.method4412(); // L: 1224
		UserComparator10.field1480 = null; // L: 1225
		Client.archiveLoaders.clear(); // L: 1226
		Client.field819 = 0; // L: 1227
		class59.field452 = new class374(); // L: 1228
		AbstractWorldMapIcon.urlRequester = new class115(class159.client.field565, 217); // L: 1229

		try {
			class139.method3110("oldschool", UserComparator3.field1471, SoundSystem.field325.name, 0, 23); // L: 1231
		} catch (IOException var2) { // L: 1233
			throw new RuntimeException(var2); // L: 1234
		}

		UserComparator10.field1480 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1236
		GameEngine.taskHandler = new TaskHandler(); // L: 1237
		class159.client.method615(); // L: 1238
		Client.field577 = class94.field1161; // L: 1239
		DefaultsGroup.method8263(0); // L: 1240
	} // L: 1241

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIZI)V",
		garbageValue = "1653848905"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11163
		int var5 = var0.height; // L: 11164
		if (var0.widthAlignment == 0) { // L: 11165
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11166
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11167
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11168
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11169
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11170
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11171
			var0.width = var0.height * var0.field3693 / var0.field3694;
		}

		if (var0.heightAlignment == 4) { // L: 11172
			var0.height = var0.field3694 * var0.width / var0.field3693;
		}

		if (var0.contentType == 1337) { // L: 11173
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11174
			var0.method6614().method6501(var0.width, var0.height); // L: 11175
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11177
			ScriptEvent var6 = new ScriptEvent(); // L: 11178
			var6.widget = var0; // L: 11179
			var6.args = var0.onResize; // L: 11180
			Client.scriptEvents.addFirst(var6); // L: 11181
		}

	} // L: 11183
}
