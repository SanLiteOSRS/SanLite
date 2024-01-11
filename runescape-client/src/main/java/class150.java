import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class150 extends class143 {
	@ObfuscatedName("am")
	boolean field1677;
	@ObfuscatedName("ap")
	byte field1673;
	@ObfuscatedName("af")
	byte field1674;
	@ObfuscatedName("aj")
	byte field1672;
	@ObfuscatedName("aq")
	byte field1676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class150(class146 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1677 = var1.readUnsignedByte() == 1; // L: 251
		this.field1673 = var1.readByte(); // L: 252
		this.field1674 = var1.readByte(); // L: 253
		this.field1672 = var1.readByte(); // L: 254
		this.field1676 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.allowGuests = this.field1677; // L: 259
		var1.field1699 = this.field1673; // L: 260
		var1.field1707 = this.field1674; // L: 261
		var1.field1696 = this.field1672; // L: 262
		var1.field1702 = this.field1676; // L: 263
	} // L: 264

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldl;",
		garbageValue = "84"
	)
	static AttackOption[] method3301() {
		return new AttackOption[]{AttackOption.field1331, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1329, AttackOption.AttackOption_dependsOnCombatLevels}; // L: 12823
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1514358172"
	)
	public static void method3304() {
		Iterator var0 = class319.field3459.iterator(); // L: 202

		while (var0.hasNext()) {
			class331 var1 = (class331)var0.next(); // L: 203
			if (var1 != null) { // L: 205
				var1.field3582.clear(); // L: 208
				var1.field3582.method6075(); // L: 209
				var1.field3582.setPcmStreamVolume(0); // L: 210
				var1.field3582.field3499 = 0; // L: 211
				class129.method3075(var1.field3573, var1.field3574); // L: 212
			}
		}

		class319.field3459.clear(); // L: 215
	} // L: 216
}
