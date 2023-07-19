import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public abstract class class455 extends class281 implements class520 {
	@ObfuscatedSignature(
		descriptor = "(Lnj;Lol;I)V"
	)
	protected class455(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lre;",
		garbageValue = "1061665604"
	)
	protected abstract class457 vmethod8842(int var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	public int method8297() {
		return super.field3079; // L: 19
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-113586147"
	)
	public Object vmethod9385(int var1) {
		class457 var2 = this.vmethod8842(var1); // L: 24
		return var2 != null && var2.method8326() ? var2.method8321() : null; // L: 25 26
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)Luj;",
		garbageValue = "-1004358669"
	)
	public class521 method8310(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class457 var3 = this.vmethod8842(var2); // L: 31
		class521 var4 = new class521(var2); // L: 32
		Class var5 = var3.field4768.field5035; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5129 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5129 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5129 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class516.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class516 var6 = (class516)var5.newInstance(); // L: 39
				var6.method9355(var1); // L: 40
				var4.field5129 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
