import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class126 {
	@ObfuscatedName("at")
	public static final float field1505;
	@ObfuscatedName("ac")
	public static final float field1506;
	@ObfuscatedName("ai")
	static float[] field1507;
	@ObfuscatedName("az")
	static float[] field1509;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	static {
		field1505 = Math.ulp(1.0F);
		field1506 = field1505 * 2.0F;
		field1507 = new float[4]; // L: 12
		field1509 = new float[5]; // L: 13
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-1457731236"
	)
	public static byte[] method2930(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var6 = (byte[])((byte[])var0); // L: 10
			if (var1) { // L: 11
				int var4 = var6.length; // L: 14
				byte[] var5 = new byte[var4]; // L: 15
				System.arraycopy(var6, 0, var5, 0, var4); // L: 16
				return var5; // L: 19
			} else {
				return var6; // L: 21
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 23
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 24
			return var2.get(); // L: 25
		} else {
			throw new IllegalArgumentException(); // L: 27
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1320879691"
	)
	public static void method2941() {
		ParamComposition.ParamComposition_cached.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IIIB)V",
		garbageValue = "-45"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3724 == null) { // L: 1229
			throw new RuntimeException(); // L: 1230
		} else {
			var0.field3724[var1] = var2; // L: 1232
			var0.field3725[var1] = var3; // L: 1233
		}
	} // L: 1234

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "158"
	)
	static final void method2942(int var0, int var1, int var2) {
		if (NPCComposition.cameraX < var0) { // L: 3780
			NPCComposition.cameraX = (var0 - NPCComposition.cameraX) * MouseHandler.field252 / 1000 + NPCComposition.cameraX + class344.field3874; // L: 3781
			if (NPCComposition.cameraX > var0) { // L: 3782
				NPCComposition.cameraX = var0;
			}
		}

		if (NPCComposition.cameraX > var0) { // L: 3784
			NPCComposition.cameraX -= (NPCComposition.cameraX - var0) * MouseHandler.field252 / 1000 + class344.field3874; // L: 3785
			if (NPCComposition.cameraX < var0) { // L: 3786
				NPCComposition.cameraX = var0;
			}
		}

		if (class133.cameraY < var1) { // L: 3788
			class133.cameraY = (var1 - class133.cameraY) * MouseHandler.field252 / 1000 + class133.cameraY + class344.field3874; // L: 3789
			if (class133.cameraY > var1) { // L: 3790
				class133.cameraY = var1;
			}
		}

		if (class133.cameraY > var1) { // L: 3792
			class133.cameraY -= (class133.cameraY - var1) * MouseHandler.field252 / 1000 + class344.field3874; // L: 3793
			if (class133.cameraY < var1) { // L: 3794
				class133.cameraY = var1;
			}
		}

		if (class139.cameraZ < var2) { // L: 3796
			class139.cameraZ = (var2 - class139.cameraZ) * MouseHandler.field252 / 1000 + class139.cameraZ + class344.field3874; // L: 3797
			if (class139.cameraZ > var2) { // L: 3798
				class139.cameraZ = var2;
			}
		}

		if (class139.cameraZ > var2) { // L: 3800
			class139.cameraZ -= (class139.cameraZ - var2) * MouseHandler.field252 / 1000 + class344.field3874; // L: 3801
			if (class139.cameraZ < var2) { // L: 3802
				class139.cameraZ = var2;
			}
		}

	} // L: 3804
}
