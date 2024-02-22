import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class318 {
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1267961965
	)
	static int field3457;
	@ObfuscatedName("id")
	static int[] field3461;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-77"
	)
	public static int method6083(int var0) {
		--var0; // L: 77
		var0 |= var0 >>> 1; // L: 78
		var0 |= var0 >>> 2; // L: 79
		var0 |= var0 >>> 4; // L: 80
		var0 |= var0 >>> 8; // L: 81
		var0 |= var0 >>> 16; // L: 82
		return var0 + 1; // L: 83
	}
}
