import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class118 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static final class118 field1433;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static final class118 field1430;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static final class118 field1431;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static final class118 field1432;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static final class118 field1434;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static final class118 field1429;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1756960623
	)
	final int field1437;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1872311517
	)
	final int field1436;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2109677301
	)
	final int field1435;

	static {
		field1433 = new class118(0, 0, (String)null, 0);
		field1430 = new class118(1, 1, (String)null, 9);
		field1431 = new class118(2, 2, (String)null, 3);
		field1432 = new class118(3, 3, (String)null, 6);
		field1434 = new class118(4, 4, (String)null, 1);
		field1429 = new class118(5, 5, (String)null, 3);
	}

	class118(int var1, int var2, String var3, int var4) {
		this.field1437 = var1;
		this.field1436 = var2;
		this.field1435 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1436;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1895809881"
	)
	int method2739() {
		return this.field1435;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1410693926"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class345.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1500949037"
	)
	static final int method2747() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1898368305"
	)
	public static int[] method2748() {
		int[] var0 = new int[KeyHandler.field132];

		for (int var1 = 0; var1 < KeyHandler.field132; ++var1) {
			var0[var1] = KeyHandler.field139[var1];
		}

		return var0;
	}
}
