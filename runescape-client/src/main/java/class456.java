import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class456 implements class455 {
	@ObfuscatedName("aj")
	Map field4815;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	final class485 field4816;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	public class456(class485 var1) {
		this.field4816 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "358119631"
	)
	public int vmethod8323(int var1) {
		if (this.field4815 != null) { // L: 20
			class486 var2 = (class486)this.field4815.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4966; // L: 22
			}
		}

		return (Integer)this.field4816.vmethod8946(var1); // L: 24
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-2005436350"
	)
	public void vmethod8322(int var1, Object var2) {
		if (this.field4815 == null) { // L: 29
			this.field4815 = new HashMap();
			this.field4815.put(var1, new class486(var1, var2));
		} else {
			class486 var3 = (class486)this.field4815.get(var1);
			if (var3 == null) {
				this.field4815.put(var1, new class486(var1, var2)); // L: 35
			} else {
				var3.field4966 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4815 == null ? Collections.emptyList().iterator() : this.field4815.values().iterator(); // L: 42 43
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;III)[Lsp;",
		garbageValue = "2111586891"
	)
	public static IndexedSprite[] method8334(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class212.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		return !var3 ? null : class130.method3031(); // L: 33 34
	}
}
