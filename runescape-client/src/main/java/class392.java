import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public abstract class class392 extends class250 implements class444 {
	@ObfuscatedName("l")
	static byte[][][] field4374;

	@ObfuscatedSignature(
		descriptor = "(Lkt;Llo;I)V"
	)
	protected class392(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lox;",
		garbageValue = "60"
	)
	protected abstract class394 vmethod7542(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-693594265"
	)
	public int method7113() {
		return super.field2872;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-61"
	)
	public Object vmethod7950(int var1) {
		class394 var2 = this.vmethod7542(var1);
		return var2 != null && var2.method7127() ? var2.method7131() : null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)Lqd;",
		garbageValue = "109"
	)
	public class445 method7115(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class394 var3 = this.vmethod7542(var2);
		class445 var4 = new class445(var2);
		Class var5 = var3.field4378.field4593;
		if (var5 == Integer.class) {
			var4.field4681 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4681 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4681 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class440.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class440 var6 = (class440)var5.newInstance();
				var6.method7924(var1);
				var4.field4681 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
