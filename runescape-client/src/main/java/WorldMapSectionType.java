import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2045678795
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ap")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)[Lks;",
		garbageValue = "-10244"
	)
	static WorldMapSectionType[] method5502() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3}; // L: 17
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lme;III)V",
		garbageValue = "-291890974"
	)
	public static void method5510(Widget var0, int var1, int var2) {
		var0.field3685.bodyColors[var1] = var2; // L: 1073
		var0.field3685.method6137(); // L: 1074
	} // L: 1075

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2102857647"
	)
	static void method5509(boolean var0) {
		Client.field642 = var0; // L: 12853
	} // L: 12854
}
