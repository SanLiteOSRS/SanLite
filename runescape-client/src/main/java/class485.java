import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
public class class485 extends class443 implements class282 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	final AbstractArchive field4964;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	final DemotingHashTable field4963;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1005522649
	)
	final int field4965;

	@ObfuscatedSignature(
		descriptor = "(Lnp;ILor;Lni;)V"
	)
	public class485(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4963 = new DemotingHashTable(64); // L: 15
		this.field4964 = var4; // L: 20
		this.field4965 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lro;",
		garbageValue = "-411631620"
	)
	protected class445 vmethod8787(int var1) {
		synchronized(this.field4963) { // L: 26
			class444 var2 = (class444)this.field4963.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method8785(var1); // L: 29
				this.field4963.method5647(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lrr;",
		garbageValue = "-699855419"
	)
	class444 method8785(int var1) {
		byte[] var2 = this.field4964.takeFile(this.field4965, var1); // L: 37
		class444 var3 = new class444(var1); // L: 38
		if (var2 != null) { // L: 39
			var3.method8276(new Buffer(var2));
		}

		return var3; // L: 40
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1688910782"
	)
	public void method8784() {
		synchronized(this.field4963) { // L: 44
			this.field4963.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class484(this); // L: 51
	}
}
