import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class191 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1719841143517453395L
	)
	public long field1985;
	@ObfuscatedName("al")
	int[] field1982;
	@ObfuscatedName("ac")
	short[] field1983;
	@ObfuscatedName("ab")
	short[] field1984;

	public class191(long var1, int[] var3, short[] var4, short[] var5) {
		this.field1985 = var1; // L: 10
		this.field1982 = var3; // L: 11
		this.field1983 = var4; // L: 12
		this.field1984 = var5; // L: 13
	} // L: 14

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lhf;",
		garbageValue = "-2012344357"
	)
	public static HitSplatDefinition method3664(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = class102.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}
}
