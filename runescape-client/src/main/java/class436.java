import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
class class436 implements Comparator {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	final class435 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqp;)V"
	)
	class436(class435 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1477804985"
	)
	int method8117(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method8117((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;B)V",
		garbageValue = "-63"
	)
	public static void method8118(AbstractArchive var0) {
		class523.field5124 = var0; // L: 20
	} // L: 21

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIIIIII)V",
		garbageValue = "1180138764"
	)
	static final void method8125(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field581) { // L: 11070
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11071
		}

		Client.field581 = false; // L: 11072
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11073
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11074
				var0.scrollY -= 4; // L: 11075
				FaceNormal.invalidateWidget(var0); // L: 11076
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11078
				var0.scrollY += 4; // L: 11079
				FaceNormal.invalidateWidget(var0); // L: 11080
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11082
				var7 = var3 * (var3 - 32) / var4; // L: 11083
				if (var7 < 8) { // L: 11084
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11085
				int var9 = var3 - 32 - var7; // L: 11086
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11087
				FaceNormal.invalidateWidget(var0); // L: 11088
				Client.field581 = true; // L: 11089
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11092
			var7 = var0.width; // L: 11093
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11094
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11095
				FaceNormal.invalidateWidget(var0); // L: 11096
			}
		}

	} // L: 11099
}
