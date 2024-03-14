import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class516 extends class474 implements class299 {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1748523701
	)
	static int field5118;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	final AbstractArchive field5116;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	final DemotingHashTable field5115;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2110259639
	)
	final int field5114;

	@ObfuscatedSignature(
		descriptor = "(Lox;ILpe;Lof;)V"
	)
	public class516(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field5115 = new DemotingHashTable(64); // L: 15
		this.field5116 = var4; // L: 20
		this.field5114 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsy;",
		garbageValue = "79"
	)
	protected class476 vmethod9278(int var1) {
		synchronized(this.field5115) { // L: 26
			class475 var2 = (class475)this.field5115.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method9274(var1); // L: 29
				this.field5115.method5975(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lsn;",
		garbageValue = "-1765623354"
	)
	class475 method9274(int var1) {
		byte[] var2 = this.field5116.takeFile(this.field5114, var1); // L: 37
		class475 var3 = new class475(var1); // L: 38
		if (var2 != null) {
			var3.method8736(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "198654526"
	)
	public void method9275() {
		synchronized(this.field5115) { // L: 44
			this.field5115.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class515(this); // L: 51
	}
}
