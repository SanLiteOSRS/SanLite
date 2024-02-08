import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public abstract class class471 extends class295 implements class538 {
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lol;I)V"
	)
	protected class471(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "1192439178"
	)
	protected abstract class473 vmethod9206(int var1);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-103"
	)
	public int method8651() {
		return super.field3140; // L: 19
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "706881700"
	)
	public Object vmethod9698(int var1) {
		class473 var2 = this.vmethod9206(var1); // L: 24
		return var2 != null && var2.method8671() ? var2.method8672() : null; // L: 25 26
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Lur;",
		garbageValue = "-1150729684"
	)
	public class539 method8659(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class473 var3 = this.vmethod9206(var2); // L: 31
		class539 var4 = new class539(var2); // L: 32
		Class var5 = var3.field4840.field5106; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5244 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5244 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5244 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class534.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class534 var6 = (class534)var5.newInstance(); // L: 39
				var6.method9667(var1); // L: 40
				var4.field5244 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
