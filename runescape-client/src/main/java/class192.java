import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class192 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2009;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2016;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2010;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2011;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2012;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2013;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	static final class192 field2014;

	static {
		field2009 = new class192(0, class205.field2255); // L: 4
		field2016 = new class192(1, class205.field2257); // L: 5
		field2010 = new class192(2, class205.field2251); // L: 6
		field2011 = new class192(3, class205.field2253); // L: 7
		field2012 = new class192(4, class205.field2261); // L: 8
		field2013 = new class192(5, class205.field2254); // L: 9
		field2014 = new class192(6, class205.field2256); // L: 10
	}

	@ObfuscatedSignature(
		descriptor = "(ILhs;)V"
	)
	class192(int var1, class205 var2) {
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lhy;",
		garbageValue = "-1270369602"
	)
	public static HitSplatDefinition method3790(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}
}
