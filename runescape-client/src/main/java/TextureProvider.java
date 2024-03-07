import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kd")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 11758587
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 761958553
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ar")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1755815021
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1855185448"
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
						if (this.archive.method7108(var8)) { // L: 52
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

	@ObfuscatedName("aw")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 66
		this.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-56"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1375979638"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 94 95
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "995906382"
	)
	public boolean vmethod5948(int var1) {
		return this.textures[var1].field2767; // L: 99
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "62"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 103
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264064121"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-118751843"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1434044569"
	)
	static int method5671(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4393
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWindowedMode(); // L: 4394
			return 1; // L: 4395
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4397
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4398
				if (var3 == 1 || var3 == 2) { // L: 4399
					FloorOverlayDefinition.setWindowedMode(var3);
				}

				return 1; // L: 4400
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4402
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class30.clientPreferences.method2553(); // L: 4403
				return 1; // L: 4404
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4406
				if (var0 == 5310) { // L: 4413
					--Interpreter.Interpreter_intStackSize; // L: 4414
					return 1; // L: 4415
				} else {
					return 2; // L: 4417
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4407
				if (var3 == 1 || var3 == 2) { // L: 4408
					class30.clientPreferences.method2552(var3); // L: 4409
				}

				return 1; // L: 4411
			}
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	static void method5672(int var0) {
		Client.oculusOrbState = var0; // L: 12915
	} // L: 12916
}
