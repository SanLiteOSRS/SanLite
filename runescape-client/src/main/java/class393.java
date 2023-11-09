import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public abstract class class393 extends class249 implements class450 {
	@ObfuscatedSignature(
		descriptor = "(Lkz;Llj;I)V"
	)
	protected class393(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lof;",
		garbageValue = "288370314"
	)
	protected abstract class395 vmethod7551(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-357161022"
	)
	public int method7107() {
		return super.field2884; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "711230371"
	)
	public Object vmethod8047(int var1) {
		class395 var2 = this.vmethod7551(var1); // L: 24
		return var2 != null && var2.method7124() ? var2.method7117() : null; // L: 25 26
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)Lqn;",
		garbageValue = "-1849555279"
	)
	public class451 method7104(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class395 var3 = this.vmethod7551(var2); // L: 31
		class451 var4 = new class451(var2); // L: 32
		Class var5 = var3.field4441.field4669; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4770 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4770 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4770 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class446.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class446 var6 = (class446)var5.newInstance(); // L: 39
				var6.method8021(var1); // L: 40
				var4.field4770 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
