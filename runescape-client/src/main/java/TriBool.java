import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8
}
