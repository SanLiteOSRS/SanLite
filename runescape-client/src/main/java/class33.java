import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class33 {
	@ObfuscatedName("aq")
	public static short[] field196;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 401350003
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1123907327
	)
	int field189;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1859599279
	)
	int field194;

	class33(int var1, int var2) {
		this.field189 = var1; // L: 14
		this.field194 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lba;S)Z",
		garbageValue = "-1563"
	)
	boolean method470(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field189) { // L: 20
			case 1:
				return var1.vmethod4143(this.field194); // L: 24
			case 2:
				return var1.vmethod4148(this.field194); // L: 22
			case 3:
				return var1.vmethod4145((char)this.field194); // L: 26
			case 4:
				return var1.vmethod4147(this.field194 == 1); // L: 30
			default:
				return false; // L: 28
			}
		}
	}
}
