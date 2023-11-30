import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class92 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1136;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1133;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1131;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1130;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1137;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1132;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1128;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1134;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1135;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1129;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1143;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1138;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1139;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1140;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1141;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class92 field1142;

	static {
		field1136 = new class92(); // L: 13024
		field1133 = new class92(); // L: 13025
		field1131 = new class92(); // L: 13026
		field1130 = new class92(); // L: 13027
		field1137 = new class92(); // L: 13028
		field1132 = new class92(); // L: 13029
		field1128 = new class92(); // L: 13030
		field1134 = new class92(); // L: 13031
		field1135 = new class92(); // L: 13032
		field1129 = new class92(); // L: 13033
		field1143 = new class92(); // L: 13034
		field1138 = new class92(); // L: 13035
		field1139 = new class92(); // L: 13036
		field1140 = new class92(); // L: 13037
		field1141 = new class92(); // L: 13038
		field1142 = new class92();
	} // L: 13039

	class92() {
	} // L: 13041

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lgh;",
		garbageValue = "-1228219586"
	)
	public static HealthBarDefinition method2445(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.NpcDefinition_cachedModels.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			var1.field1870 = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2)); // L: 38
			}

			HealthBarDefinition.NpcDefinition_cachedModels.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1040473159"
	)
	static int method2446(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 66
		if (var1 == null) { // L: 67
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 68 69
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	static void method2447() {
		if (class229.localPlayer.x >> 7 == Client.destinationX && class229.localPlayer.y >> 7 == Client.destinationY) { // L: 5007
			Client.destinationX = 0; // L: 5008
		}

	} // L: 5010
}
