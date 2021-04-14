import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		signature = "Lbh;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 184377472
	)
	static int field592;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIILel;I)Z",
		garbageValue = "120127354"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "56"
	)
	public static void method1205() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lhu;I[B[BI)V",
		garbageValue = "-358433365"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2699 == null) {
			if (var2 == null) {
				return;
			}

			var0.field2699 = new byte[11][];
			var0.field2747 = new byte[11][];
			var0.field2701 = new int[11];
			var0.field2692 = new int[11];
		}

		var0.field2699[var1] = var2;
		if (var2 != null) {
			var0.field2698 = true;
		} else {
			var0.field2698 = false;

			for (int var4 = 0; var4 < var0.field2699.length; ++var4) {
				if (var0.field2699[var4] != null) {
					var0.field2698 = true;
					break;
				}
			}
		}

		var0.field2747[var1] = var3;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-61"
	)
	static boolean method1206() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
