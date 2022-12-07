import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class216 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2055361545
	)
	int field2600;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1890114663
	)
	int field2596;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1812849095
	)
	int field2597;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 320710353
	)
	int field2598;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1128965299
	)
	int field2599;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 678945951
	)
	int field2595;

	class216(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2600 = var1; // L: 12
		this.field2596 = var2; // L: 13
		this.field2597 = var3; // L: 14
		this.field2598 = var4; // L: 15
		this.field2599 = var5; // L: 16
		this.field2595 = var6; // L: 17
	} // L: 18

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lga;",
		garbageValue = "-1342591919"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 54
		if (var1 != null) { // L: 55
			return var1; // L: 56
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 58
			var1 = new SequenceDefinition(); // L: 59
			if (var2 != null) { // L: 60
				var1.decode(new Buffer(var2)); // L: 61
			}

			var1.postDecode(); // L: 63
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 64
			return var1; // L: 65
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)Lmq;",
		garbageValue = "-51"
	)
	public static NodeDeque method4611() {
		return Client.scriptEvents; // L: 4997
	}
}
