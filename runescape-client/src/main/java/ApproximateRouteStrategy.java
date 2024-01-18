import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 12893

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILii;I)Z",
		garbageValue = "-1725376681"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12897
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-86"
	)
	public static boolean method1233(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class400.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}
}
