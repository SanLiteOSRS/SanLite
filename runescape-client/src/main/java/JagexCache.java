import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("wt")
	@ObfuscatedGetter(
		intValue = -1366756225
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("as")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1308596989
	)
	public static int field1840;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	public static BufferedFile field1836;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		field1836 = null; // L: 24
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "-50"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class7.method45(var0, var1, var2, var3, var4, var5, -1, false); // L: 10229
	} // L: 10230

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "206796942"
	)
	static final int method3521() {
		float var0 = 200.0F * ((float)class150.clientPreferences.method2476() - 0.5F); // L: 12243
		return 100 - Math.round(var0); // L: 12244
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltx;",
		garbageValue = "52"
	)
	static class507 method3528(int var0) {
		class507 var1 = (class507)Client.Widget_cachedFonts.get((long)var0); // L: 12917
		if (var1 == null) { // L: 12918
			var1 = new class507(class176.field1852, var0); // L: 12919
		}

		return var1; // L: 12921
	}
}
