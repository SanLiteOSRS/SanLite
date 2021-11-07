import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public abstract class class354 extends class229 implements class407 {
	@ObfuscatedSignature(
		descriptor = "(Ljd;Lkz;I)V"
	)
	protected class354(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmn;",
		garbageValue = "20"
	)
	protected abstract class356 vmethod6814(int var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "846699714"
	)
	public int method6384() {
		return super.field2647;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-738928947"
	)
	public Object vmethod7243(int var1) {
		class356 var2 = this.vmethod6814(var1);
		return var2 != null && var2.method6407() ? var2.method6408() : null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)Lov;",
		garbageValue = "-56"
	)
	public class408 method6391(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class356 var3 = this.vmethod6814(var2);
		class408 var4 = new class408(var2);
		Class var5 = var3.field4040.field4274;
		if (var5 == Integer.class) {
			var4.field4361 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4361 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4361 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class403.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class403 var6 = (class403)var5.newInstance();
				var6.method7216(var1);
				var4.field4361 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("jc")
	static final void method6396(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class408.clientPreferences.brightness = var0;
		Login.savePreferences();
	}
}
