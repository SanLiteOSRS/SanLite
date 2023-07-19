import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public enum class140 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1636(3, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1629(4, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1630(2, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1631(1, 3),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1632(0, 4);

	@ObfuscatedName("at")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1659523737
	)
	public final int field1633;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 35392447
	)
	@Export("id")
	final int id;

	class140(int var3, int var4) {
		this.field1633 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lik;",
		garbageValue = "581700831"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1; // L: 59
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 61
			var1 = new SequenceDefinition(); // L: 62
			if (var2 != null) { // L: 63
				var1.decode(new Buffer(var2)); // L: 64
			}

			var1.postDecode(); // L: 66
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 67
			return var1; // L: 68
		}
	}
}
