import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
class class472 implements Iterator {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1308054609
	)
	int field4935;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	final class473 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsu;)V"
	)
	class472(class473 var1) {
		this.this$0 = var1; // L: 51
	}

	public boolean hasNext() {
		return this.field4935 < this.this$0.method8283(); // L: 56
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	public Object next() {
		int var1 = ++this.field4935 - 1; // L: 61
		class431 var2 = (class431)this.this$0.field4936.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method8838(var1); // L: 63 64
	}
}
