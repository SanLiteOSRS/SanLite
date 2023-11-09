import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class451 extends class415 implements class264 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	final AbstractArchive field4863;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	final DemotingHashTable field4864;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1847422723
	)
	final int field4862;

	@ObfuscatedSignature(
		descriptor = "(Llw;ILmb;Lly;)V"
	)
	public class451(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4864 = new DemotingHashTable(64); // L: 15
		this.field4863 = var4; // L: 20
		this.field4862 = var2; // L: 21
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lpv;",
		garbageValue = "307947551"
	)
	protected class417 vmethod8354(int var1) {
		synchronized(this.field4864) { // L: 26
			class416 var2 = (class416)this.field4864.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method8352(var1); // L: 29
				this.field4864.method5418(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lpe;",
		garbageValue = "1730899339"
	)
	class416 method8352(int var1) {
		byte[] var2 = this.field4863.takeFile(this.field4862, var1); // L: 37
		class416 var3 = new class416(var1); // L: 38
		if (var2 != null) { // L: 39
			var3.method7891(new Buffer(var2));
		}

		return var3; // L: 40
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1754265267"
	)
	public void method8344() {
		synchronized(this.field4864) { // L: 44
			this.field4864.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class450(this); // L: 51
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1587631557"
	)
	public static byte[] method8356(byte[] var0) {
		int var1 = var0.length; // L: 22
		byte[] var2 = new byte[var1]; // L: 23
		System.arraycopy(var0, 0, var2, 0, var1); // L: 24
		return var2; // L: 25
	}
}
