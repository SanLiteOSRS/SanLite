import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class233 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1542692534"
	)
	public static int method4850(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 30
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 31
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 32
		var0 += var0 >>> 8; // L: 33
		var0 += var0 >>> 16; // L: 34
		return var0 & 255; // L: 35
	}
}
