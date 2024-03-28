import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class9 implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	public static final class9 field30;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	public static final class9 field28;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	static final class9 field29;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	static final class9 field27;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	static final class9 field31;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 818729035
	)
	static int field36;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 2033208005
	)
	static int field38;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 906294433
	)
	int field32;
	@ObfuscatedName("ab")
	String field33;
	@ObfuscatedName("aw")
	boolean field34;
	@ObfuscatedName("ad")
	boolean field35;

	static {
		field30 = new class9(0, "POST", true, true); // L: 6
		field28 = new class9(1, "GET", true, false); // L: 7
		field29 = new class9(2, "PUT", false, true); // L: 8
		field27 = new class9(3, "PATCH", false, true); // L: 9
		field31 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field32 = var1;
		this.field33 = var2;
		this.field34 = var3;
		this.field35 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field32; // L: 37
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-123083614"
	)
	boolean method68() {
		return this.field34;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1604233669"
	)
	public String method69() {
		return this.field33; // L: 28
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2110880381"
	)
	boolean method70() {
		return this.field35; // L: 32
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-638846758"
	)
	public static long method83(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') { // L: 23
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "64"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		FriendSystem.scrollBarSprites[0].drawAt(var0, var1); // L: 11288
		FriendSystem.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11289
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field560); // L: 11290
		int var5 = var3 * (var3 - 32) / var4; // L: 11291
		if (var5 < 8) { // L: 11292
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11293
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field590); // L: 11294
		Rasterizer2D.method9625(var0, var6 + var1 + 16, var5, Client.field592); // L: 11295
		Rasterizer2D.method9625(var0 + 1, var6 + var1 + 16, var5, Client.field592); // L: 11296
		Rasterizer2D.method9581(var0, var6 + var1 + 16, 16, Client.field592); // L: 11297
		Rasterizer2D.method9581(var0, var6 + var1 + 17, 16, Client.field592); // L: 11298
		Rasterizer2D.method9625(var0 + 15, var6 + var1 + 16, var5, Client.field624); // L: 11299
		Rasterizer2D.method9625(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field624); // L: 11300
		Rasterizer2D.method9581(var0, var6 + var5 + var1 + 15, 16, Client.field624); // L: 11301
		Rasterizer2D.method9581(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field624); // L: 11302
	} // L: 11303
}
