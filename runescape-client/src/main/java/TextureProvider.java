import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 661667840
	)
	static int field1561;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "[Leo;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1194513141
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1829748835
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("i")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -436241833
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		signature = "(Lic;Lic;IDI)V"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "861798052"
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
					if (this.archive.method4251(var8)) {
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

	@ObfuscatedName("k")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(II)[I",
		garbageValue = "-1265290789"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "260599249"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "168595235"
	)
	public boolean vmethod3396(int var1) {
		return this.textures[var1].field1647;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IS)Z",
		garbageValue = "14506"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "8"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-736148510"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "194887508"
	)
	public static boolean method2876(int var0) {
		return var0 >= WorldMapDecorationType.field2760.id && var0 <= WorldMapDecorationType.field2757.id || var0 == WorldMapDecorationType.field2761.id;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([Lgq;II)Lgq;",
		garbageValue = "1374231902"
	)
	@Export("findEnumerated")
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enumerated var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)Lij;",
		garbageValue = "38"
	)
	public static GameBuild method2863(int var0) {
		GameBuild[] var1 = IgnoreList.method5182();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}
}
