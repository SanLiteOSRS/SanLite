import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 35416535
	)
	static int field1891;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field1890;
	@ObfuscatedName("w")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("v")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("c")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -19231955
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -633508893
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("k")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("o")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("n")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-687932105"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "32"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 46
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 47
				this.outputCount = var1.readUnsignedShort(); // L: 48
				this.keys = new int[this.outputCount]; // L: 49
				this.strVals = new String[this.outputCount]; // L: 50

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 51
					this.keys[var3] = var1.readInt(); // L: 52
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 53
				}
			} else if (var2 == 6) { // L: 56
				this.outputCount = var1.readUnsignedShort(); // L: 57
				this.keys = new int[this.outputCount]; // L: 58
				this.intVals = new int[this.outputCount]; // L: 59

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 60
					this.keys[var3] = var1.readInt(); // L: 61
					this.intVals[var3] = var1.readInt(); // L: 62
				}
			}
		}

	} // L: 66

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2141311437"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lfy;",
		garbageValue = "1248940994"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}
}
