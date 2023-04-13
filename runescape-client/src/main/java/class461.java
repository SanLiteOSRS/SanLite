import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
class class461 implements Iterator {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -27751579
	)
	int field4847;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	final class462 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrw;)V"
	)
	class461(class462 var1) {
		this.this$0 = var1; // L: 51
	}

	public boolean hasNext() {
		return this.field4847 < this.this$0.method7938(); // L: 56
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	public Object next() {
		int var1 = ++this.field4847 - 1; // L: 61
		class427 var2 = (class427)this.this$0.field4850.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method8431(var1); // L: 63 64
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-1830456034"
	)
	public static int method8419(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 9
		int var4 = var1; // L: 10

		for (int var5 = 0; var5 < var3; ++var5) { // L: 11
			char var6 = var2.charAt(var5); // L: 12
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6; // L: 14
			} else if (var6 <= 2047) { // L: 16
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 17
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 18
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 21
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 22
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 23
			}
		}

		return var4 - var1; // L: 26
	}
}
