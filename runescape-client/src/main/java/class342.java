import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class342 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	public class344 field3635;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	class339 field3630;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	class27 field3631;
	@ObfuscatedName("aj")
	public Object[] field3632;
	@ObfuscatedName("aq")
	public Object[] field3633;
	@ObfuscatedName("ar")
	public Object[] field3634;
	@ObfuscatedName("ag")
	public Object[] field3629;

	class342() {
		this.field3635 = new class344(); // L: 6
		this.field3630 = new class339(); // L: 7
		this.field3631 = new class27(); // L: 8
	} // L: 14

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-1290592831"
	)
	static final boolean method6370(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 232
		Buffer var4 = new Buffer(var0); // L: 233
		int var5 = -1; // L: 234

		label68:
		while (true) {
			int var6 = var4.method9404(); // L: 236
			if (var6 == 0) { // L: 237
				return var3; // L: 268
			}

			var5 += var6; // L: 238
			int var7 = 0; // L: 239
			boolean var8 = false; // L: 240

			while (true) {
				int var9;
				while (!var8) { // L: 242
					var9 = var4.readUShortSmart(); // L: 248
					if (var9 == 0) { // L: 249
						continue label68;
					}

					var7 += var9 - 1; // L: 250
					int var10 = var7 & 63; // L: 251
					int var11 = var7 >> 6 & 63; // L: 252
					int var12 = var4.readUnsignedByte() >> 2; // L: 253
					int var13 = var11 + var1; // L: 254
					int var14 = var10 + var2; // L: 255
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 256
						ObjectComposition var15 = class137.getObjectDefinition(var5); // L: 257
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 258
							if (!var15.needsModelFiles()) { // L: 259
								++Client.field555; // L: 260
								var3 = false; // L: 261
							}

							var8 = true; // L: 263
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 243
				if (var9 == 0) { // L: 244
					break;
				}

				var4.readUnsignedByte(); // L: 245
			}
		}
	}
}
