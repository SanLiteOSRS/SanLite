import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		signature = "Ldl;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "[Lfc;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1298178757
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -453535345
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("b")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 412099007
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		signature = "(Lir;Lir;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0D;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		int var8 = var7.length;
		this.textures = new Texture[var1.getGroupFileCount(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-11"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0;
		int var2 = 0;
		Texture[] var3 = this.textures;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			Texture var5 = var3[var4];
			if (var5 != null && var5.fileIds != null) {
				var1 += var5.fileIds.length;
				int[] var6 = var5.fileIds;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					int var8 = var6[var7];
					if (this.archive.method4479(var8)) {
						++var2;
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

	@ObfuscatedName("o")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)[I",
		garbageValue = "1311269963"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-897876205"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1352590845"
	)
	public boolean vmethod3790(int var1) {
		return this.textures[var1].field1849;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "306645378"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-74"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "2035230902"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}

	}
}
