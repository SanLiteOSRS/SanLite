import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field883;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static class67 field894;
	@ObfuscatedName("si")
	static boolean field893;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -753797499
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -656693601
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 213232931
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 596666987
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -511219319
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -620532157
	)
	@Export("z")
	int z;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1820518937
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1032630509
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("al")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = UserComparator3.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = DevicePcmPlayerProvider.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "76"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method4232()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = UserComparator3.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Loc;III)Lvg;",
		garbageValue = "-349860405"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 70
		boolean var3;
		if (var4 == null) { // L: 71
			var3 = false; // L: 72
		} else {
			class483.SpriteBuffer_decode(var4); // L: 75
			var3 = true; // L: 76
		}

		if (!var3) { // L: 78
			return null;
		} else {
			SpritePixels var5 = new SpritePixels(); // L: 81
			var5.width = class549.SpriteBuffer_spriteWidth; // L: 82
			var5.height = class549.SpriteBuffer_spriteHeight; // L: 83
			var5.xOffset = class549.SpriteBuffer_xOffsets[0]; // L: 84
			var5.yOffset = class549.SpriteBuffer_yOffsets[0]; // L: 85
			var5.subWidth = class549.SpriteBuffer_spriteWidths[0]; // L: 86
			var5.subHeight = Ignored.SpriteBuffer_spriteHeights[0]; // L: 87
			int var6 = var5.subWidth * var5.subHeight; // L: 88
			byte[] var7 = class549.SpriteBuffer_pixels[0]; // L: 89
			var5.pixels = new int[var6]; // L: 90

			for (int var8 = 0; var8 < var6; ++var8) { // L: 91
				var5.pixels[var8] = class126.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			SpotAnimationDefinition.method3949(); // L: 92
			return var5; // L: 95
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-1773581638"
	)
	static final void method2076(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10283
			if (Client.menuOptionsCount < 500) { // L: 10284
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10285
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10286
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10287
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10288
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10289
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10290
				Client.field602[Client.menuOptionsCount] = var6; // L: 10291
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10292
				++Client.menuOptionsCount; // L: 10293
			}

		}
	} // L: 10295

	public GraphicsObject() {
	}
}
