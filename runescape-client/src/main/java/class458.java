import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class458 extends class422 implements class268 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	final AbstractArchive field4886;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	final DemotingHashTable field4888;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1043559905
	)
	final int field4885;

	@ObfuscatedSignature(
		descriptor = "(Lle;ILmn;Lln;)V"
	)
	public class458(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4888 = new DemotingHashTable(64); // L: 15
		this.field4886 = var4; // L: 20
		this.field4885 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lpj;",
		garbageValue = "-982443960"
	)
	protected class424 vmethod8461(int var1) {
		synchronized(this.field4888) { // L: 26
			class423 var2 = (class423)this.field4888.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method8467(var1); // L: 29
				this.field4888.method5482(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lpp;",
		garbageValue = "-1876607651"
	)
	class423 method8467(int var1) {
		byte[] var2 = this.field4886.takeFile(this.field4885, var1); // L: 37
		class423 var3 = new class423(var1); // L: 38
		if (var2 != null) {
			var3.method8016(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	public void method8463() {
		synchronized(this.field4888) { // L: 44
			this.field4888.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class457(this); // L: 51
	}
}
