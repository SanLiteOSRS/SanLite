import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public abstract class class467 extends class292 implements class534 {
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lof;I)V"
	)
	protected class467(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsj;",
		garbageValue = "-61"
	)
	protected abstract class469 vmethod9077(int var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-973269100"
	)
	public int method8531() {
		return super.field3102; // L: 19
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "415168938"
	)
	public Object vmethod9599(int var1) {
		class469 var2 = this.vmethod9077(var1); // L: 24
		return var2 != null && var2.method8553() ? var2.method8554() : null; // L: 25 26
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)Lux;",
		garbageValue = "-475761809"
	)
	public class535 method8534(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class469 var3 = this.vmethod9077(var2); // L: 31
		class535 var4 = new class535(var2); // L: 32
		Class var5 = var3.field4808.field5064; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5205 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5205 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5205 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class530.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class530 var6 = (class530)var5.newInstance(); // L: 39
				var6.method9574(var1); // L: 40
				var4.field5205 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
