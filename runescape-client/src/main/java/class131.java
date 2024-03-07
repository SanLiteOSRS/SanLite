import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fi")
public class class131 implements Callable {
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1006746715
	)
	static int field1550;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class132 field1554;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class133 field1549;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	final class134 field1551;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 260663393
	)
	final int field1552;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class140 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;Lfr;Lfv;Lfj;I)V"
	)
	class131(class140 var1, class132 var2, class133 var3, class134 var4, int var5) {
		this.this$0 = var1; // L: 277
		this.field1554 = var2; // L: 278
		this.field1549 = var3; // L: 279
		this.field1551 = var4; // L: 280
		this.field1552 = var5; // L: 281
	} // L: 282

	public Object call() {
		this.field1554.method3100(); // L: 286
		class132[][] var1;
		if (this.field1549 == class133.field1580) { // L: 288
			var1 = this.this$0.field1634; // L: 289
		} else {
			var1 = this.this$0.field1632; // L: 292
		}

		var1[this.field1552][this.field1551.method3124()] = this.field1554; // L: 294
		return null; // L: 295
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1672712163"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 218
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 219
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 220
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 221
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 222
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 223
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 224
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 225
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 226 227
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-53"
	)
	static void method3076(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
