import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1462127955
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -350124813
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("l")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)[B",
		garbageValue = "1806020760"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "1930792528"
	)
	static final void method4293(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1725199015"
	)
	public static void method4292() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
