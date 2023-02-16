import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;B)I",
		garbageValue = "-48"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "65"
	)
	static void method2941(Buffer var0) {
		if (Client.randomDatData != null) { // L: 13299
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 13300
		} else {
			byte[] var1 = class321.method6430(); // L: 13303
			var0.writeBytes(var1, 0, var1.length); // L: 13304
		}
	} // L: 13301 13305
}
