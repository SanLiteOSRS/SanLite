import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ie")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public static AbstractArchive field2130;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static EvictingDualNodeHashTable field2129;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1507604097
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 998554633
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -669765385
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1682350191
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1538783211
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		field2129 = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1890021577"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 32
	} // L: 33

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "1012239262"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 37
			if (var3 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var3, var2); // L: 39
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;III)V",
		garbageValue = "2138795593"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 44
			this.rgb = var1.readMedium();
		}

	} // L: 46

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1881157581"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 49
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 50
		double var6 = (double)(var1 & 255) / 256.0D; // L: 51
		double var8 = var2; // L: 52
		if (var4 < var2) { // L: 53
			var8 = var4;
		}

		if (var6 < var8) { // L: 54
			var8 = var6;
		}

		double var10 = var2; // L: 55
		if (var4 > var2) { // L: 56
			var10 = var4;
		}

		if (var6 > var10) { // L: 57
			var10 = var6;
		}

		double var12 = 0.0D; // L: 58
		double var14 = 0.0D; // L: 59
		double var16 = (var10 + var8) / 2.0D; // L: 60
		if (var10 != var8) { // L: 61
			if (var16 < 0.5D) { // L: 62
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 63
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 64
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 65
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 66
			}
		}

		var12 /= 6.0D; // L: 68
		this.saturation = (int)(var14 * 256.0D); // L: 69
		this.lightness = (int)(var16 * 256.0D); // L: 70
		if (this.saturation < 0) { // L: 71
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 72
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 73
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 74
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 75
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D); // L: 76
		}

		if (this.hueMultiplier < 1) { // L: 77
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 78
	} // L: 79

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "65"
	)
	static final int method3881(int var0, int var1) {
		if (var0 == -2) { // L: 984
			return 12345678;
		} else if (var0 == -1) { // L: 985
			if (var1 < 2) {
				var1 = 2; // L: 986
			} else if (var1 > 126) { // L: 987
				var1 = 126;
			}

			return var1; // L: 988
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 990
			if (var1 < 2) { // L: 991
				var1 = 2;
			} else if (var1 > 126) { // L: 992
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 993
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "508880574"
	)
	static float[] method3882(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 329

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 331
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 332
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 333
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 334
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 335
		} catch (JSONException var4) { // L: 337
			var2[0] = 0.0F; // L: 338
			var2[1] = 0.0F; // L: 339
			var2[2] = 1.0F; // L: 340
			var2[3] = 1.0F; // L: 341
		}

		return var2; // L: 343
	}
}
