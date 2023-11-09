import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1450812361
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -240859239
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 198021599
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1782298893
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 919937913
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "266902952"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 36
	} // L: 37

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IB)V",
		garbageValue = "116"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqw;III)V",
		garbageValue = "1715536911"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 48
			this.rgb = var1.readMedium();
		}

	} // L: 50

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-340320363"
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
		double var16 = (var10 + var8) / 2.0D; // L: 64
		if (var8 != var10) { // L: 65
			if (var16 < 0.5D) { // L: 66
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 67
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 68
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 69
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
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
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D); // L: 80
		}

		if (this.hueMultiplier < 1) { // L: 81
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 82
	} // L: 83

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lku;",
		garbageValue = "2"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 220
		int var2 = var0 & 65535; // L: 221
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) { // L: 222
			boolean var3 = ReflectionCheck.loadInterface(var1); // L: 223
			if (!var3) { // L: 224
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2]; // L: 226
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "342030351"
	)
	static final void method3543(int var0) {
		if (var0 >= 0) { // L: 8560
			int var1 = Client.menuArguments1[var0]; // L: 8561
			int var2 = Client.menuArguments2[var0]; // L: 8562
			int var3 = Client.menuOpcodes[var0]; // L: 8563
			int var4 = Client.menuIdentifiers[var0]; // L: 8564
			int var5 = Client.field638[var0]; // L: 8565
			String var6 = Client.menuActions[var0]; // L: 8566
			String var7 = Client.menuTargets[var0]; // L: 8567
			class9.method78(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8568
		}
	} // L: 8569
}
