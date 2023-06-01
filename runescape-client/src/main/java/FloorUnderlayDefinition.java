import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field2088;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 129794981
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1767058647
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1994151999
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1169760221
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 717169971
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "578646885"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 36
	} // L: 37

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)V",
		garbageValue = "59"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 41
			if (var3 == 0) { // L: 42
				return; // L: 45
			}

			this.decodeNext(var1, var3, var2); // L: 43
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IIB)V",
		garbageValue = "-75"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 48
			this.rgb = var1.readMedium();
		}

	} // L: 50

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1983423580"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 53
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 54
		double var6 = (double)(var1 & 255) / 256.0D; // L: 55
		double var8 = var2; // L: 56
		if (var4 < var2) { // L: 57
			var8 = var4;
		}

		if (var6 < var8) { // L: 58
			var8 = var6;
		}

		double var10 = var2; // L: 59
		if (var4 > var2) { // L: 60
			var10 = var4;
		}

		if (var6 > var10) { // L: 61
			var10 = var6;
		}

		double var12 = 0.0D; // L: 62
		double var14 = 0.0D; // L: 63
		double var16 = (var8 + var10) / 2.0D; // L: 64
		if (var8 != var10) { // L: 65
			if (var16 < 0.5D) { // L: 66
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 67
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 68
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 69
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 70
			}
		}

		var12 /= 6.0D; // L: 72
		this.saturation = (int)(var14 * 256.0D); // L: 73
		this.lightness = (int)(var16 * 256.0D); // L: 74
		if (this.saturation < 0) { // L: 75
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 76
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 77
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 78
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 79
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14); // L: 80
		}

		if (this.hueMultiplier < 1) { // L: 81
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 82
	} // L: 83

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-473664412"
	)
	public static int method3768(int var0) {
		return class452.field4740[var0 & 16383]; // L: 33
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-946694095"
	)
	static final void method3759() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4912 4913 4920
			if (var0.plane == NetFileRequest.Client_plane && !var0.isFinished) { // L: 4914
				if (Client.cycle >= var0.cycleStart) { // L: 4915
					var0.advance(Client.field558); // L: 4916
					if (var0.isFinished) {
						var0.remove(); // L: 4917
					} else {
						UserComparator4.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 4918
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4922
}
