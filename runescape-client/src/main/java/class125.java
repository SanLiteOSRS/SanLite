import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class125 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class125 field1510;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class125 field1503;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class125 field1501;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class125 field1502;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class125 field1499;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class125 field1504;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2107763657
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -773020741
	)
	final int field1505;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2060631497
	)
	final int field1506;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1971322451
	)
	final int field1507;

	static {
		field1510 = new class125(0, 0, (String)null, 0); // L: 14
		field1503 = new class125(1, 1, (String)null, 9); // L: 15
		field1501 = new class125(2, 2, (String)null, 3); // L: 16
		field1502 = new class125(3, 3, (String)null, 6); // L: 17
		field1499 = new class125(4, 4, (String)null, 1); // L: 18
		field1504 = new class125(5, 5, (String)null, 3); // L: 19
	}

	class125(int var1, int var2, String var3, int var4) {
		this.field1505 = var1;
		this.field1506 = var2; // L: 26
		this.field1507 = var4;
	} // L: 28

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1506;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1373725864"
	)
	int method2901() {
		return this.field1507;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;IZB)Ldh;",
		garbageValue = "-19"
	)
	public static class129 method2906(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 21
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 22
		if (var5 == null) { // L: 23
			var4 = false; // L: 24
			return null; // L: 25
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 27
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6); // L: 29
			} else {
				var7 = var1.getFile(var6, 0); // L: 30
			}

			if (var7 == null) { // L: 31
				var4 = false;
			}

			if (!var4) { // L: 32
				return null;
			} else {
				try {
					return new class129(var0, var1, var2, var3); // L: 34
				} catch (Exception var9) { // L: 36
					return null; // L: 37
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "22"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 143
		int var4 = 0; // L: 144

		for (int var5 = 0; var5 < var2; ++var5) { // L: 145
			int var6 = var0[var5 + var1] & 255; // L: 146
			if (var6 != 0) { // L: 147
				if (var6 >= 128 && var6 < 160) { // L: 148
					char var7 = class355.cp1252AsciiExtension[var6 - 128]; // L: 149
					if (var7 == 0) { // L: 150
						var7 = '?';
					}

					var6 = var7; // L: 151
				}

				var3[var4++] = (char)var6; // L: 153
			}
		}

		return new String(var3, 0, var4); // L: 155
	}
}
