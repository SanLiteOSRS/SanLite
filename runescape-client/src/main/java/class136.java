import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
class class136 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	final class137 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfx;Ltc;I)V"
	)
	class136(class137 var1, Buffer var2, int var3) {
		this.this$0 = var1; // L: 72
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3036(this.val$p, this.val$version); // L: 75
		return null; // L: 76
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "579367521"
	)
	static final int method3034() {
		return ViewportMouse.ViewportMouse_y; // L: 110
	}
}
