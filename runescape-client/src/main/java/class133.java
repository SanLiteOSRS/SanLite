import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class133 implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1609;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1595;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1594;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1614;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1598;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1599;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1600;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1613;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1602;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1603;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1610;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1605;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1606;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1601;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1608;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1596;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class133 field1597;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -757683773
	)
	final int field1611;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2032507435
	)
	final int field1612;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1664982399
	)
	final int field1604;

	static {
		field1609 = new class133(0, 0, (String)null, -1, -1); // L: 52
		field1595 = new class133(1, 1, (String)null, 0, 2); // L: 53
		field1594 = new class133(2, 2, (String)null, 1, 2); // L: 54
		field1614 = new class133(3, 3, (String)null, 2, 2); // L: 55
		field1598 = new class133(4, 4, (String)null, 3, 1); // L: 56
		field1599 = new class133(5, 5, (String)null, 4, 1); // L: 57
		field1600 = new class133(6, 6, (String)null, 5, 1); // L: 58
		field1613 = new class133(7, 7, (String)null, 6, 3); // L: 59
		field1602 = new class133(8, 8, (String)null, 7, 3); // L: 60
		field1603 = new class133(9, 9, (String)null, 8, 3); // L: 61
		field1610 = new class133(10, 10, (String)null, 0, 7); // L: 62
		field1605 = new class133(11, 11, (String)null, 1, 7); // L: 63
		field1606 = new class133(12, 12, (String)null, 2, 7); // L: 64
		field1601 = new class133(13, 13, (String)null, 3, 7); // L: 65
		field1608 = new class133(14, 14, (String)null, 4, 7); // L: 66
		field1596 = new class133(15, 15, (String)null, 5, 7); // L: 67
		field1597 = new class133(16, 16, (String)null, 0, 5); // L: 68
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class133(int var1, int var2, String var3, int var4, int var5) {
		this.field1611 = var1; // L: 74
		this.field1612 = var2; // L: 75
		this.field1604 = var4; // L: 76
	} // L: 77

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1612; // L: 80
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1463846702"
	)
	int method3061() {
		return this.field1604; // L: 84
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;IZI)Lja;",
		garbageValue = "-512463746"
	)
	public static Frames method3068(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvc;",
		garbageValue = "1382808710"
	)
	static PrivateChatMode[] method3070() {
		return new PrivateChatMode[]{PrivateChatMode.field5372, PrivateChatMode.field5371, PrivateChatMode.field5373}; // L: 11
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1011967481"
	)
	public static int method3067(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 18
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V",
		garbageValue = "-556645003"
	)
	static final void method3069(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		GraphicsObject.method2076(var0, var1, var2, var3, var4, var5, var6, false); // L: 10279
	} // L: 10280
}
