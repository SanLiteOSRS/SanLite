import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("StructDefinition")
public class StructDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lll;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructDefinition() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1231164770"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-1053369133"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-941858292"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = InvDefinition.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "408521937"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "7540"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapSection0.method307(this.params, var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "22"
	)
	public static int method4708(int var0) {
		return ObjectSound.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1317179334"
	)
	public static void method4699() {
		StructDefinition_cached.clear();
	}
}
