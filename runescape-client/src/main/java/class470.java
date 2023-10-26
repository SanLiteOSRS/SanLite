import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public abstract class class470 extends class295 implements class537 {
	@ObfuscatedSignature(
		descriptor = "(Lnp;Loa;I)V"
	)
	protected class470(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lsl;",
		garbageValue = "-799452482"
	)
	protected abstract class472 vmethod8991(int var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1745704270"
	)
	public int method8449() {
		return super.field3109; // L: 19
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-123056323"
	)
	public Object vmethod9530(int var1) {
		class472 var2 = this.vmethod8991(var1); // L: 24
		return var2 != null && var2.method8466() ? var2.method8470() : null; // L: 25 26
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)Lut;",
		garbageValue = "-1458029459"
	)
	public class538 method8450(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class472 var3 = this.vmethod8991(var2); // L: 31
		class538 var4 = new class538(var2); // L: 32
		Class var5 = var3.field4816.field5070; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5204 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5204 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5204 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class533.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class533 var6 = (class533)var5.newInstance(); // L: 39
				var6.method9503(var1); // L: 40
				var4.field5204 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-89620142"
	)
	public static void method8459() {
		class319.field3440.clear(); // L: 148
	} // L: 149

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1657121032"
	)
	static int method8453(int var0, Script var1, boolean var2) {
		return 2; // L: 3252
	}
}
