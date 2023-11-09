import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -1206385217
	)
	static int field498;

	ApproximateRouteStrategy() {
	} // L: 12825

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILgw;I)Z",
		garbageValue = "1813316312"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12829
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "-1070341750"
	)
	public static VarcInt method1210(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 19
			var1 = new VarcInt(); // L: 20
			if (var2 != null) { // L: 21
				var1.method3573(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}
}
