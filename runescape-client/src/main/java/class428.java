import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class428 extends class393 implements class251 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	final AbstractArchive field4644;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	final DemotingHashTable field4645;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2130544563
	)
	final int field4646;

	@ObfuscatedSignature(
		descriptor = "(Lkp;ILlv;Lls;)V"
	)
	public class428(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4645 = new DemotingHashTable(64); // L: 15
		this.field4644 = var4; // L: 20
		this.field4646 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lod;",
		garbageValue = "17"
	)
	protected class395 vmethod7449(int var1) {
		synchronized(this.field4645) { // L: 26
			class394 var2 = (class394)this.field4645.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method7446(var1); // L: 29
				this.field4645.method5073(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lot;",
		garbageValue = "-521852329"
	)
	class394 method7446(int var1) {
		byte[] var2 = this.field4644.takeFile(this.field4646, var1); // L: 37
		class394 var3 = new class394(var1); // L: 38
		if (var2 != null) {
			var3.method7031(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method7444() {
		synchronized(this.field4645) { // L: 44
			this.field4645.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class427(this); // L: 51
	}
}
