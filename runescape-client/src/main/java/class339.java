import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class339 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public class341 field3593;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	class336 field3589;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	class27 field3594;
	@ObfuscatedName("ao")
	public Object[] field3591;
	@ObfuscatedName("ab")
	public Object[] field3592;
	@ObfuscatedName("au")
	public Object[] field3588;
	@ObfuscatedName("aa")
	public Object[] field3595;

	class339() {
		this.field3593 = new class341(); // L: 6
		this.field3589 = new class336(); // L: 7
		this.field3594 = new class27(); // L: 8
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-687709037"
	)
	static void method6309(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 39
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "99"
	)
	public static void method6310(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		UserComparator6.idxCount = var4; // L: 43
		class521.cacheGamebuild = var3; // L: 44

		try {
			class90.field1088 = System.getProperty("os.name"); // L: 46
		} catch (Exception var19) { // L: 48
			class90.field1088 = "Unknown"; // L: 49
		}

		ClanChannel.field1764 = class90.field1088.toLowerCase(); // L: 51
		Login.userHomeDirectory = null; // L: 52

		try {
			Login.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var18) { // L: 56
		}

		if (Login.userHomeDirectory == null) { // L: 57
			try {
				Login.userHomeDirectory = System.getProperty("user.home"); // L: 58
			} catch (Exception var17) { // L: 60
			}
		}

		if (Login.userHomeDirectory != null) { // L: 61
			Login.userHomeDirectory = Login.userHomeDirectory + "/";
		}

		try {
			if (ClanChannel.field1764.startsWith("win")) { // L: 63
				if (Login.userHomeDirectory == null) { // L: 64
					Login.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (Login.userHomeDirectory == null) { // L: 67
				Login.userHomeDirectory = System.getenv("HOME");
			}

			if (Login.userHomeDirectory != null) { // L: 69
				Login.userHomeDirectory = Login.userHomeDirectory + "/";
			}
		} catch (Exception var16) { // L: 71
		}

		if (Login.userHomeDirectory == null) { // L: 72
			Login.userHomeDirectory = "~/";
		}

		GameObject.field3091 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Login.userHomeDirectory, "/tmp/", ""}; // L: 73
		class85.field1039 = new String[]{".jagex_cache_" + class521.cacheGamebuild, ".file_store_" + class521.cacheGamebuild}; // L: 74
		int var13 = 0;

		label118:
		while (var13 < 4) {
			JagexCache.cacheDir = class181.method3661(var0, var2, var13); // L: 76
			if (!JagexCache.cacheDir.exists()) { // L: 77
				JagexCache.cacheDir.mkdirs();
			}

			File[] var6 = JagexCache.cacheDir.listFiles(); // L: 78
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

		File var5 = JagexCache.cacheDir; // L: 108
		FileSystem.FileSystem_cacheDir = var5; // L: 110
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 111
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 112
			PacketWriter.method2884(); // L: 114
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class10.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 115
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class10.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 116
			class25.JagexCache_idxFiles = new BufferedFile[UserComparator6.idxCount]; // L: 117

			for (int var14 = 0; var14 < UserComparator6.idxCount; ++var14) { // L: 118
				class25.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(class10.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0); // L: 119
			}

		}
	} // L: 121
}
