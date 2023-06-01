import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class343 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static final class343 field3854;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static final class343 field3851;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 716758407
	)
	final int field3853;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1887159877
	)
	final int field3852;

	static {
		field3854 = new class343(51, 27, 800, 0, 16, 16); // L: 29
		field3851 = new class343(25, 28, 800, 656, 40, 40); // L: 30
	}

	class343(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3853 = var5; // L: 39
		this.field3852 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31844"
	)
	static void method6640() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromFriend(); // L: 64
		}

	} // L: 67
}
