import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("u")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 60928527
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("s")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}
}
