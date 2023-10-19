import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class167 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 3610111583627244041L
	)
	long field1789;
	@ObfuscatedName("al")
	String field1790;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class167(class148 var1) {
		this.this$0 = var1;
		this.field1789 = -1L; // L: 194
		this.field1790 = null; // L: 195
	} // L: 197

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1789 = var1.readLong(); // L: 202
		}

		this.field1790 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3251(this.field1789, this.field1790); // L: 208
	} // L: 209

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;Ltp;B)Ltp;",
		garbageValue = "8"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = EnumComposition.method3749(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;Ljava/lang/String;I)Lun;",
		garbageValue = "-2109687814"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 83
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 84
			int var4 = var0.getFileId(var3, var2); // L: 85
			IndexedSprite var5;
			if (!class164.method3376(var0, var3, var4)) { // L: 88
				var5 = null; // L: 89
			} else {
				var5 = Widget.method6728(); // L: 92
			}

			return var5; // L: 94
		}
	}
}
