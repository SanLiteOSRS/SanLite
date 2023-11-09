import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class162 extends class144 {
	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1968364243
	)
	int field1776;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2082185269
	)
	int field1775;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class162(class147 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1776 = var1.readInt(); // L: 274
		this.field1775 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3302(this.field1776, this.field1775); // L: 279
	} // L: 280

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Llb;",
		garbageValue = "-1927770938"
	)
	public static class295[] method3410() {
		return new class295[]{class295.field3214, class295.field3206, class295.field3207, class295.field3208, class295.field3210, class295.field3217, class295.field3211, class295.field3212, class295.field3218, class295.field3213, class295.field3215}; // L: 18
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "668075609"
	)
	static int method3403(String var0) {
		if (var0.equals("centre")) { // L: 319
			return 1; // L: 320
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 322 323 325
		}
	}
}
