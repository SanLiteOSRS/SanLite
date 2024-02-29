import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ParamComposition_cached")
	public static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("al")
	@Export("type")
	char type;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 443607463
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ar")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("as")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;S)V",
		garbageValue = "-21469"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "-18"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			byte var4 = var1.readByte(); // L: 48
			int var5 = var4 & 255; // L: 50
			if (var5 == 0) { // L: 51
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 52
				char var6 = class403.cp1252AsciiExtension[var5 - 128]; // L: 53
				if (var6 == 0) { // L: 54
					var6 = '?';
				}

				var5 = var6; // L: 55
			}

			char var3 = (char)var5; // L: 57
			this.type = var3; // L: 59
		} else if (var2 == 2) { // L: 61
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 62
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 63
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 65

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1215722605"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "1791578313"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 79

		for (int var6 = 0; var6 < var5; ++var6) { // L: 80
			char var7 = var0.charAt(var6 + var1); // L: 81
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 82
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 83
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 84
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 85
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 86
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 87
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 88
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 89
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 90
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119; // L: 91
			} else if (var7 == 352) { // L: 92
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 93
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 94
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 95
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 96
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 97
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 98
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 99
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 100
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 101
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 102
			} else if (var7 == 732) { // L: 103
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 104
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 105
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 106
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 107
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 108
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 109
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 110
			}
		}

		return var5; // L: 112
	}
}
