import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2136311618"
	)
	public static int method8079(int var0) {
		return class465.field4786[var0 & 16383]; // L: 28
	}
}
