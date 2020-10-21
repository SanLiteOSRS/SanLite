import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("f")
	byte[] field2423;
	@ObfuscatedName("b")
	byte[] field2426;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -261303639
	)
	int field2419;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -689759697
	)
	int field2420;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 164653841
	)
	int field2421;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2055857397
	)
	int field2422;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1633678853
	)
	int field2418;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -451863831
	)
	int field2424;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -354420263
	)
	int field2425;

	MusicPatchNode2() {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIIB)I",
		garbageValue = "-19"
	)
	public static int method3831(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lht;II)V",
		garbageValue = "1909237816"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2668 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field2594 == null) {
				var0.field2594 = new int[var0.field2668.length];
			}

			var0.field2594[var1] = Integer.MAX_VALUE;
		}
	}
}
