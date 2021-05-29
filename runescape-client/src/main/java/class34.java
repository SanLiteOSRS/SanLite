import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public enum class34 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	field256(0, 0);

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static class339 field254;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -537510065
	)
	final int field252;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1586527889
	)
	final int field253;

	class34(int var3, int var4) {
		this.field252 = var3;
		this.field253 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field253;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-67481948"
	)
	static void method327() {
		Tiles.Tiles_minPlane = 99;
		Tiles.field1120 = new byte[4][104][104];
		class253.field3130 = new byte[4][104][104];
		class20.field182 = new byte[4][104][104];
		DirectByteArrayCopier.field3128 = new byte[4][104][104];
		UrlRequester.field1419 = new int[4][105][105];
		class372.field4123 = new byte[4][105][105];
		class229.field2813 = new int[105][105];
		ChatChannel.Tiles_hue = new int[104];
		class23.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		ParamComposition.Tiles_hueMultiplier = new int[104];
		DefaultsGroup.field3894 = new int[104];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method328() {
		Tiles.field1120 = null;
		class253.field3130 = null;
		class20.field182 = null;
		DirectByteArrayCopier.field3128 = null;
		UrlRequester.field1419 = null;
		class372.field4123 = null;
		class229.field2813 = null;
		ChatChannel.Tiles_hue = null;
		class23.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		ParamComposition.Tiles_hueMultiplier = null;
		DefaultsGroup.field3894 = null;
	}
}
