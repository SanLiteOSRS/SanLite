import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public abstract class class393 extends class249 implements class450 {
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;

	@ObfuscatedSignature(
		descriptor = "(Lkp;Llv;I)V"
	)
	protected class393(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lod;",
		garbageValue = "17"
	)
	protected abstract class395 vmethod7449(int var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1852646260"
	)
	public int method7011() {
		return super.field2890; // L: 19
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1730553793"
	)
	public Object vmethod7942(int var1) {
		class395 var2 = this.vmethod7449(var1); // L: 24
		return var2 != null && var2.method7026() ? var2.method7029() : null; // L: 25 26
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;S)Lqp;",
		garbageValue = "13290"
	)
	public class451 method7012(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class395 var3 = this.vmethod7449(var2); // L: 31
		class451 var4 = new class451(var2); // L: 32
		Class var5 = var3.field4434.field4656; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4768 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4768 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4768 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class446.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class446 var6 = (class446)var5.newInstance(); // L: 39
				var6.method7911(var1); // L: 40
				var4.field4768 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
