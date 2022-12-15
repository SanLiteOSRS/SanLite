import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class338 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;II)Lkl;",
		garbageValue = "450082500"
	)
	static MusicPatch method6604(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 21
		return var2 == null ? null : new MusicPatch(var2); // L: 22
	}

	@ObfuscatedName("b")
	static final void method6605(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 83
	} // L: 84
}
