import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public class class438 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static final class438 field4735;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static final class438 field4736;
	@ObfuscatedName("af")
	final String field4737;

	static {
		field4735 = new class438("Basic"); // L: 4
		field4736 = new class438("Bearer"); // L: 5
	}

	class438(String var1) {
		this.field4737 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "10"
	)
	String method7933() {
		return this.field4737; // L: 13
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lck;Lck;IZI)I",
		garbageValue = "-2095375478"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 222
			int var4 = var0.population; // L: 223
			int var5 = var1.population; // L: 224
			if (!var3) { // L: 225
				if (var4 == -1) { // L: 226
					var4 = 2001;
				}

				if (var5 == -1) { // L: 227
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 229
		} else if (var2 == 2) { // L: 231
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 232
			if (var0.activity.equals("-")) { // L: 233
				if (var1.activity.equals("-")) { // L: 234
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 235
				}
			} else if (var1.activity.equals("-")) { // L: 237
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 238
			}
		} else if (var2 == 4) { // L: 240
			return var0.method1803() ? (var1.method1803() ? 0 : 1) : (var1.method1803() ? -1 : 0);
		} else if (var2 == 5) { // L: 241
			return var0.method1823() ? (var1.method1823() ? 0 : 1) : (var1.method1823() ? -1 : 0);
		} else if (var2 == 6) { // L: 242
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 243
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 244
		}
	}
}
