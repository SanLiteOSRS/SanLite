import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public abstract class class280 implements class282 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1108391529
	)
	protected int field3065;

	@ObfuscatedSignature(
		descriptor = "(Lng;Loj;I)V"
	)
	protected class280(StudioGame var1, Language var2, int var3) {
		this.field3065 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnt;",
		garbageValue = "1228731599"
	)
	static GameBuild[] method5602() {
		return new GameBuild[]{GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.LIVE}; // L: 13
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1454265043"
	)
	public static int method5603(int var0) {
		return (var0 & class496.field5002) - 1; // L: 26
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltz;J)V"
	)
	static void method5601(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67
}
