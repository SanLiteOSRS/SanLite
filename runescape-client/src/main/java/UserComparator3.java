import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqc;Lqc;I)I",
		garbageValue = "-1189201842"
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
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lto;",
		garbageValue = "924928885"
	)
	public static class495 method2866(int var0) {
		class495 var1 = (class495)class495.DBRowType_cache.get((long)var0); // L: 20
		if (var1 != null) { // L: 21
			return var1;
		} else {
			byte[] var2 = class495.field4996.takeFile(38, var0); // L: 22
			var1 = new class495(); // L: 23
			if (var2 != null) { // L: 24
				var1.method8876(new Buffer(var2));
			}

			var1.method8881(); // L: 25
			class495.DBRowType_cache.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-1316452058"
	)
	public static void method2873(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 239
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 241
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 242
			} catch (Exception var3) { // L: 244
			}
		}

	} // L: 246
}
