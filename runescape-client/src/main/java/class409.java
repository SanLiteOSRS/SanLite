import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class409 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	public static final class409 field4549;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static final class409 field4548;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 170219121
	)
	final int field4547;

	static {
		field4549 = new class409(0); // L: 5
		field4548 = new class409(1); // L: 6
	}

	class409(int var1) {
		this.field4547 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "23"
	)
	public static void method7687(int var0, int var1) {
		Iterator var2 = class304.field3388.iterator(); // L: 44

		while (var2.hasNext()) {
			class312 var3 = (class312)var2.next(); // L: 45
			var3.vmethod5914(var0, var1); // L: 47
		}

	} // L: 50
}
