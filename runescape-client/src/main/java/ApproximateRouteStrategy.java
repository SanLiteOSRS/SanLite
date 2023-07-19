import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	ApproximateRouteStrategy() {
	} // L: 12974

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIILig;B)Z",
		garbageValue = "-69"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12978
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "45"
	)
	static final int method1230(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 899
		int var4 = var0 & var2 - 1; // L: 900
		int var5 = var1 / var2; // L: 901
		int var6 = var1 & var2 - 1; // L: 902
		int var7 = WorldMapDecoration.method5544(var3, var5); // L: 903
		int var8 = WorldMapDecoration.method5544(var3 + 1, var5); // L: 904
		int var9 = WorldMapDecoration.method5544(var3, var5 + 1); // L: 905
		int var10 = WorldMapDecoration.method5544(var3 + 1, var5 + 1); // L: 906
		int var11 = SecureRandomCallable.method2273(var7, var8, var4, var2); // L: 907
		int var12 = SecureRandomCallable.method2273(var9, var10, var4, var2); // L: 908
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 911
		int var13 = ((65536 - var14) * var11 >> 16) + (var12 * var14 >> 16); // L: 912
		return var13; // L: 914
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "-32"
	)
	static int method1231(int var0, Script var1, boolean var2) {
		return 2; // L: 5092
	}
}
