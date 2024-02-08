import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class161 extends class143 {
	@ObfuscatedName("iy")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 200672307
	)
	int field1754;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1919202733
	)
	int field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class161(class146 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1754 = var1.readInt(); // L: 274
		this.field1752 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3352(this.field1754, this.field1752); // L: 279
	} // L: 280

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(IB)Luq;",
		garbageValue = "-30"
	)
	static class522 method3476(int var0) {
		class522 var1 = (class522)Client.Widget_cachedModels.get((long)var0); // L: 12770
		if (var1 == null) { // L: 12771
			var1 = new class522(class18.field80, RouteStrategy.method4509(var0), JagexCache.method4249(var0)); // L: 12772
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12773
		}

		return var1; // L: 12775
	}
}
