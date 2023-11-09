import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class269 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class269 field3023;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class269 field3022;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1389900853
	)
	@Export("value")
	final int value;

	static {
		field3023 = new class269(0); // L: 4
		field3022 = new class269(1); // L: 5
	}

	class269(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lso;",
		garbageValue = "1"
	)
	public static class493 method5496(int var0) {
		class493 var1 = (class493)class493.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class493.field4985.takeFile(39, var0); // L: 25
			var1 = new class493(); // L: 26
			if (var2 != null) { // L: 27
				var1.method8855(new Buffer(var2));
			}

			var1.method8857(); // L: 28
			class493.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ldk;",
		garbageValue = "66"
	)
	static Script method5495(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 69
		if (var2 != null) { // L: 70
			return var2; // L: 71
		} else {
			String var3 = String.valueOf(var0); // L: 73
			int var4 = FriendsList.archive12.getGroupId(var3); // L: 74
			if (var4 == -1) { // L: 75
				return null; // L: 76
			} else {
				byte[] var5 = FriendsList.archive12.takeFileFlat(var4); // L: 78
				if (var5 != null) { // L: 79
					if (var5.length <= 1) { // L: 80
						return null; // L: 81
					}

					var2 = ObjectSound.newScript(var5); // L: 83
					if (var2 != null) { // L: 84
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 85
						return var2; // L: 86
					}
				}

				return null; // L: 89
			}
		}
	}
}
