import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ma
@ObfuscatedName("pk")
public final class class405 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("huffman")
	public static Huffman huffman;

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$"); // L: 9
	} // L: 10
}
