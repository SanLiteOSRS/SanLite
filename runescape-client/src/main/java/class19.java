import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class19 implements Callable {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	static IndexedSprite field109;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	final class10 field110;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lt;Lc;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field110 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field110.method103()) { // L: 53
				Clock.method3567(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field110.method99(); // L: 60
	}
}
