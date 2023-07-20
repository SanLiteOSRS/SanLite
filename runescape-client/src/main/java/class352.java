import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class352 {
	@ObfuscatedName("fg")
	public static String field4146;
	@ObfuscatedName("kl")
	public static String field3908;
	@ObfuscatedName("ks")
	public static String field4163;
	@ObfuscatedName("kj")
	public static String field4034;

	static {
		field4146 = "Please visit the support page for assistance."; // L: 137
		field3908 = ""; // L: 285
		field4163 = "Page has opened in the browser."; // L: 286
		field4034 = ""; // L: 287
	} // L: 330

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "189737600"
	)
	static final float method6663(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 13
		return (1.0075567F * var1 - 75.56675F) / var1; // L: 14
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2120353581"
	)
	static int method6664(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 70
		if (var1 == null) { // L: 71
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 72 73
		}
	}
}
