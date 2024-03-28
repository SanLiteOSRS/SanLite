import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class422 extends class426 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 5778479103417342563L
	)
	long field4639;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1495748279
	)
	int field4640;

	@ObfuscatedSignature(
		descriptor = "(Lqc;I)V"
	)
	public class422(class426 var1, int var2) {
		super(var1); // L: 8
		this.field4640 = var2; // L: 9
		super.field4651 = "DelayFadeTask"; // L: 10
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4639 < (long)this.field4640) { // L: 15
			++this.field4639; // L: 16
			return false; // L: 17
		} else {
			return true; // L: 19
		}
	}
}
