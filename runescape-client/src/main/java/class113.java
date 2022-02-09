import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class113 {
	@ObfuscatedName("d")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2057074417
	)
	public final int field1397;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	public class113 field1394;
	@ObfuscatedName("s")
	float[][] field1395;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lni;"
	)
	final class371[] field1396;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lni;"
	)
	class371[] field1405;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lni;"
	)
	class371[] field1398;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class371 field1399;
	@ObfuscatedName("w")
	boolean field1400;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class371 field1401;
	@ObfuscatedName("a")
	boolean field1402;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class371 field1403;
	@ObfuscatedName("u")
	float[][] field1404;
	@ObfuscatedName("h")
	float[][] field1407;
	@ObfuscatedName("q")
	float[][] field1406;

	@ObfuscatedSignature(
		descriptor = "(ILpi;Z)V"
	)
	public class113(int var1, Buffer var2, boolean var3) {
		this.field1399 = new class371();
		this.field1400 = true;
		this.field1401 = new class371();
		this.field1402 = true;
		this.field1403 = new class371();
		this.field1397 = var2.readShort();
		this.field1396 = new class371[var1];
		this.field1405 = new class371[this.field1396.length];
		this.field1398 = new class371[this.field1396.length];
		this.field1395 = new float[this.field1396.length][3];

		for (int var4 = 0; var4 < this.field1396.length; ++var4) {
			this.field1396[var4] = new class371(var2, var3);
			this.field1395[var4][0] = var2.method7374();
			this.field1395[var4][1] = var2.method7374();
			this.field1395[var4][2] = var2.method7374();
		}

		this.method2561();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1595594268"
	)
	void method2561() {
		this.field1404 = new float[this.field1396.length][3];
		this.field1407 = new float[this.field1396.length][3];
		this.field1406 = new float[this.field1396.length][3];
		class371 var1 = WorldMapSection0.method4716();

		for (int var2 = 0; var2 < this.field1396.length; ++var2) {
			class371 var3 = this.method2562(var2);
			var1.method6699(var3);
			var1.method6705();
			this.field1404[var2] = var1.method6732();
			this.field1407[var2][0] = var3.field4241[12];
			this.field1407[var2][1] = var3.field4241[13];
			this.field1407[var2][2] = var3.field4241[14];
			this.field1406[var2] = var3.method6688();
		}

		var1.method6703();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lni;",
		garbageValue = "1703500321"
	)
	class371 method2562(int var1) {
		return this.field1396[var1];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lni;",
		garbageValue = "-1225355114"
	)
	class371 method2563(int var1) {
		if (this.field1405[var1] == null) {
			this.field1405[var1] = new class371(this.method2562(var1));
			if (this.field1394 != null) {
				this.field1405[var1].method6682(this.field1394.method2563(var1));
			} else {
				this.field1405[var1].method6682(class371.field4239);
			}
		}

		return this.field1405[var1];
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lni;",
		garbageValue = "-1654550161"
	)
	class371 method2564(int var1) {
		if (this.field1398[var1] == null) {
			this.field1398[var1] = new class371(this.method2563(var1));
			this.field1398[var1].method6705();
		}

		return this.field1398[var1];
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "9630041"
	)
	void method2565(class371 var1) {
		this.field1399.method6699(var1);
		this.field1400 = true;
		this.field1402 = true;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lni;",
		garbageValue = "1"
	)
	class371 method2566() {
		return this.field1399;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lni;",
		garbageValue = "-2064614859"
	)
	class371 method2577() {
		if (this.field1400) {
			this.field1401.method6699(this.method2566());
			if (this.field1394 != null) {
				this.field1401.method6682(this.field1394.method2577());
			}

			this.field1400 = false;
		}

		return this.field1401;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lni;",
		garbageValue = "88"
	)
	public class371 method2593(int var1) {
		if (this.field1402) {
			this.field1403.method6699(this.method2564(var1));
			this.field1403.method6682(this.method2577());
			this.field1402 = false;
		}

		return this.field1403;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1675766332"
	)
	float[] method2569(int var1) {
		return this.field1404[var1];
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-62"
	)
	float[] method2589(int var1) {
		return this.field1407[var1];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IS)[F",
		garbageValue = "-21564"
	)
	float[] method2570(int var1) {
		return this.field1406[var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-1704063900"
	)
	static float method2602(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var3 * var2;
		}

		return var3;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldl;",
		garbageValue = "-32"
	)
	static class116 method2600(int var0) {
		class116[] var1 = new class116[]{class116.field1443, class116.field1436, class116.field1439, class116.field1438, class116.field1441, class116.field1440};
		class116 var2 = (class116)class140.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class116.field1443;
		}

		return var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgl;",
		garbageValue = "0"
	)
	public static class185[] method2601() {
		return new class185[]{class185.field2135, class185.field2132, class185.field2137, class185.field2133};
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-548677477"
	)
	public static void method2603() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}
}
