import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public abstract class class415 extends class262 implements class474 {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -1332098541
	)
	static int field4647;
	@ObfuscatedName("m")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;

	@ObfuscatedSignature(
		descriptor = "(Llw;Lmb;I)V"
	)
	protected class415(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lpv;",
		garbageValue = "307947551"
	)
	protected abstract class417 vmethod8354(int var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	public int method7870() {
		return super.field3022; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "816156929"
	)
	public Object vmethod8869(int var1) {
		class417 var2 = this.vmethod8354(var1); // L: 24
		return var2 != null && var2.method7893() ? var2.method7894() : null; // L: 25 26
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lrz;",
		garbageValue = "1659575774"
	)
	public class475 method7877(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class417 var3 = this.vmethod8354(var2); // L: 31
		class475 var4 = new class475(var2); // L: 32
		Class var5 = var3.field4651.field4875; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4981 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4981 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4981 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class470.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class470 var6 = (class470)var5.newInstance(); // L: 39
				var6.method8838(var1); // L: 40
				var4.field4981 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
