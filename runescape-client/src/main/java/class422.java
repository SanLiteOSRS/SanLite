import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public abstract class class422 extends class266 implements class481 {
	@ObfuscatedSignature(
		descriptor = "(Lle;Lmn;I)V"
	)
	protected class422(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lpj;",
		garbageValue = "-982443960"
	)
	protected abstract class424 vmethod8461(int var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "510748857"
	)
	public int method8001() {
		return super.field3035; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1860534238"
	)
	public Object vmethod8966(int var1) {
		class424 var2 = this.vmethod8461(var1); // L: 24
		return var2 != null && var2.method8024() ? var2.method8017() : null; // L: 25 26
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)Lrm;",
		garbageValue = "-1684994695"
	)
	public class482 method8003(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class424 var3 = this.vmethod8461(var2); // L: 31
		class482 var4 = new class482(var2); // L: 32
		Class var5 = var3.field4674.field4901; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5004 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5004 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5004 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class477.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class477 var6 = (class477)var5.newInstance(); // L: 39
				var6.method8935(var1); // L: 40
				var4.field5004 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
