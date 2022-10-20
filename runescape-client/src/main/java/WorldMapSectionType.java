import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1293494391
	)
	@Export("type")
	final int type;
	@ObfuscatedName("j")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-442640510"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)Lkn;",
		garbageValue = "2"
	)
	static Widget method5111(Widget var0) {
		int var2 = class197.getWidgetFlags(var0); // L: 12595
		int var1 = var2 >> 17 & 7; // L: 12597
		int var3 = var1; // L: 12599
		if (var1 == 0) { // L: 12600
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 12601
				var0 = class281.getWidget(var0.parentId); // L: 12602
				if (var0 == null) { // L: 12603
					return null;
				}
			}

			return var0; // L: 12605
		}
	}
}
