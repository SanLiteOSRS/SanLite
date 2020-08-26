import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lae;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 872496481
	)
	static int field178;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 750880259
	)
	@Export("type")
	final int type;
	@ObfuscatedName("o")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Lae;",
		garbageValue = "278613741"
	)
	static WorldMapSectionType[] method327() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3};
	}
}
