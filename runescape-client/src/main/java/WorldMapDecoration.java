import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ac")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("bp")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1098083075
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -791960173
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1760076391
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqj;",
		garbageValue = "-1915947192"
	)
	static class441[] method5485() {
		return new class441[]{class441.field4716, class441.field4719, class441.field4714, class441.field4715}; // L: 16
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lal;",
		garbageValue = "-955577502"
	)
	public static class6[] method5486() {
		return new class6[]{class6.field15}; // L: 12
	}
}
