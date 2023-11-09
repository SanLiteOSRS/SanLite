import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class197 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2064;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2059;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2060;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2062;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2063;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2065;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2067;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		field2064 = new class197(0, class209.field2310); // L: 4
		field2059 = new class197(1, class209.field2313); // L: 5
		field2060 = new class197(2, class209.field2311); // L: 6
		field2062 = new class197(3, class209.field2308); // L: 7
		field2063 = new class197(4, class209.field2302); // L: 8
		field2065 = new class197(5, class209.field2303); // L: 9
		field2067 = new class197(6, class209.field2312); // L: 10
	}

	@ObfuscatedSignature(
		descriptor = "(ILiv;)V"
	)
	class197(int var1, class209 var2) {
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-75"
	)
	public static void method3886(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		class160.field1764 = var4; // L: 43
		Interpreter.cacheGamebuild = var3; // L: 44

		try {
			class173.field1840 = System.getProperty("os.name"); // L: 46
		} catch (Exception var19) { // L: 48
			class173.field1840 = "Unknown"; // L: 49
		}

		class20.field99 = class173.field1840.toLowerCase(); // L: 51
		class388.userHomeDirectory = null; // L: 52

		try {
			class388.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var18) { // L: 56
		}

		if (class388.userHomeDirectory == null) { // L: 57
			try {
				class388.userHomeDirectory = System.getProperty("user.home"); // L: 58
			} catch (Exception var17) { // L: 60
			}
		}

		if (class388.userHomeDirectory != null) { // L: 61
			class388.userHomeDirectory = class388.userHomeDirectory + "/";
		}

		try {
			if (class20.field99.startsWith("win")) { // L: 63
				if (class388.userHomeDirectory == null) { // L: 64
					class388.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class388.userHomeDirectory == null) { // L: 67
				class388.userHomeDirectory = System.getenv("HOME");
			}

			if (class388.userHomeDirectory != null) { // L: 69
				class388.userHomeDirectory = class388.userHomeDirectory + "/";
			}
		} catch (Exception var16) { // L: 71
		}

		if (class388.userHomeDirectory == null) { // L: 72
			class388.userHomeDirectory = "~/";
		}

		ArchiveDiskActionHandler.field4241 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class388.userHomeDirectory, "/tmp/", ""}; // L: 73
		JagexCache.field1844 = new String[]{".jagex_cache_" + Interpreter.cacheGamebuild, ".file_store_" + Interpreter.cacheGamebuild}; // L: 74
		int var13 = 0;

		label118:
		while (var13 < 4) {
			ItemContainer.cacheDir = class133.method3127(var0, var2, var13); // L: 76
			if (!ItemContainer.cacheDir.exists()) { // L: 77
				ItemContainer.cacheDir.mkdirs();
			}

			File[] var6 = ItemContainer.cacheDir.listFiles(); // L: 78
			if (var6 == null) { // L: 79
				break;
			}

			File[] var7 = var6; // L: 81
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label118;
				}

				File var9 = var7[var8]; // L: 83

				boolean var10;
				try {
					RandomAccessFile var11 = new RandomAccessFile(var9, "rw"); // L: 88
					int var12 = var11.read(); // L: 89
					var11.seek(0L); // L: 90
					var11.write(var12); // L: 91
					var11.seek(0L); // L: 92
					var11.close(); // L: 93
					var10 = true; // L: 95
				} catch (Exception var15) { // L: 97
					var10 = false; // L: 98
				}

				if (!var10) { // L: 101
					++var13; // L: 75
					break;
				}

				++var8; // L: 82
			}
		}

		File var5 = ItemContainer.cacheDir; // L: 108
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 111
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 112
			class173.method3575(); // L: 114
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(WorldMapSection2.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 115
			JagexCache.field1849 = new BufferedFile(new AccessFile(WorldMapSection2.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 116
			GrandExchangeOfferOwnWorldComparator.JagexCache_idxFiles = new BufferedFile[class160.field1764]; // L: 117

			for (int var14 = 0; var14 < class160.field1764; ++var14) { // L: 118
				GrandExchangeOfferOwnWorldComparator.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(WorldMapSection2.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0); // L: 119
			}

		}
	} // L: 121

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CLol;I)I",
		garbageValue = "629014722"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}
}
