import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class208 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static EvictingDualNodeHashTable field2100;

	static {
		field2100 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIIS)Z",
		garbageValue = "-1868"
	)
	static final boolean method3846(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 218
		Buffer var4 = new Buffer(var0); // L: 219
		int var5 = -1; // L: 220

		label71:
		while (true) {
			int var6 = var4.method9296(); // L: 222
			if (var6 == 0) { // L: 223
				return var3; // L: 254
			}

			var5 += var6; // L: 224
			int var7 = 0; // L: 225
			boolean var8 = false; // L: 226

			while (true) {
				int var9;
				while (!var8) { // L: 228
					var9 = var4.readUShortSmart(); // L: 234
					if (var9 == 0) { // L: 235
						continue label71;
					}

					var7 += var9 - 1; // L: 236
					int var10 = var7 & 63; // L: 237
					int var11 = var7 >> 6 & 63; // L: 238
					int var12 = var4.readUnsignedByte() >> 2; // L: 239
					int var13 = var11 + var1; // L: 240
					int var14 = var10 + var2; // L: 241
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 242
						ObjectComposition var15 = class91.getObjectDefinition(var5); // L: 243
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 244
							if (!var15.needsModelFiles()) { // L: 245
								++Client.field590; // L: 246
								var3 = false; // L: 247
							}

							var8 = true; // L: 249
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 229
				if (var9 == 0) { // L: 230
					break;
				}

				var4.readUnsignedByte(); // L: 231
			}
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-119"
	)
	static boolean method3847() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5367
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "1833009880"
	)
	static final void method3848(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10296
			if (Client.menuOptionsCount < 500) { // L: 10297
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10298
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10299
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10300
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10301
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10302
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10303
				Client.field671[Client.menuOptionsCount] = var6; // L: 10304
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10305
				++Client.menuOptionsCount; // L: 10306
			}

		}
	} // L: 10308
}
