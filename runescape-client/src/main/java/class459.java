import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public class class459 extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static AbstractArchive field4882;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("v")
	public int[][] field4883;
	@ObfuscatedName("x")
	public Object[][] field4880;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	class459() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "98"
	)
	void method8431(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8440(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "1"
	)
	void method8440(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field4883 == null) { // L: 44
				this.field4883 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 73
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field4883[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field4880 == null) {
						this.field4880 = new Object[this.field4883.length][]; // L: 55
					}

					Object[][] var17 = this.field4880; // L: 56
					int var11 = var1.readUShortSmart(); // L: 60
					Object[] var12 = new Object[var7.length * var11]; // L: 61

					for (int var13 = 0; var13 < var11; ++var13) { // L: 62
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 63
							int var15 = var14 + var7.length * var13; // L: 64
							class456 var16 = class9.method82(var7[var14]); // L: 65
							var12[var15] = var16.method8396(var1); // L: 66
						}
					}

					var17[var5] = var12; // L: 71
				}
			}
		}

	} // L: 77

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "783882667"
	)
	void method8433() {
	} // L: 79

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-770809944"
	)
	public static String method8435(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class299.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 25
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "3912"
	)
	public static int method8447(int var0) {
		return var0 >>> 4 & class462.field4898; // L: 22
	}
}