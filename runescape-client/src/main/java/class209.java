import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class209 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class209 field2309;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class209 field2317;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class209 field2304;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class209 field2305;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class209 field2311;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class209 field2306;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class209 field2308;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class209 field2303;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class209 field2310;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class209 field2302;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class209 field2312;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class209 field2313;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class209 field2314;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class209 field2315;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -380460957
	)
	public final int field2316;

	static {
		field2309 = new class209(0); // L: 4
		field2317 = new class209(1); // L: 5
		field2304 = new class209(2); // L: 6
		field2305 = new class209(3); // L: 7
		field2311 = new class209(4, class197.field2060); // L: 8
		field2306 = new class209(5); // L: 9
		field2308 = new class209(6, class197.field2062); // L: 10
		field2303 = new class209(7, class197.field2065); // L: 11
		field2310 = new class209(8, class197.field2064); // L: 12
		field2302 = new class209(9, class197.field2063); // L: 13
		field2312 = new class209(10, class197.field2067); // L: 14
		field2313 = new class209(11, class197.field2059); // L: 15
		field2314 = new class209(12); // L: 16
		field2315 = new class209(13);
	}

	class209(int var1) {
		this(var1, (class197)null); // L: 25
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(ILhx;)V"
	)
	class209(int var1, class197 var2) {
		this.field2316 = var1; // L: 21
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1749354778"
	)
	public static boolean method4224(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ldh;I)Z",
		garbageValue = "-663313427"
	)
	static boolean method4223(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5275
			return false;
		} else {
			boolean var1;
			if (class27.localPlayer == var0) { // L: 5276
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 5290
				return var1; // L: 5292
			} else {
				var1 = WorldMapLabelSize.method5139(); // L: 5277
				if (!var1) { // L: 5278
					boolean var2 = (Client.drawPlayerNames & 1) != 0; // L: 5281
					var1 = var2 && var0.method2347(); // L: 5283
				}

				return var1 || class90.method2343() && var0.method2392(); // L: 5285
			}
		}
	}
}
