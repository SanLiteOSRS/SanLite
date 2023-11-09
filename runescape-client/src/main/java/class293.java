import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public final class class293 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 1436109859624790083L
	)
	static long field3362;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 5764352098133378973L
	)
	static long field3363;

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "16777216"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class31.logOut(); // L: 2797
		switch(var0) { // L: 2798
		case 1:
			class220.method4514(); // L: 2801
			break;
		case 2:
			UrlRequest.method2867(); // L: 2806
		}

	} // L: 2810
}
