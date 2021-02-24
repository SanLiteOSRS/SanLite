import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lka;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lka;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lka;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("z")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-107"
	)
	public static boolean method5372() {
		return Client.staffModLevel >= 2;
	}
}
