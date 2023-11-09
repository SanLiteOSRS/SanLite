import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("j")
	public static short[][] field4548;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8
}
