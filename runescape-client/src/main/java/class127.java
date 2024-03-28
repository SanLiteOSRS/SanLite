import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class127 {
	@ObfuscatedName("at")
	public static final float field1518;
	@ObfuscatedName("an")
	public static final float field1522;
	@ObfuscatedName("ao")
	static float[] field1523;
	@ObfuscatedName("ab")
	static float[] field1524;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1855052619
	)
	static int field1519;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -2081060261
	)
	static int field1520;
	@ObfuscatedName("jq")
	static byte[][] field1528;

	static {
		field1518 = Math.ulp(1.0F); // L: 10
		field1522 = field1518 * 2.0F; // L: 11
		field1523 = new float[4]; // L: 12
		field1524 = new float[5]; // L: 13
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lik;",
		garbageValue = "1828485110"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FB)F",
		garbageValue = "24"
	)
	public static final float method2957(float var0) {
		float var1 = 75.0F; // L: 26
		float var2 = 10000.0F; // L: 27
		float var3 = 750000.0F / (10000.0F - 9925.0F * var0); // L: 28
		return (var3 - 75.0F) / 9925.0F; // L: 29
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "910049428"
	)
	static void method2958() {
		if (class11.loadWorlds()) { // L: 1998
			Login.worldSelectOpen = true; // L: 1999
			Login.worldSelectPage = 0; // L: 2000
			Login.worldSelectPagesCount = 0; // L: 2001
		}

	} // L: 2003
}
