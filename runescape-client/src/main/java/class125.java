import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class125 extends class128 {
	@ObfuscatedName("ae")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 475255043
	)
	int field1528;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1736825985
	)
	int field1529;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -988284569
	)
	int field1530;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1923942099
	)
	int field1533;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class125(class131 var1) {
		this.this$0 = var1;
		this.field1528 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1528 = var1.readUnsignedShort(); // L: 166
		this.field1529 = var1.readInt(); // L: 167
		this.field1530 = var1.readUnsignedByte(); // L: 168
		this.field1533 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2986(this.field1528, this.field1529, this.field1530, this.field1533); // L: 173
	} // L: 174

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lpl;B)Lpl;",
		garbageValue = "-43"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = FloorOverlayDefinition.method3800(var2); // L: 18
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lfx;",
		garbageValue = "-1909075914"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 65
		if (var1 != null) { // L: 66
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 67
			var1 = new NPCComposition(); // L: 68
			var1.id = var0; // L: 69
			if (var2 != null) { // L: 70
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 71
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 72
			return var1; // L: 73
		}
	}
}
