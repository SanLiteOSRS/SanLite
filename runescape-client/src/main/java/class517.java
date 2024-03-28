import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class517 extends class475 implements class299 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	final AbstractArchive field5147;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	final DemotingHashTable field5148;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1634351829
	)
	final int field5149;

	@ObfuscatedSignature(
		descriptor = "(Lon;ILpv;Loc;)V"
	)
	public class517(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field5148 = new DemotingHashTable(64); // L: 15
		this.field5147 = var4; // L: 20
		this.field5149 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsm;",
		garbageValue = "0"
	)
	protected class477 vmethod9068(int var1) {
		synchronized(this.field5148) { // L: 26
			class476 var2 = (class476)this.field5148.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method9069(var1); // L: 29
				this.field5148.method5845(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lsj;",
		garbageValue = "739287375"
	)
	class476 method9069(int var1) {
		byte[] var2 = this.field5147.takeFile(this.field5149, var1); // L: 37
		class476 var3 = new class476(var1); // L: 38
		if (var2 != null) {
			var3.method8515(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1015606268"
	)
	public void method9070() {
		synchronized(this.field5148) { // L: 44
			this.field5148.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class516(this); // L: 51
	}
}
