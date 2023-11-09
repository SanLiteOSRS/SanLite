import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fr")
	public static String field4017;
	@ObfuscatedName("kz")
	public static String field4150;
	@ObfuscatedName("ki")
	public static String field4151;
	@ObfuscatedName("kq")
	public static String field4152;

	static {
		field4017 = "Please visit the support page for assistance."; // L: 137
		field4150 = ""; // L: 285
		field4151 = "Page has opened in the browser."; // L: 286
		field4152 = ""; // L: 287
	} // L: 330

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "1781801172"
	)
	static final void method6649(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) { // L: 4411
			Object var1 = null; // L: 4412
			var2 = 65536; // L: 4413
			if (var0.targetIndex < var2) { // L: 4414
				var1 = Client.npcs[var0.targetIndex]; // L: 4415
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4418
			}

			if (var1 != null) { // L: 4420
				var3 = var0.x - ((Actor)var1).x; // L: 4421
				var4 = var0.y - ((Actor)var1).y; // L: 4422
				if (var3 != 0 || var4 != 0) { // L: 4423
					var0.orientation = ClientPreferences.method2538(var3, var4); // L: 4424
				}
			} else if (var0.false0) { // L: 4427
				var0.targetIndex = -1; // L: 4428
				var0.false0 = false; // L: 4429
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1213 > 0) { // L: 4432
			var7 = -1; // L: 4433
			if (var0.field1177 != -1 && var0.field1178 != -1) { // L: 4434
				var2 = var0.field1177 * 128 - class147.baseX * 8192 + 64; // L: 4435
				var3 = var0.field1178 * 128 - ModeWhere.baseY * 8192 + 64; // L: 4436
				var4 = var0.x - var2; // L: 4437
				int var5 = var0.y - var3; // L: 4438
				if (var4 != 0 || var5 != 0) { // L: 4439
					var7 = ClientPreferences.method2538(var4, var5); // L: 4440
				}
			} else if (var0.field1211 != -1) { // L: 4443
				var7 = var0.field1211; // L: 4444
			}

			if (var7 != -1) { // L: 4446
				var0.orientation = var7; // L: 4447
				if (var0.field1140) { // L: 4448
					var0.rotation = var0.orientation; // L: 4449
				}
			}

			var0.method2380(); // L: 4452
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4454
		if (var7 != 0) { // L: 4455
			boolean var8 = true; // L: 4456
			boolean var9 = true; // L: 4457
			++var0.field1207; // L: 4458
			var4 = var7 > 1024 ? -1 : 1; // L: 4459
			var0.rotation += var0.field1209 * var4; // L: 4460
			boolean var10 = true; // L: 4461
			if (var7 < var0.field1209 || var7 > 2048 - var0.field1209) { // L: 4462
				var0.rotation = var0.orientation; // L: 4463
				var10 = false; // L: 4464
			}

			if (var0.field1209 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1207 > 25 || var10)) { // L: 4466
				if (var4 == -1 && var0.field1146 != -1) { // L: 4467
					var0.movementSequence = var0.field1146; // L: 4468
				} else if (var4 == 1 && var0.field1171 != -1) { // L: 4470
					var0.movementSequence = var0.field1171; // L: 4471
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4474
				}
			}

			var0.rotation &= 2047; // L: 4478
		} else {
			if (var0.false0) { // L: 4481
				var0.targetIndex = -1; // L: 4482
				var0.false0 = false; // L: 4483
			}

			var0.field1207 = 0; // L: 4485
		}

	} // L: 4487
}
