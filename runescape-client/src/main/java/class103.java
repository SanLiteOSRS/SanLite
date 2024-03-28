import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class103 {
	@ObfuscatedName("gx")
	static String field1350;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 687459537
	)
	int field1354;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -708627193
	)
	int field1351;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -786225949
	)
	int field1352;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1948608189
	)
	int field1353;

	class103(int var1, int var2, int var3, int var4) {
		this.field1354 = var1; // L: 10
		this.field1351 = var2; // L: 11
		this.field1352 = var3; // L: 12
		this.field1353 = var4; // L: 13
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	int method2666() {
		return this.field1354; // L: 17
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	int method2658() {
		return this.field1351;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2661() {
		return this.field1352; // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1255167980"
	)
	int method2662() {
		return this.field1353; // L: 29
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;ZI)V",
		garbageValue = "779144584"
	)
	public static void method2663(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 75
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 76
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 77
	} // L: 78

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2143174195"
	)
	public static void method2672() {
		class190.field1974.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "771158237"
	)
	static final float method2674(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 21
		return (var1 * 1.0075567F - 75.56675F) / var1; // L: 22
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1615475306"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 142
		int var2 = 0; // L: 143

		for (int var3 = 0; var3 < var1; ++var3) { // L: 144
			var2 = (var2 << 5) - var2 + PacketBufferNode.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 145
	}
}
