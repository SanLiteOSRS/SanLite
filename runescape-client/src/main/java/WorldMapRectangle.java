import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1778592037
	)
	@Export("width")
	int width;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1730738719
	)
	@Export("height")
	int height;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1307484671
	)
	@Export("x")
	int x;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2146368743
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILfc;Lfq;I)Z",
		garbageValue = "-1234525376"
	)
	public static final boolean method3959(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class174.directions[var6][var7] = 99;
		class174.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class174.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class174.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class174.bufferX[var11];
			var5 = class174.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				RouteStrategy.field1979 = var4;
				class67.field845 = var5;
				return true;
			}

			int var15 = class174.distances[var16][var17] + 1;
			if (var16 > 0 && class174.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17] = 2;
				class174.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class174.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17] = 8;
				class174.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class174.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class174.bufferX[var18] = var4;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16][var17 - 1] = 1;
				class174.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class174.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class174.bufferX[var18] = var4;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16][var17 + 1] = 4;
				class174.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class174.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17 - 1] = 3;
				class174.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class174.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17 - 1] = 9;
				class174.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class174.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17 + 1] = 6;
				class174.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class174.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17 + 1] = 12;
				class174.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		RouteStrategy.field1979 = var4;
		class67.field845 = var5;
		return false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "62"
	)
	public static int method3960(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}
}
