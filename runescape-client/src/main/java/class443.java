import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public abstract class class443 extends class280 implements class508 {
	@ObfuscatedName("au")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;

	@ObfuscatedSignature(
		descriptor = "(Lnp;Lor;I)V"
	)
	protected class443(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lro;",
		garbageValue = "-411631620"
	)
	protected abstract class445 vmethod8787(int var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1046641631"
	)
	public int method8260() {
		return super.field3079; // L: 19
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1940746120"
	)
	public Object vmethod9277(int var1) {
		class445 var2 = this.vmethod8787(var1); // L: 24
		return var2 != null && var2.method8287() ? var2.method8279() : null; // L: 25 26
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)Lth;",
		garbageValue = "78"
	)
	public class509 method8262(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class445 var3 = this.vmethod8787(var2); // L: 31
		class509 var4 = new class509(var2); // L: 32
		Class var5 = var3.field4726.field4978; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5080 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5080 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5080 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class504.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class504 var6 = (class504)var5.newInstance(); // L: 39
				var6.method9246(var1); // L: 40
				var4.field5080 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
