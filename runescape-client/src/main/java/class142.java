import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class142 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2045378669
	)
	int field1668;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class142(class146 var1) {
		this.this$0 = var1;
		this.field1668 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1668 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3185(this.field1668); // L: 123
	} // L: 124

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "1391970820"
	)
	static final boolean method3104(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 207
		Buffer var4 = new Buffer(var0); // L: 208
		int var5 = -1; // L: 209

		label70:
		while (true) {
			int var6 = var4.method9076(); // L: 211
			if (var6 == 0) { // L: 212
				return var3; // L: 243
			}

			var5 += var6; // L: 213
			int var7 = 0; // L: 214
			boolean var8 = false; // L: 215

			while (true) {
				int var9;
				while (!var8) { // L: 217
					var9 = var4.readUShortSmart(); // L: 223
					if (var9 == 0) { // L: 224
						continue label70;
					}

					var7 += var9 - 1; // L: 225
					int var10 = var7 & 63; // L: 226
					int var11 = var7 >> 6 & 63; // L: 227
					int var12 = var4.readUnsignedByte() >> 2; // L: 228
					int var13 = var11 + var1; // L: 229
					int var14 = var10 + var2; // L: 230
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 231
						ObjectComposition var15 = WorldMapElement.getObjectDefinition(var5); // L: 232
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 233
							if (!var15.needsModelFiles()) { // L: 234
								++Client.field598; // L: 235
								var3 = false; // L: 236
							}

							var8 = true; // L: 238
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 218
				if (var9 == 0) { // L: 219
					break;
				}

				var4.readUnsignedByte(); // L: 220
			}
		}
	}
}
