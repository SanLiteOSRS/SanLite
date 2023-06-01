import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ar")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1066870815
	)
	@Export("width")
	public int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -127514403
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ax")
	protected float[] field5094;

	protected AbstractRasterProvider() {
	} // L: 9

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-556859416"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1400620139"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "841882349"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9283(this.pixels, this.width, this.height, this.field5094); // L: 12
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "552235877"
	)
	public final void method9372(boolean var1) {
		this.field5094 = var1 ? new float[this.height * this.width + 1] : null; // L: 19
	} // L: 20

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I[B[BI)V",
		garbageValue = "-1395399126"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3694 == null) { // L: 1201
			if (var2 == null) { // L: 1202
				return; // L: 1208
			}

			var0.field3694 = new byte[11][]; // L: 1203
			var0.field3685 = new byte[11][]; // L: 1204
			var0.field3686 = new int[11]; // L: 1205
			var0.field3687 = new int[11]; // L: 1206
		}

		var0.field3694[var1] = var2; // L: 1210
		if (var2 != null) {
			var0.field3736 = true; // L: 1211
		} else {
			var0.field3736 = false; // L: 1213

			for (int var4 = 0; var4 < var0.field3694.length; ++var4) { // L: 1214
				if (var0.field3694[var4] != null) { // L: 1215
					var0.field3736 = true; // L: 1216
					break;
				}
			}
		}

		var0.field3685[var1] = var3; // L: 1221
	} // L: 1222

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1878177975"
	)
	static void method9369(int var0) {
		SequenceDefinition var1 = class149.SequenceDefinition_get(var0); // L: 12665
		if (var1.isCachedModelIdSet()) { // L: 12666
			int var3 = var1.SequenceDefinition_cachedModelId; // L: 12670
			class137 var4 = class142.method3102(var3); // L: 12672
			int var2;
			if (var4 == null) { // L: 12673
				var2 = 2; // L: 12674
			} else {
				var2 = var4.method3068() ? 0 : 1; // L: 12677
			}

			if (var2 == 2) { // L: 12679
				Client.field777.add(var1.SequenceDefinition_cachedModelId); // L: 12680
			}

		}
	} // L: 12667 12682
}
