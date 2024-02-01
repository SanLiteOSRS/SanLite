import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("af")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("aj")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("aq")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 684618021
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -213869229
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("ao")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ae")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("aa")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "31"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;IB)V",
		garbageValue = "117"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 44
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 45
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1692614113"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2125087536"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}
}
