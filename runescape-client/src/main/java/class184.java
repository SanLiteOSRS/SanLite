import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
final class class184 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 385
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	static final void method3581(int var0, int var1) {
		if (var0 < 128) { // L: 4058
			var0 = 128; // L: 4059
		} else if (var0 > 383) { // L: 4061
			var0 = 383; // L: 4062
		}

		if (class19.cameraPitch < var0) { // L: 4064
			class19.cameraPitch = (var0 - class19.cameraPitch) * class157.field1743 / 1000 + class19.cameraPitch + class18.field95; // L: 4065
			if (class19.cameraPitch > var0) { // L: 4066
				class19.cameraPitch = var0; // L: 4067
			}
		} else if (class19.cameraPitch > var0) { // L: 4070
			class19.cameraPitch -= (class19.cameraPitch - var0) * class157.field1743 / 1000 + class18.field95; // L: 4071
			if (class19.cameraPitch < var0) { // L: 4072
				class19.cameraPitch = var0; // L: 4073
			}
		}

		var1 &= 2047; // L: 4076
		int var2 = var1 - class456.cameraYaw; // L: 4077
		if (var2 > 1024) { // L: 4078
			var2 -= 2048; // L: 4079
		} else if (var2 < -1024) { // L: 4081
			var2 += 2048; // L: 4082
		}

		if (var2 > 0) { // L: 4084
			class456.cameraYaw = class456.cameraYaw + class18.field95 + var2 * class157.field1743 / 1000; // L: 4085
			class456.cameraYaw &= 2047; // L: 4086
		} else if (var2 < 0) { // L: 4088
			class456.cameraYaw -= -var2 * class157.field1743 / 1000 + class18.field95; // L: 4089
			class456.cameraYaw &= 2047; // L: 4090
		}

		int var3 = var1 - class456.cameraYaw; // L: 4092
		if (var3 > 1024) { // L: 4093
			var3 -= 2048; // L: 4094
		} else if (var3 < -1024) { // L: 4096
			var3 += 2048; // L: 4097
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4099
			class456.cameraYaw = var1; // L: 4100
		}

	} // L: 4102
}
