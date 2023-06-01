import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
class class484 implements Iterator {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 965873591
	)
	int field4962;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	final class485 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lse;)V"
	)
	class484(class485 var1) {
		this.this$0 = var1; // L: 51
	}

	public boolean hasNext() {
		return this.field4962 < this.this$0.method8260(); // L: 56
	}

	public Object next() {
		int var1 = ++this.field4962 - 1; // L: 61
		class444 var2 = (class444)this.this$0.field4963.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method8785(var1); // L: 63 64
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1102692326"
	)
	static void method8782(int var0) {
		if (var0 != Client.loginState) { // L: 12635
			Client.loginState = var0; // L: 12636
		}
	} // L: 12637
}
