import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 5033489968543458405L
	)
	static long field1034;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILiz;Lig;Lis;I)Z",
		garbageValue = "308950437"
	)
	public static final boolean method2271(int var0, int var1, RouteStrategy var2, CollisionMap var3, class216 var4) {
		int var5 = var4.method4344(); // L: 11
		int var6 = var4.method4340(); // L: 12
		int[][] var7 = var4.method4347(); // L: 13
		int[][] var8 = var4.method4339(); // L: 14
		int[] var9 = var4.method4348(); // L: 15
		int[] var10 = var4.method4349(); // L: 16
		int var11 = var4.method4350(); // L: 17
		int var12 = var0; // L: 18
		int var13 = var1; // L: 19
		int var14 = var5 >> 1; // L: 20
		int var15 = var6 >> 1; // L: 21
		int var16 = var0 - var14; // L: 22
		int var17 = var1 - var15; // L: 23
		var8[var14][var15] = 99; // L: 24
		var7[var14][var15] = 0; // L: 25
		byte var18 = 0; // L: 26
		int var19 = 0; // L: 27
		var9[var18] = var0; // L: 28
		byte var10001 = var18;
		int var24 = var18 + 1; // L: 29
		var10[var10001] = var1;
		int[][] var20 = var3.flags; // L: 30

		while (var19 != var24) { // L: 31
			var12 = var9[var19]; // L: 32
			var13 = var10[var19]; // L: 33
			var19 = var19 + 1 & var11; // L: 34
			var14 = var12 - var16; // L: 35
			var15 = var13 - var17; // L: 36
			int var21 = var12 - var3.xInset; // L: 37
			int var22 = var13 - var3.yInset; // L: 38
			if (var2.hasArrived(2, var12, var13, var3)) { // L: 39
				var4.method4341(var12, var13); // L: 40
				return true; // L: 41
			}

			int var23 = var7[var14][var15] + 1; // L: 43
			if (var14 > 0 && var8[var14 - 1][var15] == 0 && (var20[var21 - 1][var22] & 19136782) == 0 && (var20[var21 - 1][var22 + 1] & 19136824) == 0) { // L: 44 45 46 47
				var9[var24] = var12 - 1; // L: 48
				var10[var24] = var13; // L: 49
				var24 = var24 + 1 & var11; // L: 50
				var8[var14 - 1][var15] = 2; // L: 51
				var7[var14 - 1][var15] = var23; // L: 52
			}

			if (var14 < var5 - 2 && var8[var14 + 1][var15] == 0 && (var20[var21 + 2][var22] & 19136899) == 0 && (var20[var21 + 2][var22 + 1] & 19136992) == 0) { // L: 54 55 56 57
				var9[var24] = var12 + 1; // L: 58
				var10[var24] = var13; // L: 59
				var24 = var24 + 1 & var11; // L: 60
				var8[var14 + 1][var15] = 8; // L: 61
				var7[var14 + 1][var15] = var23; // L: 62
			}

			if (var15 > 0 && var8[var14][var15 - 1] == 0 && (var20[var21][var22 - 1] & 19136782) == 0 && (var20[var21 + 1][var22 - 1] & 19136899) == 0) { // L: 64 65 66 67
				var9[var24] = var12; // L: 68
				var10[var24] = var13 - 1; // L: 69
				var24 = var24 + 1 & var11; // L: 70
				var8[var14][var15 - 1] = 1; // L: 71
				var7[var14][var15 - 1] = var23; // L: 72
			}

			if (var15 < var6 - 2 && var8[var14][var15 + 1] == 0 && (var20[var21][var22 + 2] & 19136824) == 0 && (var20[var21 + 1][var22 + 2] & 19136992) == 0) { // L: 74 75 76 77
				var9[var24] = var12; // L: 78
				var10[var24] = var13 + 1; // L: 79
				var24 = var24 + 1 & var11; // L: 80
				var8[var14][var15 + 1] = 4; // L: 81
				var7[var14][var15 + 1] = var23; // L: 82
			}

			if (var14 > 0 && var15 > 0 && var8[var14 - 1][var15 - 1] == 0 && (var20[var21 - 1][var22] & 19136830) == 0 && (var20[var21 - 1][var22 - 1] & 19136782) == 0 && (var20[var21][var22 - 1] & 19136911) == 0) { // L: 84 85 86 87 88
				var9[var24] = var12 - 1; // L: 89
				var10[var24] = var13 - 1; // L: 90
				var24 = var24 + 1 & var11; // L: 91
				var8[var14 - 1][var15 - 1] = 3; // L: 92
				var7[var14 - 1][var15 - 1] = var23; // L: 93
			}

			if (var14 < var5 - 2 && var15 > 0 && var8[var14 + 1][var15 - 1] == 0 && (var20[var21 + 1][var22 - 1] & 19136911) == 0 && (var20[var21 + 2][var22 - 1] & 19136899) == 0 && (var20[var21 + 2][var22] & 19136995) == 0) { // L: 95 96 97 98 99
				var9[var24] = var12 + 1; // L: 100
				var10[var24] = var13 - 1; // L: 101
				var24 = var24 + 1 & var11; // L: 102
				var8[var14 + 1][var15 - 1] = 9; // L: 103
				var7[var14 + 1][var15 - 1] = var23; // L: 104
			}

			if (var14 > 0 && var15 < var6 - 2 && var8[var14 - 1][var15 + 1] == 0 && (var20[var21 - 1][var22 + 1] & 19136830) == 0 && (var20[var21 - 1][var22 + 2] & 19136824) == 0 && (var20[var21][var22 + 2] & 19137016) == 0) { // L: 106 107 108 109 110
				var9[var24] = var12 - 1; // L: 111
				var10[var24] = var13 + 1; // L: 112
				var24 = var24 + 1 & var11; // L: 113
				var8[var14 - 1][var15 + 1] = 6; // L: 114
				var7[var14 - 1][var15 + 1] = var23; // L: 115
			}

			if (var14 < var5 - 2 && var15 < var6 - 2 && var8[var14 + 1][var15 + 1] == 0 && (var20[var21 + 1][var22 + 2] & 19137016) == 0 && (var20[var21 + 2][var22 + 2] & 19136992) == 0 && (var20[var21 + 2][var22 + 1] & 19136995) == 0) { // L: 117 118 119 120 121
				var9[var24] = var12 + 1; // L: 122
				var10[var24] = var13 + 1; // L: 123
				var24 = var24 + 1 & var11; // L: 124
				var8[var14 + 1][var15 + 1] = 12; // L: 125
				var7[var14 + 1][var15 + 1] = var23; // L: 126
			}
		}

		var4.method4341(var12, var13); // L: 129
		return false; // L: 130
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)I",
		garbageValue = "-29778"
	)
	static final int method2273(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 918
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 919
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-717702619"
	)
	static final int method2270(int var0, int var1) {
		if (var0 == -1) { // L: 937
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 938
			if (var1 < 2) { // L: 939
				var1 = 2;
			} else if (var1 > 126) { // L: 940
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 941
		}
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1827211278"
	)
	static final void method2272(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12164
		var0 = 100 - var0; // L: 12165
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12166
		Rasterizer3D.Rasterizer3D_setBrightness((double)var1); // L: 12168
		((TextureProvider)Rasterizer3D.field2528.Rasterizer3D_textureLoader).setBrightness((double)var1); // L: 12169
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12171
		ScriptFrame.clientPreferences.method2513((double)var1); // L: 12173
	} // L: 12175

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltm;",
		garbageValue = "3"
	)
	static class506 method2274(int var0) {
		class506 var1 = (class506)Client.Widget_cachedFonts.get((long)var0); // L: 12866
		if (var1 == null) { // L: 12867
			var1 = new class506(class170.field1811, var0); // L: 12868
		}

		return var1; // L: 12870
	}
}
