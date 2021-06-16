import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public abstract class class341 extends class215 implements class390 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -504771019
	)
	public static int field3921;

	@ObfuscatedSignature(
		descriptor = "(Ljl;Lkn;I)V"
	)
	protected class341(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lmq;",
		garbageValue = "-898201969"
	)
	protected abstract class343 vmethod6482(int var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
	)
	public int method6050() {
		return super.field2559;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-898289717"
	)
	public Object vmethod6893(int var1) {
		class343 var2 = this.vmethod6482(var1);
		return var2 != null && var2.method6072() ? var2.method6073() : null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)Loo;",
		garbageValue = "124"
	)
	public class391 method6052(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class343 var3 = this.vmethod6482(var2);
		class391 var4 = new class391(var2);
		Class var5 = var3.field3924.field4132;
		if (var5 == Integer.class) {
			var4.field4227 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4227 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4227 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class386.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class386 var6 = (class386)var5.newInstance();
				var6.method6869(var1);
				var4.field4227 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
