import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class127 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 300976639
	)
	int field1501;
	@ObfuscatedName("aw")
	float field1500;
	@ObfuscatedName("al")
	float field1503;
	@ObfuscatedName("ai")
	float field1502;
	@ObfuscatedName("ar")
	float field1499;
	@ObfuscatedName("as")
	float field1506;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	class127 field1505;

	class127() {
		this.field1503 = Float.MAX_VALUE; // L: 8
		this.field1502 = Float.MAX_VALUE; // L: 9
		this.field1499 = Float.MAX_VALUE; // L: 10
		this.field1506 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1382456271"
	)
	void method2994(Buffer var1, int var2) {
		this.field1501 = var1.readShort(); // L: 17
		this.field1500 = var1.method9481(); // L: 18
		this.field1503 = var1.method9481(); // L: 19
		this.field1502 = var1.method9481(); // L: 20
		this.field1499 = var1.method9481(); // L: 21
		this.field1506 = var1.method9481(); // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "-1080781222"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 75
		if (var1 != null) { // L: 76
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 77
			var1 = new ObjectComposition(); // L: 78
			var1.id = var0; // L: 79
			if (var2 != null) { // L: 80
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 81
			if (var1.isSolid) { // L: 82
				var1.interactType = 0; // L: 83
				var1.boolean1 = false; // L: 84
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 86
			return var1; // L: 87
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "72"
	)
	static final boolean method2999(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 228
		Buffer var4 = new Buffer(var0); // L: 229
		int var5 = -1; // L: 230

		label71:
		while (true) {
			int var6 = var4.method9660(); // L: 232
			if (var6 == 0) { // L: 233
				return var3; // L: 264
			}

			var5 += var6; // L: 234
			int var7 = 0; // L: 235
			boolean var8 = false; // L: 236

			while (true) {
				int var9;
				while (!var8) { // L: 238
					var9 = var4.readUShortSmart(); // L: 244
					if (var9 == 0) { // L: 245
						continue label71;
					}

					var7 += var9 - 1; // L: 246
					int var10 = var7 & 63; // L: 247
					int var11 = var7 >> 6 & 63; // L: 248
					int var12 = var4.readUnsignedByte() >> 2; // L: 249
					int var13 = var11 + var1; // L: 250
					int var14 = var10 + var2; // L: 251
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 252
						ObjectComposition var15 = getObjectDefinition(var5); // L: 253
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 254
							if (!var15.needsModelFiles()) { // L: 255
								++Client.field621; // L: 256
								var3 = false; // L: 257
							}

							var8 = true; // L: 259
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 239
				if (var9 == 0) { // L: 240
					break;
				}

				var4.readUnsignedByte(); // L: 241
			}
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1602956230"
	)
	static int method2998(int var0, int var1) {
		int var2 = var1 - 334; // L: 5812
		if (var2 < 0) { // L: 5813
			var2 = 0;
		} else if (var2 > 100) { // L: 5814
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5815
		return var0 * var3 / 256; // L: 5816
	}
}
