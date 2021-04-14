import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class29 implements Callable {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 254933769
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lnu;"
	)
	final Buffer field216;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lat;"
	)
	final class31 field215;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lax;"
	)
	final class35 this$0;

	@ObfuscatedSignature(
		signature = "(Lax;Lnu;Lat;)V"
	)
	class29(class35 var1, Buffer var2, class31 var3) {
		this.this$0 = var1;
		this.field216 = var2;
		this.field215 = var3;
	}

	public Object call() {
		return this.field215.vmethod389(this.field216);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		signature = "(Lhu;I)V",
		garbageValue = "1142852074"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field810) {
			Client.field811[var0.rootIndex] = true;
		}

	}
}
