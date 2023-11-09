import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class156 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lqv;",
		garbageValue = "-62"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class303.cacheDir, "preferences" + var0 + ".dat"); // L: 183
		if (var3.exists()) { // L: 184
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 186
				return var10; // L: 187
			} catch (IOException var9) { // L: 189
			}
		}

		String var4 = ""; // L: 191
		if (JagexCache.cacheGamebuild == 33) { // L: 192
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 193
			var4 = "_wip";
		}

		File var5 = new File(class37.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 194
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 195
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 197
				return var6; // L: 198
			} catch (IOException var8) { // L: 200
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 203
			return var6; // L: 204
		} catch (IOException var7) { // L: 206
			throw new RuntimeException(); // L: 207
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public static void method3225() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "52"
	)
	static int method3226(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field853 - 7.0D) * 256.0D); // L: 4231
	}
}
