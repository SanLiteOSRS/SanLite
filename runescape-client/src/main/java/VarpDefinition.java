import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1381184627
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1440962611
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "923214413"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "1336556891"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "47"
	)
	static int method4898(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++class16.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			Interpreter.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++class16.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++class16.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Huffman.method4311() ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++class16.Interpreter_intStackSize;
			return 1;
		}
	}
}
