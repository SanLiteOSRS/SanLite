import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8
}
