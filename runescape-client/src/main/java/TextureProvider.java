import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lks;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2010680135
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1765545141
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ab")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -414641329
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;IDI)V"
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
		descriptor = "(B)I",
		garbageValue = "81"
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
						if (this.archive.method6954(var8)) { // L: 52
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

	@ObfuscatedName("ah")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 66
		this.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2146690386"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-799593144"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 94 95
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-293103198"
	)
	public boolean vmethod5823(int var1) {
		return this.textures[var1].field2725; // L: 99
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "32621"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 103
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1262125265"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2003638345"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 115
			Texture var3 = this.textures[var2]; // L: 116
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1); // L: 118
				var3.isLoaded = false;
			}
		}

	} // L: 122

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1703102437"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = class131.getPreferencesFile("", Messages.field1401.name, true); // L: 119
			Buffer var1 = WorldMapIcon_1.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset); // L: 121
		} catch (Exception var3) { // L: 123
		}

		try {
			if (var0 != null) { // L: 125
				var0.closeSync(true); // L: 126
			}
		} catch (Exception var2) { // L: 129
		}

	} // L: 130

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	static final void method5533() {
		class314.method5953(FloorOverlayDefinition.field2194, class323.field3490, Projectile.field937); // L: 3902
		class303.method5908(class127.field1494, CollisionMap.field2370); // L: 3903
		if (FloorOverlayDefinition.field2194 == ViewportMouse.cameraX && SecureRandomFuture.cameraY == class323.field3490 && class36.cameraZ == Projectile.field937 && class127.field1494 == Varcs.cameraPitch && CollisionMap.field2370 == class192.cameraYaw) { // L: 3904
			Client.field482 = false; // L: 3905
			Client.isCameraLocked = false; // L: 3906
			Client.field748 = false; // L: 3907
			Client.field749 = false; // L: 3908
			Messages.field1400 = 0; // L: 3909
			AbstractWorldMapData.field2575 = 0; // L: 3910
			class302.field3119 = 0; // L: 3911
			class60.field421 = 0; // L: 3912
			class134.field1581 = 0; // L: 3913
			class1.field2 = 0; // L: 3914
			WorldMapIcon_0.field2529 = 0; // L: 3915
			ScriptFrame.field456 = 0; // L: 3916
			class216.field2314 = 0; // L: 3917
			class127.field1488 = 0; // L: 3918
			Client.field751 = null; // L: 3919
			Client.field672 = null; // L: 3920
			Client.field752 = null; // L: 3921
		}

	} // L: 3923
}
