import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lgm;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -518380787
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -879981925
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("j")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -858300133
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;IDI)V"
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
		descriptor = "(I)I",
		garbageValue = "-1251728227"
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
					if (this.archive.method5071(var8)) {
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

	@ObfuscatedName("e")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "20"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1186181127"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-189956627"
	)
	public boolean vmethod4428(int var1) {
		return this.textures[var1].field2214;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2053899531"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-19913"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "942464912"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Lep;",
		garbageValue = "-96"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	public static int method4272(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;Ljava/lang/String;I)Lof;",
		garbageValue = "-1314791632"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		IndexedSprite var5;
		if (!Message.method1263(var0, var3, var4)) {
			var5 = null;
		} else {
			var5 = class302.method5571();
		}

		return var5;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-635307263"
	)
	static final void method4291(String var0) {
		PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2643, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "462577738"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class20.loadInterface(var0)) {
			Widget[] var1 = GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
