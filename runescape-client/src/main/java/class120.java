import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class120 {
	@ObfuscatedName("ay")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -834721191
	)
	int field1452;
	@ObfuscatedName("an")
	float field1455;
	@ObfuscatedName("aw")
	float field1451;
	@ObfuscatedName("ac")
	float field1449;
	@ObfuscatedName("au")
	float field1453;
	@ObfuscatedName("ab")
	float field1450;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	class120 field1454;

	class120() {
		this.field1451 = Float.MAX_VALUE; // L: 8
		this.field1449 = Float.MAX_VALUE; // L: 9
		this.field1453 = Float.MAX_VALUE; // L: 10
		this.field1450 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "652967441"
	)
	void method2974(Buffer var1, int var2) {
		this.field1452 = var1.readShort(); // L: 17
		this.field1455 = var1.method9064(); // L: 18
		this.field1451 = var1.method9064(); // L: 19
		this.field1449 = var1.method9064(); // L: 20
		this.field1453 = var1.method9064(); // L: 21
		this.field1450 = var1.method9064(); // L: 22
	} // L: 23

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-44"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10800
	} // L: 10801
}
