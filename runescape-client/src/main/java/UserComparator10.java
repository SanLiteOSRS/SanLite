import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "1119204610"
	)
	public static void method2989(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 44
			class208.ByteArrayPool_alternativeSizes = var0; // L: 57
			FileSystem.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 58
			class155.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 59

			for (int var2 = 0; var2 < class208.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 60
				class155.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 61
				ByteArrayPool.field4627.add(var0[var2]); // L: 62
			}

			Collections.sort(ByteArrayPool.field4627); // L: 64
		} else {
			class208.ByteArrayPool_alternativeSizes = null; // L: 45
			FileSystem.ByteArrayPool_altSizeArrayCounts = null; // L: 46
			class155.ByteArrayPool_arrays = null; // L: 47
			ByteArrayPool.field4627.clear(); // L: 49
			ByteArrayPool.field4627.add(100); // L: 50
			ByteArrayPool.field4627.add(5000); // L: 51
			ByteArrayPool.field4627.add(10000); // L: 52
			ByteArrayPool.field4627.add(30000); // L: 53
		}
	} // L: 55 65
}
