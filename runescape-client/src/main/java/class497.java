import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public class class497 extends class455 implements class283 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	final AbstractArchive field5025;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	final DemotingHashTable field5023;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -739575073
	)
	final int field5026;

	@ObfuscatedSignature(
		descriptor = "(Lnj;ILol;Lnr;)V"
	)
	public class497(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field5023 = new DemotingHashTable(64); // L: 15
		this.field5025 = var4; // L: 20
		this.field5026 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lre;",
		garbageValue = "1061665604"
	)
	protected class457 vmethod8842(int var1) {
		synchronized(this.field5023) { // L: 26
			class456 var2 = (class456)this.field5023.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method8840(var1); // L: 29
				this.field5023.method5699(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lrb;",
		garbageValue = "1660483457"
	)
	class456 method8840(int var1) {
		byte[] var2 = this.field5025.takeFile(this.field5026, var1); // L: 37
		class456 var3 = new class456(var1); // L: 38
		if (var2 != null) { // L: 39
			var3.method8318(new Buffer(var2));
		}

		return var3; // L: 40
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1225068856"
	)
	public void method8841() {
		synchronized(this.field5023) { // L: 44
			this.field5023.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class496(this); // L: 51
	}
}
