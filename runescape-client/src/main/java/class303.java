import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public class class303 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -242219637
	)
	static int field3123;

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "86"
	)
	static final void method5908(int var0, int var1) {
		if (var0 < 128) { // L: 3953
			var0 = 128; // L: 3954
		} else if (var0 > 383) { // L: 3956
			var0 = 383; // L: 3957
		}

		if (Varcs.cameraPitch < var0) { // L: 3959
			Varcs.cameraPitch = (var0 - Varcs.cameraPitch) * class134.field1581 / 1000 + Varcs.cameraPitch + class60.field421; // L: 3960
			if (Varcs.cameraPitch > var0) { // L: 3961
				Varcs.cameraPitch = var0; // L: 3962
			}
		} else if (Varcs.cameraPitch > var0) { // L: 3965
			Varcs.cameraPitch -= (Varcs.cameraPitch - var0) * class134.field1581 / 1000 + class60.field421; // L: 3966
			if (Varcs.cameraPitch < var0) { // L: 3967
				Varcs.cameraPitch = var0; // L: 3968
			}
		}

		var1 &= 2047; // L: 3971
		int var2 = var1 - class192.cameraYaw; // L: 3972
		if (var2 > 1024) { // L: 3973
			var2 -= 2048; // L: 3974
		} else if (var2 < -1024) { // L: 3976
			var2 += 2048; // L: 3977
		}

		if (var2 > 0) { // L: 3979
			class192.cameraYaw = class192.cameraYaw + class60.field421 + var2 * class134.field1581 / 1000; // L: 3980
			class192.cameraYaw &= 2047; // L: 3981
		} else if (var2 < 0) { // L: 3983
			class192.cameraYaw -= class60.field421 + -var2 * class134.field1581 / 1000; // L: 3984
			class192.cameraYaw &= 2047; // L: 3985
		}

		int var3 = var1 - class192.cameraYaw; // L: 3987
		if (var3 > 1024) { // L: 3988
			var3 -= 2048; // L: 3989
		} else if (var3 < -1024) { // L: 3991
			var3 += 2048; // L: 3992
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3994
			class192.cameraYaw = var1; // L: 3995
		}

	} // L: 3997
}
