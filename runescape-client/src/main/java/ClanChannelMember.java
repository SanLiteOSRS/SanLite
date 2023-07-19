import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("gj")
	static String field1653;
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -1436564919
	)
	static int field1656;
	@ObfuscatedName("ai")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1388126921
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "27347"
	)
	static final int method3228(int var0, int var1) {
		int var2 = var0 + var1 * 57; // L: 930
		var2 ^= var2 << 13; // L: 931
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 932
		return var3 >> 19 & 255; // L: 933
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "1606857461"
	)
	static final String method3229(int var0, int var1) {
		int var2 = var1 - var0; // L: 10532
		if (var2 < -9) { // L: 10533
			return class17.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10534
			return class17.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10535
			return class17.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 10536
			return class17.colorStartTag(16756736);
		} else if (var2 > 9) { // L: 10537
			return class17.colorStartTag(65280);
		} else if (var2 > 6) { // L: 10538
			return class17.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10539
			return class17.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class17.colorStartTag(12648192) : class17.colorStartTag(16776960); // L: 10540 10541
		}
	}
}
