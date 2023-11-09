import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class19 implements Callable {
	@ObfuscatedName("eu")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field92;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class10 field94;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lay;Lap;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field94 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field94.method94()) { // L: 53
				class219.method4260(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field94.method91(); // L: 60
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2072070052"
	)
	static void method295(int var0) {
		if (var0 != Client.loginState) { // L: 12940
			Client.loginState = var0; // L: 12941
		}
	} // L: 12942
}
