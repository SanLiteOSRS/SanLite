import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
public class class490 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	public static final class490 field4973;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	public static final class490 field4972;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	public static final class490 field4976;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 962054877
	)
	public final int field4977;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -298664853
	)
	public final int field4975;
	@ObfuscatedName("ap")
	public final Class field4974;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	final class486 field4971;

	static {
		field4973 = new class490(1, 0, Integer.class, new class487()); // L: 10
		field4972 = new class490(2, 1, Long.class, new class489()); // L: 24
		field4976 = new class490(0, 2, String.class, new class491()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lso;)V"
	)
	class490(int var1, int var2, Class var3, class486 var4) {
		this.field4977 = var1; // L: 62
		this.field4975 = var2; // L: 63
		this.field4974 = var3; // L: 64
		this.field4971 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4975; // L: 93
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)Ljava/lang/Object;",
		garbageValue = "21"
	)
	public Object method8758(Buffer var1) {
		return this.field4971.vmethod8773(var1); // L: 97
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsw;",
		garbageValue = "-823988806"
	)
	public static class490[] method8761() {
		return new class490[]{field4976, field4973, field4972}; // L: 58
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "349653987"
	)
	public static void method8764() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 86
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lso;",
		garbageValue = "1741919342"
	)
	public static class486 method8756(Class var0) {
		class490[] var2 = method8761(); // L: 73
		int var3 = 0;

		class490 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null; // L: 84
				break;
			}

			class490 var4 = var2[var3]; // L: 75
			if (var4.field4974 == var0) { // L: 77
				var1 = var4; // L: 78
				break;
			}

			++var3; // L: 74
		}

		if (var1 == null) { // L: 87
			throw new IllegalArgumentException();
		} else {
			return var1.field4971; // L: 88
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILmb;IIIII[FB)Lmb;",
		garbageValue = "-79"
	)
	static Widget method8768(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 852
		var8.type = var0; // L: 853
		var8.parentId = var1.id; // L: 854
		var8.childIndex = var2; // L: 855
		var8.isIf3 = true; // L: 856
		var8.xAlignment = var3; // L: 857
		var8.yAlignment = var4; // L: 858
		var8.widthAlignment = var5; // L: 859
		var8.heightAlignment = var6; // L: 860
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 861
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 862
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 863
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 864
		return var8; // L: 865
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lsw;I)Ljava/lang/Object;",
		garbageValue = "-431860160"
	)
	static Object method8770(class490 var0) {
		if (var0 == null) { // L: 5269
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5270
		} else {
			switch(var0.field4977) { // L: 5272
			case 0:
				return Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 5278
			case 1:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5276
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5274
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "871967711"
	)
	static void method8769() {
		PcmPlayer.field300 = System.getenv("JX_ACCESS_TOKEN"); // L: 892
		class4.field8 = System.getenv("JX_REFRESH_TOKEN"); // L: 893
		WorldMapDecorationType.field3788 = System.getenv("JX_SESSION_ID"); // L: 894
		Ignored.field4610 = System.getenv("JX_CHARACTER_ID"); // L: 895
		String var0 = System.getenv("JX_DISPLAY_NAME"); // L: 896
		Login.field939 = class1.method9(var0); // L: 898
	} // L: 900
}
