import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class467 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	public static final class467 field4866;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	public static final class467 field4859;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	public static final class467 field4865;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 800309189
	)
	public final int field4861;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 502816997
	)
	public final int field4862;
	@ObfuscatedName("ao")
	public final Class field4858;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	final class463 field4864;

	static {
		field4866 = new class467(0, 0, Integer.class, new class464()); // L: 10
		field4859 = new class467(1, 1, Long.class, new class466()); // L: 24
		field4865 = new class467(2, 2, String.class, new class468()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lrj;)V"
	)
	class467(int var1, int var2, Class var3, class463 var4) {
		this.field4861 = var1; // L: 62
		this.field4862 = var2; // L: 63
		this.field4858 = var3; // L: 64
		this.field4864 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4862; // L: 112
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)Ljava/lang/Object;",
		garbageValue = "-680543053"
	)
	public Object method8465(Buffer var1) {
		return this.field4864.vmethod8485(var1); // L: 116
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "83"
	)
	public static int method8481(int var0) {
		return var0 >> 17 & 7; // L: 13
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lew;FB)F",
		garbageValue = "33"
	)
	static float method8462(class127 var0, float var1) {
		if (var0 == null) { // L: 139
			return 0.0F; // L: 140
		} else {
			float var2 = var1 - var0.field1505; // L: 142
			return var0.field1500 + var2 * (var2 * (var2 * var0.field1521 + var0.field1506) + var0.field1507); // L: 143
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lrf;",
		garbageValue = "79"
	)
	public static class467[] method8480() {
		return new class467[]{field4866, field4865, field4859}; // L: 58
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lrf;",
		garbageValue = "-2"
	)
	public static class467 method8473(Class var0) {
		class467[] var1 = method8480(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class467 var3 = var1[var2]; // L: 72
			if (var3.field4858 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lsy;B)V",
		garbageValue = "32"
	)
	public static void method8475(Object var0, Buffer var1) {
		class463 var2 = method8471(var0.getClass()); // L: 83
		var2.vmethod8486(var0, var1); // L: 84
	} // L: 85

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lrj;",
		garbageValue = "-18"
	)
	static class463 method8471(Class var0) {
		class467[] var2 = method8480(); // L: 92
		int var3 = 0;

		class467 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null; // L: 103
				break;
			}

			class467 var4 = var2[var3]; // L: 94
			if (var4.field4858 == var0) { // L: 96
				var1 = var4; // L: 97
				break;
			}

			++var3; // L: 93
		}

		if (var1 == null) { // L: 106
			throw new IllegalArgumentException();
		} else {
			return var1.field4864; // L: 107
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lcz;",
		garbageValue = "306318319"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class260.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(B)Lrc;",
		garbageValue = "-64"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return WorldMapData_1.worldMap; // L: 720
	}
}
