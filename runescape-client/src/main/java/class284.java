import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class284 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class284 field3062;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class284 field3063;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1515319085
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1909619553
	)
	@Export("value")
	final int value;

	static {
		field3062 = new class284(0); // L: 4
		field3063 = new class284(1); // L: 5
	}

	class284(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	static final void method5656() {
		class436.method7914("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 152
	} // L: 153

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-33"
	)
	public static class226 method5657() {
		return Client.field755; // L: 1073
	}
}
