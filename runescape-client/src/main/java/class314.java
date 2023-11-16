import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class314 {
	@ObfuscatedName("at")
	static int[] field3402;
	@ObfuscatedName("hu")
	static String field3401;

	static {
		new Object();
		field3402 = new int[33]; // L: 10
		field3402[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3402[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "26"
	)
	static final void method5953(int var0, int var1, int var2) {
		if (ViewportMouse.cameraX < var0) { // L: 3926
			ViewportMouse.cameraX = (var0 - ViewportMouse.cameraX) * class1.field2 / 1000 + ViewportMouse.cameraX + WorldMapIcon_0.field2529; // L: 3927
			if (ViewportMouse.cameraX > var0) { // L: 3928
				ViewportMouse.cameraX = var0;
			}
		}

		if (ViewportMouse.cameraX > var0) { // L: 3930
			ViewportMouse.cameraX -= (ViewportMouse.cameraX - var0) * class1.field2 / 1000 + WorldMapIcon_0.field2529; // L: 3931
			if (ViewportMouse.cameraX < var0) { // L: 3932
				ViewportMouse.cameraX = var0;
			}
		}

		if (SecureRandomFuture.cameraY < var1) { // L: 3934
			SecureRandomFuture.cameraY = (var1 - SecureRandomFuture.cameraY) * class1.field2 / 1000 + SecureRandomFuture.cameraY + WorldMapIcon_0.field2529; // L: 3935
			if (SecureRandomFuture.cameraY > var1) { // L: 3936
				SecureRandomFuture.cameraY = var1;
			}
		}

		if (SecureRandomFuture.cameraY > var1) { // L: 3938
			SecureRandomFuture.cameraY -= (SecureRandomFuture.cameraY - var1) * class1.field2 / 1000 + WorldMapIcon_0.field2529; // L: 3939
			if (SecureRandomFuture.cameraY < var1) { // L: 3940
				SecureRandomFuture.cameraY = var1;
			}
		}

		if (class36.cameraZ < var2) { // L: 3942
			class36.cameraZ = (var2 - class36.cameraZ) * class1.field2 / 1000 + class36.cameraZ + WorldMapIcon_0.field2529; // L: 3943
			if (class36.cameraZ > var2) { // L: 3944
				class36.cameraZ = var2;
			}
		}

		if (class36.cameraZ > var2) { // L: 3946
			class36.cameraZ -= (class36.cameraZ - var2) * class1.field2 / 1000 + WorldMapIcon_0.field2529; // L: 3947
			if (class36.cameraZ < var2) { // L: 3948
				class36.cameraZ = var2;
			}
		}

	} // L: 3950
}
