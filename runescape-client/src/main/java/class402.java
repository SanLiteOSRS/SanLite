import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class402 extends class406 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 7767078370621973443L
	)
	long field4498;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -922716481
	)
	int field4503;
	@ObfuscatedName("ac")
	boolean field4500;

	@ObfuscatedSignature(
		descriptor = "(Lps;I)V"
	)
	public class402(class406 var1, int var2) {
		super(var1); // L: 9
		this.field4500 = false; // L: 6
		this.field4503 = var2; // L: 10
		super.field4513 = "DelayFadeTask"; // L: 11
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		if (!this.field4500) { // L: 16
			this.field4498 = (long)var1; // L: 17
			this.field4500 = true; // L: 18
		}

		return (long)var1 >= (long)this.field4503 + this.field4498; // L: 20
	}
}
