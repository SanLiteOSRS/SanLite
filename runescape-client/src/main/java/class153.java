import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class153 extends class135 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1481780439
	)
	int field1720;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1421693743
	)
	int field1719;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class153(class138 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		this.field1720 = var1.readInt(); // L: 274
		this.field1719 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.method3116(this.field1720, this.field1719); // L: 279
	} // L: 280

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lqj;",
		garbageValue = "35817219"
	)
	public static class458 method3196(int var0) {
		class458 var1 = (class458)class458.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class458.field4848.takeFile(38, var0); // L: 26
			var1 = new class458(); // L: 27
			if (var2 != null) { // L: 28
				var1.method8306(new Buffer(var2));
			}

			var1.method8309(); // L: 29
			class458.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
