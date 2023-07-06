import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public final class class381 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "-2114828179"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "90"
	)
	static void method7122(NPC var0) {
		var0.field1155 = var0.definition.size * 64; // L: 9049
		var0.field1220 = var0.definition.rotation; // L: 9050
		var0.walkSequence = var0.definition.walkSequence; // L: 9051
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9052
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9053
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9054
		var0.idleSequence = var0.definition.idleSequence; // L: 9055
		var0.field1199 = var0.definition.turnLeftSequence; // L: 9056
		var0.field1159 = var0.definition.turnRightSequence; // L: 9057
		var0.runSequence = var0.definition.field2014; // L: 9058
		var0.field1191 = var0.definition.field2011; // L: 9059
		var0.field1198 = var0.definition.field2012; // L: 9060
		var0.field1167 = var0.definition.field2013; // L: 9061
		var0.field1168 = var0.definition.field1994; // L: 9062
		var0.field1169 = var0.definition.field2015; // L: 9063
		var0.field1183 = var0.definition.field2016; // L: 9064
		var0.field1171 = var0.definition.field2017; // L: 9065
	} // L: 9066
}
