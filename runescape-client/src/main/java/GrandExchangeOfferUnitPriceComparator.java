import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("no")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 1915876021
	)
	static int field4269;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;I)I",
		garbageValue = "-698884156"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "146398086"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 165
		int var4 = 0; // L: 166

		for (int var5 = 0; var5 < var2; ++var5) { // L: 167
			int var6 = var0[var5 + var1] & 255; // L: 168
			if (var6 != 0) { // L: 169
				if (var6 >= 128 && var6 < 160) { // L: 170
					char var7 = class365.cp1252AsciiExtension[var6 - 128]; // L: 171
					if (var7 == 0) { // L: 172
						var7 = '?';
					}

					var6 = var7; // L: 173
				}

				var3[var4++] = (char)var6; // L: 175
			}
		}

		return new String(var3, 0, var4); // L: 177
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-1107467981"
	)
	static int method6602(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1494
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1495
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1496
			return 1; // L: 1497
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1499
			if (var3.itemId != -1) { // L: 1500
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1501
			}

			return 1; // L: 1502
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1504
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1505
			return 1; // L: 1506
		} else if (var0 == 1707) { // L: 1508
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6191() ? 1 : 0; // L: 1509
			return 1; // L: 1510
		} else if (var0 == 1708) { // L: 1512
			return World.method1830(var3); // L: 1513
		} else {
			return var0 == 1709 ? class420.method7841(var3) : 2; // L: 1515 1516 1518
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-29"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5470
			int var3 = WorldMapDecorationType.getTileHeight(var0, var1, TaskHandler.Client_plane) - var2; // L: 5475
			var0 -= class381.cameraX; // L: 5476
			var3 -= class351.cameraY; // L: 5477
			var1 -= class471.cameraZ; // L: 5478
			int var4 = Rasterizer3D.Rasterizer3D_sine[class311.cameraPitch]; // L: 5479
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class311.cameraPitch]; // L: 5480
			int var6 = Rasterizer3D.Rasterizer3D_sine[class110.cameraYaw]; // L: 5481
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class110.cameraYaw]; // L: 5482
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5483
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5484
			var0 = var8; // L: 5485
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5486
			var1 = var4 * var3 + var5 * var1 >> 16; // L: 5487
			if (var1 >= 50) { // L: 5489
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5490
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5491
			} else {
				Client.viewportTempX = -1; // L: 5494
				Client.viewportTempY = -1; // L: 5495
			}

		} else {
			Client.viewportTempX = -1; // L: 5471
			Client.viewportTempY = -1; // L: 5472
		}
	} // L: 5473 5497
}
