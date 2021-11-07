import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public class class387 extends class354 implements class231 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	final AbstractArchive field4262;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	final DemotingHashTable field4260;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1336685485
	)
	final int field4259;

	@ObfuscatedSignature(
		descriptor = "(Ljd;ILkz;Lko;)V"
	)
	public class387(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4260 = new DemotingHashTable(64);
		this.field4262 = var4;
		this.field4259 = var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmn;",
		garbageValue = "20"
	)
	protected class356 vmethod6814(int var1) {
		synchronized(this.field4260) {
			class355 var2 = (class355)this.field4260.get((long)var1);
			if (var2 == null) {
				var2 = this.method6820(var1);
				this.field4260.method4673(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmf;",
		garbageValue = "67"
	)
	class355 method6820(int var1) {
		byte[] var2 = this.field4262.takeFile(this.field4259, var1);
		class355 var3 = new class355(var1);
		if (var2 != null) {
			var3.method6405(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1873863120"
	)
	public void method6811() {
		synchronized(this.field4260) {
			this.field4260.clear();
		}
	}

	public Iterator iterator() {
		return new class386(this);
	}
}
