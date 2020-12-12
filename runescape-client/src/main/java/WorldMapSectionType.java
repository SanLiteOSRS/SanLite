import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lag;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "[Llo;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -297259605
	)
	@Export("type")
	final int type;
	@ObfuscatedName("j")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)[Lag;",
		garbageValue = "116"
	)
	static WorldMapSectionType[] method295() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE2};
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(ILib;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-519940907"
	)
	public static void method300(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getGroupId(var2);
		int var7 = var1.getFileId(var6, var3);
		SecureRandomCallable.playMusicTrack(var0, var1, var6, var7, var4, var5);
	}
}
