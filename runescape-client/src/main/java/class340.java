import java.awt.Image;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public abstract class class340 extends class214 implements class389 {
	@ObfuscatedName("ap")
	static Image field3934;

	@ObfuscatedSignature(
		descriptor = "(Ljr;Lkr;I)V"
	)
	protected class340(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lmi;",
		garbageValue = "1012040544"
	)
	protected abstract class342 vmethod6308(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1225449172"
	)
	public int method5863() {
		return super.field2549;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-666299836"
	)
	public Object vmethod6737(int var1) {
		class342 var2 = this.vmethod6308(var1);
		return var2 != null && var2.method5881() ? var2.method5884() : null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)Lol;",
		garbageValue = "1464292562"
	)
	public class390 method5873(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class342 var3 = this.vmethod6308(var2);
		class390 var4 = new class390(var2);
		Class var5 = var3.field3936.field4134;
		if (var5 == Integer.class) {
			var4.field4221 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4221 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4221 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class385.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class385 var6 = (class385)var5.newInstance();
				var6.method6714(var1);
				var4.field4221 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
