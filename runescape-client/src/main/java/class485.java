import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public class class485 extends class443 implements class282 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -784910213
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	final AbstractArchive field4963;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	final DemotingHashTable field4961;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 609973375
	)
	final int field4962;

	@ObfuscatedSignature(
		descriptor = "(Lng;ILoj;Lnq;)V"
	)
	public class485(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4961 = new DemotingHashTable(64);
		this.field4963 = var4; // L: 20
		this.field4962 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lrg;",
		garbageValue = "-1481275551"
	)
	protected class445 vmethod8719(int var1) {
		synchronized(this.field4961) { // L: 26
			class444 var2 = (class444)this.field4961.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method8720(var1); // L: 29
				this.field4961.method5610(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lrs;",
		garbageValue = "2033867333"
	)
	class444 method8720(int var1) {
		byte[] var2 = this.field4963.takeFile(this.field4962, var1); // L: 37
		class444 var3 = new class444(var1); // L: 38
		if (var2 != null) {
			var3.method8211(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2049322638"
	)
	public void method8721() {
		synchronized(this.field4961) { // L: 44
			this.field4961.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class484(this); // L: 51
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-115"
	)
	public static int method8730(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}
}
