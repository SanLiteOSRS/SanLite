import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class207 {
	@ObfuscatedName("wq")
	@ObfuscatedGetter(
		intValue = 1951750999
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedSprites")
	static final class207 Widget_cachedSprites;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedModels")
	static final class207 Widget_cachedModels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedFonts")
	static final class207 Widget_cachedFonts;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedSpriteMasks")
	static final class207 Widget_cachedSpriteMasks;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2279;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2275;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2287;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2281;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2283;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2284;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2285;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2280;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2278;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2288;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1269733693
	)
	public final int field2289;

	static {
		Widget_cachedSprites = new class207(0); // L: 4
		Widget_cachedModels = new class207(1); // L: 5
		Widget_cachedFonts = new class207(2); // L: 6
		Widget_cachedSpriteMasks = new class207(3); // L: 7
		field2279 = new class207(4, class193.field2027); // L: 8
		field2275 = new class207(5); // L: 9
		field2287 = new class207(6, class193.field2028); // L: 10
		field2281 = new class207(7, class193.field2025); // L: 11
		field2283 = new class207(8, class193.field2030); // L: 12
		field2284 = new class207(9, class193.field2029); // L: 13
		field2285 = new class207(10, class193.field2031); // L: 14
		field2280 = new class207(11, class193.field2026); // L: 15
		field2278 = new class207(12);
		field2288 = new class207(13); // L: 17
	}

	class207(int var1) {
		this(var1, (class193)null); // L: 25
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(ILhx;)V"
	)
	class207(int var1, class193 var2) {
		this.field2289 = var1; // L: 21
	} // L: 22

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2078236639"
	)
	static String method4107() {
		return class30.clientPreferences.method2533() ? class368.method7012(Login.Login_username) : Login.Login_username; // L: 297
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldd;",
		garbageValue = "3"
	)
	static class90[] method4106() {
		return new class90[]{class90.field1116, class90.field1122, class90.field1118, class90.field1117, class90.field1115}; // L: 16
	}
}
