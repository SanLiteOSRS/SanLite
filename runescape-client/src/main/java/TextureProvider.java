import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("x")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lgy;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2032521801
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1066617989
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("k")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 928913955
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;IDI)V"
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
		int var8 = var7.length; // L: 23
		this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 24

		for (int var9 = 0; var9 < var8; ++var9) { // L: 25
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10); // L: 27
		}

	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1687202729"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0; // L: 32
		int var2 = 0; // L: 33
		Texture[] var3 = this.textures; // L: 35

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 36
			Texture var5 = var3[var4]; // L: 37
			if (var5 != null && var5.fileIds != null) { // L: 39
				var1 += var5.fileIds.length; // L: 40
				int[] var6 = var5.fileIds; // L: 42

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 43
					int var8 = var6[var7]; // L: 44
					if (this.archive.method6011(var8)) { // L: 46
						++var2; // L: 47
					}
				}
			}
		}

		if (var1 == 0) { // L: 55
			return 0;
		} else {
			return var2 * 100 / var1; // L: 56
		}
	}

	@ObfuscatedName("p")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 60
		this.clear(); // L: 61
	} // L: 62

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-2101542497"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 65
		if (var2 != null) { // L: 66
			if (var2.pixels != null) { // L: 67
				this.deque.addLast(var2); // L: 68
				var2.isLoaded = true; // L: 69
				return var2.pixels; // L: 70
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive); // L: 72
			if (var3) { // L: 73
				if (this.remaining == 0) { // L: 74
					Texture var4 = (Texture)this.deque.removeFirst(); // L: 75
					var4.reset(); // L: 76
				} else {
					--this.remaining; // L: 78
				}

				this.deque.addLast(var2); // L: 79
				var2.isLoaded = true; // L: 80
				return var2.pixels; // L: 81
			}
		}

		return null; // L: 84
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-14"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 88 89
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "8"
	)
	public boolean vmethod4653(int var1) {
		return this.textures[var1].field2323; // L: 93
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "75925311"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 97
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-43207350"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 101
			if (this.textures[var1] != null) { // L: 102
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 104
		this.remaining = this.capacity; // L: 105
	} // L: 106

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 109
			Texture var3 = this.textures[var2]; // L: 110
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 111
				var3.animate(var1); // L: 112
				var3.isLoaded = false; // L: 113
			}
		}

	} // L: 116

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-642711715"
	)
	static boolean method4482(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}
}
