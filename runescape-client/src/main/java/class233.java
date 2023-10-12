import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class233 implements Comparator {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	class233() {
	} // L: 43

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;S)I",
		garbageValue = "-253"
	)
	int method4418(class228 var1, class228 var2) {
		return var1.method4336() - var2.method4336(); // L: 46
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 54
	}

	public int compare(Object var1, Object var2) {
		return this.method4418((class228)var1, (class228)var2); // L: 50
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-1425233568"
	)
	public static String method4421(byte[] var0) {
		int var2 = var0.length; // L: 59
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class400.field4477[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class400.field4477[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class400.field4477[(var6 & 15) << 2 | var7 >>> 6]).append(class400.field4477[var7 & 63]); // L: 70
				} else {
					var3.append(class400.field4477[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class400.field4477[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1; // L: 78
	}
}
