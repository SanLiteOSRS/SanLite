import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public final class class236 {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive7")
	static Archive archive7;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lid;II)V",
		garbageValue = "-237601579"
	)
	static void method4263(Archive var0, int var1) {
		if (class90.NetCache_reference != null) {
			class90.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = class90.NetCache_reference.readInt();
			int var3 = class90.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			VarcInt.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1381808682"
	)
	public static int method4264() {
		return KeyHandler.KeyHandler_idleCycles;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		signature = "(Lcs;B)V",
		garbageValue = "-118"
	)
	static final void method4265(Actor var0) {
		int var1 = Math.max(1, var0.field1009 - Client.cycle);
		int var2 = var0.field1017 * 128 + var0.field1011 * 64;
		int var3 = var0.field1019 * 128 + var0.field1011 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field978 = 0;
		var0.orientation = var0.field1023;
	}
}
