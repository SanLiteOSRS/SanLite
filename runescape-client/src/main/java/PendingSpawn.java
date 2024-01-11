import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -7190583
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -309329667
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -440010209
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 956622833
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1260061589
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -284572845
	)
	int field1162;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1964960583
	)
	int field1163;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 91823357
	)
	int field1164;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2132160277
	)
	int field1157;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 427908289
	)
	int field1166;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1348057939
	)
	int field1167;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1116431321
	)
	int field1169;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1748127727
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -255769707
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1169 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "349896774"
	)
	void method2443(int var1) {
		this.field1169 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "65280"
	)
	boolean method2442(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1169 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;II)V",
		garbageValue = "300310316"
	)
	public static void method2448(Widget var0, int var1) {
		ItemComposition var2 = class341.ItemComposition_get(var1); // L: 992
		var0.field3759.equipment[var2.maleModel] = var1 + 512; // L: 993
		if (var2.maleModel1 != -1) { // L: 994
			var0.field3759.equipment[var2.maleModel1] = 0; // L: 995
		}

		if (var2.maleModel2 != -1) { // L: 997
			var0.field3759.equipment[var2.maleModel2] = 0; // L: 998
		}

		var0.field3759.method6383(); // L: 1000
	} // L: 1001

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-469241818"
	)
	static final void method2449(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) { // L: 4473
			Object var1 = null; // L: 4474
			var2 = 65536; // L: 4475
			if (var0.targetIndex < var2) { // L: 4476
				var1 = Client.npcs[var0.targetIndex]; // L: 4477
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4480
			}

			if (var1 != null) { // L: 4482
				var3 = var0.x - ((Actor)var1).x; // L: 4483
				var4 = var0.y - ((Actor)var1).y; // L: 4484
				if (var3 != 0 || var4 != 0) { // L: 4485
					int var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047; // L: 4489
					var0.orientation = var6; // L: 4491
				}
			} else if (var0.false0) { // L: 4494
				var0.targetIndex = -1; // L: 4495
				var0.false0 = false; // L: 4496
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1245 > 0) { // L: 4499
			var7 = -1; // L: 4500
			if (var0.field1213 != -1 && var0.field1210 != -1) { // L: 4501
				var2 = var0.field1213 * 128 - HealthBarDefinition.baseX * 8192 + 64; // L: 4502
				var3 = var0.field1210 * 128 - WorldMapScaleHandler.baseY * 8192 + 64; // L: 4503
				var4 = var0.x - var2; // L: 4504
				int var8 = var0.y - var3; // L: 4505
				if (var4 != 0 || var8 != 0) { // L: 4506
					var7 = class189.method3782(var4, var8); // L: 4507
				}
			} else if (var0.field1208 != -1) { // L: 4510
				var7 = var0.field1208; // L: 4511
			}

			if (var7 != -1) { // L: 4513
				var0.orientation = var7; // L: 4514
				if (var0.field1211) { // L: 4515
					var0.rotation = var0.orientation; // L: 4516
				}
			}

			var0.method2460(); // L: 4519
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4521
		if (var7 != 0) { // L: 4522
			boolean var10 = true; // L: 4523
			boolean var11 = true; // L: 4524
			++var0.field1239; // L: 4525
			var4 = var7 > 1024 ? -1 : 1; // L: 4526
			var0.rotation += var0.field1240 * var4; // L: 4527
			boolean var12 = true; // L: 4528
			if (var7 < var0.field1240 || var7 > 2048 - var0.field1240) { // L: 4529
				var0.rotation = var0.orientation; // L: 4530
				var12 = false; // L: 4531
			}

			if (var0.field1240 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1239 > 25 || var12)) { // L: 4533
				if (var4 == -1 && var0.field1236 != -1) { // L: 4534
					var0.movementSequence = var0.field1236; // L: 4535
				} else if (var4 == 1 && var0.field1179 != -1) { // L: 4537
					var0.movementSequence = var0.field1179; // L: 4538
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4541
				}
			}

			var0.rotation &= 2047; // L: 4545
		} else {
			if (var0.false0) { // L: 4548
				var0.targetIndex = -1; // L: 4549
				var0.false0 = false; // L: 4550
			}

			var0.field1239 = 0; // L: 4552
		}

	} // L: 4554
}
