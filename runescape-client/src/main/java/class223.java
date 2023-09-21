import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class223 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("Widget_cachedSprites")
	static final class223 Widget_cachedSprites;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2343;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2344;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2353;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2346;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2356;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2354;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2349;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2347;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2351;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2352;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2348;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2358;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2359;
	@ObfuscatedName("aw")
	public static String field2350;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1898440511
	)
	public final int field2342;

	static {
		Widget_cachedSprites = new class223(0); // L: 4
		field2343 = new class223(1); // L: 5
		field2344 = new class223(2); // L: 6
		field2353 = new class223(3); // L: 7
		field2346 = new class223(4, class209.field2110); // L: 8
		field2356 = new class223(5); // L: 9
		field2354 = new class223(6, class209.field2108); // L: 10
		field2349 = new class223(7, class209.field2105); // L: 11
		field2347 = new class223(8, class209.field2109); // L: 12
		field2351 = new class223(9, class209.field2107); // L: 13
		field2352 = new class223(10, class209.field2111); // L: 14
		field2348 = new class223(11, class209.field2106); // L: 15
		field2358 = new class223(12); // L: 16
		field2359 = new class223(13); // L: 17
	}

	class223(int var1) {
		this(var1, (class209)null); // L: 25
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(ILik;)V"
	)
	class223(int var1, class209 var2) {
		this.field2342 = var1; // L: 21
	} // L: 22

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-886545953"
	)
	static void method4213() {
		class467.field4804 = System.getenv("JX_ACCESS_TOKEN"); // L: 899
		class191.field1917 = System.getenv("JX_REFRESH_TOKEN"); // L: 900
		LoginScreenAnimation.field1283 = System.getenv("JX_SESSION_ID"); // L: 901
		class155.field1698 = System.getenv("JX_CHARACTER_ID"); // L: 902
		String var0 = System.getenv("JX_DISPLAY_NAME"); // L: 903
		String var1;
		if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') { // L: 907
			var1 = var0; // L: 911
		} else {
			var1 = ""; // L: 908
		}

		Login.field928 = var1; // L: 913
	} // L: 915

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "796213891"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class36.scrollBarSprites[0].drawAt(var0, var1); // L: 11233
		class36.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11234
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field598); // L: 11235
		int var5 = var3 * (var3 - 32) / var4; // L: 11236
		if (var5 < 8) { // L: 11237
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11238
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field801); // L: 11239
		Rasterizer2D.method9557(var0, var6 + var1 + 16, var5, Client.field601); // L: 11240
		Rasterizer2D.method9557(var0 + 1, var6 + var1 + 16, var5, Client.field601); // L: 11241
		Rasterizer2D.method9555(var0, var6 + var1 + 16, 16, Client.field601); // L: 11242
		Rasterizer2D.method9555(var0, var6 + var1 + 17, 16, Client.field601); // L: 11243
		Rasterizer2D.method9557(var0 + 15, var6 + var1 + 16, var5, Client.field556); // L: 11244
		Rasterizer2D.method9557(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field556); // L: 11245
		Rasterizer2D.method9555(var0, var5 + var6 + var1 + 15, 16, Client.field556); // L: 11246
		Rasterizer2D.method9555(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field556); // L: 11247
	} // L: 11248

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(II)Luq;",
		garbageValue = "-134807305"
	)
	static class521 method4212(int var0) {
		class521 var1 = (class521)Client.Widget_cachedFonts.get((long)var0); // L: 12894
		if (var1 == null) { // L: 12895
			var1 = new class521(class313.field3396, var0); // L: 12896
		}

		return var1; // L: 12898
	}
}
