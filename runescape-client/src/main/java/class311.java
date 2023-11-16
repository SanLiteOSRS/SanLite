import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ma
@ObfuscatedName("lt")
public final class class311 {
	@ObfuscatedName("ar")
	static final HashMap field3392;

	static {
		field3392 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3392) { // L: 16
			TimeZone var2 = (TimeZone)field3392.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3392.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "-1631504286"
	)
	static class140 method5939(int var0) {
		class140 var1 = (class140)class12.findEnumerated(UserComparator8.method2955(), var0); // L: 110
		if (var1 == null) {
			var1 = class140.field1615; // L: 111
		}

		return var1; // L: 112
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-256877556"
	)
	static final void method5940(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12295
		var0 = 100 - var0; // L: 12296
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12297
		Rasterizer3D.Rasterizer3D_setBrightness((double)var1); // L: 12299
		((TextureProvider)Rasterizer3D.field2772.Rasterizer3D_textureLoader).setBrightness((double)var1); // L: 12300
		class166.method3495(); // L: 12301
		WorldMapIcon_1.clientPreferences.method2551((double)var1); // L: 12302
	} // L: 12304
}
