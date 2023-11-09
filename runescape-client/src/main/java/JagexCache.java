import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("at")
	static File field1869;
	@ObfuscatedName("ac")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 389454859
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -593090687
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("am")
	static String[] field1867;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "285746383"
	)
	static int method3482(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 99
	}
}
