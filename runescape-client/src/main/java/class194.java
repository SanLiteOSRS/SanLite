import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class194 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 2758428562155224691L
	)
	public long field2004;
	@ObfuscatedName("aj")
	int[] field2001;
	@ObfuscatedName("ac")
	short[] field2003;
	@ObfuscatedName("aw")
	short[] field2006;
	@ObfuscatedName("ay")
	public boolean field2005;

	public class194(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field2005 = false; // L: 8
		this.field2004 = var1; // L: 11
		this.field2001 = var3; // L: 12
		this.field2003 = var4; // L: 13
		this.field2006 = var5;
		this.field2005 = var6;
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)V",
		garbageValue = "-885381399"
	)
	public static void method3809(Huffman var0) {
		class334.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "20"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 38
		boolean var3 = false; // L: 39
		int var4 = 0; // L: 40
		int var5 = var0.length(); // L: 41
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 71
				break;
			}

			label83: {
				char var7 = var0.charAt(var6); // L: 43
				if (var6 == 0) { // L: 44
					if (var7 == '-') { // L: 45
						var2 = true; // L: 46
						break label83;
					}

					if (var7 == '+') { // L: 49
						break label83;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 51
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 52
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 53
						var1 = false; // L: 55
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 58
					var1 = false; // L: 59
					break; // L: 60
				}

				if (var2) { // L: 62
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9; // L: 63
				if (var4 != var8 / 10) { // L: 64
					var1 = false; // L: 65
					break; // L: 66
				}

				var4 = var8; // L: 68
				var3 = true; // L: 69
			}

			++var6; // L: 42
		}

		return var1; // L: 73
	}
}
