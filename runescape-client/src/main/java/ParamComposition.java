import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ParamComposition_cached")
	static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("af")
	@Export("type")
	char type;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2040410373
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("an")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ao")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-974811788"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-2087726211"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "-123"
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
				char var6 = class404.cp1252AsciiExtension[var5 - 128]; // L: 53
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}
}
