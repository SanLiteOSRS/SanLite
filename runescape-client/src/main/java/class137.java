import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class137 extends class139 {
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -8453460473841490933L
	)
	long field1632;
	@ObfuscatedName("an")
	String field1633;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class137(class142 var1) {
		this.this$0 = var1;
		this.field1632 = -1L; // L: 74
		this.field1633 = null; // L: 75
	} // L: 77

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1632 = var1.readLong(); // L: 82
		}

		this.field1633 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.method3299(this.field1632, this.field1633, 0); // L: 88
	} // L: 89

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-876753180"
	)
	static void method3197() {
		Tiles.Tiles_minPlane = 99; // L: 45
		class186.field1976 = new short[4][104][104]; // L: 46
		Tiles.field997 = new short[4][104][104]; // L: 47
		Tiles.field1008 = new byte[4][104][104]; // L: 48
		Tiles.field999 = new byte[4][104][104]; // L: 49
		class161.field1782 = new int[4][105][105]; // L: 50
		Tiles.field994 = new byte[4][105][105]; // L: 51
		Tiles.field996 = new int[105][105]; // L: 52
		FileSystem.Tiles_hue = new int[104]; // L: 53
		Tiles.Tiles_saturation = new int[104]; // L: 54
		class283.Tiles_lightness = new int[104]; // L: 55
		UserComparator4.Tiles_hueMultiplier = new int[104]; // L: 56
		class31.field176 = new int[104]; // L: 57
	} // L: 58
}
