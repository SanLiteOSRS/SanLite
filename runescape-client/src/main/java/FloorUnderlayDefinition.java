import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1649414567
	)
	static int field2096;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 86825461
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 372444635
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1058265139
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1527986335
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2012234183
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "875414437"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb); // L: 23
	} // L: 24

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "-2029421932"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 28
			if (var3 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var3, var2); // L: 30
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IIB)V",
		garbageValue = "-64"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 35
			this.rgb = var1.readMedium();
		}

	} // L: 37

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2063363905"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 40
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 41
		double var6 = (double)(var1 & 255) / 256.0D; // L: 42
		double var8 = var2; // L: 43
		if (var4 < var2) { // L: 44
			var8 = var4;
		}

		if (var6 < var8) { // L: 45
			var8 = var6;
		}

		double var10 = var2; // L: 46
		if (var4 > var2) { // L: 47
			var10 = var4;
		}

		if (var6 > var10) { // L: 48
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 56
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 66
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14);
		}

		if (this.hueMultiplier < 1) { // L: 68
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12);
	}

	@ObfuscatedName("aw")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 49
			if (var0 % 37L == 0L) { // L: 50
				return null;
			} else {
				int var2 = 0; // L: 51

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 52 53 55
					++var2; // L: 54
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 67
					long var6 = var0;
					var0 /= 37L;
					var8 = class373.base37Table[(int)(var6 - var0 * 37L)]; // L: 61
					if (var8 == '_') { // L: 62
						int var9 = var5.length() - 1; // L: 63
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 64
						var8 = 160; // L: 65
					}
				}

				var5.reverse(); // L: 69
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 70
				return var5.toString(); // L: 71
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-852125385"
	)
	public static void method3865() {
		class475.midiPcmStream.clear(); // L: 57
		class297.musicPlayerStatus = 1; // L: 58
		class297.musicTrackArchive = null; // L: 59
	} // L: 60
}
