import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("StructDefinition")
public class StructDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lme;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructDefinition() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-51783205"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "1597477180"
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
		garbageValue = "414960674"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class105.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-981552906"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "429267652"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return MouseHandler.method725(this.params, var1, var2);
	}
}
