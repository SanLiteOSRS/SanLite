import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("StructDefinition")
public class StructDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 762629466
	)
	public static int field3338;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Llg;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructDefinition() {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-61",
		signature = "(B)V"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-1222397412",
		signature = "(Lkx;I)V"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "1068696099",
		signature = "(Lkx;II)V"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = TextureProvider.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1838065399",
		signature = "(III)I"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "-15071",
		signature = "(ILjava/lang/String;S)Ljava/lang/String;"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class69.method1258(this.params, var1, var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "76",
		signature = "(Lig;Lig;Lig;B)V"
	)
	public static void method4734(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		Frames.field1904 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}
}
