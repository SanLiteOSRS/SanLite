import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1764010479
	)
	static int field302;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			LoginPacket.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lni;Ljava/lang/String;Ljava/lang/String;I)[Ltt;",
		garbageValue = "1428194172"
	)
	public static SpritePixels[] method835(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 90
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 91
			int var4 = var0.getFileId(var3, var2); // L: 92
			return ArchiveLoader.method2219(var0, var3, var4); // L: 93
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1186906464"
	)
	public static String method838(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 160
		int var2 = 0; // L: 161
		int var3 = -1; // L: 162

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 163
			char var5 = var0.charAt(var4); // L: 164
			if (var5 == '<') { // L: 165
				var1.append(var0.substring(var2, var4)); // L: 166
				var3 = var4; // L: 167
			} else if (var5 == '>' && var3 != -1) { // L: 170
				String var6 = var0.substring(var3 + 1, var4); // L: 171
				var3 = -1; // L: 172
				if (var6.equals("lt")) { // L: 173
					var1.append("<"); // L: 174
				} else if (var6.equals("gt")) { // L: 176
					var1.append(">"); // L: 177
				} else if (var6.equals("br")) { // L: 179
					var1.append("\n"); // L: 180
				}

				var2 = var4 + 1; // L: 182
			}
		}

		if (var2 < var0.length()) { // L: 185
			var1.append(var0.substring(var2, var0.length())); // L: 186
		}

		return var1.toString(); // L: 188
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(ILms;ZI)V",
		garbageValue = "-1428851961"
	)
	static void method839(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = RouteStrategy.getWorldMap().getMapArea(var0); // L: 5260
		int var4 = HitSplatDefinition.localPlayer.plane; // L: 5261
		int var5 = class147.baseX * 64 + (HitSplatDefinition.localPlayer.x >> 7); // L: 5262
		int var6 = ModeWhere.baseY * 64 + (HitSplatDefinition.localPlayer.y >> 7); // L: 5263
		Coord var7 = new Coord(var4, var5, var6); // L: 5264
		RouteStrategy.getWorldMap().method8551(var3, var7, var1, var2); // L: 5265
	} // L: 5266

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2099489323"
	)
	static int method837() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1675
			int var0 = 0; // L: 1676

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1677
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1678
			}

			return var0 * 10000 / Client.field780; // L: 1680
		} else {
			return 10000;
		}
	}
}
