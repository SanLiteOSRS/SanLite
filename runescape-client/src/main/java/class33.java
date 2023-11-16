import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class33 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1887407395
	)
	int field163;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1936284001
	)
	int field168;

	class33(int var1, int var2) {
		this.field163 = var1; // L: 14
		this.field168 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)Z",
		garbageValue = "1979217570"
	)
	boolean method491(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field163) { // L: 20
			case 1:
				return var1.vmethod4310(this.field168); // L: 22
			case 2:
				return var1.vmethod4320(this.field168); // L: 30
			case 3:
				return var1.vmethod4321((char)this.field168); // L: 28
			case 4:
				return var1.vmethod4312(this.field168 == 1); // L: 24
			default:
				return false; // L: 26
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1755486935"
	)
	static int method494(String var0) {
		if (var0.equals("centre")) { // L: 319
			return 1; // L: 320
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 322 323 325
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V",
		garbageValue = "-56685834"
	)
	static void method495(NPC var0) {
		var0.field1198 = var0.definition.size; // L: 9217
		var0.field1240 = var0.definition.rotation; // L: 9218
		var0.walkSequence = var0.definition.walkSequence; // L: 9219
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9220
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9221
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9222
		var0.idleSequence = var0.definition.idleSequence; // L: 9223
		var0.field1191 = var0.definition.turnLeftSequence; // L: 9224
		var0.field1207 = var0.definition.turnRightSequence; // L: 9225
		var0.runSequence = var0.definition.field1931; // L: 9226
		var0.field1185 = var0.definition.field1937; // L: 9227
		var0.field1186 = var0.definition.field1954; // L: 9228
		var0.field1233 = var0.definition.field1962; // L: 9229
		var0.field1188 = var0.definition.field1961; // L: 9230
		var0.field1189 = var0.definition.field1941; // L: 9231
		var0.field1190 = var0.definition.field1958; // L: 9232
		var0.field1239 = var0.definition.field1945; // L: 9233
	} // L: 9234
}
