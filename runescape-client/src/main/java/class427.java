import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
class class427 implements Iterator {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -596337965
	)
	int field4654;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	final class428 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpo;)V"
	)
	class427(class428 var1) {
		this.this$0 = var1; // L: 51
	}

	public Object next() {
		int var1 = ++this.field4654 - 1; // L: 61
		class394 var2 = (class394)this.this$0.field4656.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method7555(var1); // L: 63 64
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	public boolean hasNext() {
		return this.field4654 < this.this$0.method7107(); // L: 56
	}
}
