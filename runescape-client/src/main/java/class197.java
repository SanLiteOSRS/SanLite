import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class197 {
	@ObfuscatedName("f")
	static int[] field2373;

	static {
		new Object();
		field2373 = new int[33];
		field2373[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2373[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IZI)Ljava/lang/String;",
		garbageValue = "657840099"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class258.method4655(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1748256399"
	)
	static void method3783() {
		if (ModelData0.field1895 != null) {
			Client.field950 = Client.cycle;
			ModelData0.field1895.method4466();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					ModelData0.field1895.method4465(FloorDecoration.baseX * 64 + (Client.players[var0].x >> 7), WorldMapData_0.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
