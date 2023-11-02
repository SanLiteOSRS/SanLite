import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class185 {
	@ObfuscatedName("ak")
	public short[] field1894;
	@ObfuscatedName("ax")
	public short[] field1893;

	public class185(int var1) {
		ItemComposition var2 = class214.ItemComposition_get(var1); // L: 12
		if (var2.method4066()) { // L: 13
			this.field1894 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1894, 0, this.field1894.length); // L: 15
		}

		if (var2.method4067()) { // L: 17
			this.field1893 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1893, 0, this.field1893.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "466779098"
	)
	static void method3598() {
		Tiles.Tiles_minPlane = 99;
		World.field841 = new short[4][104][104]; // L: 46
		VertexNormal.field2820 = new short[4][104][104]; // L: 47
		SecureRandomFuture.field997 = new byte[4][104][104]; // L: 48
		class199.field2004 = new byte[4][104][104]; // L: 49
		UserComparator6.field1486 = new int[4][105][105]; // L: 50
		Tiles.field1045 = new byte[4][105][105]; // L: 51
		class158.field1739 = new int[105][105]; // L: 52
		SecureRandomFuture.Tiles_hue = new int[104]; // L: 53
		class135.Tiles_saturation = new int[104]; // L: 54
		Tiles.Tiles_lightness = new int[104]; // L: 55
		WorldMapSection2.Tiles_hueMultiplier = new int[104]; // L: 56
		Script.field1008 = new int[104]; // L: 57
	} // L: 58

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "841575506"
	)
	public static void method3597() {
		InvDefinition.InvDefinition_cached.clear(); // L: 44
	} // L: 45
}
