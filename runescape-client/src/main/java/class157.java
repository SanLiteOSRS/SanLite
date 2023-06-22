import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class157 extends class142 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 369331553
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8489607795920725143L
	)
	long field1733;
	@ObfuscatedName("an")
	String field1730;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -127734709
	)
	int field1729;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class157(class145 var1) {
		this.this$0 = var1;
		this.field1733 = -1L; // L: 93
		this.field1730 = null; // L: 94
		this.field1729 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1733 = var1.readLong(); // L: 102
		}

		this.field1730 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1729 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3207(this.field1733, this.field1730, this.field1729); // L: 109
	} // L: 110

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1636680829"
	)
	public static int method3299(int var0) {
		if (var0 > 0) { // L: 204
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 205 206
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "715423144"
	)
	static void method3300(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1556

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1557
			int var4 = var3 * 32 + 15 + 128; // L: 1558
			int var5 = class101.method2635(var4); // L: 1559
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1560
			int var8 = var1 - 334; // L: 1563
			if (var8 < 0) { // L: 1564
				var8 = 0;
			} else if (var8 > 100) { // L: 1565
				var8 = 100;
			}

			int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 1566
			int var7 = var5 * var9 / 256; // L: 1567
			var2[var3] = var6 * var7 >> 16; // L: 1570
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1572
	} // L: 1573
}
