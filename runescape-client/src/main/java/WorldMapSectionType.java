import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Led;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Led;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Led;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Led;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 624022127
	)
	@Export("type")
	final int type;
	@ObfuscatedName("e")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IZIZI)V",
		garbageValue = "-998879160"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class9.World_worlds != null) {
			class368.doWorldSorting(0, class9.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "583371585"
	)
	public static boolean method3066(int var0) {
		return var0 >= WorldMapDecorationType.field2834.id && var0 <= WorldMapDecorationType.field2835.id;
	}
}
