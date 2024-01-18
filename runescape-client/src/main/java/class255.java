import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class255 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lrh;",
		garbageValue = "-163160714"
	)
	public static class466 method5035() {
		synchronized(class466.field4811) { // L: 27
			if (class431.field4647 == 0) { // L: 28
				return new class466();
			} else {
				class466.field4811[--class431.field4647].method8546(); // L: 30
				return class466.field4811[class431.field4647]; // L: 31
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-2864"
	)
	static void method5036() {
		Actor.method2489(24); // L: 1998
		class142.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 1999
	} // L: 2000
}
