import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public abstract class class474 extends class297 implements class541 {
	@ObfuscatedSignature(
		descriptor = "(Lox;Lpe;I)V"
	)
	protected class474(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsy;",
		garbageValue = "79"
	)
	protected abstract class476 vmethod9278(int var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	public int method8723() {
		return super.field3147; // L: 19
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-276041869"
	)
	public Object vmethod9769(int var1) {
		class476 var2 = this.vmethod9278(var1); // L: 24
		return var2 != null && var2.method8738() ? var2.method8741() : null; // L: 25 26
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Luk;",
		garbageValue = "568285893"
	)
	public class542 method8725(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class476 var3 = this.vmethod9278(var2); // L: 31
		class542 var4 = new class542(var2); // L: 32
		Class var5 = var3.field4875.field5129; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5268 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5268 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5268 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class537.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class537 var6 = (class537)var5.newInstance(); // L: 39
				var6.method9744(var1); // L: 40
				var4.field5268 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
