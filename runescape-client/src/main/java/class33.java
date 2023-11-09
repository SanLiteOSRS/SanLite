import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public class class33 {
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = 1197195264
	)
	static int field180;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 1547663815
	)
	static int field188;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 497616693
	)
	int field192;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 685095567
	)
	int field186;

	class33(int var1, int var2) {
		this.field192 = var1; // L: 14
		this.field186 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lbv;I)Z",
		garbageValue = "625917301"
	)
	boolean method491(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field192) { // L: 20
			case 1:
				return var1.vmethod4117(this.field186); // L: 28
			case 2:
				return var1.vmethod4139(this.field186); // L: 30
			case 3:
				return var1.vmethod4106((char)this.field186); // L: 26
			case 4:
				return var1.vmethod4132(this.field186 == 1); // L: 22
			default:
				return false; // L: 24
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-795893337"
	)
	static final int method492(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 17
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "-1816107521"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}
}
