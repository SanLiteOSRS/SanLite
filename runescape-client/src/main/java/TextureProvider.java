import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lif;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -997416033
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1854212709
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ac")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1457440821
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		if (var7 != null) { // L: 23
			int var8 = var7.length; // L: 24
			this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 25

			for (int var9 = 0; var9 < var8; ++var9) { // L: 26
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 27
				this.textures[var7[var9]] = new Texture(var10); // L: 28
			}
		} else {
			this.textures = new Texture[0]; // L: 32
		}

	} // L: 34

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) { // L: 37
			return 100;
		} else {
			int var1 = 0; // L: 38
			int var2 = 0; // L: 39
			Texture[] var3 = this.textures; // L: 41

			for (int var4 = 0; var4 < var3.length; ++var4) { // L: 42
				Texture var5 = var3[var4]; // L: 43
				if (var5 != null && var5.fileIds != null) { // L: 45
					var1 += var5.fileIds.length; // L: 46
					int[] var6 = var5.fileIds; // L: 48

					for (int var7 = 0; var7 < var6.length; ++var7) { // L: 49
						int var8 = var6[var7]; // L: 50
						if (this.archive.method6698(var8)) { // L: 52
							++var2; // L: 53
						}
					}
				}
			}

			if (var1 == 0) {
				return 0;
			} else {
				return var2 * 100 / var1;
			}
		}
	}

	@ObfuscatedName("ae")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1284455059"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1228029354"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 94
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "89"
	)
	public boolean vmethod5036(int var1) {
		return this.textures[var1].field2486; // L: 99
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1328264692"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 103
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1655781551"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 107
			if (this.textures[var1] != null) { // L: 108
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 110
		this.remaining = this.capacity; // L: 111
	} // L: 112

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2107237619"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 115
			Texture var3 = this.textures[var2]; // L: 116
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 117
				var3.animate(var1); // L: 118
				var3.isLoaded = false; // L: 119
			}
		}

	} // L: 122

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "1"
	)
	public static byte[] method4752(CharSequence var0) {
		int var1 = var0.length(); // L: 61
		byte[] var2 = new byte[var1]; // L: 62

		for (int var3 = 0; var3 < var1; ++var3) { // L: 63
			char var4 = var0.charAt(var3); // L: 64
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 65
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 66
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 67
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 68
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 69
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 70
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 71
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 72
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 73
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 74
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118; // L: 75
			} else if (var4 == 8249) { // L: 76
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 77
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 78
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 79
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 80
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 81
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 82
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 83
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 84
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 85
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 86
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 87
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 88
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101; // L: 89
			} else if (var4 == 339) { // L: 90
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 91
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 92
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 93
			}
		}

		return var2; // L: 95
	}
}
