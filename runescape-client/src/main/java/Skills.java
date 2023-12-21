import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("ah")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("ar")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lol;Ljava/lang/String;Ljava/lang/String;I)[Lup;",
		garbageValue = "900236984"
	)
	public static IndexedSprite[] method6857(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 115
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 116
			int var4 = var0.getFileId(var3, var2); // L: 117
			byte[] var7 = var0.takeFile(var3, var4); // L: 122
			boolean var6;
			if (var7 == null) { // L: 123
				var6 = false; // L: 124
			} else {
				class162.SpriteBuffer_decode(var7); // L: 127
				var6 = true; // L: 128
			}

			IndexedSprite[] var5;
			if (!var6) { // L: 130
				var5 = null; // L: 131
			} else {
				var5 = class518.method9159(); // L: 134
			}

			return var5; // L: 136
		}
	}
}
