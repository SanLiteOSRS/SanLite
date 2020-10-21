import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1335589657
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2004662257
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "1021098633"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkb;IS)V",
		garbageValue = "-6183"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkb;Lll;I)Lll;",
		garbageValue = "-1253554841"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = WorldMapData_0.method266(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}
}
