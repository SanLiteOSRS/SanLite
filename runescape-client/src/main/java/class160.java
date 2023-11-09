import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class160 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -244276762934367085L
	)
	long field1782;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 4534125073915190119L
	)
	public long field1781;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	IterableNodeDeque field1780;

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public class160(Buffer var1) {
		this.field1781 = -1L; // L: 10
		this.field1780 = new IterableNodeDeque(); // L: 11
		this.method3274(var1); // L: 19
	} // L: 20

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-2067216516"
	)
	void method3274(Buffer var1) {
		this.field1782 = var1.readLong(); // L: 23
		this.field1781 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class155(this);
			} else if (var2 == 4) {
				var3 = new class166(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class151(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class149(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class156(this);
			}

			((class159)var3).vmethod3333(var1); // L: 34
			this.field1780.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "-40"
	)
	public void method3275(ClanChannel var1) {
		if (var1.key == this.field1782 && var1.field1808 == this.field1781) { // L: 41
			for (class159 var2 = (class159)this.field1780.last(); var2 != null; var2 = (class159)this.field1780.previous()) { // L: 44
				var2.vmethod3332(var1); // L: 45
			}

			++var1.field1808; // L: 47
		} else {
			throw new RuntimeException(""); // L: 42
		}
	} // L: 48

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-753212760"
	)
	static void method3282(float[] var0) {
		var0[1] = 1.0F - var0[1]; // L: 319
		if (var0[0] < 0.0F) { // L: 320
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) { // L: 321
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) { // L: 322
			float var1 = (float)(1.0D + (double)(var0[0] * (var0[0] - 2.0F + var0[1])) + ((double)var0[1] - 2.0D) * (double)var0[1]); // L: 323
			if (var1 + class126.field1505 > 0.0F) { // L: 324
				if (class126.field1505 + var0[0] < 1.3333334F) { // L: 326
					float var2 = var0[0] - 2.0F; // L: 327
					float var3 = var0[0] - 1.0F; // L: 328
					float var4 = (float)Math.sqrt((double)(var2 * var2 - 4.0F * var3 * var3)); // L: 329
					float var5 = 0.5F * (var4 + -var2); // L: 330
					if (var0[1] + class126.field1505 > var5) { // L: 331
						var0[1] = var5 - class126.field1505; // L: 332
					} else {
						var5 = (-var2 - var4) * 0.5F; // L: 335
						if (var0[1] < var5 + class126.field1505) { // L: 336
							var0[1] = class126.field1505 + var5; // L: 337
						}
					}
				} else {
					var0[0] = 1.3333334F - class126.field1505; // L: 342
					var0[1] = 0.33333334F - class126.field1505; // L: 343
				}
			}
		}

		var0[1] = 1.0F - var0[1]; // L: 348
	} // L: 349

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmt;ZB)V",
		garbageValue = "0"
	)
	public static void method3278(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1049
		var0.field3704 = new PlayerComposition(var1); // L: 1050
		if (!var2) { // L: 1051
			var0.field3704.equipment = Arrays.copyOf(var0.field3704.field3584, var0.field3704.field3584.length); // L: 1052
			var0.field3704.method6072(); // L: 1053
		}

	} // L: 1055
}
