import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;B)I",
		garbageValue = "121"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1707669825"
	)
	public static int method2885(int var0, int var1) {
		return (var0 << 8) + var1; // L: 14
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-398774343"
	)
	static void method2886(float[] var0) {
		var0[1] = 1.0F - var0[1]; // L: 329
		if (var0[0] < 0.0F) { // L: 330
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) { // L: 331
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) { // L: 332
			float var1 = (float)(((double)var0[1] - 2.0D) * (double)var0[1] + (double)(var0[0] * (var0[0] - 2.0F + var0[1])) + 1.0D); // L: 333
			if (class126.field1494 + var1 > 0.0F) { // L: 334
				SecureRandomCallable.method2248(var0); // L: 335
			}
		}

		var0[1] = 1.0F - var0[1]; // L: 338
	} // L: 339

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1187022906"
	)
	public static void method2887() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 340
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 341
	} // L: 342
}
