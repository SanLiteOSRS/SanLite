import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public abstract class class250 implements class252 {
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = 416925267
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 309984325
	)
	protected int field2872;

	@ObfuscatedSignature(
		descriptor = "(Lkh;Llp;I)V"
	)
	protected class250(StudioGame var1, Language var2, int var3) {
		this.field2872 = var3;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1347336152"
	)
	static Date method5137() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}
}
