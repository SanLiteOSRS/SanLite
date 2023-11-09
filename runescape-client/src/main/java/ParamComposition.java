import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ParamComposition_cached")
	public static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("ar")
	@Export("type")
	char type;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -951631697
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("as")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("aj")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-17467"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1931541536"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "243375101"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			this.type = class17.method258(var1.readByte()); // L: 43
		} else if (var2 == 2) { // L: 45
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 46
		} else if (var2 == 5) { // L: 47
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 49

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-791513096"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 52
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfm;I)V",
		garbageValue = "-1881059806"
	)
	static void method3847(float var0, float var1, float var2, float var3, class130 var4) {
		float var5 = var1 - var0; // L: 342
		float var6 = var2 - var1; // L: 343
		float var7 = var3 - var2; // L: 344
		float var8 = var6 - var5; // L: 345
		var4.field1550 = var7 - var6 - var8; // L: 346
		var4.field1542 = var8 + var8 + var8; // L: 347
		var4.field1541 = var5 + var5 + var5; // L: 348
		var4.field1540 = var0; // L: 349
	} // L: 350
}
