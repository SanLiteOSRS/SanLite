import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ab")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lsu;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("az")
	@Export("operatingSystemName")
	public static String operatingSystemName;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	static final void method3476() {
		Client.field615 = Client.cycleCntr; // L: 12388
		LoginType.field4933 = true; // L: 12389
	} // L: 12390
}
