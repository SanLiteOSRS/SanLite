import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public enum class86 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	field1095(0, -1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	field1094(1, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	field1098(2, 3),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	field1096(3, 4),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	field1097(4, 5),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	field1102(5, 6);

	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1416858077
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1375045067
	)
	final int field1103;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1420454587
	)
	final int field1100;

	class86(int var3, int var4) {
		this.field1103 = var3; // L: 21
		this.field1100 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1100; // L: 27
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1962588142"
	)
	static int method2346(int var0, int var1) {
		if (var0 == -2) { // L: 77
			return 12345678;
		} else if (var0 == -1) { // L: 78
			if (var1 < 0) { // L: 79
				var1 = 0; // L: 80
			} else if (var1 > 127) { // L: 82
				var1 = 127; // L: 83
			}

			var1 = 127 - var1; // L: 85
			return var1; // L: 86
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 88
			if (var1 < 2) { // L: 89
				var1 = 2;
			} else if (var1 > 126) { // L: 90
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 91
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "77"
	)
	static boolean method2341(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance(); // L: 987
		var1.set(1, var1.get(1) - 13); // L: 988
		var1.set(5, var1.get(5) + 1); // L: 989
		var1.set(11, 0); // L: 990
		var1.set(12, 0); // L: 991
		var1.set(13, 0); // L: 992
		var1.set(14, 0); // L: 993
		Date var2 = var1.getTime(); // L: 994
		return var0.before(var2); // L: 995
	}
}
