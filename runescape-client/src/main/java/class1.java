import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class1 implements Callable {
	@ObfuscatedName("ag")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = 43392043
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final Buffer field6;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ln;Lrd;Ls;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field6 = var2; // L: 48
		this.field1 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field1.vmethod12(this.field6); // L: 54
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llm;II)V",
		garbageValue = "-2059005384"
	)
	static void method9(Archive var0, int var1) {
		class10.field56.offset = var1 * 8 + 5; // L: 217
		if (class10.field56.offset >= class10.field56.array.length) { // L: 218
			if (var0.field4205) { // L: 219
				var0.method6480(); // L: 220
			} else {
				throw new RuntimeException(""); // L: 223
			}
		} else {
			int var2 = class10.field56.readInt(); // L: 225
			int var3 = class10.field56.readInt(); // L: 226
			var0.loadIndex(var2, var3); // L: 227
		}
	} // L: 221 228
}
