import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class169 extends class181 {
	@ObfuscatedName("ay")
	String field1801;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgu;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class169(class170 var1, String var2, String var3) {
		super(var1, var2); // L: 412
		this.this$0 = var1; // L: 411
		this.field1801 = var3; // L: 413
	} // L: 414

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-3"
	)
	public int vmethod3520() {
		return 1; // L: 417
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String vmethod3523() {
		return this.field1801; // L: 422
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "1"
	)
	static final int method3363(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 13
	}
}
