import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 12350

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILgl;B)Z",
		garbageValue = "57"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12354
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	static void method1070(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1447
		Client.archiveLoaders.add(var2); // L: 1448
		Client.field509 += var2.groupCount; // L: 1449
	} // L: 1450

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "574817710"
	)
	static final void method1068(Actor var0) {
		int var1 = Math.max(1, var0.field1182 - Client.cycle); // L: 4137
		int var2 = var0.field1178 * 128 + var0.field1190 * -1534074048; // L: 4138
		int var3 = var0.field1127 * 128 + var0.field1190 * -1534074048; // L: 4139
		var0.x += (var2 - var0.x) / var1; // L: 4140
		var0.y += (var3 - var0.y) / var1; // L: 4141
		var0.field1200 = 0; // L: 4142
		var0.orientation = var0.field1136; // L: 4143
	} // L: 4144

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1922987723"
	)
	static final void method1065(int var0) {
		if (var0 >= 0) { // L: 8391
			int var1 = Client.menuArguments1[var0]; // L: 8392
			int var2 = Client.menuArguments2[var0]; // L: 8393
			int var3 = Client.menuOpcodes[var0]; // L: 8394
			int var4 = Client.menuIdentifiers[var0]; // L: 8395
			int var5 = Client.field630[var0]; // L: 8396
			String var6 = Client.menuActions[var0]; // L: 8397
			String var7 = Client.menuTargets[var0]; // L: 8398
			class352.method6432(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8399
		}
	} // L: 8400

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	static void method1069(int var0) {
		if (var0 != Client.loginState) { // L: 12269
			Client.loginState = var0; // L: 12270
		}
	} // L: 12271

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "55"
	)
	static void method1071(boolean var0) {
		Client.field623 = var0; // L: 12274
	} // L: 12275
}
