import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
public class class497 extends class455 implements class283 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	final AbstractArchive field5020;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	final DemotingHashTable field5021;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1843835189
	)
	final int field5019;

	@ObfuscatedSignature(
		descriptor = "(Lns;ILon;Lnu;)V"
	)
	public class497(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field5021 = new DemotingHashTable(64); // L: 15
		this.field5020 = var4; // L: 20
		this.field5019 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrv;",
		garbageValue = "-32"
	)
	protected class457 vmethod8872(int var1) {
		synchronized(this.field5021) { // L: 26
			class456 var2 = (class456)this.field5021.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method8878(var1); // L: 29
				this.field5021.method5639(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrg;",
		garbageValue = "-117"
	)
	class456 method8878(int var1) {
		byte[] var2 = this.field5020.takeFile(this.field5019, var1); // L: 37
		class456 var3 = new class456(var1); // L: 38
		if (var2 != null) {
			var3.method8310(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "322447059"
	)
	public void method8874() {
		synchronized(this.field5021) { // L: 44
			this.field5021.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class496(this); // L: 51
	}
}
