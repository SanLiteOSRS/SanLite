import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public abstract class class224 {
	@ObfuscatedName("ai")
	String field2408;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;Ljava/lang/String;)V"
	)
	class224(class221 var1, String var2) {
		this.this$0 = var1; // L: 273
		this.field2408 = var2; // L: 274
	} // L: 275

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2105911105"
	)
	public abstract int vmethod4366();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-8310"
	)
	public int vmethod4368() {
		return -1; // L: 288
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String vmethod4367() {
		return null; // L: 284
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1193221178"
	)
	public String method4365() {
		return this.field2408; // L: 278
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)I",
		garbageValue = "13055"
	)
	static final int method4378(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 9
	}

	@ObfuscatedName("aw")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (0L == var0 % 37L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 39 40 49
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var8 = class407.base37Table[(int)(var6 - var0 * 37L)]; // L: 43
					if (var8 == '_') { // L: 44
						int var9 = var5.length() - 1; // L: 45
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 46
						var8 = 160; // L: 47
					}
				}

				var5.reverse(); // L: 51
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 52
				return var5.toString(); // L: 53
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "24441"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Script.method2240(); // L: 12690
		if (Projectile.friendsChatManager != null) { // L: 12691
			Projectile.friendsChatManager.invalidateIgnoreds(); // L: 12692
		}

	} // L: 12694
}
