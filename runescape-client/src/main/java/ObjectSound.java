import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1401561861
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1199351805
	)
	@Export("x")
	int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1139384192
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 699471981
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1301434539
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1369887985
	)
	int field847;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1499670769
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -384288947
	)
	int field842;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1911815479
	)
	int field839;
	@ObfuscatedName("i")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1274533343
	)
	int field850;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1596084359"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field847 = var2.int7 * 128; // L: 54
			this.field842 = var2.int5; // L: 55
			this.field839 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field847 = 0; // L: 61
			this.field842 = 0; // L: 62
			this.field839 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1783942898"
	)
	public static boolean method1871(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 45
			return true;
		} else {
			if (var0 != 0) { // L: 46
				char[] var1 = class358.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true; // L: 53
					}
				}
			}

			return false; // L: 59
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "11"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class37.method706(var0, var1, var2, var3, var4, var5, -1, false); // L: 9972
	} // L: 9973
}
