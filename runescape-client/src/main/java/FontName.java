import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("ab")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lsu;",
		garbageValue = "87"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class388.cacheDir, "preferences" + var0 + ".dat"); // L: 254
		if (var3.exists()) { // L: 255
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 257
				return var10; // L: 258
			} catch (IOException var9) { // L: 260
			}
		}

		String var4 = ""; // L: 262
		if (class496.cacheGamebuild == 33) { // L: 263
			var4 = "_rc";
		} else if (class496.cacheGamebuild == 34) { // L: 264
			var4 = "_wip";
		}

		File var5 = new File(class148.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 265
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 266
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 268
				return var6; // L: 269
			} catch (IOException var8) { // L: 271
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 274
			return var6; // L: 275
		} catch (IOException var7) { // L: 277
			throw new RuntimeException(); // L: 278
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILhx;IB)V",
		garbageValue = "81"
	)
	static void method8578(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 74
		var5.plane = var0; // L: 75
		var5.x = var1 * 128; // L: 76
		var5.y = var2 * 16384; // L: 77
		int var6 = var3.sizeX; // L: 78
		int var7 = var3.sizeY; // L: 79
		if (var4 == 1 || var4 == 3) { // L: 80
			var6 = var3.sizeY; // L: 81
			var7 = var3.sizeX; // L: 82
		}

		var5.maxX = (var6 + var1) * 128; // L: 84
		var5.maxY = (var7 + var2) * 16384; // L: 85
		var5.soundEffectId = var3.ambientSoundId; // L: 86
		var5.field843 = var3.int7 * 128; // L: 87
		var5.field845 = var3.int5; // L: 88
		var5.field836 = var3.int6; // L: 89
		var5.soundEffectIds = var3.soundEffectIds; // L: 90
		if (var3.transforms != null) { // L: 91
			var5.obj = var3; // L: 92
			var5.set(); // L: 93
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 95
		if (var5.soundEffectIds != null) { // L: 96
			var5.field848 = var5.field845 + (int)(Math.random() * (double)(var5.field836 - var5.field845));
		}

	} // L: 97
}
