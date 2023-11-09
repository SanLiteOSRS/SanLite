import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Liq;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -300508505
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -578773067
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ax")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2070337693
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;IDI)V"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2129653920"
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
						if (this.archive.method6694(var8)) { // L: 52
							++var2; // L: 53
						}
					}
				}
			}

			if (var1 == 0) { // L: 61
				return 0;
			} else {
				return var2 * 100 / var1; // L: 62
			}
		}
	}

	@ObfuscatedName("an")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 66
		this.clear(); // L: 67
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1457358156"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 71
		if (var2 != null) { // L: 72
			if (var2.pixels != null) { // L: 73
				this.deque.addLast(var2); // L: 74
				var2.isLoaded = true; // L: 75
				return var2.pixels; // L: 76
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive); // L: 78
			if (var3) { // L: 79
				if (this.remaining == 0) { // L: 80
					Texture var4 = (Texture)this.deque.removeFirst(); // L: 81
					var4.reset(); // L: 82
				} else {
					--this.remaining; // L: 84
				}

				this.deque.addLast(var2); // L: 85
				var2.isLoaded = true; // L: 86
				return var2.pixels; // L: 87
			}
		}

		return null; // L: 90
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 94 95
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public boolean vmethod5030(int var1) {
		return this.textures[var1].field2469; // L: 99
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "28"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 103
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "858578069"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-54"
	)
	public static int method4744(CharSequence var0) {
		return class211.method4167(var0, 10, true); // L: 68
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-81"
	)
	static void method4755(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 184
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2); // L: 185
		if (var4 != null) { // L: 186
			NetCache.NetCache_pendingWritesQueue.addLast(var4); // L: 187
		}
	} // L: 188

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1705195685"
	)
	public static void method4758() {
		class515.SpriteBuffer_xOffsets = null; // L: 289
		class402.SpriteBuffer_yOffsets = null; // L: 290
		class515.SpriteBuffer_spriteWidths = null; // L: 291
		class515.SpriteBuffer_spriteHeights = null; // L: 292
		class515.SpriteBuffer_spritePalette = null; // L: 293
		class515.SpriteBuffer_pixels = null; // L: 294
	} // L: 295
}
