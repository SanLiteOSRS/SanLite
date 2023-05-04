import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public abstract class class430 extends class273 implements class496 {
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lnx;I)V"
	)
	protected class430(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqg;",
		garbageValue = "0"
	)
	protected abstract class432 vmethod8824(int var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1861055046"
	)
	public int method8283() {
		return super.field3071; // L: 19
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/Object;",
		garbageValue = "-16285"
	)
	public Object vmethod9374(int var1) {
		class432 var2 = this.vmethod8824(var1); // L: 24
		return var2 != null && var2.method8305() ? var2.method8310() : null; // L: 25 26
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)Lte;",
		garbageValue = "2049638438"
	)
	public class497 method8285(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class432 var3 = this.vmethod8824(var2); // L: 31
		class497 var4 = new class497(var2); // L: 32
		Class var5 = var3.field4701.field4951; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5057 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5057 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5057 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class492.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class492 var6 = (class492)var5.newInstance(); // L: 39
				var6.method9344(var1); // L: 40
				var4.field5057 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
