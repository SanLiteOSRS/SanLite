import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		longValue = -3968021499924867655L
	)
	static long field2499;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1830367773
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 488993931
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 212406311
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -5502089969894061195L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2018612915
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "759565724"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 178
			int var6 = (var0 + var1) / 2; // L: 179
			int var7 = var0; // L: 180
			World var8 = UserComparator3.World_worlds[var6]; // L: 181
			UserComparator3.World_worlds[var6] = UserComparator3.World_worlds[var1]; // L: 182
			UserComparator3.World_worlds[var1] = var8; // L: 183

			for (int var9 = var0; var9 < var1; ++var9) { // L: 184
				if (DevicePcmPlayerProvider.method312(UserComparator3.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 185
					World var10 = UserComparator3.World_worlds[var9]; // L: 186
					UserComparator3.World_worlds[var9] = UserComparator3.World_worlds[var7]; // L: 187
					UserComparator3.World_worlds[var7++] = var10; // L: 188
				}
			}

			UserComparator3.World_worlds[var1] = UserComparator3.World_worlds[var7]; // L: 192
			UserComparator3.World_worlds[var7] = var8; // L: 193
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 194
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 195
		}

	} // L: 197

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "0"
	)
	static final void method4500(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) { // L: 11355
			var1 = var0.field3807; // L: 11356
			var2 = var0.id; // L: 11357
			var3 = var0.itemId; // L: 11358
			class208.method3848(var1, "", 24, 0, 0, var2, var3, false); // L: 11360
		}

		int var4;
		String var8;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11364
			var1 = class155.Widget_getSpellActionName(var0); // L: 11365
			if (var1 != null) { // L: 11366
				var8 = Client.colorStartTag(65280) + var0.field3806; // L: 11367
				var3 = var0.id; // L: 11368
				var4 = var0.itemId; // L: 11369
				class208.method3848(var1, var8, 25, 0, -1, var3, var4, false); // L: 11371
			}
		}

		if (var0.buttonType == 3) { // L: 11376
			class153.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11377
		}

		if (var0.buttonType == 4) { // L: 11380
			class153.insertMenuItemNoShift(var0.field3807, "", 28, 0, 0, var0.id); // L: 11381
		}

		if (var0.buttonType == 5) { // L: 11384
			class153.insertMenuItemNoShift(var0.field3807, "", 29, 0, 0, var0.id); // L: 11385
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11388
			class153.insertMenuItemNoShift(var0.field3807, "", 30, 0, -1, var0.id); // L: 11389
		}

		if (var0.isIf3) { // L: 11392
			int var5;
			int var6;
			int var7;
			String var10;
			if (Client.isSpellSelected) { // L: 11393
				var2 = MouseRecorder.getWidgetFlags(var0); // L: 11395
				boolean var9 = (var2 >> 21 & 1) != 0; // L: 11397
				if (var9 && (class31.field173 & 32) == 32) { // L: 11399
					var10 = Client.field751; // L: 11400
					String var11 = Client.field688 + " " + "->" + " " + var0.dataText; // L: 11401
					var5 = var0.childIndex; // L: 11402
					var6 = var0.id; // L: 11403
					var7 = var0.itemId; // L: 11404
					class208.method3848(var10, var11, 58, 0, var5, var6, var7, false); // L: 11406
				}
			} else {
				for (int var12 = 9; var12 >= 5; --var12) { // L: 11412
					var8 = class231.method4382(var0, var12); // L: 11413
					if (var8 != null) { // L: 11414
						var10 = var0.dataText; // L: 11415
						var4 = var12 + 1; // L: 11416
						var5 = var0.childIndex; // L: 11417
						var6 = var0.id; // L: 11418
						var7 = var0.itemId; // L: 11419
						class208.method3848(var8, var10, 1007, var4, var5, var6, var7, false); // L: 11421
					}
				}

				var1 = class155.Widget_getSpellActionName(var0); // L: 11426
				if (var1 != null) { // L: 11427
					var8 = var0.dataText; // L: 11428
					var3 = var0.childIndex; // L: 11429
					var4 = var0.id; // L: 11430
					var5 = var0.itemId; // L: 11431
					class208.method3848(var1, var8, 25, 0, var3, var4, var5, false); // L: 11433
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 11437
					var10 = class231.method4382(var0, var2); // L: 11438
					if (var10 != null) { // L: 11439
						class208.method3848(var10, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11440
					}
				}

				if (class146.method3161(MouseRecorder.getWidgetFlags(var0))) { // L: 11444
					class153.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11445
				}
			}
		}

	} // L: 11450
}
