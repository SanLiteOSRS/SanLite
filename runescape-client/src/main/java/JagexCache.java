import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1493789117
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}
}
