import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public abstract class class340 extends class214 implements class389 {
	@ObfuscatedSignature(
		descriptor = "(Ljd;Lkk;I)V"
	)
	protected class340(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lml;",
		garbageValue = "1996028065"
	)
	protected abstract class342 vmethod6434(int var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1710884845"
	)
	public int method6018() {
		return super.field2558;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1572379722"
	)
	public Object vmethod6837(int var1) {
		class342 var2 = this.vmethod6434(var1);
		return var2 != null && var2.method6040() ? var2.method6038() : null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)Loc;",
		garbageValue = "66"
	)
	public class390 method6021(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class342 var3 = this.vmethod6434(var2);
		class390 var4 = new class390(var2);
		Class var5 = var3.field3927.field4127;
		if (var5 == Integer.class) {
			var4.field4218 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4218 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4218 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class385.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class385 var6 = (class385)var5.newInstance();
				var6.method6815(var1);
				var4.field4218 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
