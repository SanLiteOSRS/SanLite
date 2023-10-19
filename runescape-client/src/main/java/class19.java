import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class19 implements Callable {
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1387904025
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final class10 field101;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;Lag;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field101 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field101.method88()) { // L: 53
				Players.method2741(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field101.method89(); // L: 60
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "44"
	)
	static void method285(String var0, String var1, String var2) {
		GameEngine.method647(7); // L: 1229
		AbstractWorldMapIcon.setLoginResponseString(var0, var1, var2); // L: 1230
	} // L: 1231

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "770676496"
	)
	protected static final void method283() {
		class314.clock.mark(); // L: 432

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 433
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 434
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class160.gameCyclesToDo = 0; // L: 435
	} // L: 436

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "-11"
	)
	static final void method280(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8610

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8611 8612 8617
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8613
				var10 = var11; // L: 8614
				break;
			}
		}

		if (var10 == null) { // L: 8619
			var10 = new PendingSpawn(); // L: 8620
			var10.plane = var0; // L: 8621
			var10.type = var3; // L: 8622
			var10.x = var1; // L: 8623
			var10.y = var2; // L: 8624
			var10.field1180 = -1; // L: 8625
			GrandExchangeOfferOwnWorldComparator.method1237(var10); // L: 8626
			Client.pendingSpawns.addFirst(var10); // L: 8627
		}

		var10.field1177 = var4; // L: 8629
		var10.field1173 = var5; // L: 8630
		var10.field1170 = var6; // L: 8631
		var10.delay = var8; // L: 8632
		var10.hitpoints = var9; // L: 8633
		var10.method2413(var7); // L: 8634
	} // L: 8635

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1266586426"
	)
	static final void method284(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9310
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9311
				Client.field739[var4] = true;
			}
		}

	} // L: 9313
}
