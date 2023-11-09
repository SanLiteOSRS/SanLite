import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class129 implements Callable {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class130 field1524;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class131 field1527;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	final class132 field1525;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 912043257
	)
	final int field1526;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfw;Lfp;Lfz;Lfl;I)V"
	)
	class129(class138 var1, class130 var2, class131 var3, class132 var4, int var5) {
		this.this$0 = var1; // L: 296
		this.field1524 = var2; // L: 297
		this.field1527 = var3; // L: 298
		this.field1525 = var4; // L: 299
		this.field1526 = var5; // L: 300
	} // L: 301

	public Object call() {
		this.field1524.method3059(); // L: 305
		class130[][] var1;
		if (this.field1527 == class131.field1554) { // L: 307
			var1 = this.this$0.field1605; // L: 308
		} else {
			var1 = this.this$0.field1603; // L: 311
		}

		var1[this.field1526][this.field1525.method3117()] = this.field1524; // L: 313
		return null; // L: 314
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "609423106"
	)
	public static class505 method3056(int var0) {
		class505 var1 = (class505)class505.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class505.field5042.takeFile(39, var0); // L: 25
			var1 = new class505(); // L: 26
			if (var2 != null) { // L: 27
				var1.method8931(new Buffer(var2));
			}

			var1.method8932(); // L: 28
			class505.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1212448447"
	)
	public static void method3054() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 82
	} // L: 83

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "2122733192"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 141
		int var2 = 0; // L: 142

		for (int var3 = 0; var3 < var1; ++var3) { // L: 143
			var2 = (var2 << 5) - var2 + UserComparator4.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 144
	}
}
