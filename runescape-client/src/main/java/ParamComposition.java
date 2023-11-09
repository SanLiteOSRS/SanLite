import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("ParamComposition_cached")
	public static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("f")
	@Export("type")
	char type;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -162748113
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("c")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("w")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-801851410"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "436104445"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "1998774230"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.type = class101.method2633(var1.readByte()); // L: 47
		} else if (var2 == 2) { // L: 49
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 50
		} else if (var2 == 5) { // L: 51
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 53

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "611849620"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 56
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lku;B)Ljava/lang/String;",
		garbageValue = "80"
	)
	static String method3572(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10455
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10456
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10458
					if (var3 == -1) { // L: 10459
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10460
					int var6 = class343.method6335(var1, var2 - 1); // L: 10462
					String var5;
					if (var6 < 999999999) { // L: 10464
						var5 = Integer.toString(var6); // L: 10465
					} else {
						var5 = "*"; // L: 10468
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10470
				}
			}
		}

		return var0; // L: 10474
	}
}
