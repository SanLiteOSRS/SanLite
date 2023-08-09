import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class498 extends class456 implements class284 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	final AbstractArchive field5020;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	final DemotingHashTable field5018;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1417136981
	)
	final int field5019;

	@ObfuscatedSignature(
		descriptor = "(Lnu;ILot;Lnd;)V"
	)
	public class498(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field5018 = new DemotingHashTable(64); // L: 15
		this.field5020 = var4; // L: 20
		this.field5019 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lrc;",
		garbageValue = "-1481639468"
	)
	protected class458 vmethod8884(int var1) {
		synchronized(this.field5018) { // L: 26
			class457 var2 = (class457)this.field5018.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method8885(var1); // L: 29
				this.field5018.method5655(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrl;",
		garbageValue = "-53"
	)
	class457 method8885(int var1) {
		byte[] var2 = this.field5020.takeFile(this.field5019, var1); // L: 37
		class457 var3 = new class457(var1); // L: 38
		if (var2 != null) {
			var3.method8381(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "356849458"
	)
	public void method8883() {
		synchronized(this.field5018) { // L: 44
			this.field5018.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class497(this); // L: 51
	}
}
