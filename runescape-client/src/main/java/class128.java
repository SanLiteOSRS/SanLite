import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class128 implements Callable {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1888844281
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	final class129 field1502;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	final class130 field1500;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	final class131 field1501;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1087939561
	)
	final int field1499;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	final class137 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfx;Ler;Lfj;Lfi;I)V"
	)
	class128(class137 var1, class129 var2, class130 var3, class131 var4, int var5) {
		this.this$0 = var1; // L: 273
		this.field1502 = var2; // L: 274
		this.field1500 = var3; // L: 275
		this.field1501 = var4; // L: 276
		this.field1499 = var5; // L: 277
	} // L: 278

	public Object call() {
		this.field1502.method2965(); // L: 282
		class129[][] var1;
		if (this.field1500 == class130.field1529) { // L: 284
			var1 = this.this$0.field1577; // L: 285
		} else {
			var1 = this.this$0.field1576; // L: 288
		}

		var1[this.field1499][this.field1501.method3009()] = this.field1502; // L: 290
		return null; // L: 291
	}
}
