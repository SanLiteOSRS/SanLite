import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class133 implements class124 {
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 912731593
	)
	@Export("cameraY")
	static int cameraY;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldh;",
		garbageValue = "47"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = GrandExchangeOffer.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = HitSplatDefinition.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lnk;",
		garbageValue = "1423183196"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1984
		if (JagexCache.JagexCache_dat2File != null) { // L: 1985
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, DecorativeObject.JagexCache_idxFiles[var0], 1000000); // L: 1986
		}

		return new Archive(var5, class6.field17, class308.field3462, var0, var1, var2, var3, var4); // L: 1988
	}
}
