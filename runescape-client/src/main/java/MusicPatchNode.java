import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1025207361
	)
	int field2905;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	MusicPatchNode2 field2894;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2143225367
	)
	int field2893;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -723940785
	)
	int field2896;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1566640151
	)
	int field2897;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 970092925
	)
	int field2898;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 215164221
	)
	int field2900;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1146128297
	)
	int field2899;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1897214019
	)
	int field2901;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1629995008
	)
	int field2902;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 370154707
	)
	int field2903;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 939918277
	)
	int field2911;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1951740649
	)
	int field2895;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -292962099
	)
	int field2906;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 726334989
	)
	int field2907;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1237883869
	)
	int field2908;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 730487289
	)
	int field2891;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -576530835
	)
	int field2904;

	MusicPatchNode() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	void method4634() {
		this.patch = null;
		this.rawSound = null;
		this.field2894 = null;
		this.stream = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-387650050"
	)
	static boolean method4638(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
