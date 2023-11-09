import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class19 implements Callable {
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static Bounds field103;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final class10 field106;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lag;Lay;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field106 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field106.method91()) { // L: 53
				PlayerComposition.method6084(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field106.method87(); // L: 60
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lif;I)V",
		garbageValue = "146668751"
	)
	static final void method294(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var15 = var2 + SpriteMask.method5990(var13 & 7, var14 & 7, var7); // L: 120
						int var18 = var13 & 7; // L: 123
						int var19 = var14 & 7; // L: 124
						int var20 = var7 & 3; // L: 127
						int var17;
						if (var20 == 0) { // L: 128
							var17 = var19; // L: 129
						} else if (var20 == 1) { // L: 132
							var17 = 7 - var18; // L: 133
						} else if (var20 == 2) { // L: 136
							var17 = 7 - var19; // L: 137
						} else {
							var17 = var18; // L: 140
						}

						int var21 = var3 + var17; // L: 142
						int var22 = (var13 & 7) + var8 + var2; // L: 143
						int var23 = var3 + (var14 & 7) + var9; // L: 144
						class372.loadTerrain(var24, var1, var15, var21, var22, var23, var7); // L: 145
					} else {
						class372.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151
}
