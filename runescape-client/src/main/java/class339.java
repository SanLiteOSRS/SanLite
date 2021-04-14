import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public abstract class class339 extends class192 implements class388 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lmd;",
		garbageValue = "-883591339"
	)
	protected abstract class341 vmethod6425(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "324704805"
	)
	public int method5994() {
		return super.field2198;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IB)Ljava/lang/Object;",
		garbageValue = "14"
	)
	public Object vmethod6841(int var1) {
		class341 var2 = this.vmethod6425(var1);
		return var2 != null && var2.method6007() ? var2.method6010() : null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lnu;I)Lnl;",
		garbageValue = "-821097421"
	)
	public class389 method5996(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class341 var3 = this.vmethod6425(var2);
		class389 var4 = new class389(var2);
		Class var5 = var3.field3928.field4131;
		if (var5 == Integer.class) {
			var4.field4216 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4216 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4216 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class384.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class384 var6 = (class384)var5.newInstance();
				var6.method6821(var1);
				var4.field4216 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
