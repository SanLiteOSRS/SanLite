import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class19 implements Callable {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final class10 field100;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;Lad;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field100 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field100.method81()) { // L: 53
				PendingSpawn.method2365(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field100.method80(); // L: 60
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1773391988"
	)
	public static void method295() {
		class507.DBRowType_cache.clear(); // L: 75
	} // L: 76

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1020330780"
	)
	static final int method294(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 990
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 991
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-274496968"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ModeWhere.loadInterface(var0)) { // L: 12132
			Widget[] var1 = PacketBufferNode.Widget_interfaceComponents[var0]; // L: 12133

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12134
				Widget var3 = var1[var2]; // L: 12135
				if (var3 != null) { // L: 12136
					var3.modelFrame = 0; // L: 12137
					var3.modelFrameCycle = 0; // L: 12138
				}
			}

		}
	} // L: 12140
}
