import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class124 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field1462;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 833991373
	)
	static int field1461;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -627812805
	)
	int field1454;
	@ObfuscatedName("an")
	float field1457;
	@ObfuscatedName("ar")
	float field1458;
	@ObfuscatedName("ab")
	float field1456;
	@ObfuscatedName("at")
	float field1460;
	@ObfuscatedName("ax")
	float field1459;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	class124 field1455;

	class124() {
		this.field1458 = Float.MAX_VALUE; // L: 8
		this.field1456 = Float.MAX_VALUE; // L: 9
		this.field1460 = Float.MAX_VALUE; // L: 10
		this.field1459 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "1559372127"
	)
	void method2906(Buffer var1, int var2) {
		this.field1454 = var1.readShort(); // L: 17
		this.field1457 = var1.method8971(); // L: 18
		this.field1458 = var1.method8971(); // L: 19
		this.field1456 = var1.method8971(); // L: 20
		this.field1460 = var1.method8971(); // L: 21
		this.field1459 = var1.method8971(); // L: 22
	} // L: 23

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "4123"
	)
	public static void method2905(int var0) {
		if (class304.musicPlayerStatus != 0) { // L: 58
			class178.musicTrackVolume = var0;
		} else {
			class304.midiPcmStream.setPcmStreamVolume(var0); // L: 59
		}

	} // L: 60
}
