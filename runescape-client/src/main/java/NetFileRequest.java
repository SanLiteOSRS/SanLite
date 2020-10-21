import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1779411329
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("s")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	}
}
