import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class139 extends class142 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1062343141
	)
	int field1615;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1360406087
	)
	int field1614;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -858682801
	)
	int field1613;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1996159169
	)
	int field1616;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class139(class145 var1) {
		this.this$0 = var1;
		this.field1615 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		this.field1615 = var1.readUnsignedShort(); // L: 166
		this.field1614 = var1.readInt(); // L: 167
		this.field1613 = var1.readUnsignedByte(); // L: 168
		this.field1616 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3215(this.field1615, this.field1614, this.field1613, this.field1616); // L: 173
	} // L: 174

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "-2123064978"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
