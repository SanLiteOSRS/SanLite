import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class393 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	static final class393 field4519;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	static final class393 field4518;
	@ObfuscatedName("aw")
	final String field4520;

	static {
		field4519 = new class393("Basic"); // L: 4
		field4518 = new class393("Bearer"); // L: 5
	}

	class393(String var1) {
		this.field4520 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "43"
	)
	String method7621() {
		return this.field4520; // L: 13
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Lmq;B)Z",
		garbageValue = "1"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12068
	}
}
