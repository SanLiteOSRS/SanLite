import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class168 {
	@ObfuscatedName("f")
	public short[] field1835;
	@ObfuscatedName("n")
	public short[] field1833;

	public class168(int var1) {
		ItemComposition var2 = UserComparator3.ItemComposition_get(var1); // L: 12
		if (var2.method3848()) { // L: 13
			this.field1835 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1835, 0, this.field1835.length); // L: 15
		}

		if (var2.method3840()) { // L: 17
			this.field1833 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1833, 0, this.field1833.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpq;IIB)I",
		garbageValue = "-53"
	)
	static int method3508(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1633050435"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 154
	}
}
