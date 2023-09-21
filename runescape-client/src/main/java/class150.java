import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class150 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -530195071
	)
	int field1678;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 305260667
	)
	int field1674;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1815038205
	)
	int field1675;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -532414831
	)
	int field1677;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class150(class148 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1678 = var1.readInt(); // L: 292
		this.field1677 = var1.readInt(); // L: 293
		this.field1674 = var1.readUnsignedByte(); // L: 294
		this.field1675 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3252(this.field1678, this.field1677, this.field1674, this.field1675); // L: 299
	} // L: 300

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lha;",
		garbageValue = "84"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;Ljava/lang/String;I)I",
		garbageValue = "-1376508948"
	)
	public static int method3192(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		int var4 = var1.length(); // L: 17
		byte[] var5 = new byte[var4]; // L: 18

		for (int var6 = 0; var6 < var4; ++var6) { // L: 19
			char var7 = var1.charAt(var6); // L: 20
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 21
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 22
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 23
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 24
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 25
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 26
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 27
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 28
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 29
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 30
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 31
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 32
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 33
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 34
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 35
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 36
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 37
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 38
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 39
				var5[var6] = -107;
			} else if (var7 == 8211) { // L: 40
				var5[var6] = -106;
			} else if (var7 == 8212) { // L: 41
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 42
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 43
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 44
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 45
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 46
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 47
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 48
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 49
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 54
		var0.offset += class349.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 55
		return var0.offset - var2; // L: 56
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1670051292"
	)
	static int method3186(int var0, Script var1, boolean var2) {
		return 2; // L: 5294
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-405650921"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5869
			int var3 = class115.getTileHeight(var0, var1, class87.Client_plane) - var2; // L: 5874
			var0 -= Client.cameraX; // L: 5875
			var3 -= class17.cameraY; // L: 5876
			var1 -= WorldMapArea.cameraZ; // L: 5877
			int var4 = Rasterizer3D.Rasterizer3D_sine[class365.cameraPitch]; // L: 5878
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class365.cameraPitch]; // L: 5879
			int var6 = Rasterizer3D.Rasterizer3D_sine[DecorativeObject.cameraYaw]; // L: 5880
			int var7 = Rasterizer3D.Rasterizer3D_cosine[DecorativeObject.cameraYaw]; // L: 5881
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5882
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5883
			var0 = var8; // L: 5884
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5885
			var1 = var3 * var4 + var5 * var1 >> 16; // L: 5886
			if (var1 >= 50) { // L: 5888
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5889
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5890
			} else {
				Client.viewportTempX = -1; // L: 5893
				Client.viewportTempY = -1; // L: 5894
			}

		} else {
			Client.viewportTempX = -1; // L: 5870
			Client.viewportTempY = -1; // L: 5871
		}
	} // L: 5872 5896
}
