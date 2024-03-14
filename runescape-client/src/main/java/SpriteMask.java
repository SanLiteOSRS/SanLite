import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	static Bounds field3613;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2078688393
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -527389665
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("al")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ai")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1068
		this.height = var2; // L: 1069
		this.xWidths = var3; // L: 1070
		this.xStarts = var4; // L: 1071
	} // L: 1072

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "18"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1075
			int var3 = this.xStarts[var2]; // L: 1076
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1077
				return true;
			}
		}

		return false; // L: 1079
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1762638973"
	)
	static final void method6399(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12359
		if (var0 != class30.clientPreferences.method2544()) { // L: 12360
			if (class30.clientPreferences.method2544() == 0 && VarbitComposition.method3831()) { // L: 12361
				Interpreter.method2056(Renderable.field2921, var0); // L: 12362
				Client.playingJingle = false; // L: 12363
			} else if (var0 == 0) { // L: 12365
				class169.method3521(0, 0); // L: 12366
				Client.playingJingle = false; // L: 12367
			} else if (!class321.field3474.isEmpty()) { // L: 12370
				Iterator var1 = class321.field3474.iterator(); // L: 12371

				while (var1.hasNext()) {
					class333 var2 = (class333)var1.next(); // L: 12372
					if (var2 != null) { // L: 12374
						var2.field3592 = var0; // L: 12377
					}
				}

				class333 var3 = (class333)class321.field3474.get(0); // L: 12380
				if (var3 != null && var3.field3594 != null && var3.field3594.isReady() && !var3.field3597) { // L: 12381
					var3.field3594.setPcmStreamVolume(var0); // L: 12382
					var3.field3602 = (float)var0; // L: 12383
				}
			}

			class30.clientPreferences.method2556(var0); // L: 12387
		}

	} // L: 12389
}
