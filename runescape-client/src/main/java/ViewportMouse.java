import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("s")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 858842197
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1382738033
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("v")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1792884329
	)
	static int field2593;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 191932759
	)
	static int field2599;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -834575933
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("l")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2086292027"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 74
		if (var0 < 0 || var0 >= 65536) { // L: 75
			var0 >>>= 16; // L: 76
			var1 += 16; // L: 77
		}

		if (var0 >= 256) { // L: 79
			var0 >>>= 8; // L: 80
			var1 += 8; // L: 81
		}

		if (var0 >= 16) { // L: 83
			var0 >>>= 4; // L: 84
			var1 += 4; // L: 85
		}

		if (var0 >= 4) { // L: 87
			var0 >>>= 2; // L: 88
			var1 += 2; // L: 89
		}

		if (var0 >= 1) { // L: 91
			var0 >>>= 1; // L: 92
			++var1; // L: 93
		}

		return var0 + var1; // L: 95
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "971084928"
	)
	static final int method4395(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 986
		int var4 = var0 & var2 - 1; // L: 987
		int var5 = var1 / var2; // L: 988
		int var6 = var1 & var2 - 1; // L: 989
		int var7 = World.method1623(var3, var5); // L: 990
		int var8 = World.method1623(var3 + 1, var5); // L: 991
		int var9 = World.method1623(var3, var5 + 1); // L: 992
		int var10 = World.method1623(var3 + 1, var5 + 1); // L: 993
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 996
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16); // L: 997
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 1002
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 1003
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 1008
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16); // L: 1009
		return var15; // L: 1011
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1744172239"
	)
	static boolean method4413() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4955
	}
}
