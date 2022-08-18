import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class428 extends class393 implements class251 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	final AbstractArchive field4655;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	final DemotingHashTable field4656;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1079858443
	)
	final int field4658;

	@ObfuscatedSignature(
		descriptor = "(Lkz;ILlj;Llc;)V"
	)
	public class428(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4656 = new DemotingHashTable(64); // L: 15
		this.field4655 = var4; // L: 20
		this.field4658 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lof;",
		garbageValue = "288370314"
	)
	protected class395 vmethod7551(int var1) {
		synchronized(this.field4656) { // L: 26
			class394 var2 = (class394)this.field4656.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method7555(var1); // L: 29
				this.field4656.method5125(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lom;",
		garbageValue = "28"
	)
	class394 method7555(int var1) {
		byte[] var2 = this.field4655.takeFile(this.field4658, var1); // L: 37
		class394 var3 = new class394(var1); // L: 38
		if (var2 != null) { // L: 39
			var3.method7114(new Buffer(var2));
		}

		return var3; // L: 40
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1106917598"
	)
	public void method7552() {
		synchronized(this.field4656) { // L: 44
			this.field4656.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class427(this); // L: 51
	}
}
