import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public enum class125 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	field1495(3, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	field1490(2, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	field1498(4, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	field1497(0, 3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	field1493(1, 4);

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -978634339
	)
	public final int field1494;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -761276969
	)
	@Export("id")
	final int id;

	class125(int var3, int var4) {
		this.field1494 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lng;IB)V",
		garbageValue = "4"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3739 == null) { // L: 1278
			throw new RuntimeException(); // L: 1279
		} else {
			if (var0.field3871 == null) { // L: 1281
				var0.field3871 = new int[var0.field3739.length]; // L: 1282
			}

			var0.field3871[var1] = Integer.MAX_VALUE; // L: 1284
		}
	} // L: 1285
}
