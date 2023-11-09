import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class323 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "560060975"
	)
	static void method6094(Archive var0, int var1) {
		if (var0.field4250) { // L: 62
			if (var1 <= NetCache.field4291) { // L: 63
				throw new RuntimeException(""); // L: 64
			}

			if (var1 < NetCache.field4279) { // L: 66
				NetCache.field4279 = var1; // L: 67
			}
		} else {
			if (var1 >= NetCache.field4279) { // L: 71
				throw new RuntimeException(""); // L: 72
			}

			if (var1 > NetCache.field4291) { // L: 74
				NetCache.field4291 = var1; // L: 75
			}
		}

		if (Huffman.field3767 != null) { // L: 78
			World.method1826(var0, var1); // L: 79
		} else {
			ApproximateRouteStrategy.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 82
			NetCache.NetCache_archives[var1] = var0; // L: 83
		}
	} // L: 80 84

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "1234787118"
	)
	static final boolean method6092(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 214
		Buffer var4 = new Buffer(var0); // L: 215
		int var5 = -1; // L: 216

		label68:
		while (true) {
			int var6 = var4.method8981(); // L: 218
			if (var6 == 0) { // L: 219
				return var3; // L: 250
			}

			var5 += var6; // L: 220
			int var7 = 0; // L: 221
			boolean var8 = false; // L: 222

			while (true) {
				int var9;
				while (!var8) { // L: 224
					var9 = var4.readUShortSmart(); // L: 230
					if (var9 == 0) { // L: 231
						continue label68;
					}

					var7 += var9 - 1; // L: 232
					int var10 = var7 & 63; // L: 233
					int var11 = var7 >> 6 & 63; // L: 234
					int var12 = var4.readUnsignedByte() >> 2; // L: 235
					int var13 = var11 + var1; // L: 236
					int var14 = var10 + var2; // L: 237
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 238
						ObjectComposition var15 = class59.getObjectDefinition(var5); // L: 239
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 240
							if (!var15.needsModelFiles()) { // L: 241
								++Client.field624; // L: 242
								var3 = false; // L: 243
							}

							var8 = true; // L: 245
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 225
				if (var9 == 0) { // L: 226
					break;
				}

				var4.readUnsignedByte(); // L: 227
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmo;II)V",
		garbageValue = "-1654747219"
	)
	public static void method6096(Widget var0, int var1) {
		ItemComposition var2 = class230.ItemComposition_get(var1); // L: 1040
		var0.field3666.equipment[var2.maleModel] = var1 + 512; // L: 1041
		if (var2.maleModel1 != -1) { // L: 1042
			var0.field3666.equipment[var2.maleModel1] = 0; // L: 1043
		}

		if (var2.maleModel2 != -1) { // L: 1045
			var0.field3666.equipment[var2.maleModel2] = 0; // L: 1046
		}

		var0.field3666.method6140(); // L: 1048
	} // L: 1049
}
