import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ai")
	static File field2331;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1691658533
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field2336;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -462290629
	)
	static int field2329;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lin;",
		garbageValue = "-1812345915"
	)
	public static Clock method4223() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1275044390"
	)
	static void method4224(int var0) {
		if (var0 != Login.loginIndex) { // L: 2028
			Login.loginIndex = var0; // L: 2029
		}
	} // L: 2030
}
