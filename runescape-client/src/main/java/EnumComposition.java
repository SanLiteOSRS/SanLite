import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("af")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("at")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("an")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1960364517
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -535223549
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("aw")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ad")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("al")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1121999579"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;IS)V",
		garbageValue = "16495"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-682335485"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}
}
